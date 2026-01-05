CREATE TABLE booking_schema.booking(
        id BIGINT AUTO_INCREMENT PRIMARY KEY,
	price FLOAT NOT NULL,
	check_in TIMESTAMP NOT NULL,
	check_out TIMESTAMP NOT NULL,
	status VARCHAR(20) NOT NULL,
	room_id BIGINT NOT NULL,
	user_id BIGINT NOT NULL,
	CONSTRAINT fk_room FOREIGN KEY (room_id) REFERENCES room(id),
	CONSTRAINT fk_client FOREIGN KEY (user_id) REFERENCES user(id)
);