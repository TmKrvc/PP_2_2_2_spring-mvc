package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.List;

@Component
public class CarServicelmp implements CarService {
    private Car car = new Car();
    List<Car> cars = car.allCars();

    @Override
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
