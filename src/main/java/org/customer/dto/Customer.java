package org.customer.dto;

import lombok.Data;

@Data
public class Customer {
    private String name;
    private String phone;
    private Gender gender;
    private String zipCode;
}
