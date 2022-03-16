package Model.Entities;

public class Product {

    private int productId;
    private String productName;
    private String modelYear;
    private Double listPrice;
    private String brandName;
    private String categoryName;

    public Product() {
    }

    public Product(int productId, String productName, String modelYear, Double listPrice, String brandName, String categoryName) {
        this.productId = productId;
        this.productName = productName;
        this.modelYear = modelYear;
        this.listPrice = listPrice;
        this.brandName = brandName;
        this.categoryName = categoryName;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getModelYear() {
        return modelYear;
    }

    public void setModelYear(String modelYear) {
        this.modelYear = modelYear;
    }

    public Double getListPrice() {
        return listPrice;
    }

    public void setListPrice(Double listPrice) {
        this.listPrice = listPrice;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }

    @Override
    public String toString() {
        return "Product{" + "productId=" + productId + ", productName=" + productName + ", modelYear=" + modelYear + ", listPrice=" + listPrice + ", brandName=" + brandName + ", categoryName=" + categoryName + '}';
    }

}
