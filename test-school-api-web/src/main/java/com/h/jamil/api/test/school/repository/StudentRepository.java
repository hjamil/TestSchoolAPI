package com.h.jamil.api.test.school.repository;

import com.h.jamil.api.test.school.entity.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Integer> {

    void deleteByName(String name);

}
