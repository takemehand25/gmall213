package com.takemehand.gmall.user.service.impl;

import com.takemehand.gmall.user.bean.UmsMeber;
import com.takemehand.gmall.user.mapper.UserMapper;
import com.takemehand.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public List<UmsMeber> getAllUser() {

        List<UmsMeber> umsMeberList = userMapper.selectAllUser();
        //使用通用mapper
        List<UmsMeber> umsMeberList2 = userMapper.selectAll();

        return umsMeberList;
    }


    public List<UmsMeber> getById(int meberId){

        //封装的参数对象
        UmsMeber umsMeber = new UmsMeber();
        umsMeber.setId(meberId);
        List<UmsMeber> umsMeberList1 = userMapper.select(umsMeber);    //两种方法结果一样

        //通用mapper条件查询
        Example example = new Example(UmsMeber.class);
        example.createCriteria().andEqualTo("id",meberId);
        List<UmsMeber> umsMeberList = userMapper.selectByExample(example);
        return  umsMeberList;
    }
}
