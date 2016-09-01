package org.customer.integration.zipcode;

import org.customer.dto.Address;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("zipcode")
public interface ZipCodeIntegration {

    @RequestMapping(value = "/v1/zip-codes/{zipCode}", method = RequestMethod.GET)
    Address findAddresByZipCode(@PathVariable("zipCode") String zipCode);

}