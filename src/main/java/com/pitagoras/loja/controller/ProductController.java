package com.pitagoras.loja.controller;

import com.pitagoras.loja.domain.Product;
import com.pitagoras.loja.repository.ProductRepository;
import com.pitagoras.loja.service.ProductService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;
import java.util.List;

@RestController
@RequestMapping("/products")
@Api
public class ProductController extends BaseController{

    @Autowired
    private ProductRepository productRepository;

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getProducts(){
        return productRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public void saveProduct(@RequestBody Product product) throws Exception {
        productService.createProduct(product);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updateProduct(@RequestBody Product product){
        productRepository.save(product);
    }

    @PatchMapping("/{idProduct}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void updatePrice(@PathVariable("idProduct") Long idProduct, @RequestBody BigDecimal price){
        Product product = productRepository.findById(idProduct).get();
        product.setPreco(price);
        productRepository.save(product);
    }

    @DeleteMapping("/{idProduct}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteProduct(@PathVariable("idProduct") Long idProduct){
        productRepository.deleteById(idProduct);
    }

}
