package com.alergenko.repositoriesInt;

import com.alergenko.entities.Product;

public interface ProductRepoInt {

    void save(Product product);

    Product findByBarcode(String barcode);

    Product getRandomProduct();

    void update(Product product);

    void delete(String barcode);

}
