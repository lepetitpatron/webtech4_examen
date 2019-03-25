package edu.ap.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class BlockChainController
{
    @GetMapping("/")
    @ResponseBody
    public String index()
    {
        return "Blockchain";
    }
}