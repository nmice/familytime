DROP TABLE IF EXISTS calendar_event;
CREATE TABLE calendar_event
(
    id         BIGINT PRIMARY KEY AUTO_INCREMENT,
    descriptor VARCHAR(255),
    start_date TIMESTAMP NOT NULL,
    is_exactly BOOLEAN,
    user_id  BIGINT
);

DROP TABLE IF EXISTS users;
CREATE TABLE users
(
    id        BIGINT PRIMARY KEY AUTO_INCREMENT,
    name      VARCHAR(255)
);

ALTER TABLE calendar_event
    ADD CONSTRAINT fk_calendar_event_to_users FOREIGN KEY (user_id) REFERENCES users (id);