/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50521
Source Host           : localhost:3306
Source Database       : ipp

Target Server Type    : MYSQL
Target Server Version : 50521
File Encoding         : 65001

Date: 2015-12-12 18:51:54
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `ip_employee`
-- ----------------------------
DROP TABLE IF EXISTS `ip_employee`;
CREATE TABLE `ip_employee` (
  `ID` int(11) NOT NULL,
  `EMPLOYEE_NAME` varchar(50) NOT NULL,
  `ENGLISH_NAME` varchar(50) DEFAULT NULL,
  `GENDER` varchar(4) DEFAULT NULL,
  `MAIL` varchar(50) DEFAULT NULL,
  `ADDRESS` varchar(100) DEFAULT NULL,
  `MOBILE_NUMBER` varchar(20) DEFAULT NULL,
  `CREATE_TIME` datetime NOT NULL,
  `CREATE_BY` varchar(50) DEFAULT NULL,
  `MODIFY_TIME` date DEFAULT NULL,
  `MODIFY_BY` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ip_employee
-- ----------------------------
