package com.chz.cors.handler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;

/**
 * @author @CrossOrigin 只允许将数据返回,不加该注解内容同样会传入到该mapping中
 */
@Controller
public class CorsController {
    @GetMapping("/cors")
    @ResponseBody
//  方法二单独接收cors 直接配置@CrossOrigin,不用配置额外的
//  可以将数据放回指定的域名,要带协议
//    @CrossOrigin(origins = "http://localhost:8080")
    public HashMap<Object, Object> func(String msg, String val) {
        System.out.println(msg + val);
        HashMap<Object, Object> map = new HashMap<>(10);
        map.put("1", msg);
        map.put("2", val);
        map.put("3", "接收到跨域请求");
        return map;
    }
}
