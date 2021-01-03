package com.abc.service;

import com.abc.beans.Student;
import com.abc.dao.IStudentDao;

import java.util.List;

public class StudentServiceImpl implements IStudentService {

    private IStudentDao dao;
 //设值注入
    public void setDao(IStudentDao dao) {
        this.dao = dao;
    }

    public void saveStudent(Student student) {
        dao.insertStudent(student);

    }

    public void removeStudentById(int id) {
         dao.deleteStudentById(id);
    }

    public void modifyStudent(Student student) {
        dao.updateStudent(student);
    }

    public String findStudentNameById(int id) {
        return dao.selectStudentNameById(id);
    }

    public List<String> findAllStudentName() {
        return dao.selectAllStudentName();
    }

    public Student findStudentById(int id) {
        return dao.selectStudentById(id);
    }

    public List<Student> findAllStudents() {
        return dao.selectAllStudents();
    }
}
