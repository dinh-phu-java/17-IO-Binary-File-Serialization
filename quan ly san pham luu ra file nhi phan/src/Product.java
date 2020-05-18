import java.io.Serializable;

public class Product implements Serializable {
    private String productName;
    private String productVendor;
    private double productPrice;
    private int productId;
    private static int nextId=1;
    {
        this.productId=nextId;
        nextId++;
    }

    public Product(String name,String vendor,double price){
        this.productName=name;
        this.productVendor=vendor;
        this.productPrice=price;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductVendor() {
        return productVendor;
    }

    public void setProductVendor(String productVendor) {
        this.productVendor = productVendor;
    }

    public double getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(double productPrice) {
        this.productPrice = productPrice;
    }

    public int getProductId() {
        return productId;
    }

    @Override
    public String toString(){
        return "[Product ID: "+getProductId()+" ,Product Name: "+getProductName()+" , Product Vendor: "+getProductVendor()+" , Product Price: "+getProductPrice()+" ]";
    }
}
