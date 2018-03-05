package me.ssm.crud.controller;

import me.ssm.crud.bean.Department;
import me.ssm.crud.bean.Msg;
import me.ssm.crud.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author AlbertRui
 * @create 2018-03-04 23:35
 */
@Controller
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    @RequestMapping("/depts")
    @ResponseBody
    public Msg getDepts() {
        List<Department> departments = departmentService.getDepts();
         return Msg.success().add("depts", departments);
    }

}
