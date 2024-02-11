import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Menu {
    public static List<String> menu() {
        data string = new data();
        String[] brands = string.brands;
        String[] OZU = string.OZU;
        String[] HDD = string.HDD;
        String[] OS = string.OS;
        String[] color = string.color;
        List<String> l = new ArrayList<>();
        int Search;
        int searchWord;
        input input = new input();
        boolean Check = false;
        boolean check = false;
        while (!Check) {
            System.out.println("""
                 “Введите цифру, соответствующую необходимому критерию:
                 1) Бренд
                 2) ОЗУ
                 3) Объём ЖД
                 4) Операционная система
                 5) Цвет …
                 6) Поиск
                """);
            Search = input.in();
            if (Objects.equals(Search, 1)) {
                while(!check){
                    System.out.println("""
                        Выберите наименование бренда:
                        1) Acer
                        2) Asus
                        3) Apple
                        4) Lenovo
                        5) Dell
                        6) HP
                        7) Huawei
                        8) Samsung
                        9) Xiaomi
                        """);
                    searchWord = input.in();
                    if (searchWord >= 1 && searchWord <= 9) {
                        l.add(brands[searchWord - 1]);
                        check=true;
                    } else {
                        System.out.println("Ошибка ввода.");
                    }
                }
                check=false;
            } else if (Objects.equals(Search, 2)) {
                while(!check){
                    System.out.println("""
                            Выберите размер ОЗУ:
                        1) DDR4 SO-DIMM - 4Гб
                        2) DDR4 SO-DIMM - 8Гб
                        3) DD4 SO-DIMM - 16Гб
                        4) DDR4 DIMM - 32Гб
                        """);
                    searchWord = input.in();
                    if (searchWord >= 1 && searchWord <= 4) {
                        l.add(OZU[searchWord - 1]);
                        check = true;
                    }else {
                        System.out.println("Ошибка ввода.");
                    }
                }
                check=false;
            } else if (Objects.equals(Search, 3)) {
                while(!check){
                    System.out.println("""
                        Выберите объём ЖД(в Гб/Тб):
                        1) 8Гб
                        2) 64Гб
                        3) 160Гб
                        4) 256Гб
                        5) 320Гб
                        6) 512Гб
                        7) 1Тб/1000Гб
                        8) 3,48Тб/3048Гб
                        9) 5Тб/5000Гб
                        10) 8Тб/8000Гб
                        11) Поддерживает только SSD
                        """);
                    searchWord = input.in();
                    if (searchWord >= 1 && searchWord <= 11) {
                        l.add(HDD[searchWord - 1]);
                        check=true;
                    } else {
                        System.out.println("Ошибка ввода.");
                    }
                }
                check=false;
            } else if (Objects.equals(Search, 4)) {
                while(!check){
                    System.out.println("""
                        Выберите тип операционной системы:
                        1) MS-Windows
                        2) Windows 10
                        3) Ubuntu
                        4) Mac OS
                        5) Fedora
                        6) Solaris
                        7) Chrome OS
                        8) Windows 11
                        """);
                    searchWord = input.in();
                    if (searchWord >= 1 && searchWord <= 8) {
                        l.add(OS[searchWord - 1]);
                        check=true;
                    } else {
                        System.out.println("Ошибка ввода.");
                    }
                }
                check=false;
            } else if (Objects.equals(Search, 5)) {
                while(!check){
                    System.out.println("""
                        Выберите цвет:
                        1) Чёрный
                        2) Белый
                        3) Серый
                        4) Голубой
                        5) Серебряный
                        6) Синий
                        7) Золотой
                        8) Красный
                        9) Жёлтый
                        10) Розовый
                        """);
                    searchWord = input.in();
                    if (searchWord >= 1 && searchWord <= 10) {
                        l.add(color[searchWord - 1]);
                        check=true;
                    } else {
                        System.out.println("Ошибка ввода.");
                    }
                }
                check=false;
            } else if (Objects.equals(Search, 6)) {
                Check = true;
            } else {
                System.out.println("Ошибка ввода. Попробуйте ещё раз.");
            }
        }
        System.out.println("Результаты по запросу: " + Arrays.toString(l.toArray()).replace("[","").replace("]",""));
        return l;
    }
}