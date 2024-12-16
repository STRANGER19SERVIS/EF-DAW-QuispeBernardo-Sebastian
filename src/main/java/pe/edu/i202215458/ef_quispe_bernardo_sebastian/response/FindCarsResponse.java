package pe.edu.i202215458.ef_quispe_bernardo_sebastian.response;

import pe.edu.i202215458.ef_quispe_bernardo_sebastian.dto.CarDto;

import java.util.List;

public record FindCarsResponse(String code,
                               String error,
                               List<CarDto> cars) {
}
