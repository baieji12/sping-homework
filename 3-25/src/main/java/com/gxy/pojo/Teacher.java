package com.gxy.pojo;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Teacher {
    private String name;
    private double[] salary;
    private List<String> student;
    private Map<String,Object> info;
    private Set<String> key;

    @Override
    public String toString() {
        return "Teacher{" +
                "\n name='" + name + '\'' +
                "\n salary=" + Arrays.toString(salary) +
                "\n student=" + student +
                "\n info=" + info +
                "\n key=" + key +
                "\n}";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double[] getSalary() {
        return salary;
    }

    public void setSalary(double[] salary) {
        this.salary = salary;
    }

    public List<String> getStudent() {
        return student;
    }

    public void setStudent(List<String> student) {
        this.student = student;
    }

    public Map<String, Object> getInfo() {
        return info;
    }

    public void setInfo(Map<String, Object> info) {
        this.info = info;
    }

    public Set<String> getKey() {
        return key;
    }

    public void setKey(Set<String> key) {
        this.key = key;
    }
}
