package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarDAO {
    private List<Car> cars;

    {
        cars = new ArrayList<Car>();
        cars.add(new Car("Kia", "yellow", 1994));
        cars.add(new Car("Toyota", "green", 2001));
        cars.add(new Car("Lada", "blue", 2005));
        cars.add(new Car("Hyundai", "purple", 1999));
        cars.add(new Car("Mercedes", "brown", 1984));
    }


    public List<Car> getCars(int count) {
        if (count >= 0) {
            return cars.stream().limit(count).collect(Collectors.toList());
        } else return cars;
    }
}
