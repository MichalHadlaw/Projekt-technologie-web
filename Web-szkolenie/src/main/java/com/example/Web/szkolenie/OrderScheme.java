package com.example.Web.szkolenie;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Entity
@Getter
@Setter
public class OrderScheme {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private Client client;

    @ManyToOne
    private Product product;

    private int quantity;
    private Date orderDate;

    public OrderScheme(Long id, Client client,Product product, Date orderDate) {
        this.id = id;
        this.client = client;
        this.product = product;
        this.orderDate = orderDate;
    }


}
