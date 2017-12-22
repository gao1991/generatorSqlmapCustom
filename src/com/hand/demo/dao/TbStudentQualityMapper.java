package com.hand.demo.dao;

import com.hand.demo.entity.TbStudentQuality;
import com.hand.demo.entity.TbStudentQualityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbStudentQualityMapper {
    int countByExample(TbStudentQualityExample example);

    int deleteByExample(TbStudentQualityExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbStudentQuality record);

    int insertSelective(TbStudentQuality record);

    List<TbStudentQuality> selectByExample(TbStudentQualityExample example);

    TbStudentQuality selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbStudentQuality record, @Param("example") TbStudentQualityExample example);

    int updateByExample(@Param("record") TbStudentQuality record, @Param("example") TbStudentQualityExample example);

    int updateByPrimaryKeySelective(TbStudentQuality record);

    int updateByPrimaryKey(TbStudentQuality record);
}