DROP TABLE IF EXISTS countries;

CREATE TABLE countries (
  numericCode INT PRIMARY KEY,
  name VARCHAR(250) NOT NULL,
  region VARCHAR(250) NOT NULL,
  subregion VARCHAR(250) DEFAULT NULL,
  population INT NOT NULL
);