package za.co.cput.domain;

import jakarta.persistence.Embeddable;

@Embeddable
public class Address {
    private String streetNumber;
    private String unitNumber;
    private String complexNumber;
    private String complexName;
    private String apartmentNumber;
    private String street;
    private String city;
    private String state;
    private String postalCode;


}
