package com.abc.dao;

import com.abc.beans.Student;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import java.util.List;

public class StudentDaoImpl extends JdbcDaoSupport implements IStudentDao{
    public void insertStudent(Student student) {
     String sql = "insert into student(name,age) value(?,?)";
     this.getJdbcTemplate().update(sql,student.getName(),student.getAge());
    }


    public void deleteStudentById(int id) {
        String sql = "delete from student where id=?";
        this.getJdbcTemplate().update(sql,id);
    }


    public void updateStudent(Student student) {
        String sql = "update student set name=?,age=? where id=?";
        this.getJdbcTemplate().update(sql,student.getName(),student.getAge(),student.getId());
    }


    public String selectStudentNameById(int id) {
        String sql = "select name from student where id=?";
        Object[] args = {id};
        return this.getJdbcTemplate().queryForObject(sql,args,String.class);
    }


    public List<String> selectAllStudentName() {
        String sql = "select name from student";
        return this.getJdbcTemplate().queryForList(sql,String.class);
    }


    public Student selectStudentById(int id) {
           String sql = "select id,name,age from student where id=?";
           Object[] args={id};
        return this.getJdbcTemplate().queryForObject(sql,args,new StudentRowMapper());
    }


    public List<Student> selectAllStudents() {
        String sql = "select id,name,age from student ";
        return this.getJdbcTemplate().query(sql,new StudentRowMapper());
    }
}
