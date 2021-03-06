package com.haibao.dao;

import com.haibao.model.po.Penalty;

public interface PenaltyDao {
    int deleteByPrimaryKey(Integer pid);

    int insert(Penalty record);

    int insertSelective(Penalty record);

    Penalty selectByPrimaryKey(Integer pid);

    int updateByPrimaryKeySelective(Penalty record);

    int updateByPrimaryKey(Penalty record);
}