-- Working on the POS Queries
CREATE TABLE IF NOT EXISTS `items` (id INT AUTO_INCREMENT PRIMARY KEY, `itemCode` VARCHAR(255) NOT NULL, `quantity` INT NOT NULL, `unitPrice` DOUBLE NOT NULL);
INSERT INTO items (itemCode, quantity, unitPrice) VALUES (?, ?, ?);
SELECT * FROM items;
DELETE FROM items;

CREATE TABLE IF NOT EXISTS user (id INT AUTO_INCREMENT PRIMARY KEY, username VARCHAR(255) NOT NULL, password VARCHAR(255) NOT NULL);
INSERT INTO user (username,password) VALUES(?, ?);
SELECT * FROM user WHERE username = ? AND password = ?
 insert into user (username,password) values("posadmin","Admin123");