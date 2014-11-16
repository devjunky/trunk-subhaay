package com.ecommerce.subhaay.service.controller;

import com.ecommerce.subhaay.service.database.dao.DaoHelperService;
import com.ecommerce.subhaay.service.database.model.Product;
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

    @Autowired
    private DaoHelperService daoHelperService;


    @RequestMapping(value = "/all", method = RequestMethod.GET)
    @ResponseBody
    public Collection<Product> getAllProducts() {
        return daoHelperService.listProduct();
    }

    @RequestMapping(value = "/get/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Product retrieveQuestion(@PathVariable("id") String id) {
        return daoHelperService.getProductById(id);
    }

}
