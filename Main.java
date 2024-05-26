// Интерфейс ТорговыйАвтомат
interface ТорговыйАвтомат {
    void getProduct(int name, int volume);
}

// Класс ГорячийНапиток
// Класс ГорячийНапиток
class ГорячийНапиток {
    String name;
    int volume;
    int temperature;

    public ГорячийНапиток(String name, int volume, int temperature) {
        this.name = name;
        this.volume = volume;
        this.temperature = temperature;
    }
}

// Класс ГорячиеНапиткиАвтомат
class ГорячиеНапиткиАвтомат implements ТорговыйАвтомат {
    ГорячийНапиток[] drinks;

    public ГорячиеНапиткиАвтомат(ГорячийНапиток[] drinks) {
        this.drinks = drinks;
    }

    @Override
    public void getProduct(int name, int volume) {
        for (ГорячийНапиток drink : drinks) {
            if (drink.name.equals(name) && drink.volume == volume) {
                // Логика по выдаче продукта
                System.out.println("Продукт " + drink.name + " объемом " + drink.volume + " выдан!");
                return;
            }
        }
        System.out.println("Продукт не найден.");
    }
}

// В main
public class Main {
    public static void main(String[] args) {
        ГорячийНапиток[] горячиеНапитки = {new ГорячийНапиток("Чай", 200, 80), new ГорячийНапиток("Кофе", 300, 70)};
        ГорячиеНапиткиАвтомат автомат = new ГорячиеНапиткиАвтомат(горячиеНапитки);

        автомат.getProduct(0, 200); // Передаем индекс горячего напитка в массиве и объем
        автомат.getProduct(1, 150); // Передаем индекс другого горячего напитка и объем
    }
}

