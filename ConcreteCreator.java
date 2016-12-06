import java.util.Locale;

/**
 * Created by fodoucou on 25/10/2016.
 */
public class ConcreteCreator implements Creator {

    public Product createProduct(){
        Locale locale= locale.getDefault();
        switch(locale.getCountry()){
            case "FR":
                return new ConcreteProductFr();
            break;
            case "EN":
                return new ConcreteProductEn();
            default:
                return  new ConcreteProductFr();

        }
        return null;
    }

}
