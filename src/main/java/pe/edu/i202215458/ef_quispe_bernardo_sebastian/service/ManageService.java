package pe.edu.i202215458.ef_quispe_bernardo_sebastian.service;

import pe.edu.i202215458.ef_quispe_bernardo_sebastian.dto.CarDetailDto;
import pe.edu.i202215458.ef_quispe_bernardo_sebastian.dto.CarDto;
import pe.edu.i202215458.ef_quispe_bernardo_sebastian.dto.CarUpdateDto;

import java.util.List;
import java.util.Optional;

public interface ManageService {
    List<CarDto> getAllCars() throws Exception;

    Optional<CarDetailDto> getCarById(int id) throws Exception;

    boolean updateCar(CarDto CarDto) throws Exception;

    boolean deleteCarById(int id) throws Exception;

    boolean addCar(CarUpdateDto carUpdateDto) throws Exception;
}
