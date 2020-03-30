package com.lyq.edu.dao;

import com.lyq.edu.entity.DefaultEduInfo;
import com.lyq.edu.entity.DefaultEduInfoExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DefaultEduInfoMapper {
    int countByExample(DefaultEduInfoExample example);

    int deleteByExample(DefaultEduInfoExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(DefaultEduInfo record);

    int insertSelective(DefaultEduInfo record);

    List<DefaultEduInfo> selectByExampleWithBLOBs(DefaultEduInfoExample example);

    List<DefaultEduInfo> selectByExample(DefaultEduInfoExample example);

    DefaultEduInfo selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") DefaultEduInfo record, @Param("example") DefaultEduInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") DefaultEduInfo record, @Param("example") DefaultEduInfoExample example);

    int updateByExample(@Param("record") DefaultEduInfo record, @Param("example") DefaultEduInfoExample example);

    int updateByPrimaryKeySelective(DefaultEduInfo record);

    int updateByPrimaryKeyWithBLOBs(DefaultEduInfo record);

    int updateByPrimaryKey(DefaultEduInfo record);
}