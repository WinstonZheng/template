package com.winston.rest.service;

import com.winston.rest.dao.StudentDao;
import com.winston.rest.domain.DemoStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * author: winston
 * date: 10/29/2017.
 * description:
 */
@Service
public class DemoServiceImpl implements DemoService{

    @Autowired
    StudentDao studentDao;


    public List<DemoStudent> getStudents(){
        return studentDao.selectStudents();
    }





}
