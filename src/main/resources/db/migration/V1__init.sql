DROP TABLE IF EXISTS `notebook`;

CREATE TABLE `notebook`
(
    `id`            bigint NOT NULL AUTO_INCREMENT,
    `date_of_issue` datetime(6)  DEFAULT NULL,
    `hull_type`     varchar(255) DEFAULT NULL,
    `manufacturer`  varchar(255) DEFAULT NULL,
    `memory`        int    NOT NULL,
    `model`         varchar(255) DEFAULT NULL,
    `price`         double NOT NULL,
    `processor`     varchar(255) DEFAULT NULL,
    `was_in_use`    bit(1) NOT NULL,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  AUTO_INCREMENT = 99
  DEFAULT CHARSET = utf8mb4
  COLLATE = utf8mb4_0900_ai_ci;

LOCK TABLES `notebook` WRITE;
INSERT INTO `notebook`(id, date_of_issue, hull_type, manufacturer, memory, model, price, processor, was_in_use)
VALUES (1, '2016-08-01 00:00:00.002000', 'Plastic', 'Asus', 18, 'ROG Strix G15', 17000, 'Intel Core I5', true),
       (2, '2017-04-06 00:00:00.200000', 'Metal', 'HP', 16, 'Pavilion', 24000, 'AMD Razen 5', false),
       (3, '2016-08-01 00:00:00.002000', 'Plastic', 'Acer', 12, 'Aspire 7', 15000, 'Intel Core I7', true),
       (4, '2017-04-06 00:00:00.200000', 'Metal', 'Lenovo', 24, 'Idea pad pro', 24000, 'AMD A6', true),
       (5, '2018-08-01 00:00:00.002000', 'Plastic', 'Asus', 12, 'X555', 15000, 'Intel Core I3', false),
       (6, '2017-08-01 00:00:00.002000', 'Metal', 'Dell', 4, 'G5', 31000, 'Intel Core I7', false),
       (7, '2019-08-01 00:00:00.002000', 'Metal', 'Apple', 18, 'MacBook Pro', 45000, 'Intel Core I5', false),
       (8, '2019-08-01 00:00:00.002000', 'Plastic', 'Asus', 4, 'X409UA', 7000, 'Intel Pentium 4417U', false),
       (9, '2019-08-01 00:00:00.002000', 'Plastic', 'Dell', 4, 'Inspiron 3587', 11000, 'Intel Core I5', false),
       (10, '2019-09-18 00:00:00.000000', 'Metal', 'Asus', 32, 'ZenbBook 14', 44000, 'AMD Radeon RX', true);
UNLOCK TABLES;
