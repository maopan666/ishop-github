package cn.fastline.ishop.controller;

import cn.fastline.ishop.domain.Employee;
import cn.fastline.ishop.util.AjaxResult;
import com.sun.org.apache.bcel.internal.generic.NEW;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    @RequestMapping(value = "/login",method = RequestMethod.POST)
    public AjaxResult login(@RequestBody Employee employee){
        System.out.println(employee);
        if ("admin".equals(employee.getName())&&"admin".equals(employee.getPassword())){
            return AjaxResult.me().setSuccess(true).setMsg("登录成功");
        }else {
            return AjaxResult.me().setSuccess(false).setMsg("登录失败");
        }
    }
}
