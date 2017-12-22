package com.hand.demo.dao;

import com.hand.demo.entity.TbStudentGroups;
import com.hand.demo.entity.TbStudentGroupsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbStudentGroupsMapper {
    int countByExample(TbStudentGroupsExample example);

    int deleteByExample(TbStudentGroupsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbStudentGroups record);

    int insertSelective(TbStudentGroups record);

    List<TbStudentGroups> selectByExample(TbStudentGroupsExample example);

    TbStudentGroups selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbStudentGroups record, @Param("example") TbStudentGroupsExample example);

    int updateByExample(@Param("record") TbStudentGroups record, @Param("example") TbStudentGroupsExample example);

    int updateByPrimaryKeySelective(TbStudentGroups record);

    int updateByPrimaryKey(TbStudentGroups record);
}