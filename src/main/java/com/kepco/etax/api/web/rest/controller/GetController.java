package com.kepco.etax.api.web.rest.controller;

import com.kepco.etax.api.domain.dto.MemberDTO;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/get-api")
public class GetController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String getHello() {
        return "Hello, Jhipster Microservices";
    }

    @GetMapping(value = "/variable1/{val}")
    public String getVariable(@PathVariable String val) {
        return val;
    }

    @GetMapping(value = "/variable2/{val}")
    public String getVariable2(@PathVariable("val") String var) {
        return var;
    }

    @GetMapping(value = "/request1")
    public String getRequestParam(@RequestParam String name, @RequestParam String email, @RequestParam String organization) {
        return name + "/" + email + "/" + organization;
    }

    @GetMapping(value = "/request2")
    public String getRequestParam2(@RequestParam Map<String, String> param) {
        StringBuilder sb = new StringBuilder();

        param.entrySet().forEach(map -> {
            sb.append(map.getKey() + " " + map.getValue() + "\n");
        });

        return sb.toString();
    }

    @GetMapping(value = "/request3")
    public String getRequestParam3(MemberDTO memberDTO) {
        return memberDTO.toString();
    }

}
