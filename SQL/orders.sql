DROP DATABASE IF EXISTS online_shop;

CREATE DATABASE online_shop;

USE online_shop;

CREATE TABLE customers (
    id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(100),
    email VARCHAR(100),
    phone VARCHAR(20),
    address VARCHAR(200),
    PRIMARY KEY(id)
);

CREATE TABLE orders (
    id INT NOT NULL AUTO_INCREMENT,
    order_date DATETIME DEFAULT NOW(),
    total_amount DECIMAL(10,2),
    customer_id INT,
    PRIMARY KEY(id),
    FOREIGN KEY (customer_id) REFERENCES customers(id)
);

CREATE TABLE products (
    id INT NOT NULL AUTO_INCREMENT,
    name VARCHAR(100),
    price DECIMAL(10,2),
    type VARCHAR(50),
    order_id INT,
    PRIMARY KEY(id),
    FOREIGN KEY (order_id) REFERENCES orders(id)
);

INSERT INTO customers ( name, email, phone, address)
VALUES
    ('John Doe', 'john@example.com', '1234567890', '123 Main St'),
    ('Jane Smith', 'jane@example.com', '9876543210', '456 Elm St'),
    ('Michael Johnson', 'michael@example.com', '5551234567', '789 Oak Ave'),
    ('Emily Wilson', 'emily@example.com', '1112223333', '321 Pine St'),
    ('David Brown', 'david@example.com', '4445556666', '555 Cedar Rd');

INSERT INTO orders ( order_date, total_amount, customer_id)
VALUES
    ('2023-05-01', 100.00, 2),
    ('2023-05-02', 75.50, 2),
    ('2023-05-03', 200.00, 3),
    ('2023-05-04', 50.00, 3),
    ('2023-05-05', 300.75, 3),
    ('2023-05-06', 80.00, 4),
    ('2023-05-07', 150.25, 4),
    ('2023-05-08', 125.50, 5),
    ('2023-05-09', 175.00, 5),
    ('2023-05-10', 250.00, 5);

INSERT INTO products (name, type, price, order_id)
VALUES
    ('iPhone 12 Pro', "mobile", 999.00, 1),
    ('Samsung Galaxy S21', "mobile", 899.99, 2),
    ('Sony PlayStation 5', "games console", 499.99, 3),
    ('Bose QuietComfort 35 II', "headphones", 299.00, 4),
    ('Apple AirPods Pro', "headphones",249.00, 5),
    ('Amazon Echo Dot', "smart hub", 49.99, 6),
    ('Fitbit Charge 4', "smart watch", 129.95, 7),
    ('Dell XPS 15 Laptop', "laptop", 1599.99, 8),
    ('Samsung 55-Inch 4K Smart TV', "tv", 899.00, 9),
    ('Nintendo Switch', "games console", 299.99, 10),
	('iPhone 12 Pro', "mobile", 999.00, 7),
    ('Samsung Galaxy S21', "mobile", 899.99, 8),
    ('ERROR', NULL , -1, NULL);
    

