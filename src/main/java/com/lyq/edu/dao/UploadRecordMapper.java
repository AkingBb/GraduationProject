package com.lyq.edu.dao;

import com.lyq.edu.entity.UploadRecord;
import com.lyq.edu.entity.UploadRecordExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UploadRecordMapper {
    int countByExample(UploadRecordExample example);

    int deleteByExample(UploadRecordExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UploadRecord record);

    int insertSelective(UploadRecord record);

    List<UploadRecord> selectByExample(UploadRecordExample example);

    UploadRecord selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UploadRecord record, @Param("example") UploadRecordExample example);

    int updateByExample(@Param("record") UploadRecord record, @Param("example") UploadRecordExample example);

    int updateByPrimaryKeySelective(UploadRecord record);

    int updateByPrimaryKey(UploadRecord record);
}