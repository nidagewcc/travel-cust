/*
Navicat MySQL Data Transfer

Source Server         : localDB
Source Server Version : 50505
Source Host           : localhost:3306
Source Database       : travel

Target Server Type    : MYSQL
Target Server Version : 50505
File Encoding         : 65001

Date: 2018-12-12 15:05:01
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for admin_user
-- ----------------------------
DROP TABLE IF EXISTS `admin_user`;
CREATE TABLE `admin_user` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `user_name` varchar(30) CHARACTER SET utf8mb4 NOT NULL COMMENT '用户名',
  `password` varchar(100) CHARACTER SET utf8mb4 NOT NULL COMMENT '密码',
  `mobile` varchar(20) CHARACTER SET utf8mb4 NOT NULL COMMENT '手机号',
  `email` varchar(50) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '邮箱',
  `powers` varchar(150) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '权限JSON TODO',
  `user_sts` tinyint(4) NOT NULL DEFAULT 0 COMMENT '用户状态 0：正常 1：TODO',
  `create_time` timestamp NOT NULL DEFAULT current_timestamp() COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp() COMMENT '更新时间',
  `del_flag` tinyint(4) NOT NULL DEFAULT 0 COMMENT '删除标志 0：正常 1：删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for order
-- ----------------------------
DROP TABLE IF EXISTS `order`;
CREATE TABLE `order` (
  `order_id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '订单ID',
  `order_no` varchar(100) CHARACTER SET utf8mb4 NOT NULL COMMENT '订单号',
  `contact_phone` varchar(20) CHARACTER SET utf8mb4 NOT NULL COMMENT '联系人手机号',
  `contact_name` varchar(30) CHARACTER SET utf8mb4 NOT NULL COMMENT '联系人姓名',
  `trip_id` int(11) NOT NULL COMMENT '行程ID',
  `trip_title` varchar(20) CHARACTER SET utf8mb4 NOT NULL COMMENT '行程标题',
  `ticket_info` varchar(100) CHARACTER SET utf8mb4 NOT NULL COMMENT '订票信息',
  `enroll_time` timestamp NOT NULL DEFAULT current_timestamp() COMMENT '是啥时间来着我忘了',
  `order_sts` tinyint(4) NOT NULL DEFAULT 0 COMMENT '订单状态 0：未处理 1：已处理',
  `remark` varchar(150) CHARACTER SET utf8mb4 DEFAULT NULL COMMENT '备注',
  `create_time` timestamp NOT NULL DEFAULT current_timestamp() COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp() COMMENT '更新时间',
  `del_flag` tinyint(4) NOT NULL DEFAULT 0 COMMENT '删除标志 0：正常 1：删除',
  PRIMARY KEY (`order_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- ----------------------------
-- Table structure for scenic
-- ----------------------------
DROP TABLE IF EXISTS `scenic`;
CREATE TABLE `scenic` (
  `scenic_id` int(11) unsigned NOT NULL AUTO_INCREMENT COMMENT '景点ID',
  `banner_imgs` varchar(150) CHARACTER SET utf8mb4 NOT NULL COMMENT '轮播图',
  `scenic_name` varchar(50) CHARACTER SET utf8mb4 NOT NULL COMMENT '景点名称',
  `scenic_address` varchar(100) CHARACTER SET utf8mb4 NOT NULL COMMENT '景点地址',
  `city_id` int(4) NOT NULL COMMENT '城市ID',
  `open_time` varchar(20) CHARACTER SET utf8mb4 NOT NULL COMMENT '开放时间',
  `ticket_info` varchar(100) CHARACTER SET utf8mb4 NOT NULL COMMENT '票价信息',
  `thumbnail` varchar(150) CHARACTER SET utf8mb4 NOT NULL COMMENT '缩略图',
  `scenic_sts` tinyint(4) NOT NULL DEFAULT 0 COMMENT '景点状态 0：正常 1：下线',
  `create_time` timestamp NOT NULL DEFAULT current_timestamp() COMMENT '创建时间',
  `update_time` timestamp NOT NULL DEFAULT current_timestamp() ON UPDATE current_timestamp() COMMENT '更新时间',
  `del_flag` tinyint(4) NOT NULL DEFAULT 0 COMMENT '删除标志 0：正常 1：删除',
  PRIMARY KEY (`scenic_id`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
