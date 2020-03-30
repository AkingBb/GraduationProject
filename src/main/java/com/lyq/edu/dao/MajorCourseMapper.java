package com.lyq.edu.dao;

import com.lyq.edu.entity.MajorCourse;
import com.lyq.edu.entity.MajorCourseExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MajorCourseMapper {
    int countByExample(MajorCourseExample example);

    int deleteByExample(MajorCourseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MajorCourse record);

    int insertSelective(MajorCourse record);

    List<MajorCourse> selectByExample(MajorCourseExample example);

    MajorCourse selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MajorCourse record, @Param("example") MajorCourseExample example);

    int updateByExample(@Param("record") MajorCourse record, @Param("example") MajorCourseExample example);

    int updateByPrimaryKeySelective(MajorCourse record);

    int updateByPrimaryKey(MajorCourse record);
}