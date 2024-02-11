import java.util.ArrayList;
import java.util.List;

class data {
    String[] brands = {"Acer", "Asus", "Apple", "Lenovo", "Dell", "HP", "Huawei", "Samsung", "Xiaomi"};
    String[] AcerSeries = {"Swift 3", "Aspire", "Chromebook"};
    String[] AsusSeries = {"TUF Gaming F15", "Vivobook", "N series"};
    String[] AppleSeries = {"MacBook Air", "Mac", "Mac Pro 14"};
    String[] LenovoSeries = {"ThinkPad X1 Carbon", "Legion 5 Pro", "Yoga 9i", "Thinkpad T420"};
    String[] DellSeries = {"XPS 15", "Inspiron 14", "Alienware m18"};
    String[] HpSeries = {"Spectre x360", "Dragomfly Pro Chromebook", "Victus 16"};
    String[] HuaweiSeries = {"MateBook X pro", "MateBook D 15"};
    String[] SamsungSeries = {"Galaxy Book Pro", "Chromebook 4", "Chromebook Plus V2"};
    String[] XiaomiSeries = {"Mi Notebook 14(IC)", "Mi Notebook 14 e- Learning Edition"};
    String[] OZU = {"DDR4 SO-DIMM - 4Гб", "DDR4 SO-DIMM - 8Гб", "DD4 SO-DIMM - 16Гб", "DDR4 DIMM - 32Гб"};
    String[] HDD = {"8Гб", "64Гб", "160Гб", "256Гб", "320Гб", "512Гб", "1Тб/1000Гб", "3,48Тб/3048Гб", "5Тб/5000Гб", "8Тб/8000Гб","Поддерживает только SSD"};
    String[] OS = {"MS-Windows", "Windows 10", "Ubuntu", "Mac OS", "Fedora", "Solaris", "Chrome OS", "Windows 11"};
    String[] color = {"Чёрный", "Белый", "Серый", "Голубой", "Серебряный", "Синий", "Золотой", "Красный", "Жёлтый", "Розовый"};
    List<String> categories = new ArrayList<>();

    public String toString() {
        return categories.toString();
    }
}
