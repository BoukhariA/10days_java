// Arraylist as library
import java.util.ArrayList;
// list as library
import java.util.List;

public class ProductService {

    List<Product> products = new ArrayList<>();

    public void addProduct(Product p){
        products.add(p);
    }

    public List<Product> getAllProducts(){
        return products;
    }

    public Product getProduct(String name){
        for(Product p : products){
            if(p.getName().equals(name))
                return p;
        }

        return null;
    }
    
    
    public List<Product> getProductWithText(String text) {
        String str = text.toLowerCase();
        List<Product> prods = new ArrayList<>();

        for(Product p : products){
            String name = p.getName().toLowerCase();
            String type = p.getType().toLowerCase();
            String place = p.getPlace().toLowerCase();
            if(name.contains(str) || type.contains(str) || place.contains(str))
                prods.add(p);
        }
        return prods;

    }
    //search by place

    public List<Product> getPlace(String place) {
        String str = place.toLowerCase();
        List<Product> prods = new ArrayList<>();
        for (Product p : products) {
            if (p.getPlace().equalsIgnoreCase(str)) {
                prods.add(p);
            }
        }
        return prods;
    }

    //Search a products out of warranty

    public List<Product> getWarranty(int warranty) {
        List <Product> Prods = new ArrayList<>();

        for(Product prods: products){
            if(prods.getWarranty()<warranty)
                Prods.add(prods);
        }
        return Prods;
    }

}