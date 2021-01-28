package com.company.designpatterns.builder;

import java.math.BigDecimal;
import java.time.LocalDateTime;

//POJO
public class Product {

    private Long id;
    private String name;
    private LocalDateTime time;
    private Boolean inStock;
    private String description;
    private BigDecimal price;

    public Product(){}
    /*
    public Product(Long id, String name, LocalDateTime time, Boolean inStock, String description, BigDecimal price) {
        this.id = id;
        this.name = name;
        this.time = time;
        this.inStock = inStock;
        this.description = description;
        this.price = price;
    }
     */
    public Product(ProductBuilder productBuilder){
        this.id = productBuilder.id;
        this.name = productBuilder.name;
        this.time = productBuilder.time;
        this.inStock = productBuilder.inStock;
        this.description = productBuilder.description;
        this.price = productBuilder.price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Boolean getInStock() {
        return inStock;
    }

    public void setInStock(Boolean inStock) {
        this.inStock = inStock;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", time=" + time +
                ", inStock=" + inStock +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }

    //Our Builder Class
    public static class ProductBuilder{
        private Long id;
        private String name;
        private LocalDateTime time;
        private Boolean inStock;
        private String description;
        private BigDecimal price;

        public ProductBuilder Id(Long id) {
            this.id = id;
            return this;
        }

        public ProductBuilder Name(String name) {
            this.name = name;
            return this;
        }

        public ProductBuilder Time(LocalDateTime time) {
            this.time = time;
            return this;
        }

        public ProductBuilder InStock(Boolean inStock) {
            this.inStock = inStock;
            return this;
        }

        public ProductBuilder Description(String description) {
            this.description = description;
            return this;
        }

        public ProductBuilder Price(BigDecimal price) {
            this.price = price;
            return this;
        }

        public Product build(){
            Product product = new Product(this);
            return product;
        }
    }
}
