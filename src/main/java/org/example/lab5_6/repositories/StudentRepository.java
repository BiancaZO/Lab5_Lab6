package org.example.lab5_6.repositories;

import org.example.lab5_6.entities.Student;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student,Long> {
    List<Student> findStudentById (long kw);



}
