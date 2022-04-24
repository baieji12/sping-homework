package com.gxy.dao.impl;

import com.gxy.dao.TeacherDao;
import org.springframework.stereotype.Repository;

@Repository
public class TeacherDaoImpl implements TeacherDao {
    @Override
    public String addHomework(String homework) {
        System.out.println("布置了一个名为”"+homework+"“的作业");
        return homework;
    }
}
