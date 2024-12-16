package pe.edu.i202215458.ef_quispe_bernardo_sebastian.response;

import pe.edu.i202215458.ef_quispe_bernardo_sebastian.dto.CarDetailDto;

public record FindCarResponse(String code,
                              String error,
                              CarDetailDto carDetailDto) {
}
