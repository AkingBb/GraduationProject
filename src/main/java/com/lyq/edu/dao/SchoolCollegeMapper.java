package com.lyq.edu.dao;

import com.lyq.edu.entity.SchoolCollege;
import com.lyq.edu.entity.SchoolCollegeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SchoolCollegeMapper {
    int countByExample(SchoolCollegeExample example);

    int deleteByExample(SchoolCollegeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SchoolCollege record);

    int insertSelective(SchoolCollege record);

    List<SchoolCollege> selectByExample(SchoolCollegeExample example);

    SchoolCollege selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SchoolCollege record, @Param("example") SchoolCollegeExample example);

    int updateByExample(@Param("record") SchoolCollege record, @Param("example") SchoolCollegeExample example);

    int updateByPrimaryKeySelective(SchoolCollege record);

    int updateByPrimaryKey(SchoolCollege record);
}