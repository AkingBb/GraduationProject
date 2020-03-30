package com.lyq.edu.dao;

import com.lyq.edu.entity.ServerBoard;
import com.lyq.edu.entity.ServerBoardExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ServerBoardMapper {
    int countByExample(ServerBoardExample example);

    int deleteByExample(ServerBoardExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ServerBoard record);

    int insertSelective(ServerBoard record);

    List<ServerBoard> selectByExample(ServerBoardExample example);

    ServerBoard selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ServerBoard record, @Param("example") ServerBoardExample example);

    int updateByExample(@Param("record") ServerBoard record, @Param("example") ServerBoardExample example);

    int updateByPrimaryKeySelective(ServerBoard record);

    int updateByPrimaryKey(ServerBoard record);
}