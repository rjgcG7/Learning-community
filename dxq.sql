/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50615
Source Host           : localhost:3306
Source Database       : dxq

Target Server Type    : MYSQL
Target Server Version : 50615
File Encoding         : 65001

Date: 2018-07-09 13:40:19
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `admin` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `tx` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`admin`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------

-- ----------------------------
-- Table structure for course
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `courseid` int(11) NOT NULL AUTO_INCREMENT,
  `id` varchar(50) DEFAULT NULL,
  `kcmc` varchar(50) DEFAULT NULL,
  `kcjs` varchar(500) DEFAULT NULL,
  `tx` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`courseid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of course
-- ----------------------------

-- ----------------------------
-- Table structure for kcnr
-- ----------------------------
DROP TABLE IF EXISTS `kcnr`;
CREATE TABLE `kcnr` (
  `courseid` int(11) DEFAULT NULL,
  `videoid` int(11) DEFAULT NULL,
  `splj` varchar(100) DEFAULT NULL,
  `spwz` varchar(100) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of kcnr
-- ----------------------------

-- ----------------------------
-- Table structure for sh1
-- ----------------------------
DROP TABLE IF EXISTS `sh1`;
CREATE TABLE `sh1` (
  `id` int(11) DEFAULT NULL,
  `jsjs` varchar(500) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sh1
-- ----------------------------

-- ----------------------------
-- Table structure for sh2
-- ----------------------------
DROP TABLE IF EXISTS `sh2`;
CREATE TABLE `sh2` (
  `id` int(11) DEFAULT NULL,
  `kcmc` varchar(50) DEFAULT NULL,
  `kcjs` varchar(500) DEFAULT NULL,
  `tx` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sh2
-- ----------------------------

-- ----------------------------
-- Table structure for student
-- ----------------------------
DROP TABLE IF EXISTS `student`;
CREATE TABLE `student` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `power` varchar(50) DEFAULT NULL,
  `tx` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of student
-- ----------------------------

-- ----------------------------
-- Table structure for yhkc
-- ----------------------------
DROP TABLE IF EXISTS `yhkc`;
CREATE TABLE `yhkc` (
  `courseid` int(11) DEFAULT NULL,
  `id` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of yhkc
-- ----------------------------
