package com.weike.edu.cloud.common.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.*;

@FeignClient(value = "SPRINGCLOUD-DEPT")
public interface DepartmentService {

    @RequestMapping(value = "/dept/info/{id}",method = RequestMethod.GET)
    @ResponseBody
    String getInfo(@PathVariable("id") String id);
}
