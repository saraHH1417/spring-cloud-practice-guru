package practice.sara.msscbrew.services;

import practice.sara.msscbrew.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);

    CustomerDto save(CustomerDto customerDto);

    void update(UUID beerId, CustomerDto customerDto);

    void delete(UUID beerId);
}
