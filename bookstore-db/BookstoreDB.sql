CREATE DATABASE BookstoreDB ;
USE BookstoreDB ;

CREATE TABLE User (
    user_id INT PRIMARY KEY AUTO_INCREMENT,
    username VARCHAR(255) NOT NULL,
    email VARCHAR(255) NOT NULL UNIQUE,
    password VARCHAR(255) NOT NULL
);


CREATE TABLE Book (
    book_id INT PRIMARY KEY AUTO_INCREMENT,
    isbn BIGINT NOT NULL,
    title VARCHAR(255) NOT NULL,
    author VARCHAR(255) NOT NULL,
    genre VARCHAR(255),
    price DECIMAL(10, 2) NOT NULL
);


CREATE TABLE OrderTable (
    order_id INT PRIMARY KEY AUTO_INCREMENT,
    user_id INT,
    order_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    total_amount DECIMAL(10, 2),
    FOREIGN KEY (user_id) REFERENCES User(user_id)
);


CREATE TABLE OrderCart (
    order_item_id INT PRIMARY KEY AUTO_INCREMENT,
    order_id INT,
    book_id INT,
    quantity INT,
    subtotal DECIMAL(10, 2),
    FOREIGN KEY (order_id) REFERENCES OrderTable(order_id),
    FOREIGN KEY (book_id) REFERENCES Book(book_id)
);


CREATE TABLE Catalogue (
    catalogue_id INT PRIMARY KEY AUTO_INCREMENT,
    book_id INT,
    title VARCHAR(255),
    price DECIMAL(10, 2) ,
    availability_status VARCHAR(50) NOT NULL,
    FOREIGN KEY (book_id) REFERENCES book(book_id)
);

CREATE TABLE Reviews(
    review_id INT PRIMARY KEY NOT NULL AUTO_INCREMENT,
    book_id INT,
    title VARCHAR(255),
    review_desc VARCHAR(255),
    FOREIGN KEY (book_id) REFERENCES book(book_id)
    );