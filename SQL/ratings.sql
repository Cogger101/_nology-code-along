DROP DATABASE IF EXISTS movie_ratings;

CREATE DATABASE movie_ratings;

USE movie_ratings;

CREATE TABLE movies (
id INT NOT NULL AUTO_INCREMENT,
title VARCHAR(255) NOT NULL,
year_released VARCHAR(255) NOT NULL,
PRIMARY KEY(id)
);

CREATE TABLE users (
id INT NOT NULL AUTO_INCREMENT,
first_name VARCHAR(255) NOT NULL,
last_name VARCHAR(255) NOT NULL,
PRIMARY KEY(id)
);

CREATE TABLE ratings (
id INT NOT NULL AUTO_INCREMENT,
user_id INT NOT NULL,
movie_id INT NOT NULL,
rating INT NOT NULL,
PRIMARY KEY(id),
FOREIGN KEY(movie_id) REFERENCES movies(id),
FOREIGN KEY(user_id) REFERENCES users(id)
);

INSERT INTO movies (id, title, year_released) VALUES (1, "The Shawshank Redemption", "1994");
INSERT INTO movies (id, title, year_released) VALUES (2, "The Godfather", "1972");
INSERT INTO movies (id, title, year_released) VALUES (3, "The Dark Knight", "2008");
INSERT INTO movies (id, title, year_released) VALUES (4, "The Godfather Part II", "1974");
INSERT INTO movies (id, title, year_released) VALUES (5, "12 Angry Men", "1957");
INSERT INTO movies (id, title, year_released) VALUES (6, "Schindler's List", "1993");
INSERT INTO movies (id, title, year_released) VALUES (7, "The Lord of the Rings: The Return of the King", "2003");
INSERT INTO movies (id, title, year_released) VALUES (8, "Pulp Fiction", "1994");
INSERT INTO movies (id, title, year_released) VALUES (9, "The Lord of the Rings: The Fellowship of the Ring", "2001");
INSERT INTO movies (id, title, year_released) VALUES (10, "The Good, the Bad and the Ugly", "1966");

INSERT INTO users (id, first_name, last_name) VALUES (1, "Mervin", "Brwon");
INSERT INTO users (id, first_name, last_name) VALUES (2, "Byron", "Ferrando");
INSERT INTO users (id, first_name, last_name) VALUES (3, "Gerry", "Losey");
INSERT INTO users (id, first_name, last_name) VALUES (4, "Nicole", "Goswami");
INSERT INTO users (id, first_name, last_name) VALUES (5, "Leigha", "Saldano");
INSERT INTO users (id, first_name, last_name) VALUES (6, "Bethany", "Dafonseca");
INSERT INTO users (id, first_name, last_name) VALUES (7, "Karma", "Clearwater");
INSERT INTO users (id, first_name, last_name) VALUES (8, "Ahmad", "Walz");
INSERT INTO users (id, first_name, last_name) VALUES (9, "Jerry", "Galdames");
INSERT INTO users (id, first_name, last_name) VALUES (10, "Randi", "Welzel");
INSERT INTO users (id, first_name, last_name) VALUES (11, "Huey", "Burd");
INSERT INTO users (id, first_name, last_name) VALUES (12, "Shaunda", "Scharpf");
INSERT INTO users (id, first_name, last_name) VALUES (13, "Diedra", "Fermo");
INSERT INTO users (id, first_name, last_name) VALUES (14, "Joan", "Sebastiano");
INSERT INTO users (id, first_name, last_name) VALUES (15, "Kendal", "Cordovano");
INSERT INTO users (id, first_name, last_name) VALUES (16, "Zackary", "Brun");
INSERT INTO users (id, first_name, last_name) VALUES (17, "Marcelino", "Sluder");
INSERT INTO users (id, first_name, last_name) VALUES (18, "Nicholle", "Zeme");
INSERT INTO users (id, first_name, last_name) VALUES (19, "Shelby", "Nathan");
INSERT INTO users (id, first_name, last_name) VALUES (20, "Rina", "Woznick");
INSERT INTO users (id, first_name, last_name) VALUES (21, "Sybil", "Marzinske");
INSERT INTO users (id, first_name, last_name) VALUES (22, "Sean", "Vanegas");
INSERT INTO users (id, first_name, last_name) VALUES (23, "Ivette", "Johar");
INSERT INTO users (id, first_name, last_name) VALUES (24, "Leslie", "Malbrough");

INSERT INTO ratings (id, user_id, movie_id, rating) VALUES (1, 10, 5, 3);
INSERT INTO ratings (id, user_id, movie_id, rating) VALUES (2, 1, 6, 0);
INSERT INTO ratings (id, user_id, movie_id, rating) VALUES (3, 1, 6, 4);
INSERT INTO ratings (id, user_id, movie_id, rating) VALUES (4, 2, 1, 9);
INSERT INTO ratings (id, user_id, movie_id, rating) VALUES (5, 2, 3, 4);
INSERT INTO ratings (id, user_id, movie_id, rating) VALUES (6, 3, 3, 5);
INSERT INTO ratings (id, user_id, movie_id, rating) VALUES (7, 3, 4, 3);
INSERT INTO ratings (id, user_id, movie_id, rating) VALUES (8, 4, 3, 8);
INSERT INTO ratings (id, user_id, movie_id, rating) VALUES (9, 4, 2, 9);
INSERT INTO ratings (id, user_id, movie_id, rating) VALUES (10, 5, 1, 0);
INSERT INTO ratings (id, user_id, movie_id, rating) VALUES (11, 5, 5, 3);
INSERT INTO ratings (id, user_id, movie_id, rating) VALUES (12, 6, 7, 7);
INSERT INTO ratings (id, user_id, movie_id, rating) VALUES (13, 6, 4, 4);
INSERT INTO ratings (id, user_id, movie_id, rating) VALUES (14, 7, 6, 8);
INSERT INTO ratings (id, user_id, movie_id, rating) VALUES (15, 7, 10, 0);
INSERT INTO ratings (id, user_id, movie_id, rating) VALUES (16, 8, 2, 6);
INSERT INTO ratings (id, user_id, movie_id, rating) VALUES (17, 8, 8, 7);
INSERT INTO ratings (id, user_id, movie_id, rating) VALUES (18, 9, 2, 7);
INSERT INTO ratings (id, user_id, movie_id, rating) VALUES (19, 9, 4, 3);
INSERT INTO ratings (id, user_id, movie_id, rating) VALUES (20, 10, 8, 1);
INSERT INTO ratings (id, user_id, movie_id, rating) VALUES (21, 10, 2, 9);
INSERT INTO ratings (id, user_id, movie_id, rating) VALUES (22, 11, 9, 8);
INSERT INTO ratings (id, user_id, movie_id, rating) VALUES (23, 11, 2, 2);
INSERT INTO ratings (id, user_id, movie_id, rating) VALUES (24, 12, 5, 8);
INSERT INTO ratings (id, user_id, movie_id, rating) VALUES (25, 12, 7, 9);
INSERT INTO ratings (id, user_id, movie_id, rating) VALUES (26, 13, 7, 1);
INSERT INTO ratings (id, user_id, movie_id, rating) VALUES (27, 13, 5, 4);
INSERT INTO ratings (id, user_id, movie_id, rating) VALUES (28, 14, 8, 4);
INSERT INTO ratings (id, user_id, movie_id, rating) VALUES (29, 14, 6, 1);
INSERT INTO ratings (id, user_id, movie_id, rating) VALUES (30, 15, 4, 4);
INSERT INTO ratings (id, user_id, movie_id, rating) VALUES (31, 15, 4, 2);
INSERT INTO ratings (id, user_id, movie_id, rating) VALUES (32, 16, 8, 9);
INSERT INTO ratings (id, user_id, movie_id, rating) VALUES (33, 16, 9, 3);
INSERT INTO ratings (id, user_id, movie_id, rating) VALUES (34, 17, 2, 8);
INSERT INTO ratings (id, user_id, movie_id, rating) VALUES (35, 17, 9, 3);
INSERT INTO ratings (id, user_id, movie_id, rating) VALUES (36, 18, 10, 0);
INSERT INTO ratings (id, user_id, movie_id, rating) VALUES (37, 18, 8, 6);
INSERT INTO ratings (id, user_id, movie_id, rating) VALUES (38, 19, 9, 0);
INSERT INTO ratings (id, user_id, movie_id, rating) VALUES (39, 19, 6, 6);
INSERT INTO ratings (id, user_id, movie_id, rating) VALUES (40, 20, 3, 8);
INSERT INTO ratings (id, user_id, movie_id, rating) VALUES (41, 20, 1, 0);
INSERT INTO ratings (id, user_id, movie_id, rating) VALUES (42, 21, 6, 6);
INSERT INTO ratings (id, user_id, movie_id, rating) VALUES (43, 21, 3, 6);
INSERT INTO ratings (id, user_id, movie_id, rating) VALUES (44, 22, 1, 7);
INSERT INTO ratings (id, user_id, movie_id, rating) VALUES (45, 22, 1, 2);
INSERT INTO ratings (id, user_id, movie_id, rating) VALUES (46, 23, 1, 5);
INSERT INTO ratings (id, user_id, movie_id, rating) VALUES (47, 23, 1, 9);
INSERT INTO ratings (id, user_id, movie_id, rating) VALUES (48, 24, 4, 8);
INSERT INTO ratings (id, user_id, movie_id, rating) VALUES (49, 24, 5, 0);
