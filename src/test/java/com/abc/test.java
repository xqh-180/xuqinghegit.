package com.abc;

import com.abc.beans.Student;
import com.abc.service.IStudentService;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class test {

    private IStudentService service;

    @Before
    public void before(){
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        service = (IStudentService) ac.getBean("studentService");
    }
    @Test
    public void test01(){

        Student student = new Student("lisi",25);
        service.saveStudent(student);
    }

    @Test
    public void test02(){
        service.removeStudentById(9);
    }

    @Test
    public void test03(){
        Student student = new Student("wangfei",21);
        student.setId(4);
        service.modifyStudent(student);
    }

    @Test
    public void test04(){
       String name = service.findStudentNameById(3);
        System.out.println(name);
    }

    @Test
    public void test05(){
        List<String> list = service.findAllStudentName();
        for (String name:list){
            System.out.println(name);
        }
    }

    @Test
    public void test06(){
        Student student = service.findStudentById(2);
        System.out.println(student);
    }

    @Test
    public void test07(){
        List<Student> list = service.findAllStudents();
        for (Student student:list){
            System.out.println(student);
        }
    }
}
