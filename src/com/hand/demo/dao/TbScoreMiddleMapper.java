package com.hand.demo.dao;

import com.hand.demo.entity.TbScoreMiddle;
import com.hand.demo.entity.TbScoreMiddleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbScoreMiddleMapper {
    int countByExample(TbScoreMiddleExample example);

    int deleteByExample(TbScoreMiddleExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TbScoreMiddle record);

    int insertSelective(TbScoreMiddle record);

    List<TbScoreMiddle> selectByExample(TbScoreMiddleExample example);

    TbScoreMiddle selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TbScoreMiddle record, @Param("example") TbScoreMiddleExample example);

    int updateByExample(@Param("record") TbScoreMiddle record, @Param("example") TbScoreMiddleExample example);

    int updateByPrimaryKeySelective(TbScoreMiddle record);

    int updateByPrimaryKey(TbScoreMiddle record);
}