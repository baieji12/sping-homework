package com.gxy.pojo;

import org.springframework.web.bind.annotation.RequestMapping;

public class Customer {
    private Student student;
    private Teacher teacher;

    @Override
    public String toString() {
        return "Customer{" +
                "student=" + student +
                ", teacher=" + teacher +
                '}';
    }


    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public Teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }
    @RequestMapping(value = "login.do")
    <init-parm>

}
