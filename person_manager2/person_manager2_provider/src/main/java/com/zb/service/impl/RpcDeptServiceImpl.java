package com.zb.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.zb.entity.Dept;
import com.zb.mapper.DeptMapper;
import com.zb.service.RpcDeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Service
@Component
public class RpcDeptServiceImpl implements RpcDeptService {

    @Autowired
    private DeptMapper deptMapper;
    @Override
    public List<Dept> findDeptList() {
        return deptMapper.findDeptList();
    }
}
