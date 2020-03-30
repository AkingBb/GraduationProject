package com.lyq.edu.dao;

import com.lyq.edu.entity.MajorChapter;
import com.lyq.edu.entity.MajorChapterExample;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface MajorChapterMapper {
    int countByExample(MajorChapterExample example);

    int deleteByExample(MajorChapterExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(MajorChapter record);

    int insertSelective(MajorChapter record);

    List<MajorChapter> selectByExample(MajorChapterExample example);

    MajorChapter selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") MajorChapter record, @Param("example") MajorChapterExample example);

    int updateByExample(@Param("record") MajorChapter record, @Param("example") MajorChapterExample example);

    int updateByPrimaryKeySelective(MajorChapter record);

    int updateByPrimaryKey(MajorChapter record);
}