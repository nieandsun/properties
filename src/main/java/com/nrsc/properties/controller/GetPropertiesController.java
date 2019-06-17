package com.nrsc.properties.controller;

import com.nrsc.properties.properties1.SecurityProperties;
import com.nrsc.properties.properties2.Unions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GetPropertiesController {

    @Autowired
    private SecurityProperties securityProperties;
    @Autowired
    private Unions unions;


    @GetMapping("/getProperties")
    public String getProperties() {

        System.out.println("方式1--properties里没配置值,默认值browser--------->" +
                securityProperties.getBrowser().getLoginPage());
        System.out.println("方式1--properties里配置了值Android,默认值app------>" +
                securityProperties.getApp().getLoginPage());

        System.out.println("方式2---properties里没配置值,默认值yoyo------>"+unions.getPartI().getName());
        System.out.println("方式2---properties里配置了值10,默认值20------>"+unions.getPartII().getAge());

        return "ok";
    }
}
