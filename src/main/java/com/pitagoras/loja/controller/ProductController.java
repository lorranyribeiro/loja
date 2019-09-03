package com.pitagoras.loja.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    private static List<String> products = new ArrayList(Arrays.asList("carvão", "cerveja", "carne"));

    @GetMapping
    public List<String> getProducts(){
        return products;
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveProduct(@RequestBody String product){
        products.add(product);
    }
}
