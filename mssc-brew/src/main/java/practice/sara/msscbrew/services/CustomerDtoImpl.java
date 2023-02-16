package practice.sara.msscbrew.services;

import org.springframework.stereotype.Service;
import practice.sara.msscbrew.web.model.CustomerDto;

import java.util.UUID;

@Service
public class CustomerDtoImpl implements CustomerService{

    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder().id(UUID.randomUUID())
                .name("Joe Buck")
                .build();
    }
}
