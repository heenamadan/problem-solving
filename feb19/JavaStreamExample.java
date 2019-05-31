package feb19;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

class Product{
    int id;
    String name;
    float price;
    int p;
    public Product(int id, String name, float price, int p) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.p=p;
    }
}
public class JavaStreamExample {
    public static void main(String[] args) {
        List<Product> productsList = new ArrayList<Product>();
        //Adding Products
        productsList.add(new Product(1,"HP Laptop",25000f, 1));
        productsList.add(new Product(2,"Dell Laptop",30000f, 2));
        productsList.add(new Product(3,"Lenevo Laptop",28000f,3 ));
        productsList.add(new Product(4,"Sony Laptop",28000f,4));
        productsList.add(new Product(5,"Apple Laptop",90000f,5));
        // This is more compact approach for filtering data
        Float totalPrice = productsList.stream()
                .map(product->product.price)
                .reduce(0.0f,(sum, price)->sum+price);   // accumulating price
        System.out.println(totalPrice);
        // More precise code
        float totalPrice2 = productsList.stream()
                .map(product->product.price)
                .reduce(0.0f,Float::sum);   // accumulating price, by referring method of Float class
        System.out.println(totalPrice2);

        int s= productsList.stream().map(pro->pro.p).reduce(0, Integer::sum);
        System.out.println(s);
        double totalPrice3 = productsList.stream()
                .collect(Collectors.summingDouble(product->product.price));






    }
}
