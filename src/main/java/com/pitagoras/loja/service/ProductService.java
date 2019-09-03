package com.pitagoras.loja.service;

import com.pitagoras.loja.domain.Product;
import com.pitagoras.loja.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public void createProduct(Product product) throws Exception {
        if(product.getPreco() == null){
            throw new Exception("Produto precisa de preco!!");
        }
        if(product.getNome() == null){
            throw new Exception("Produto precisa de nome!!");
        }
        productRepository.save(product);
    }
}
