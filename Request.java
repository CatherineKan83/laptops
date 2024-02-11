// Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
// Создать множество ноутбуков.
// Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки, отвечающие фильтру.
// Критерии фильтрации можно хранить в Map.
// Например:
// “Введите цифру, соответствующую необходимому критерию:
// 1 - ОЗУ
// 2 - Объем ЖД
// 3 - Операционная система
// 4 - Цвет …
// 5 - Поиск
// Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
// Отфильтровать ноутбуки из первоначального множества и вывести проходящие по условиям.
// Работу сдать как обычно ссылкой на гит репозиторий
// Частые ошибки:
// 1. Заставляете пользователя вводить все существующие критерии фильтрации
// 2. Невозможно использовать более одного критерия фильтрации одновременно
// 3. При выборке выводятся ноутбуки, которые удовлетворяют только одному фильтру, а не всем введенным пользователем
// 4. Работа выполнена только для каких то конкретных ноутбуков, и если поменять характеристики ноутбуков или добавить еще ноутбук, то
// программа начинает работать некорректно

import java.util.*;


public class Request{
    public static void main (String[]args){
        data string = new data();
        String[] brands = string.brands;
        String[] AcerSeries = string.AcerSeries;
        String[] AsusSeries = string.AsusSeries;
        String[] AppleSeries = string.AppleSeries;
        String[] LenovoSeries = string.LenovoSeries;
        String[] DellSeries = string.DellSeries;
        String[] HpSeries = string.HpSeries;
        String[] HuaweiSeries = string.HuaweiSeries;
        String[] SamsungSeries = string.SamsungSeries;
        String[] XiaomiSeries = string.XiaomiSeries;
        String[] OZU = string.OZU;
        String[] HDD = string.HDD;
        String[] OS = string.OS;
        String[] color = string.color;

        Laptop laptop1 = new Laptop();
        laptop1.brand = brands[1];
        laptop1.series = AsusSeries[0];
        laptop1.OZU = OZU[3];
        laptop1.HDD = HDD[6];
        laptop1.OS = OS[1];
        laptop1.color = color[0];

        Laptop laptop2 = new Laptop();
        laptop2.brand = brands[2];
        laptop2.series = AppleSeries[2];
        laptop2.OZU = OZU[2];
        laptop2.HDD = HDD[5];
        laptop2.OS = OS[3];
        laptop2.color = color[4];

        Laptop laptop3 = new Laptop();
        laptop3.brand = brands[3];
        laptop3.series = LenovoSeries[3];
        laptop3.OZU = OZU[0];
        laptop3.HDD = HDD[4];
        laptop3.OS = OS[1];
        laptop3.color = color[4];

        Laptop laptop4 = new Laptop();
        laptop4.brand = brands[0];
        laptop4.series = AcerSeries[0];
        laptop4.OZU = OZU[1];
        laptop4.HDD = HDD[3];
        laptop4.OS = OS[1];
        laptop4.color = color[6];

        Laptop laptop5 = new Laptop();
        laptop5.brand = brands[4];
        laptop5.series = DellSeries[0];
        laptop5.OZU = OZU[2];
        laptop5.HDD = HDD[5];
        laptop5.OS = OS[7];
        laptop5.color = color[2];

        Laptop laptop6 = new Laptop();
        laptop6.brand = brands[5];
        laptop6.series = HpSeries[0];
        laptop6.OZU = OZU[2];
        laptop6.HDD = HDD[5];
        laptop6.OS = OS[2];
        laptop6.color = color[0];

        Laptop laptop7 = new Laptop();
        laptop7.brand = brands[6];
        laptop7.series = HuaweiSeries[0];
        laptop7.OZU = OZU[2];
        laptop7.HDD = HDD[10];
        laptop7.OS = OS[7];
        laptop7.color = color[1];

        Laptop laptop8 = new Laptop();
        laptop8.brand = brands[7];
        laptop8.series = SamsungSeries[0];
        laptop8.OZU = OZU[2];
        laptop8.HDD = HDD[5];
        laptop8.OS = OS[7];
        laptop8.color = color[4];

        Laptop laptop9 = new Laptop();
        laptop9.brand = brands[8];
        laptop9.series = XiaomiSeries[0];
        laptop9.OZU = OZU[1];
        laptop9.HDD = HDD[1];
        laptop8.OS = OS[7];
        laptop9.color = color[1];

        Set<Laptop>laptops = new HashSet<>();
        laptops.add(laptop1);
        laptops.add(laptop2);
        laptops.add(laptop3);
        laptops.add(laptop4);
        laptops.add(laptop5);
        laptops.add(laptop6);
        laptops.add(laptop7);
        laptops.add(laptop8);
        laptops.add(laptop9);

        printSet(laptops);
    }
    static Set<String>laptops= new HashSet<>();
    static void printSet(Set<Laptop>set) {
        int check = 0;
        List<String> a = Menu.menu();
        for (Laptop laptop : set) {
            String b = String.valueOf(laptop);
            for (String s : a) {
                if (b.contains(s)) {
                    check+=1;
                    if(check==a.size()) {
                        laptops.add(laptop + "\n");
                    }
                }
            }
            check=0;
        }
        if (laptops.isEmpty()) {
            System.out.print("По вашему запросу ничего не найдено.");
        } else {
            System.out.print(String.valueOf(laptops).replace("[", "").replace("]", "").replace(",", ""));
        }
    }
}