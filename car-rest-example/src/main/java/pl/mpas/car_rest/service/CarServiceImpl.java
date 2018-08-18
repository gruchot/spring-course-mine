package pl.mpas.car_rest.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import pl.mpas.car_rest.dao.CarDao;
import pl.mpas.car_rest.domain.Car;

import java.util.List;

@Component
public class CarServiceImpl implements CarService {

    private CarDao carDao;

    @Autowired
    public CarServiceImpl(CarDao carDao) {
        this.carDao = carDao;
    }

    @Override
    public List<Car> getFavoritesCars() {
        return carDao.getCars();
    }
}
