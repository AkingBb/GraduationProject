package com.lyq.edu.dao;

import com.lyq.edu.entity.UseLab;
import com.lyq.edu.entity.UseLabExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UseLabMapper {
    int countByExample(UseLabExample example);

    int deleteByExample(UseLabExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UseLab record);

    int insertSelective(UseLab record);

    List<UseLab> selectByExample(UseLabExample example);

    UseLab selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UseLab record, @Param("example") UseLabExample example);

    int updateByExample(@Param("record") UseLab record, @Param("example") UseLabExample example);

    int updateByPrimaryKeySelective(UseLab record);

    int updateByPrimaryKey(UseLab record);
}