package pe.edu.i202215458.ef_quispe_bernardo_sebastian.dto;

public record CarDto(Integer carId,
                     String make,
                     String model,
                     String licensePlate,
                     String ownerName,
                     String ownerContact,
                     String insuranceCompany) {
}
