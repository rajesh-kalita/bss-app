USE bss_db;
CREATE TABLE employee(
	`id` INT UNSIGNED AUTO_INCREMENT NOT NULL,
    `bss_id` VARCHAR(10) NOT NULL,
    `emp_name` VARCHAR(100) NOT NULL,
    `dob` DATE NOT NULL,
    `city` VARCHAR(20) NOT NULL,
    `state` VARCHAR(20) NOT NULL,
    `ps` VARCHAR(20) NOT NULL,
    `po` VARCHAR(20) NOT NULL,
    `pincode` INT(7) UNSIGNED NOT NULL,
    `phone_number` INT(10) NOT NULL,
    `sex` ENUM('M','F') NOT NULL,
    `status` BIT(1) DEFAULT b'1',
    PRIMARY KEY (`id`),
    UNIQUE KEY `bss_id_UNIQUE` (`bss_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COMMENT='Employee Table';