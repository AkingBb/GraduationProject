package com.lyq.edu.dao;

import com.lyq.edu.entity.ErrorLog;
import com.lyq.edu.entity.ErrorLogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ErrorLogMapper {
    int countByExample(ErrorLogExample example);

    int deleteByExample(ErrorLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ErrorLog record);

    int insertSelective(ErrorLog record);

    List<ErrorLog> selectByExampleWithBLOBs(ErrorLogExample example);

    List<ErrorLog> selectByExample(ErrorLogExample example);

    ErrorLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ErrorLog record, @Param("example") ErrorLogExample example);

    int updateByExampleWithBLOBs(@Param("record") ErrorLog record, @Param("example") ErrorLogExample example);

    int updateByExample(@Param("record") ErrorLog record, @Param("example") ErrorLogExample example);

    int updateByPrimaryKeySelective(ErrorLog record);

    int updateByPrimaryKeyWithBLOBs(ErrorLog record);

    int updateByPrimaryKey(ErrorLog record);
}