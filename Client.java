import java.util.Locale;

/**
 * Created by fodoucou on 25/10/2016.
 */
public class Client {
    Creator c= new ConcreteCreator();
    Product p= c.createProduct();
    Product p= c.createProduct(Locale.ENGLISH);


}
