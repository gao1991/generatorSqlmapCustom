package com.hand.demo.dao;

import com.hand.demo.entity.TbStudentMiddle;
import com.hand.demo.entity.TbStudentMiddleExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbStudentMiddleMapper {
    int countByExample(TbStudentMiddleExample example);

    int deleteByExample(TbStudentMiddleExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbStudentMiddle record);

    int insertSelective(TbStudentMiddle record);

    List<TbStudentMiddle> selectByExample(TbStudentMiddleExample example);

    TbStudentMiddle selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbStudentMiddle record, @Param("example") TbStudentMiddleExample example);

    int updateByExample(@Param("record") TbStudentMiddle record, @Param("example") TbStudentMiddleExample example);

    int updateByPrimaryKeySelective(TbStudentMiddle record);

    int updateByPrimaryKey(TbStudentMiddle record);
}