/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50615
Source Host           : localhost:3306
Source Database       : duanxueqi

Target Server Type    : MYSQL
Target Server Version : 50615
File Encoding         : 65001

Date: 2018-07-15 14:20:03
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for t_admin
-- ----------------------------
DROP TABLE IF EXISTS `t_admin`;
CREATE TABLE `t_admin` (
  `userid` varchar(50) NOT NULL,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `tx` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_admin
-- ----------------------------

-- ----------------------------
-- Table structure for t_course
-- ----------------------------
DROP TABLE IF EXISTS `t_course`;
CREATE TABLE `t_course` (
  `courseid` int(11) NOT NULL AUTO_INCREMENT,
  `teacher_userid` varchar(50) DEFAULT NULL,
  `course_name` varchar(50) DEFAULT NULL,
  `course_remark` longtext,
  `tx` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`courseid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_course
-- ----------------------------

-- ----------------------------
-- Table structure for t_course_apply
-- ----------------------------
DROP TABLE IF EXISTS `t_course_apply`;
CREATE TABLE `t_course_apply` (
  `apply_id` int(11) NOT NULL AUTO_INCREMENT,
  `teacher_userid` varchar(50) DEFAULT NULL,
  `course_name` varchar(50) DEFAULT NULL,
  `course_remark` longtext,
  `check_result` int(11) DEFAULT NULL,
  `tx` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`apply_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_course_apply
-- ----------------------------

-- ----------------------------
-- Table structure for t_course_lession
-- ----------------------------
DROP TABLE IF EXISTS `t_course_lession`;
CREATE TABLE `t_course_lession` (
  `lession_id` int(11) NOT NULL AUTO_INCREMENT,
  `courseid` int(11) DEFAULT NULL,
  `lession_name` varchar(255) DEFAULT NULL,
  `lession_remark` varchar(255) DEFAULT NULL,
  `video_url` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`lession_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_course_lession
-- ----------------------------

-- ----------------------------
-- Table structure for t_course_user
-- ----------------------------
DROP TABLE IF EXISTS `t_course_user`;
CREATE TABLE `t_course_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `courseid` int(11) DEFAULT NULL,
  `userid` varchar(50) DEFAULT NULL,
  `userrole` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_course_user
-- ----------------------------

-- ----------------------------
-- Table structure for t_teacher_apply
-- ----------------------------
DROP TABLE IF EXISTS `t_teacher_apply`;
CREATE TABLE `t_teacher_apply` (
  `userid` varchar(50) DEFAULT NULL,
  `apply_remark` longtext,
  `check_result` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_teacher_apply
-- ----------------------------
INSERT INTO `t_teacher_apply` VALUES ('12', '2222222', '1');
INSERT INTO `t_teacher_apply` VALUES ('13', '2222', '2');

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `userid` varchar(50) NOT NULL,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `is_teacher` int(11) DEFAULT NULL,
  `tx` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('12', '12', '12', '1', null);
INSERT INTO `t_user` VALUES ('13', '13', '13', '2', null);
