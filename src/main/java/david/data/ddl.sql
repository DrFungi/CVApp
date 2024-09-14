-- Table: Job title
CREATE TABLE JobTitle (
                          ID INTEGER PRIMARY KEY AUTOINCREMENT,
                          JobTitle VARCHAR(200) NOT NULL
);

-- Table: Company
CREATE TABLE Company (
                         ID INTEGER PRIMARY KEY AUTOINCREMENT,
                         Name VARCHAR(50) NOT NULL,
                         Website VARCHAR(200)
);

-- Table: Category
CREATE TABLE Category (
                          ID INTEGER PRIMARY KEY AUTOINCREMENT,
                          Category VARCHAR(50) NOT NULL
);

-- Table: CV
CREATE TABLE CV (
                    ID INTEGER PRIMARY KEY AUTOINCREMENT,
                    File BLOB,
                    DateApplication DATE NOT NULL,
                    JobTitleID INTEGER NOT NULL,
                    CompanyID INTEGER NOT NULL,
                    CategoryID INTEGER NOT NULL,
                    FOREIGN KEY (JobTitleID) REFERENCES JobTitle(ID),
                    FOREIGN KEY (CompanyID) REFERENCES Company(ID),
                    FOREIGN KEY (CategoryID) REFERENCES Category(ID)
);
