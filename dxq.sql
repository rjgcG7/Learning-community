/*
Navicat MySQL Data Transfer

Source Server         : localhost_3306
Source Server Version : 50556
Source Host           : localhost:3306
Source Database       : dxq

Target Server Type    : MYSQL
Target Server Version : 50556
File Encoding         : 65001

Date: 2018-07-22 11:11:45
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
INSERT INTO `t_admin` VALUES ('admin', 'admin', 'admin', '管理员.jpg');

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
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_course
-- ----------------------------
INSERT INTO `t_course` VALUES ('1', '12', '钢琴入门', '音乐是最高雅的艺术，学习钢琴，净化心灵。', '钢琴.jpg');
INSERT INTO `t_course` VALUES ('2', '12', '古筝入门', '古筝入门课程', '古筝.jpg');
INSERT INTO `t_course` VALUES ('3', '12', '书法入门', '书法入门课程', '书法.jpg');
INSERT INTO `t_course` VALUES ('4', '12', '素描入门', '素描入门课程', '素描.jpg');
INSERT INTO `t_course` VALUES ('5', '5', '陶艺入门', '陶艺入门课程', '陶艺.jpg');
INSERT INTO `t_course` VALUES ('7', '12', '水彩入门', '水彩入门课程', '水彩.jpg');
INSERT INTO `t_course` VALUES ('8', '12', '烹饪入门', '烹饪入门课程', '烹饪.jpg');
INSERT INTO `t_course` VALUES ('9', '5', '小提琴入门', '小提琴入门课程', '小提琴.jpg');
INSERT INTO `t_course` VALUES ('10', '5', '折纸入门', '折纸入门课程', '折纸.jpg');

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
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_course_apply
-- ----------------------------
INSERT INTO `t_course_apply` VALUES ('5', '5', '素描高级', '适合已学习素描入门课程的学生', '1', 'background1.jpg');
INSERT INTO `t_course_apply` VALUES ('6', '12', '水彩高级', '适合已学习水彩入门课程的学生', '1', 'background1.jpg');
INSERT INTO `t_course_apply` VALUES ('7', '12', '小提琴高级', '适合已学习小提琴入门课程的学生', '1', 'background1.jpg');
INSERT INTO `t_course_apply` VALUES ('8', '12', '陶艺高级', '适合已学习陶艺入门课程的学生', '1', 'background1.jpg');

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
) ENGINE=InnoDB AUTO_INCREMENT=19 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_course_lession
-- ----------------------------
INSERT INTO `t_course_lession` VALUES ('13', '1', '钢琴第一课', '本次学习为钢琴入门第一节', 'VID_20180718_085144.mp4');
INSERT INTO `t_course_lession` VALUES ('14', '1', '钢琴第二课', '本次学习为钢琴入门第二节', '2.jpg');
INSERT INTO `t_course_lession` VALUES ('15', '1', '钢琴第三课', '本次学习为钢琴入门第三节', 'RUNNING.txt');
INSERT INTO `t_course_lession` VALUES ('16', '1', '钢琴第四课', '本次学习为钢琴入门第四节', 'RUNNING.txt');
INSERT INTO `t_course_lession` VALUES ('17', '1', '期中复习', '本次学习为钢琴入门期中复习', '1.jpg');
INSERT INTO `t_course_lession` VALUES ('18', '1', '期末考试', '本次学习为钢琴入门期末考试', '');

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
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_course_user
-- ----------------------------
INSERT INTO `t_course_user` VALUES ('1', '1', '123', null);
INSERT INTO `t_course_user` VALUES ('2', '1', '123', null);
INSERT INTO `t_course_user` VALUES ('3', '1', '123', null);
INSERT INTO `t_course_user` VALUES ('4', '2', '123', null);
INSERT INTO `t_course_user` VALUES ('5', '4', '123', null);
INSERT INTO `t_course_user` VALUES ('6', '4', '123', null);
INSERT INTO `t_course_user` VALUES ('7', '5', '123', null);
INSERT INTO `t_course_user` VALUES ('8', '3', '123', null);
INSERT INTO `t_course_user` VALUES ('9', '5', '12', null);

-- ----------------------------
-- Table structure for t_message
-- ----------------------------
DROP TABLE IF EXISTS `t_message`;
CREATE TABLE `t_message` (
  `messageid` int(11) NOT NULL AUTO_INCREMENT,
  `userid` varchar(50) DEFAULT NULL,
  `message` longtext,
  PRIMARY KEY (`messageid`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_message
-- ----------------------------
INSERT INTO `t_message` VALUES ('13', '13', '您的教师身份未通过审核');
INSERT INTO `t_message` VALUES ('16', '5', '钢琴入门课程通过审核');
INSERT INTO `t_message` VALUES ('17', '14', '您的教师身份未通过审核');
INSERT INTO `t_message` VALUES ('19', '13', '恭喜您成为教师');
INSERT INTO `t_message` VALUES ('21', '12', '水彩入门课程通过审核');
INSERT INTO `t_message` VALUES ('22', '123', '恭喜您成为教师');

-- ----------------------------
-- Table structure for t_notice
-- ----------------------------
DROP TABLE IF EXISTS `t_notice`;
CREATE TABLE `t_notice` (
  `noticeid` int(11) NOT NULL AUTO_INCREMENT,
  `courseid` int(11) DEFAULT NULL,
  `remark` longtext,
  `uptime` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`noticeid`)
) ENGINE=InnoDB AUTO_INCREMENT=20 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_notice
-- ----------------------------
INSERT INTO `t_notice` VALUES ('18', '1', '明天考试', '2018-07-21  10:41:48');
INSERT INTO `t_notice` VALUES ('19', '1', '今天放假', '2018-07-21  11:01:38');

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

-- ----------------------------
-- Table structure for t_test
-- ----------------------------
DROP TABLE IF EXISTS `t_test`;
CREATE TABLE `t_test` (
  `titleid` int(11) NOT NULL AUTO_INCREMENT,
  `title_name` varchar(50) DEFAULT NULL,
  `time` int(11) DEFAULT NULL,
  `courseid` int(11) DEFAULT NULL,
  `test_remark` longtext,
  `type` varchar(50) DEFAULT NULL,
  `A` longtext,
  `B` longtext,
  `C` longtext,
  `D` longtext,
  `key` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`titleid`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_test
-- ----------------------------
INSERT INTO `t_test` VALUES ('1', '1', '30', '1', '1+1', '1', '1', '2', '3', '4', null);
INSERT INTO `t_test` VALUES ('2', '1', '30', '1', '1+2', '1', '1', '2', '3', '4', null);
INSERT INTO `t_test` VALUES ('3', '1', '30', '1', '1+3', '1', '1', '2', '3', '4', null);
INSERT INTO `t_test` VALUES ('4', '1', '30', '1', '1+4', '1', '1', '2', '3', '4', null);
INSERT INTO `t_test` VALUES ('5', '1', '30', '1', '1+5', '1', '1', '2', '3', '4', null);
INSERT INTO `t_test` VALUES ('6', '2', '30', '1', '1+6', '1', '1', '2', '3', '4', null);
INSERT INTO `t_test` VALUES ('7', '2', '30', '1', '1+7', '1', '1', '2', '3', '4', null);
INSERT INTO `t_test` VALUES ('8', '2', '30', '1', '1+8', '1', '1', '2', '3', '4', null);
INSERT INTO `t_test` VALUES ('9', '2', '30', '1', '1+9', '1', '1', '2', '3', '4', null);
INSERT INTO `t_test` VALUES ('10', '2', '30', '1', '1+10', '1', '1', '2', '3', '4', null);
INSERT INTO `t_test` VALUES ('13', '1', '30', '1', '6+6', '2', null, null, null, null, null);
INSERT INTO `t_test` VALUES ('14', '1', '30', '1', '6+7', '2', null, null, null, null, null);
INSERT INTO `t_test` VALUES ('15', '1', '30', '1', '6+8', '2', null, null, null, null, null);
INSERT INTO `t_test` VALUES ('16', '1', '30', '1', '6+9', '2', null, null, null, null, null);
INSERT INTO `t_test` VALUES ('17', '1', '30', '1', '6+10', '2', null, null, null, null, null);

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user` (
  `userid` varchar(50) NOT NULL,
  `username` varchar(50) DEFAULT NULL,
  `password` varchar(50) DEFAULT NULL,
  `is_teacher` int(11) DEFAULT NULL,
  `remark` longtext,
  `tx` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`userid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES ('12', '12', '12', '1', '我要给高分', '头像(1).jpg');
INSERT INTO `t_user` VALUES ('123', '123', '123', '1', '我是大师', '头像(2).jpg');
INSERT INTO `t_user` VALUES ('13', '13', '13', '1', '我是青铜', '头像(3).jpg');
INSERT INTO `t_user` VALUES ('14', '14', '14', '2', '老师，请给高分', '头像(4).jpg');
INSERT INTO `t_user` VALUES ('144', '144', '144', '0', '我爱学习', '(8).jpg');
INSERT INTO `t_user` VALUES ('444', '444', '444', '0', '学习爱我', '(6).jpg');
INSERT INTO `t_user` VALUES ('5', '5', '5', '1', '我是菜鸡', '(7).jpg');
INSERT INTO `t_user` VALUES ('hhh', 'hh', 'hhh', '0', '天天学习', '(5).jpg');
