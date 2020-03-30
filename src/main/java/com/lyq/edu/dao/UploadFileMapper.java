package com.lyq.edu.dao;

import com.lyq.edu.entity.UploadFile;
import com.lyq.edu.entity.UploadFileExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UploadFileMapper {
    int countByExample(UploadFileExample example);

    int deleteByExample(UploadFileExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UploadFile record);

    int insertSelective(UploadFile record);

    List<UploadFile> selectByExampleWithBLOBs(UploadFileExample example);

    List<UploadFile> selectByExample(UploadFileExample example);

    UploadFile selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UploadFile record, @Param("example") UploadFileExample example);

    int updateByExampleWithBLOBs(@Param("record") UploadFile record, @Param("example") UploadFileExample example);

    int updateByExample(@Param("record") UploadFile record, @Param("example") UploadFileExample example);

    int updateByPrimaryKeySelective(UploadFile record);

    int updateByPrimaryKeyWithBLOBs(UploadFile record);

    int updateByPrimaryKey(UploadFile record);
}