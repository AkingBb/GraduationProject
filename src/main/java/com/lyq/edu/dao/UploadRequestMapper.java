package com.lyq.edu.dao;

import com.lyq.edu.entity.UploadRequest;
import com.lyq.edu.entity.UploadRequestExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UploadRequestMapper {
    int countByExample(UploadRequestExample example);

    int deleteByExample(UploadRequestExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UploadRequest record);

    int insertSelective(UploadRequest record);

    List<UploadRequest> selectByExample(UploadRequestExample example);

    UploadRequest selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UploadRequest record, @Param("example") UploadRequestExample example);

    int updateByExample(@Param("record") UploadRequest record, @Param("example") UploadRequestExample example);

    int updateByPrimaryKeySelective(UploadRequest record);

    int updateByPrimaryKey(UploadRequest record);
}