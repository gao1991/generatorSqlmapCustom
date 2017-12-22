package com.hand.demo.dao;

import com.hand.demo.entity.TbScoreQuality;
import com.hand.demo.entity.TbScoreQualityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbScoreQualityMapper {
    int countByExample(TbScoreQualityExample example);

    int deleteByExample(TbScoreQualityExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbScoreQuality record);

    int insertSelective(TbScoreQuality record);

    List<TbScoreQuality> selectByExample(TbScoreQualityExample example);

    TbScoreQuality selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbScoreQuality record, @Param("example") TbScoreQualityExample example);

    int updateByExample(@Param("record") TbScoreQuality record, @Param("example") TbScoreQualityExample example);

    int updateByPrimaryKeySelective(TbScoreQuality record);

    int updateByPrimaryKey(TbScoreQuality record);
}