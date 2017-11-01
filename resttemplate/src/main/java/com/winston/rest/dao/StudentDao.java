package com.winston.rest.dao;

import com.winston.rest.dao.mapper.StudentMapper;
import com.winston.rest.domain.DemoStudent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * author: winston
 * date: 10/30/2017.
 * description:
 */
@Repository
public class StudentDao {

    @Autowired
    StudentMapper studentMapper;

    public List<DemoStudent> selectStudents(){
        return studentMapper.selectStudents();
    }


}
