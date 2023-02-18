package practice.sara.msscbrew.web.controller;

import jakarta.validation.ConstraintViolationException;
import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import practice.sara.msscbrew.services.CustomerService;
import practice.sara.msscbrew.web.model.BeerDto;
import practice.sara.msscbrew.web.model.CustomerDto;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Validated
@RequestMapping("/api/v1/customer/")
@RestController
public class CustomerController {

    private CustomerService customerService;

    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;
    }

    @GetMapping("/{customerId}")
    public ResponseEntity<CustomerDto> getCustomer(@NotNull @PathVariable("customerId")UUID customerId) {
        return new ResponseEntity<>(customerService.getCustomerById(customerId), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<CustomerDto> saveCustomer(@Valid @NotNull @RequestBody CustomerDto customerDto) {
        CustomerDto savedCustomer = customerService.save(customerDto);
        HttpHeaders headers = new HttpHeaders();
        // TODO: add hostname to url
        headers.add("Location", "/api/v1/customer/" + savedCustomer.getId().toString());
        return new ResponseEntity<>(headers, HttpStatus.CREATED);
    }

    @PutMapping("/{beerId}")
    public ResponseEntity<CustomerDto> updateCustomer(@NotNull @PathVariable("beerId") UUID beerId,
                                                      @Valid @NotNull @RequestBody CustomerDto customerDto) {
        customerService.update(beerId, customerDto);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }


    @DeleteMapping("/{beerId}")
    public void deleteCustomer(@NotNull @PathVariable("beerId") UUID beerId) {
        customerService.delete(beerId);
    }

}
