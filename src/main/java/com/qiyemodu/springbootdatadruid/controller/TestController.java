package com.qiyemodu.springbootdatadruid.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

/**
 * @author QiYeMoDu
 * @version 1.0
 * ===========================================================
 * @function 这个类用来
 * ===========================================================
 * @date 2019/12/20 22:14
 */
@Controller
public class TestController {
    @Autowired
    JdbcTemplate jdbcTemplate; //注入template来测试连接属性

    @GetMapping("/test")
    @ResponseBody
    public Map<String, Object> test() {
        List<Map<String, Object>> maps = jdbcTemplate.queryForList("select * from user");
        return maps.get(0);
    }
}
