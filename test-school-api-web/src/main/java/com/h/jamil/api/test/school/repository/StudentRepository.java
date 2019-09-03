package com.h.jamil.api.test.school.repository;

import com.h.jamil.api.test.school.entity.Student;
import org.springframework.data.repository.CrudRepository;
import java.util.List;

public interface StudentRepository extends CrudRepository<Student, Integer> {

    void deleteByName(String name);
    List<Student> findByName(String name);
}
