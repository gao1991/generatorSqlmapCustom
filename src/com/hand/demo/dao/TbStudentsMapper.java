package com.hand.demo.dao;

import com.hand.demo.entity.TbStudents;
import com.hand.demo.entity.TbStudentsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TbStudentsMapper {
    int countByExample(TbStudentsExample example);

    int deleteByExample(TbStudentsExample example);

    int deleteByPrimaryKey(Long id);

    int insert(TbStudents record);

    int insertSelective(TbStudents record);

    List<TbStudents> selectByExample(TbStudentsExample example);

    TbStudents selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") TbStudents record, @Param("example") TbStudentsExample example);

    int updateByExample(@Param("record") TbStudents record, @Param("example") TbStudentsExample example);

    int updateByPrimaryKeySelective(TbStudents record);

    int updateByPrimaryKey(TbStudents record);
}