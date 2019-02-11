package com.h.jamil.api.test.school.impl;

import com.google.common.collect.Lists;
import com.h.jamil.api.test.school.domain.Student;
import com.h.jamil.api.test.school.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SchoolTestAPIImpl {

    @Autowired
    private StudentRepository studentRepository;

    public Student getStudent(Integer studentId) {

        com.h.jamil.api.test.school.entity.Student entityStudent = studentRepository.findOne(studentId);

        Student student = new Student(entityStudent.getId(), entityStudent.getName());

        return student;
    }

    public List<Student> getStudents() {

        List<com.h.jamil.api.test.school.entity.Student> entityStudents = Lists.newArrayList(studentRepository.findAll());

        List<Student> students = new ArrayList<>();

        for(com.h.jamil.api.test.school.entity.Student entityStudent : entityStudents) {
            students.add(new Student(entityStudent.getId(), entityStudent.getName()));
        }

        return students;
    }
}
