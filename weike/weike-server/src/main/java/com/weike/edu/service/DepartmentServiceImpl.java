package com.weike.edu.service;

import com.weike.edu.cloud.common.controller.DepartmentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    private static final Logger logger = LoggerFactory.getLogger(DepartmentServiceImpl.class);

    @Override
    public String getInfo(String deptId) {
        logger.info("来着:{}",deptId);
        return "success info for RPC";
    }
}
