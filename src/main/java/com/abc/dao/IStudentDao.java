package com.abc.dao;

import com.abc.beans.Student;

import java.util.List;

public interface IStudentDao {
    void insertStudent(Student student);
    void deleteStudentById(int id);
    void updateStudent(Student student);

    String selectStudentNameById(int id);
    List<String> selectAllStudentName();

    Student selectStudentById(int id);
    List<Student> selectAllStudents();
}
