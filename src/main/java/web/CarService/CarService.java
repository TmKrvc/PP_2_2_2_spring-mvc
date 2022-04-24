package web.CarService;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;

@Component
public class CarService {
    private Car car = new Car();
    List<Car> cars = car.allCars();

    public List<Car> showCar(Integer count) {
        if (count == null) {
            return cars.subList(0, cars.size());
        }
        if (count > cars.size()) {
            return cars.subList(0, cars.size());
        } else {
            return cars.subList(0, count);
        }
    }
}
