/*
SQLyog - Free MySQL GUI v5.02
Host - 5.0.19-nt : Database - feereport_data
*********************************************************************
Server version : 5.0.19-nt
*/


create database if not exists `feereport_data`;

USE `feereport_data`;

/*Table structure for table `accountants` */

DROP TABLE IF EXISTS `accountants`;

CREATE TABLE `accountants` (
  `acct_id` int(11) NOT NULL,
  `acct_name` varchar(255) default NULL,
  `acct_password` varchar(255) default NULL,
  `acct_email` varchar(255) default NULL,
  `acct_contact` varchar(255) default NULL,
  PRIMARY KEY  (`acct_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

/*Data for the table `accountants` */

insert into `accountants` values 
(1,'sagar','sagar','sagar','8722548007'),
(2,'Sagar V Hande','sagar123','sagarvhande@gmail.com','8722548007'),
(3,'Sourav','sourav123','souravh@gmail.com','263302'),
(4,'rahul','rahul123','rahul@gmail.com','007'),
(5,'Naanu','nanu123','naanu@gmail.com','007');
