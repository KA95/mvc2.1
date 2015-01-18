CREATE TABLE W66_USER (
  id INTEGER NOT NULL ,
  entered_on DATE,
  first_name VARCHAR(50),
  last_name VARCHAR(50)
);

CREATE TABLE W66_PRODUCT (
  id INTEGER NOT NULL,
  entered_on DATE,
  name VARCHAR(40),
  description VARCHAR(200),
  producer_id INTEGER
);