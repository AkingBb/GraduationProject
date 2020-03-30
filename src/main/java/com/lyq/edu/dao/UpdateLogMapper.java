package com.lyq.edu.dao;

import com.lyq.edu.entity.UpdateLog;
import com.lyq.edu.entity.UpdateLogExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UpdateLogMapper {
    int countByExample(UpdateLogExample example);

    int deleteByExample(UpdateLogExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UpdateLog record);

    int insertSelective(UpdateLog record);

    List<UpdateLog> selectByExampleWithBLOBs(UpdateLogExample example);

    List<UpdateLog> selectByExample(UpdateLogExample example);

    UpdateLog selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UpdateLog record, @Param("example") UpdateLogExample example);

    int updateByExampleWithBLOBs(@Param("record") UpdateLog record, @Param("example") UpdateLogExample example);

    int updateByExample(@Param("record") UpdateLog record, @Param("example") UpdateLogExample example);

    int updateByPrimaryKeySelective(UpdateLog record);

    int updateByPrimaryKeyWithBLOBs(UpdateLog record);

    int updateByPrimaryKey(UpdateLog record);
}