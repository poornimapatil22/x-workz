package Enum;
import Enum.Product;

public class CustomerDTO {

    private String name;
    private String email;
    private Product.ProductType productType;

    public CustomerDTO(String email, String name, Product.ProductType productType) {
        this.email = email;
        this.name = name;
        this.productType = productType;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public Product.ProductType getProductType(){
        return productType;
    }
}
