package com.lyq.edu.dao;

import com.lyq.edu.entity.UserUseLog;
import com.lyq.edu.entity.UserUseLogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserUseLogMapper {
    int countByExample(UserUseLogExample example);

    int deleteByExample(UserUseLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserUseLog record);

    int insertSelective(UserUseLog record);

    List<UserUseLog> selectByExample(UserUseLogExample example);

    UserUseLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserUseLog record, @Param("example") UserUseLogExample example);

    int updateByExample(@Param("record") UserUseLog record, @Param("example") UserUseLogExample example);

    int updateByPrimaryKeySelective(UserUseLog record);

    int updateByPrimaryKey(UserUseLog record);
}