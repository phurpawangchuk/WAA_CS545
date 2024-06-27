-- Insert Categories
INSERT INTO Category (id, name) VALUES
(1, 'Electronics'),
(2, 'Books'),
(3, 'Clothing'),
(4, 'Home & Kitchen'),
(5, 'Sports & Outdoors'),
(6, 'Toys & Games'),
(7, 'Beauty & Personal Care'),
(8, 'Automotive'),
(9, 'Garden & Outdoor'),
(10, 'Health & Household');

-- Insert Products
INSERT INTO Product (id, name, price, rating, category_id) VALUES
   (1, 'Smartphone', 699.99, 4.5, 1),
   (2, 'Laptop', 999.99, 4.7, 1),
   (3, 'E-reader', 129.99, 4.3, 2),
   (4, 'Novel', 19.99, 4.6, 2),
   (5, 'T-shirt', 15.99, 4.2, 3),
   (6, 'Jeans', 49.99, 4.4, 3),
   (7, 'Blender', 29.99, 4.1, 4),
   (8, 'Cookware Set', 89.99, 4.8, 4),
   (9, 'Yoga Mat', 25.99, 4.6, 5),
   (10, 'Tent', 129.99, 4.5, 5);

-- Insert Users
INSERT INTO User (id, email, password, first_name, last_name) VALUES
      (1, 'user1@example.com', 'password1', 'John', 'Doe'),
      (2, 'user2@example.com', 'password2', 'Jane', 'Smith'),
      (3, 'user3@example.com', 'password3', 'Alice', 'Johnson'),
      (4, 'user4@example.com', 'password4', 'Bob', 'Brown'),
      (5, 'user5@example.com', 'password5', 'Charlie', 'Davis'),
      (6, 'user6@example.com', 'password6', 'David', 'Miller'),
      (7, 'user7@example.com', 'password7', 'Eve', 'Wilson'),
      (8, 'user8@example.com', 'password8', 'Frank', 'Moore'),
      (9, 'user9@example.com', 'password9', 'Grace', 'Taylor'),
      (10, 'user10@example.com', 'password10', 'Hank', 'Anderson');

-- Insert Addresses
INSERT INTO Address (id, street, zip, city, user_id) VALUES
(1, '123 Main St', '12345', 'New York', 1),
(2, '456 Oak St', '67890', 'Los Angeles', 2),
(3, '789 Pine St', '11223', 'Chicago', 3),
(4, '101 Maple St', '44556', 'Houston', 4),
(5, '202 Elm St', '77889', 'Phoenix', 5),
(6, '303 Cedar St', '99100', 'Philadelphia', 6),
(7, '404 Birch St', '22334', 'San Antonio', 7),
(8, '505 Willow St', '55667', 'San Diego', 8),
(9, '606 Redwood St', '88990', 'Dallas', 9),
(10, '707 Spruce St', '11212', 'San Jose', 10);

-- Insert Reviews
INSERT INTO Review (id, comment, user_id, product_id) VALUES
(1, 'Great product!', 1, 1),
(2, 'Very satisfied.', 2, 2),
(3, 'Would buy again.', 3, 3),
(4, 'Highly recommend.', 4, 4),
(5, 'Good quality.', 5, 5),
(6, 'Worth the price.', 6, 6),
(7, 'Met my expectations.', 7, 7),
(8, 'Fantastic!', 8, 8),
(9, 'Love it!', 9, 9),
(10, 'Just what I needed.', 10, 10);
