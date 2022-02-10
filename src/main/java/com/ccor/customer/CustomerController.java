package com.ccor.customer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@Slf4j
@RestController
@RequestMapping("api/v1/customer")
public record CustomerController(CustomerService customerService) {

    @PostMapping("/save")
    public void registerCustomer(@RequestBody CustomerRequest request) {
        log.info("new customer registration {}", request);
        customerService.registerCustomer(request);
    }
}
