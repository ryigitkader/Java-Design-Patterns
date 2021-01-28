package com.company.designpatterns.builder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Run {

    public static void main(String[] args) {

        /**
         * The  Builder Design's goal we dont want to set values like that
         */
         /*
            Product product1 = new Product();
            product1.setId(1L);
            product1.setName("product1");
            product1.setDescription("descrprod1");
            product1.setTime(LocalDateTime.now());
            product1.setPrice(BigDecimal.valueOf(100));
            product1.setInStock(true);
            //Product product2 = new Product(10L,"deneme");
          */

        /**
         * The  Builder Design's goal is above
         * Lombok library can do this with @Builder annotation
         */
        Product product = new Product.ProductBuilder()
                .Id(12L)
                .Description("descr")
                .Name("Builder Product")
                .InStock(true)
                .build();


        System.out.println(product.toString());
    }
}
