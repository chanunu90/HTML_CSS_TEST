package com.astro.html_css_test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.log4j.Log4j2;

@Controller
@Log4j2
public class IndexController {
    
    @GetMapping({"","/"})
    public String index(){

        log.info("HTML 및 CSS 테스트 입니다.");
        log.info("600X600 으로 이미지 만들기");

        return "index";

    }

}
