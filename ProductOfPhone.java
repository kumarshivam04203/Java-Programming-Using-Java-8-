//// get the cheapest product of phone category using java 8 

import java.util.Arrays;
import java.util.Comparator;

public class ProductOfPhone{
    private Integer id;
    private String name;
    private String category;
    private Integer price;
    

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    public Integer getPrice() {
        return price;
    }
    public void setPrice(Integer price) {
        this.price = price;
    }
    public ProductOfPhone(){
        super();
    }
    public ProductOfPhone (Integer id, String name, String category, Integer price){
        super();
        this.id = id;
        this.name = name;
        this.category = category;
        this.price = price;
    }

    @Override
    public String toString(){
        return"ProductOfPhone {id= "+ id +", name=" + name +", category=" + category + ", price=" + price +"}";
    }
    public static void main(String[] args) {
        ProductOfPhone p1 = new ProductOfPhone (101, "Java", "Books", 150);
        ProductOfPhone p2 = new ProductOfPhone (102, "Spring", "Books", 300);
        ProductOfPhone p3 = new ProductOfPhone (103, "Html", "Books", 100);
        ProductOfPhone p4 = new ProductOfPhone (104, "CSS", "Books", 250);

        ProductOfPhone p5 = new ProductOfPhone (105, "Nokia", "Phones", 3000);
        ProductOfPhone p6 = new ProductOfPhone (106, "Samsung", "Phones", 1500);
        ProductOfPhone p7 = new ProductOfPhone (107, "Lenovo", "Phones", 2500);

        List<ProductOfPhone> products = Arrays.asList(p1,p2,p3,p4,p5,p6,p7);

        ProductOfPhone cheapetsProduct = products.stream().filter(p -> p.getCategory().equalsIgnoreCase("Phone"))
        .min(Comparator.comparing(ProductOfPhone :: getPrice)).get();

        System.out.println(cheapetsProduct);
    }
}