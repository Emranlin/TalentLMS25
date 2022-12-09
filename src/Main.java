import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<Car, InfoCar> cars = new HashMap<>();
        cars.put(new Car(12, "OA4578"),
                new InfoCar(LocalDate.of(2020, 6, 20), "Camry LX", BigDecimal.valueOf(200000), "Black"));
        cars.put(new Car(13, "OA7878"),
                new InfoCar(LocalDate.of(2021, 1, 15), "Highlander", BigDecimal.valueOf(400000), "Black"));
        cars.put(new Car(14, "OA4545"),
                new InfoCar(LocalDate.of(2000, 7, 21), "Lexus 330", BigDecimal.valueOf(500000), "Blue"));
        cars.put(new Car(15, "OA4578"),
                new InfoCar(LocalDate.of(2018, 9, 29), "Bugatti ", BigDecimal.valueOf(100000), "White"));
        Iterator<Map.Entry<Car, InfoCar>> iterator = cars.entrySet().iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}