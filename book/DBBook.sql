/*
SQLyog Ultimate v8.32 
MySQL - 5.5.20 : Database - bookstop
*********************************************************************
*/


/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`bookstop` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `bookstop`;

/*Table structure for table `author` */

DROP TABLE IF EXISTS `author`;

CREATE TABLE `author` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `name` VARCHAR(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=INNODB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

/*Data for the table `author` */

INSERT  INTO `author`(`id`,`name`) VALUES (1,'金庸'),(2,'吴承恩');

/*Table structure for table `author_book` */

DROP TABLE IF EXISTS `author_book`;

CREATE TABLE `author_book` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `author_id` INT(11) DEFAULT NULL,
  `book_id` INT(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=INNODB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `author_book` */

INSERT  INTO `author_book`(`id`,`author_id`,`book_id`) VALUES (1,1,1),(2,1,2),(3,2,3),(4,2,4);

/*Table structure for table `book` */

DROP TABLE IF EXISTS `book`;

CREATE TABLE `book` (
  `id` INT(11) NOT NULL AUTO_INCREMENT,
  `ISBN` VARCHAR(50) NOT NULL,
  `name` VARCHAR(50) NOT NULL,
  `price` FLOAT NOT NULL,
  `discount` INT(10) NOT NULL,
  `publisher` VARCHAR(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=INNODB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

/*Data for the table `book` */

INSERT  INTO `book`(`id`,`ISBN`,`name`,`price`,`discount`,`publisher`) VALUES (1,'987-7-121-2564-8','神雕侠侣',100,7,'北京大学出版'),(2,'987-7-121-2564-7','射雕英雄传',50,8,'浙江大学出版'),(3,'984-5-556-6486-7','西游记',100,5,'浙江大学出版'),(4,'123-594-757-8','三国演义',20,6,'深圳福田大学出版');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

SELECT * FROM book;
SELECT t2.id,t2.name,t3.id,t3.ISBN,t3.name,t3.price,t3.discount,t3.publisher FROM author_book t1 LEFT JOIN author t2 ON t1.author_id=t2.id LEFT JOIN book t3 ON t3.id=t1.book_id WHERE t2.id=2;
SELECT t2.id,t2.name,t3.id,t3.ISBN,t3.name,t3.price,t3.discount,t3.publisher FROM author_book t1 LEFT JOIN author t2 ON t1.author_id=t2.id LEFT JOIN book t3 ON t3.id=t1.book_id WHERE t3.id=2;
