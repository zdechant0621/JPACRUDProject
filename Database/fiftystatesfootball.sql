DROP DATABASE IF EXISTS fiftystatesfootballdb;
CREATE DATABASE IF NOT EXISTS fiftystatesfootballdb;

USE fiftystatesfootballdb;

CREATE TABLE fifty_states_football(
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100) NOT NULL,
    capital_city VARCHAR(100),
    stadium_name VARCHAR(100),
    year_admitted INT,
    head_coach_name VARCHAR(100)
);


DROP USER IF EXISTS fiftystatesfootballdbuser@localhost;
CREATE USER IF NOT EXISTS fiftystatesfootballdbuser@localhost IDENTIFIED BY 'pass';
GRANT ALL ON fiftystatesfootballdb.* TO fiftystatesfootballdbuser@localhost;

INSERT INTO FIFTY_STATES_FOOTBALL (id, name, capital_city, stadium_name, year_admitted, head_coach_name) VALUES 
    (1, 'Alaska Igloos', 'Juneau', 'Tundra Field', 1959, 'Ethan Smith'),
    (2, 'Hawaii Volcanoes', 'Honolulu', 'Lava Dome Stadium', 1959, 'Jack Harvest'),
    (3, 'Texas Tornadoes', 'Austin', 'Cyclone Stadium', 1845, 'Johnny McBride'),
    (4, 'Florida Peaches', 'Tallahassee', 'Sunshine Stadium', 1845, 'Noah Johnson'),
    (5, 'Montana Huckleberries', 'Helena', 'Yellowstone Stadium', 1889, 'Mason Williams'),
    (6, 'New York Big Apples', 'Albany', 'Big Apple Arena', 1788, 'Lucas Taylor'),
    (7, 'Colorado Blizzards', 'Denver', 'Frostbite Field', 1876, 'James Davis'),
    (8, 'Louisiana Crawdads', 'Baton Rouge', 'Gumbo Field', 1812, 'William Miller'),
    (9, 'California Wildfires', 'Sacramento', 'SoCal Stadium', 1850, 'Oliver Moore'),
    (10, 'Oregon Trails', 'Salem', 'Pioneer Field', 1859, 'Benjamin Brown');

