/*
Navicat MySQL Data Transfer

Source Server         : test
Source Server Version : 50711
Source Host           : localhost:3306
Source Database       : zdsc

Target Server Type    : MYSQL
Target Server Version : 50711
File Encoding         : 65001

Date: 2017-06-15 21:18:29
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `course`
-- ----------------------------
DROP TABLE IF EXISTS `course`;
CREATE TABLE `course` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `level` int(11) DEFAULT NULL,
  `introduction` text CHARACTER SET utf8,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=22 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of course
-- ----------------------------
INSERT INTO `course` VALUES ('1', '小儿推拿', '1', '介绍');
INSERT INTO `course` VALUES ('2', '中医正骨推拿', '1', '介绍');
INSERT INTO `course` VALUES ('3', '耳穴疗法', '1', '介绍');
INSERT INTO `course` VALUES ('4', '拔罐疗法', '1', '介绍');
INSERT INTO `course` VALUES ('5', '刮痧疗法', '1', '介绍');
INSERT INTO `course` VALUES ('6', '艾灸疗法', '1', '介绍');
INSERT INTO `course` VALUES ('7', '穴位贴敷疗法', '1', '介绍');
INSERT INTO `course` VALUES ('8', '穴位注射疗法', '1', '介绍');
INSERT INTO `course` VALUES ('9', '浮针疗法', '1', '介绍');
INSERT INTO `course` VALUES ('10', '头皮针疗法', '1', '介绍');
INSERT INTO `course` VALUES ('11', '腕踝针疗法', '1', '介绍');
INSERT INTO `course` VALUES ('12', '针刺疗法', '1', '介绍');
INSERT INTO `course` VALUES ('13', '中医舌诊', '1', '介绍');
INSERT INTO `course` VALUES ('14', '中医脉诊', '1', '介绍');
INSERT INTO `course` VALUES ('15', '中医手诊', '1', '介绍');
INSERT INTO `course` VALUES ('16', '妇科常见病 中医综合治疗', '2', '介绍');
INSERT INTO `course` VALUES ('17', '儿科常见病 中医综合治疗', '2', '介绍');
INSERT INTO `course` VALUES ('18', '皮肤科常见病 中医综合治疗', '2', '介绍');
INSERT INTO `course` VALUES ('19', '心脑血管疾病的中医综合治疗', '2', '介绍');
INSERT INTO `course` VALUES ('20', '一针阵痛疗法', '3', '介绍');
INSERT INTO `course` VALUES ('21', '针灸减肥', '3', '介绍');

-- ----------------------------
-- Table structure for `customer`
-- ----------------------------
DROP TABLE IF EXISTS `customer`;
CREATE TABLE `customer` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `uid` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `mobilePhone` int(11) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of customer
-- ----------------------------
INSERT INTO `customer` VALUES ('1', '123', 'saf', '123', null, null);

-- ----------------------------
-- Table structure for `news`
-- ----------------------------
DROP TABLE IF EXISTS `news`;
CREATE TABLE `news` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `title` varchar(255) DEFAULT NULL,
  `content` text,
  `presstime` datetime DEFAULT NULL,
  `author` varchar(255) DEFAULT NULL,
  `delflag` tinyint(3) unsigned zerofill DEFAULT NULL,
  `classification` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of news
-- ----------------------------
INSERT INTO `news` VALUES ('1', 'title1', 'news1', '2017-06-01 00:00:00', 'author1', '000', 'type1');
INSERT INTO `news` VALUES ('2', 'title2', 'news2', '2017-06-02 00:00:00', 'author2', '000', 'type2');
INSERT INTO `news` VALUES ('3', 'title3', 'news3', '2017-06-03 00:00:00', 'author3', '000', 'type1');

-- ----------------------------
-- Table structure for `policy`
-- ----------------------------
DROP TABLE IF EXISTS `policy`;
CREATE TABLE `policy` (
  `id` int(11) NOT NULL,
  `title` varchar(255) DEFAULT NULL,
  `content` text,
  `classification` varchar(255) DEFAULT NULL,
  `rank` int(11) DEFAULT NULL,
  `subrank` int(11) DEFAULT NULL,
  `link` varchar(255) DEFAULT NULL,
  `delflag` tinyint(3) unsigned zerofill DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of policy
-- ----------------------------
INSERT INTO `policy` VALUES ('1', 'title1', 'policy1', 'type1', '1', '1', '1', '000');
INSERT INTO `policy` VALUES ('2', 'title2', 'policy2', 'type2', '2', '2', '2', '000');
INSERT INTO `policy` VALUES ('3', 'title3', 'policy3', 'type1', '3', '3', '3', '000');
INSERT INTO `policy` VALUES ('4', 'title4', 'policy4', 'type1', '4', '2', '4', '000');
INSERT INTO `policy` VALUES ('5', 'title5', 'policy5', 'type2', '5', '1', '5', '000');

-- ----------------------------
-- Table structure for `qyzcpx`
-- ----------------------------
DROP TABLE IF EXISTS `qyzcpx`;
CREATE TABLE `qyzcpx` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `introduction` text CHARACTER SET utf8,
  `exam` text CHARACTER SET utf8,
  `delflag` tinyint(3) unsigned zerofill DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of qyzcpx
-- ----------------------------
INSERT INTO `qyzcpx` VALUES ('1', '这里是确有专长培训第一个介绍', '这里是确有专长培训考试大纲', '000');

-- ----------------------------
-- Table structure for `scpx`
-- ----------------------------
DROP TABLE IF EXISTS `scpx`;
CREATE TABLE `scpx` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `introduction` text CHARACTER SET utf8,
  `exam` text CHARACTER SET utf8,
  `delflag` tinyint(4) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of scpx
-- ----------------------------
INSERT INTO `scpx` VALUES ('1', '这里是师承培训第一个简介，包含了很多东西', '这里是考试大纲', '0');

-- ----------------------------
-- Table structure for `zysyjs`
-- ----------------------------
DROP TABLE IF EXISTS `zysyjs`;
CREATE TABLE `zysyjs` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `course` varchar(255) CHARACTER SET utf8 DEFAULT NULL,
  `level` int(11) DEFAULT NULL,
  `introduction` text CHARACTER SET utf8,
  `delflag` tinyint(3) unsigned zerofill DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8 COLLATE=utf8_bin;

-- ----------------------------
-- Records of zysyjs
-- ----------------------------
INSERT INTO `zysyjs` VALUES ('1', '初级第一个课程', '1', '这里是初级第一个课程的简介', '000');
INSERT INTO `zysyjs` VALUES ('2', '中级第一个课程', '2', '这里是中级第一个课程的简介', '000');
INSERT INTO `zysyjs` VALUES ('3', '高级第一个课程', '3', '这里是高级第一个课程的简介', '000');
