package ru.strudents.dbtestrest.dao;

import org.springframework.stereotype.Repository;
import ru.strudents.dbtestrest.entity.Student;

import java.util.List;

@Repository
public interface StudentDAO {
    List<Student> getAllStudents();

    Student getStudent(int id);

    Student saveStudent(Student student);

    void deleteStudent(int id);
}
