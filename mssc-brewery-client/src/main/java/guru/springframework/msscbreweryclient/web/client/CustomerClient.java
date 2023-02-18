package guru.springframework.msscbreweryclient.web.client;

import guru.springframework.msscbreweryclient.web.model.CustomerDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.net.URI;
import java.util.UUID;

@Component
public class CustomerClient {
    private final String CUSTOMER_BASE_URL = "/api/v1/customer/";
    @Value("${sfg.brewery.apihost}")
    private String apihost;

    private final RestTemplate restTemplate;

    public CustomerClient(RestTemplateBuilder restTemplateBuilder) {
        this.restTemplate = restTemplateBuilder.build();
    }

    public CustomerDto getCustomerById(UUID uuid) {
        return restTemplate.getForObject(
                apihost + CUSTOMER_BASE_URL + uuid.toString(),
                CustomerDto.class);
    }

    public URI saveCustomer(CustomerDto customerDto) {
        return restTemplate.postForLocation(apihost + CUSTOMER_BASE_URL,
                                            customerDto);
    }

    public void updateCustomer(UUID uuid,
                               CustomerDto customerDto) {
        restTemplate.put(apihost + CUSTOMER_BASE_URL + uuid.toString(),
                            customerDto);
    }

    public void deleteCustomer(UUID uuid) {
        restTemplate.delete(apihost + CUSTOMER_BASE_URL + uuid.toString());
    }

}
