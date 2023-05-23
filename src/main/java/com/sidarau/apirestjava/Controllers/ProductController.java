package com.sidarau.apirestjava.Controllers;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sidarau.apirestjava.Entities.Department;
import com.sidarau.apirestjava.Entities.Product;

@RestController
@RequestMapping(value = "/products")
public class ProductController {

    @GetMapping
    public List<Product> listar(){
        Department dep1 = new Department(1L,"Telefonia");
        Department dep2 = new Department(2L,"Relojoaria");

        Product prod1 = new Product(123L, "Citizen", 1240.10D,dep2);
        Product prod2 = new Product(1323L, "Nokia", 2140D,dep1);
        Product prod3 = new Product(4123L, "Samsung", 4540D,dep1);

        return Arrays.asList(prod1,prod2,prod3);
    }

}
