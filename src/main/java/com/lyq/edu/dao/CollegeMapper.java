package com.lyq.edu.dao;

import com.lyq.edu.entity.College;
import com.lyq.edu.entity.CollegeExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface CollegeMapper {
    int countByExample(CollegeExample example);

    int deleteByExample(CollegeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(College record);

    int insertSelective(College record);

    List<College> selectByExampleWithBLOBs(CollegeExample example);

    List<College> selectByExample(CollegeExample example);

    College selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") College record, @Param("example") CollegeExample example);

    int updateByExampleWithBLOBs(@Param("record") College record, @Param("example") CollegeExample example);

    int updateByExample(@Param("record") College record, @Param("example") CollegeExample example);

    int updateByPrimaryKeySelective(College record);

    int updateByPrimaryKeyWithBLOBs(College record);

    int updateByPrimaryKey(College record);
}