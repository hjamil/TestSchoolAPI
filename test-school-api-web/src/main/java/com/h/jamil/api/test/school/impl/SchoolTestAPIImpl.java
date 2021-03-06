package com.h.jamil.api.test.school.impl;

import com.google.common.collect.Lists;
import com.h.jamil.api.framework.utility.ELKLogger;
import com.h.jamil.api.test.school.domain.Student;
import com.h.jamil.api.test.school.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Service
public class SchoolTestAPIImpl {
    // Define Logback
    private static final ELKLogger log = new ELKLogger(SchoolTestAPIImpl.class);

    private com.h.jamil.api.test.school.entity.Student studentEntity;

    @Value("${some.thing.value:xyz}")
    private String somethingValue;

    @Autowired
    private StudentRepository studentRepository;

    public Student getStudent(Integer studentId) {

        log.info(this.getClass().getSimpleName() + " INITIATED...");

        com.h.jamil.api.test.school.entity.Student entityStudent = studentRepository.findOne(studentId);

        Student student = new Student(entityStudent.getId(), entityStudent.getName(), somethingValue);

        return student;
    }
    public List<Student> getStudentByName(String name) {

        log.info(this.getClass().getSimpleName() + " INITIATED...");

        List<com.h.jamil.api.test.school.entity.Student> entityStudents = Lists.newArrayList(studentRepository.findByName(name));

        List<Student> students = new ArrayList<>();

        for(com.h.jamil.api.test.school.entity.Student entityStudent : entityStudents) {
            students.add(new Student(entityStudent.getId(), entityStudent.getName(), somethingValue));
        }

        return students;
    }

    public List<Student> getStudents() {

        log.info(this.getClass().getSimpleName() + " INITIATED...");

        List<com.h.jamil.api.test.school.entity.Student> entityStudents = Lists.newArrayList(studentRepository.findAll());

        List<Student> students = new ArrayList<>();

        for(com.h.jamil.api.test.school.entity.Student entityStudent : entityStudents) {
            students.add(new Student(entityStudent.getId(), entityStudent.getName(), somethingValue));
        }

        return students;
    }

    public void delStudent(Integer studentId) {

        log.info(this.getClass().getSimpleName() + " INITIATED...");

        studentRepository.delete(studentId);

        return;
    }

    @Transactional
    public void delStudentByName(String name) {

        log.info(this.getClass().getSimpleName() + " INITIATED...");

        studentRepository.deleteByName(name);

        return;
    }

    public Student postStudent(Student student) {
        log.info(this.getClass().getSimpleName() + " INITIATED...");
        studentEntity = new com.h.jamil.api.test.school.entity.Student();
        studentEntity.setId(student.getId());
        studentEntity.setName(student.getName());
        studentRepository.save(studentEntity);

        return getStudent(student.getId());
    }
}
