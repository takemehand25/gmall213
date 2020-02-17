package com.takemehand.gmall.user.mapper;

import com.takemehand.gmall.user.bean.UmsMeber;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface UserMapper extends Mapper<UmsMeber> {
    List<UmsMeber> selectAllUser();
}
