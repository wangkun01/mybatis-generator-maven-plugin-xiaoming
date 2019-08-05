package com.xiaoming.dao;

import com.xiaoming.dto.Test;

public interface TestMapper {
    int insert(Test record);

    int insertSelective(Test record);
}