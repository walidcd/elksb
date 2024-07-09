package com.elk.elksb.Controller;

import com.elk.elksb.Entities.Car;
import com.elk.elksb.repository.CarRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;



@RestController
@RequestMapping("/cars")
@AllArgsConstructor
public class CarController {
    private final CarRepository carRepository;

    @GetMapping
    public Iterable<Car> getAllCars() {
        return  carRepository.findAll();
    }

    @PostMapping
    public Car saveCar(@RequestBody Car car) {
        return carRepository.save(car);
    }

    @PutMapping
    public Car updateCar(@RequestBody Car car) {
        return carRepository.save(car);
    }

    @DeleteMapping("/{id}")
    public void deleteCar(@PathVariable String id) {
        carRepository.deleteById(id);
    }

    @GetMapping("/{id}")
    public Car getCar(@PathVariable String id) {
        return carRepository.findById(id).orElse(null);
    }
}
