package com.company.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "client", schema = "booking_schema")
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @Column(name = "email")
    private String email;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "age")
    private Integer age;
    @Column( name = "gender")
    private GenderClient gender;
    @Column( name = "vip")
    private Boolean vip;
    @OneToMany(mappedBy = "client", fetch = FetchType.LAZY)
    private List<Booking> bookings;
    @Column( name = "password")
    private String password;

    public Client(String firstName, String lastName, String email, String phoneNumber, Integer age, GenderClient gender,Boolean vip, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.gender = gender;
        this.vip = vip;
        this.password = password;
    }
    public Client() {}

    public Long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public Integer getAge() {
        return age;
    }

    public GenderClient getGender() {
        return gender;
    }

    public Boolean getVip() {
        return vip;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public void setGender(GenderClient gender) {
        this.gender = gender;
    }

    public void setVip(Boolean vip) {
        this.vip = vip;
    }

    public void setBookings(List<Booking> bookings) {
        this.bookings = bookings;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
