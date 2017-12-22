package com.hand.demo.dao;

import com.hand.demo.entity.TbGroups;
import com.hand.demo.entity.TbGroupsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbGroupsMapper {
    int countByExample(TbGroupsExample example);

    int deleteByExample(TbGroupsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbGroups record);

    int insertSelective(TbGroups record);

    List<TbGroups> selectByExample(TbGroupsExample example);

    TbGroups selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbGroups record, @Param("example") TbGroupsExample example);

    int updateByExample(@Param("record") TbGroups record, @Param("example") TbGroupsExample example);

    int updateByPrimaryKeySelective(TbGroups record);

    int updateByPrimaryKey(TbGroups record);
}