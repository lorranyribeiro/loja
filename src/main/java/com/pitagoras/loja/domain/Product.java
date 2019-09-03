package com.pitagoras.loja.domain;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.math.BigDecimal;

@Data
@Entity
@Table(name = "product")
public class Product {
    @Id
    @GeneratedValue
    private Long id;
    private String nome;
    private BigDecimal preco;
}
