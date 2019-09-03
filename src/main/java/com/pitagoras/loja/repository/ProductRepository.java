package com.pitagoras.loja.repository;

import com.pitagoras.loja.domain.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
