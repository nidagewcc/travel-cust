package com.phoenix.travel.dao;

import com.phoenix.travel.po.Scenic;
import com.phoenix.travel.po.ScenicExample;

import java.util.List;

import org.apache.ibatis.annotations.Param;

public interface ScenicMapper {
    int countByExample(ScenicExample example);

    int deleteByExample(ScenicExample example);

    int deleteByPrimaryKey(Integer scenicId);

    int insert(Scenic record);

    int insertSelective(Scenic record);

    List<Scenic> selectByExampleWithBLOBs(ScenicExample example);

    List<Scenic> selectByExample(ScenicExample example);

    Scenic selectByPrimaryKey(Integer scenicId);

    int updateByExampleSelective(@Param("record") Scenic record, @Param("example") ScenicExample example);

    int updateByExampleWithBLOBs(@Param("record") Scenic record, @Param("example") ScenicExample example);

    int updateByExample(@Param("record") Scenic record, @Param("example") ScenicExample example);

    int updateByPrimaryKeySelective(Scenic record);

    int updateByPrimaryKeyWithBLOBs(Scenic record);

    int updateByPrimaryKey(Scenic record);

    /**
     * 批量更新景点状态
     *
     * @param ids
     * @param sts
     */
    void batchUpdateStatus(@Param("ids") List<Integer> ids, @Param("sts") Integer sts);
}