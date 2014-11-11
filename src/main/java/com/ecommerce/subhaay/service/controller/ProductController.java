package com.ecommerce.subhaay.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

/**
 * Created by hackintosh on 11/10/2014.
 */
@Controller
@RequestMapping(value = "/rest/products")
public class ProductController {


    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @ResponseBody
    public String getAllQuestions() {
        return "Hello World...";
    }

}
