package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Locale;

@Controller
public class I18nController {
    @Autowired
    MessageSource messageSource;

    @RequestMapping("/hello")
    public String hello(){
        //确定用户是使用哪个国际区域
        Locale locale=LocaleContextHolder.getLocale();
        //装载国际化消息
        String msg=messageSource.getMessage("login.hello",null,locale);
        System.out.println("locale:"+locale+"   msg:"+msg);

        //返回页面
        return "hello";
    }
}
