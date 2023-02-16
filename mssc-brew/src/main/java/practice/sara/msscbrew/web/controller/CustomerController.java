package practice.sara.msscbrew.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import practice.sara.msscbrew.services.CustomerService;
import practice.sara.msscbrew.web.model.BeerDto;
import practice.sara.msscbrew.web.model.CustomerDto;

import java.util.UUID;

@RequestMapping("/api/v1/customer")
@RestController
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/{customerId}")
    public ResponseEntity<CustomerDto> getCustomer(@PathVariable("customerId")UUID customerId) {
        return new ResponseEntity<>(customerService.getCustomerById(customerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<CustomerDto> saveCustomer(@RequestBody CustomerDto customerDto) {
        CustomerDto savedCustomer = customerService.save(customerDto);
        return new ResponseEntity<>(savedCustomer, HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity<CustomerDto> updateCustomer(@PathVariable("beerId") UUID beerId,
                                                      @RequestBody CustomerDto customerDto) {
        customerService.update(beerId, customerDto);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


    @DeleteMapping("/{beerId}")
    public void deleteCustomer(@PathVariable("beerId") UUID beerId) {
        customerService.delete(beerId);
    }

}
