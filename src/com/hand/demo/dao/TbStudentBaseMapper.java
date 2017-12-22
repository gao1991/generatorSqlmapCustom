package com.hand.demo.dao;

import com.hand.demo.entity.TbStudentBase;
import com.hand.demo.entity.TbStudentBaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbStudentBaseMapper {
    int countByExample(TbStudentBaseExample example);

    int deleteByExample(TbStudentBaseExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbStudentBase record);

    int insertSelective(TbStudentBase record);

    List<TbStudentBase> selectByExample(TbStudentBaseExample example);

    TbStudentBase selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbStudentBase record, @Param("example") TbStudentBaseExample example);

    int updateByExample(@Param("record") TbStudentBase record, @Param("example") TbStudentBaseExample example);

    int updateByPrimaryKeySelective(TbStudentBase record);

    int updateByPrimaryKey(TbStudentBase record);
}