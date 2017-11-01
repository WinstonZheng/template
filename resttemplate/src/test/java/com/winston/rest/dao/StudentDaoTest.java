package com.winston.rest.dao;

import com.winston.rest.Application;
import com.winston.rest.domain.DemoStudent;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * author: winston
 * date: 10/30/2017.
 * description: it's a test for dao
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {Application.class})
public class StudentDaoTest {

    @Autowired
    StudentDao studentDao;

    @Test
    public void testSelectStudents() throws Exception {
        List<DemoStudent> students = studentDao.selectStudents();
        System.out.println(students.get(0).getName());
    }
}