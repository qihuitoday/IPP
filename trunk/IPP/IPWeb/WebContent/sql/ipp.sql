/*
Navicat MySQL Data Transfer

Source Server         : localhost
Source Server Version : 50521
Source Host           : localhost:3306
Source Database       : ipp

Target Server Type    : MYSQL
Target Server Version : 50521
File Encoding         : 65001

Date: 2016-05-12 00:02:33
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
) ENGINE=InnoDB AUTO_INCREMENT=14 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ip_employee
-- ----------------------------
INSERT INTO `ip_employee` VALUES ('0000000011', 'qilin@123', '123', 'lin', 'Aileen', '', '', '', '2016-04-16 22:08:00', null, null, null);
INSERT INTO `ip_employee` VALUES ('0000000012', 'sy@123', '111111', null, null, null, null, null, '2016-05-09 15:20:29', null, null, null);
INSERT INTO `ip_employee` VALUES ('0000000013', '1', '1', '1111', '1111', '1111', '1111', '1111', '2016-05-09 16:26:13', null, null, null);

-- ----------------------------
-- Table structure for `ip_fund`
-- ----------------------------
DROP TABLE IF EXISTS `ip_fund`;
CREATE TABLE `ip_fund` (
  `ID` int(10) NOT NULL AUTO_INCREMENT,
  `UW_CODE` varchar(10) NOT NULL,
  `PRODUCT_CODE` varchar(12) NOT NULL,
  `FUND_CODE` varchar(50) NOT NULL,
  `FUND_NAME` varchar(102) NOT NULL,
  `LOCAL_NAME` varchar(102) DEFAULT NULL,
  `CURRENCY_CODE` varchar(3) DEFAULT NULL,
  `RISK_LEVEL` varchar(1) DEFAULT NULL,
  `STATUS` varchar(10) DEFAULT NULL,
  `MAKER_ID` varchar(20) DEFAULT NULL,
  `MAKER_TS` datetime NOT NULL,
  `LAST_MODIFIED_TS` datetime NOT NULL,
  PRIMARY KEY (`ID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of ip_fund
-- ----------------------------
INSERT INTO `ip_fund` VALUES ('1', '1', '1', '1', '1', '1', '1', '1', 'Active', null, '2016-05-11 22:38:50', '2016-05-11 22:38:55');
INSERT INTO `ip_fund` VALUES ('2', '44', '33', '111', '22', null, null, null, 'Closed', null, '2016-05-11 22:52:49', '2016-05-11 22:52:49');
