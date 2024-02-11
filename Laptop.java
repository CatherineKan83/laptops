import java.util.ArrayList;
import java.util.List;

public class Laptop{
    String brand;
    String series;
    String OZU;
    String HDD;
    String OS;
    String color;
    List<String> laptop = new ArrayList<>();

    @Override

    public String toString(){
        return "\nБренд: " + brand + "\nСерия: " + series + "\nОЗУ: " + OZU + "\nОбъём ЖД: " + HDD + "\nОперационная система: " + OS + "\nЦвет: " + color;
    }
}
