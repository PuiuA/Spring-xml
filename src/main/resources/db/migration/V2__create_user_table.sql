CREATE TABLE booking_schema.user (
     id BIGINT AUTO_INCREMENT PRIMARY KEY,
     first_name VARCHAR(255),
     last_name VARCHAR(255),
     email VARCHAR(255) UNIQUE NOT NULL,
     phone_number VARCHAR(50) UNIQUE NOT NULL,
     age INT NOT NULL,
     gender VARCHAR(15) NOT NULL,
     vip BOOLEAN
 );