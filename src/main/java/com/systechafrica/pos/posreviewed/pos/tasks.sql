-- Working on the POS Queries
CREATE TABLE IF NOT EXISTS `items` (id INT AUTO_INCREMENT PRIMARY KEY, `itemCode` VARCHAR(255) NOT NULL, `quantity` INT NOT NULL, `unitPrice` DOUBLE NOT NULL);
INSERT INTO items (itemCode, quantity, unitPrice) VALUES (?, ?, ?);
SELECT * FROM items;
DELETE FROM items;