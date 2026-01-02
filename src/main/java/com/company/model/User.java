package com.company.model;

import com.company.dto.BookingDto;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "user", schema = "booking_schema")
public class User {
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
    @Enumerated(EnumType.STRING)
    @Column( name = "gender")
    private GenderUser gender;
    @Column( name = "vip")
    private Boolean vip;
    @OneToMany(mappedBy = "client", fetch = FetchType.LAZY)
    private List<Booking> bookings;
    @Column( name = "password")
    private String password;

    public User(String firstName, String lastName, String email, String phoneNumber, Integer age, GenderUser gender, Boolean vip, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.gender = gender;
        this.vip = vip;
        this.password = password;
    }
    public User() {}

//    public User(Builder builder) {
//        this.firstName = builder.firstName;
//        this.lastName = builder.lastName;
//        this.email = builder.email;
//        this.phoneNumber = builder.phoneNumber;
//        this.age = builder.age;
//        this.gender = builder.genderUser;
//        this.vip = builder.vip;
//        this.bookings = new ArrayList<>();
//        this.password = password;
//    }

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

    public GenderUser getGender() {
        return gender;
    }

    public Boolean getVip() {
        return vip;
    }

    public List<Booking> getBookings() {
        return bookings;
    }
//    public String getPassword() {
//        return password;
//    }

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

    public void setGender(GenderUser gender) {
        this.gender = gender;
    }

    public void setVip(Boolean vip) {
        this.vip = vip;
    }

    public void setBookings(ArrayList<Booking> bookings) {
        this.bookings = bookings;
    }

    public void setPassword(String password) {
        this.password = password;
    }

//    public static class Builder{
//        private Long id;
//        private String firstName;
//        private String lastName;
//        private String email;
//        private String phoneNumber;
//        private Integer age;
//        private GenderUser genderUser;
//        private Boolean vip;
//        private ArrayList<BookingDto> bookings;
//        private String password;
//
//        Builder(){}
//
//        public Builder setId(Long id) {
//            this.id = id;
//            return this;
//        }
//        public Builder setFirstName(String firstName){
//            this.firstName = firstName;
//            return this;
//        }
//        public Builder setLastName(String lastName){
//            this.lastName = lastName;
//            return this;
//        }
//        public Builder setEmail(String email){
//            this.email = email;
//            return this;
//        }
//        public Builder setPhoneNumber(String phoneNumber){
//            this.phoneNumber = phoneNumber;
//            return this;
//        }
//        public Builder setAge(Integer age){
//            this.age = age;
//            return this;
//        }
//        public Builder setGenderClient(GenderUser genderUser){
//            this.genderUser = genderUser;
//            return this;
//        }
//        public Builder setVip(Boolean vip){
//            this.vip = vip;
//            return this;
//        }
//        public Builder setBookings(ArrayList<BookingDto> bookings){
//            this.bookings = bookings;
//            return this;
//        }
//        public Builder setPassword(String password){
//            this.password = password;
//            return this;
//        }
//        public User build(){
//            return new User(this);
//        }
//    }
}
