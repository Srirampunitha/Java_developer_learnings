create database easybank;

use easybank;

create table 'users'('id' INT NOT NULL AUTO_INCREMENT ,
                     'username' VARCHAR(45) NOT NULL ,
                     'password' VARCHAR(45) NOT NULL,
                     'enabled' INT NOT NULL), 	
                     PRIMARYKEY(id));
                     
CREATE TABLE `authorities` (
  `id` int NOT NULL AUTO_INCREMENT,
  `username` varchar(45) NOT NULL,
  `authority` varchar(45) NOT NULL,
  PRIMARY KEY (`id`));
  
  INSERT IGNORE INTO `users` VALUES (NULL, 'happy', '12345', '1');
INSERT IGNORE INTO `authorities` VALUES (NULL, 'happy', 'write');