# echartDemo

/*
SQLyog v10.2 
MySQL - 5.5.25 : Database - echarts
*********************************************************************
*/


/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`echarts` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `echarts`;

/*Table structure for table `drug` */

DROP TABLE IF EXISTS `drug`;

CREATE TABLE `drug` (
  `drugId` int(24) NOT NULL AUTO_INCREMENT,
  `drugName` year(4) NOT NULL,
  `money` int(10) NOT NULL,
  PRIMARY KEY (`drugId`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

/*Data for the table `drug` */

insert  into `drug`(`drugId`,`drugName`,`money`) values (1,0000,11),(2,0000,12),(3,0000,2),(4,0000,3),(5,0000,4),(6,0000,1);
