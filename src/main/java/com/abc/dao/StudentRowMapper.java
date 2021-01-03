package com.abc.dao;

import com.abc.beans.Student;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class StudentRowMapper implements RowMapper<Student> {
   /*
   * 功能：将查询结果集中的一行记录转换为指定对象，该方法是由Spring框架自动调用的
   * 当查询到结果集后 框架会自动遍历这个结果集，每遍历一行记录，就会调用这个方法一次
   * 只要调用这个方法，就说明结果集中还有记录
   * @param rs： 查询出的结果集中的一行记录，而不是总的结果集
   * @param rowNum：当前遍历行再查询出的结果集中的索引
   *
   * */
    public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
        Student student = new Student();
        student.setId(rs.getInt("id"));
        student.setName(rs.getString("name"));
        student.setAge(rs.getInt("age"));
        return student;
    }
}
