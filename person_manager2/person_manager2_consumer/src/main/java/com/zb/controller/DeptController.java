package com.zb.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zb.entity.Dept;
import com.zb.service.RpcDeptService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class DeptController {
    @Reference
    private RpcDeptService rpcDeptService;

    @RequestMapping(value = "/showDept")
    @ResponseBody
    public List<Dept> findDeptList(){
        return rpcDeptService.findDeptList();
    }

}
