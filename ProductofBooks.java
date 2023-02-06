////get the list of all the product that belong to books category and product price  >>200 using java 8

import java.util.*;
import java.util.stream.Collectors;
public class ProductofBooks{

    private Integer id;
    private String category;
    private String name;
    private Integer price;

    
    public Integer getId() {
        return id;
    }


    public void setId(Integer id) {
        this.id = id;
    }


    public String getCategory() {
        return category;
    }


    public void setCategory(String category) {
        this.category = category;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public Integer getPrice() {
        return price;
    }


    public void setPrice(Integer price) {
        this.price = price;
    }

    public ProductofBooks(){
        super();
    }
    public ProductofBooks(Integer id, String category, String name, Integer price){
        super();
        this.id = id;
        this.category = category;
        this.name = name;
        this.price = price;
    }


    @Override
    public String toString() {
        return "ProductofBooks [id=" + id + ", category=" + category + ", name=" + name + ", price=" + price + "]";
    }


    public static void main(String[] args) {
        ProductofBooks p1 = new ProductofBooks (101, "Java", "Books", 150);
        ProductofBooks p2 = new ProductofBooks (102, "Spring", "Books", 300);
        ProductofBooks p3 = new ProductofBooks (103, "Html", "Books", 100);
        ProductofBooks p4 = new ProductofBooks (104, "CSS", "Books", 250);

        ProductofBooks p5 = new ProductofBooks (105, "Nokia", "Phones", 3000);
        ProductofBooks p6 = new ProductofBooks (106, "Samsung", "Phones", 1500);
        ProductofBooks p7 = new ProductofBooks (107, "Lenovo", "Phones", 2500);


        List<ProductofBooks> products = Arrays.asList(p1,p2,p3,p4,p5,p6,p7);

        products.stream().filter(p ->p.getCategory().equalsIgnoreCase("Books")).filter(p->p.getPrice() > 200)
        .collect(Collectors.toList()).forEach(System.out::println);
    }
}