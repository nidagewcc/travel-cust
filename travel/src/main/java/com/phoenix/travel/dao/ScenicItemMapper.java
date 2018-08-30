package com.phoenix.travel.dao;

import com.phoenix.travel.po.ScenicItem;
import com.phoenix.travel.po.ScenicItemExample;
import com.phoenix.travel.po.ScenicItemWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScenicItemMapper {
    int countByExample(ScenicItemExample example);

    int deleteByExample(ScenicItemExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(ScenicItemWithBLOBs record);

    int insertSelective(ScenicItemWithBLOBs record);

    List<ScenicItemWithBLOBs> selectByExampleWithBLOBs(ScenicItemExample example);

    List<ScenicItem> selectByExample(ScenicItemExample example);

    ScenicItemWithBLOBs selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") ScenicItemWithBLOBs record, @Param("example") ScenicItemExample example);

    int updateByExampleWithBLOBs(@Param("record") ScenicItemWithBLOBs record, @Param("example") ScenicItemExample example);

    int updateByExample(@Param("record") ScenicItem record, @Param("example") ScenicItemExample example);

    int updateByPrimaryKeySelective(ScenicItemWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(ScenicItemWithBLOBs record);

    int updateByPrimaryKey(ScenicItem record);
}