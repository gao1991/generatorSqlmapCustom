package com.hand.demo.dao;

import com.hand.demo.entity.TbScoreBase;
import com.hand.demo.entity.TbScoreBaseExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbScoreBaseMapper {
    int countByExample(TbScoreBaseExample example);

    int deleteByExample(TbScoreBaseExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbScoreBase record);

    int insertSelective(TbScoreBase record);

    List<TbScoreBase> selectByExample(TbScoreBaseExample example);

    TbScoreBase selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbScoreBase record, @Param("example") TbScoreBaseExample example);

    int updateByExample(@Param("record") TbScoreBase record, @Param("example") TbScoreBaseExample example);

    int updateByPrimaryKeySelective(TbScoreBase record);

    int updateByPrimaryKey(TbScoreBase record);
}