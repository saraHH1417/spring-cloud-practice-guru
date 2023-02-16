package practice.sara.msscbrew.services;

import practice.sara.msscbrew.web.model.CustomerDto;

import java.util.UUID;

public interface CustomerService {
    CustomerDto getCustomerById(UUID customerId);

}
