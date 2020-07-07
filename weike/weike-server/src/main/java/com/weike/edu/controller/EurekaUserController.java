package com.weike.edu.controller;

import com.weike.edu.cloud.common.controller.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class EurekaUserController {

    @Autowired
    private DepartmentService departmentService;

    @RequestMapping(value = "/index/{id}",method = RequestMethod.GET)
    public String eurekaInfo(@PathVariable("id") String id){
      /*  try {
            Thread.sleep(000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        return departmentService.getInfo("hello 8001");
    }
}
