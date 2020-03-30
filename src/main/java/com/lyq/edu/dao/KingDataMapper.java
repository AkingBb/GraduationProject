package com.lyq.edu.dao;

import com.lyq.edu.entity.KingData;
import com.lyq.edu.entity.KingDataExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface KingDataMapper {
    int countByExample(KingDataExample example);

    int deleteByExample(KingDataExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(KingData record);

    int insertSelective(KingData record);

    List<KingData> selectByExampleWithBLOBs(KingDataExample example);

    List<KingData> selectByExample(KingDataExample example);

    KingData selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") KingData record, @Param("example") KingDataExample example);

    int updateByExampleWithBLOBs(@Param("record") KingData record, @Param("example") KingDataExample example);

    int updateByExample(@Param("record") KingData record, @Param("example") KingDataExample example);

    int updateByPrimaryKeySelective(KingData record);

    int updateByPrimaryKeyWithBLOBs(KingData record);

    int updateByPrimaryKey(KingData record);
}