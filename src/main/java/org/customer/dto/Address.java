package org.customer.dto;

import lombok.Data;
import lombok.ToString;

@Data
@ToString
public class Address {
    private String zipCode;
    private String street;
    private String complement;
    private String neighborhood;
    private String city;
    private String state;
}
