package com.h.jamil.api.test.school.impl;

import com.google.common.collect.Lists;
import com.h.jamil.api.test.school.entity.Student;
import com.h.jamil.api.test.school.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolTestAPIImpl {

    @Autowired
    private StudentRepository studentRepository;

    public Student getStudent(Integer studentId) {

        return studentRepository.findOne(studentId);
    }

    public List<Student> getStudents() {

        return Lists.newArrayList(studentRepository.findAll());
    }
}
