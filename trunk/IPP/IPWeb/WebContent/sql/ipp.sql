/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50521
Source Host           : localhost:3306
Source Database       : ipp

Target Server Type    : MYSQL
Target Server Version : 50521
File Encoding         : 65001

Date: 2016-04-14 23:31:12
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `ip_employee`
-- ----------------------------
DROP TABLE IF EXISTS `ip_employee`;
CREATE TABLE `ip_employee` (
  `ID` int(10) unsigned zerofill NOT NULL AUTO_INCREMENT,
  `MAIL` varchar(50) NOT NULL,
  `PASSWORD` varchar(50) NOT NULL,
  `EMPLOYEE_NAME` varchar(50) DEFAULT NULL,
  `ENGLISH_NAME` varchar(50) DEFAULT NULL,
  `GENDER` varchar(4) DEFAULT NULL,
  `ADDRESS` varchar(100) DEFAULT NULL,
  `MOBILE_NUMBER` varchar(20) DEFAULT NULL,
  `CREATE_TIME` datetime NOT NULL,
  `CREATE_BY` varchar(50) DEFAULT NULL,
  `MODIFY_TIME` datetime DEFAULT NULL,
  `MODIFY_BY` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;
