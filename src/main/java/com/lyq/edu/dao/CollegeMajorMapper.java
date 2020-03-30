package com.lyq.edu.dao;

import com.lyq.edu.entity.CollegeMajor;
import com.lyq.edu.entity.CollegeMajorExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CollegeMajorMapper {
    int countByExample(CollegeMajorExample example);

    int deleteByExample(CollegeMajorExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(CollegeMajor record);

    int insertSelective(CollegeMajor record);

    List<CollegeMajor> selectByExample(CollegeMajorExample example);

    CollegeMajor selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") CollegeMajor record, @Param("example") CollegeMajorExample example);

    int updateByExample(@Param("record") CollegeMajor record, @Param("example") CollegeMajorExample example);

    int updateByPrimaryKeySelective(CollegeMajor record);

    int updateByPrimaryKey(CollegeMajor record);
}