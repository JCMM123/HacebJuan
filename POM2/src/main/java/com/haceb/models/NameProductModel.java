package com.haceb.models;

public class NameProductModel {
    private static String nameProduct;

    public static String getNameProduct() {
        return nameProduct;
    }

    public static void setNameProduct(String nameProduct) {
        NameProductModel.nameProduct = nameProduct;
    }
}
