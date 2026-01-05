CREATE TABLE booking_schema.room(
	id BIGINT AUTO_INCREMENT PRIMARY KEY,
	floor INT NOT NULL,
	room_number INT NOT NULL UNIQUE,
	room_type VARCHAR(30) NOT NULL,
	price_per_night FLOAT NOT NULL,
	capacity INT NOT NULL
);