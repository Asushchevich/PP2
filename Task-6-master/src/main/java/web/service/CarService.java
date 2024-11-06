package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;
import java.util.Arrays;
import java.util.List;

@Service
public class CarService {

    private final List<Car> cars = Arrays.asList(
            new Car(1L, "Toyota", "red"),
            new Car(2L, "Honda", "white"),
            new Car(3L, "Ford", "blue"),
            new Car(4L, "Chevrolet", "grey"),
            new Car(5L, "Nissan", "green")
    );

    public List<Car> getCars(int count) {
        return count >= cars.size() ? cars : cars.subList(0, count);
    }
}
