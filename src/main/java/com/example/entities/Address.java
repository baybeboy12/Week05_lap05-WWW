package com.example.entities;

import com.neovisionaries.i18n.CountryCode;
import jakarta.persistence.*;

@Entity
@Table
public class Address {
    @Id
    @Column(length = 20)
    private long add_id;
    @Column(columnDefinition = "smallint",length = 6)
    private CountryCode country;
    @Column(length = 7)
    private String zipcode;
    @Column(length = 20)
    private String number;
    @Column(length = 50)
    private String city;
    @Column(length = 150)
    private String street;
    @OneToOne
    @JoinColumn(name = "can_id")
    private Candidate candidate;
    @OneToOne
    @JoinColumn(name = "com_id")
    private Company company;
    public Address() {
    }

    public Address(long add_id, CountryCode country, String zipcode, String number, String city, String street) {
        this.add_id = add_id;
        this.country = country;
        this.zipcode = zipcode;
        this.number = number;
        this.city = city;
        this.street = street;
    }

    public long getAdd_id() {
        return add_id;
    }

    public void setAdd_id(long add_id) {
        this.add_id = add_id;
    }

    public CountryCode getCountry() {
        return country;
    }

    public void setCountry(CountryCode country) {
        this.country = country;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    @Override
    public String toString() {
        return "address{" +
                "add_id=" + add_id +
                ", country=" + country +
                ", zipcode='" + zipcode + '\'' +
                ", number='" + number + '\'' +
                ", city='" + city + '\'' +
                ", street='" + street + '\'' +
                '}';
    }
}
