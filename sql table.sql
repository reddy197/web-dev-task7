CREATE TABLE Users (
    Id INT PRIMARY KEY AUTO_INCREMENT,
    Name VARCHAR(100),
    Mobile VARCHAR(15),
    Education VARCHAR(100),
    DOB DATE,
    Working BOOLEAN,
    EmergencyContact VARCHAR(15)
);

CREATE TABLE Address (
    Id INT PRIMARY KEY AUTO_INCREMENT,
    UserId INT,
    AddressLine1 VARCHAR(255),
    AddressLine2 VARCHAR(255),
    City VARCHAR(100),
    State VARCHAR(50),
    Country VARCHAR(50), DEFAULT 'India',
    Pincode VARCHAR(10),
    FOREIGN KEY(User Id) REFERENCES Users(Id)
);

CREATE TABLE Rooms (
    Id INT PRIMARY KEY AUTO_ INCREMENT,
    UserId INT,
    RoomNO VARCHAR(10),
    NoOfGuests INT,
    FOREIGN KEY (UserId) REFERENCES Users (Id)
);
