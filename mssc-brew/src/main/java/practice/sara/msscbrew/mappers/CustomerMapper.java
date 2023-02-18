package practice.sara.msscbrew.mappers;

import org.mapstruct.Mapper;
import practice.sara.msscbrew.domain.Customer;
import practice.sara.msscbrew.web.model.CustomerDto;

@Mapper
public interface CustomerMapper {

    CustomerDto customerToCustomerDto(Customer customer);
    Customer customerDtoToCustomer(CustomerDto customerDto);

}
