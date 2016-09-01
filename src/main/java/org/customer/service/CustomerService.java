package org.customer.service;

import lombok.extern.log4j.Log4j;
import org.customer.dto.Address;
import org.customer.dto.Customer;
import org.customer.integration.zipcode.ZipCodeIntegration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Log4j
public class CustomerService {

    @Autowired
    private ZipCodeIntegration zipCodeIntegration;

    public void save(Customer customer) {
        final Address address = zipCodeIntegration.findAddresByZipCode(customer.getZipCode());

        log.info(address);

        //save customer
    }

}
