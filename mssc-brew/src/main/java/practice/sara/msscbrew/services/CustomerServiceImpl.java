package practice.sara.msscbrew.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import practice.sara.msscbrew.web.model.CustomerDto;

import java.util.UUID;

@Slf4j
@Service
public class CustomerServiceImpl implements CustomerService{

    @Override
    public CustomerDto getCustomerById(UUID customerId) {
        return CustomerDto.builder().id(UUID.randomUUID())
                .name("Joe Buck")
                .build();
    }

    @Override
    public CustomerDto save(CustomerDto customerDto) {
        return CustomerDto.builder()
                .id(UUID.randomUUID())
                .name(customerDto.getName())
                .build();
    }

    @Override
    public void update(UUID beerId, CustomerDto customerDto) {
        // TODO: implement Customer Update Method
    }

    @Override
    public void delete(UUID beerId) {
        log.debug("Deleting a Customer ...");
    }
}
