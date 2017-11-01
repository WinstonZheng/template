package com.winston.rest.dao.mapper;

import com.winston.rest.domain.DemoStudent;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * author: winston
 * date: 10/30/2017.
 * description:
 */
@Mapper
public interface StudentMapper {

    List<DemoStudent> selectStudents();
}
