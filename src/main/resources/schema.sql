DROP TABLE IF EXISTS calendar_event;
CREATE TABLE calendar_event
(
    id         VARCHAR(50) PRIMARY KEY,
    descriptor VARCHAR(255),
    start_date TIMESTAMP NOT NULL,
    end_date   DATETIME  NOT NULL,
    is_exactly BOOL,
    family_id  VARCHAR(50)
);

DROP TABLE IF EXISTS users;
CREATE TABLE users
(
    id        VARCHAR(50) PRIMARY KEY,
    login     VARCHAR(255) UNIQUE,
    pass      VARCHAR(50),
    name      VARCHAR(255),
    family_id VARCHAR(50)
);

DROP TABLE IF EXISTS family;
CREATE TABLE family
(
    id   VARCHAR(50) PRIMARY KEY,
    name VARCHAR(255) UNIQUE
);

ALTER TABLE calendar_event
    ADD CONSTRAINT fk_calendar_event_to_family FOREIGN KEY (family_id) REFERENCES family (id);

ALTER TABLE users
    ADD CONSTRAINT fk_user_to_family FOREIGN KEY (family_id) REFERENCES family (id) ON DELETE CASCADE;