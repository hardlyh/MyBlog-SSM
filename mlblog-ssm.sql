/*
Navicat MySQL Data Transfer

Source Server         : 1
Source Server Version : 50635
Source Host           : 127.0.0.1:3306
Source Database       : mlblog_ssm

Target Server Type    : MYSQL
Target Server Version : 50635
File Encoding         : 65001

Date: 2017-10-13 21:08:26
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for blog_admin
-- ----------------------------
DROP TABLE IF EXISTS `blog_admin`;
CREATE TABLE `blog_admin` (
  `id` tinyint(4) unsigned NOT NULL AUTO_INCREMENT,
  `gmt_create` date DEFAULT NULL COMMENT '创建时间',
  `username` varchar(20) DEFAULT NULL COMMENT '账号',
  `password` varchar(20) DEFAULT NULL COMMENT '密码',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for blog_admin_function
-- ----------------------------
DROP TABLE IF EXISTS `blog_admin_function`;
CREATE TABLE `blog_admin_function` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `admin_id` int(11) unsigned DEFAULT NULL COMMENT '人员id',
  `function_id` int(11) unsigned DEFAULT NULL COMMENT '权限id',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for blog_category
-- ----------------------------
DROP TABLE IF EXISTS `blog_category`;
CREATE TABLE `blog_category` (
  `id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `is_parent` tinyint(255) DEFAULT NULL COMMENT '是否是父节点',
  `parent_id` int(11) unsigned DEFAULT NULL COMMENT '父id',
  `name` varchar(255) DEFAULT '' COMMENT '标签名字',
  `gmt_create` datetime(6) DEFAULT NULL COMMENT '创建时间',
  `gmt_modified` datetime(6) DEFAULT NULL COMMENT '修改时间',
  `pageamount_category` smallint(255) DEFAULT NULL COMMENT '此标签下的文章总数',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for blog_function
-- ----------------------------
DROP TABLE IF EXISTS `blog_function`;
CREATE TABLE `blog_function` (
  `id` smallint(5) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT NULL COMMENT '权限名字',
  `description` varchar(255) DEFAULT NULL COMMENT '权限简介',
  `code` varchar(255) DEFAULT NULL COMMENT '权限简称',
  `page_url` varchar(255) DEFAULT NULL COMMENT '指向的url',
  `pid` tinyint(4) unsigned DEFAULT '0' COMMENT '父id 最顶层为0',
  `generatemenu` tinyint(4) DEFAULT NULL COMMENT '是否生成菜单 1 生成 0 不生成',
  `zindex` tinyint(4) DEFAULT NULL COMMENT '菜单排序',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for blog_myprofile
-- ----------------------------
DROP TABLE IF EXISTS `blog_myprofile`;
CREATE TABLE `blog_myprofile` (
  `id` tinyint(3) unsigned NOT NULL AUTO_INCREMENT,
  `name` varchar(255) DEFAULT '' COMMENT '名字',
  `age` tinyint(4) DEFAULT NULL COMMENT '年龄',
  `email` varchar(255) DEFAULT '' COMMENT '电子邮箱',
  `weibo` varchar(255) DEFAULT '' COMMENT '微博地址',
  `github` varchar(255) DEFAULT '' COMMENT 'github地址',
  `introduction` varchar(255) DEFAULT '' COMMENT '个人介绍',
  `myweb_url` varchar(255) DEFAULT '' COMMENT '个人网页地址',
  `head_portrait_url` varchar(255) DEFAULT NULL COMMENT '头像地址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for blog_page
-- ----------------------------
DROP TABLE IF EXISTS `blog_page`;
CREATE TABLE `blog_page` (
  `id` int(20) unsigned NOT NULL AUTO_INCREMENT,
  `page_title` varchar(255) DEFAULT '' COMMENT '标题',
  `page_html_url` varchar(255) DEFAULT '' COMMENT '静态页面地址',
  `page_viewing_count` smallint(255) unsigned DEFAULT '0' COMMENT '浏览量',
  `gmt_create` datetime(6) DEFAULT NULL,
  `gmt_modified` datetime(6) DEFAULT NULL COMMENT '更新时间',
  `page_tag` varchar(255) DEFAULT '' COMMENT '文章标签',
  `page_is_private` tinyint(255) unsigned DEFAULT NULL COMMENT '是否为私密文章',
  `page_imgurl` varchar(255) DEFAULT '' COMMENT '标题图片',
  `page_description` varchar(255) DEFAULT NULL COMMENT '文章简介',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=30 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for blog_page_content
-- ----------------------------
DROP TABLE IF EXISTS `blog_page_content`;
CREATE TABLE `blog_page_content` (
  `id` int(10) unsigned NOT NULL,
  `page_description` text COMMENT '页面简介',
  `page_content` text COMMENT '页面内容',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Table structure for blog_webinformation
-- ----------------------------
DROP TABLE IF EXISTS `blog_webinformation`;
CREATE TABLE `blog_webinformation` (
  `id` int(11) unsigned NOT NULL AUTO_INCREMENT,
  `time` date DEFAULT NULL,
  `totalcount` int(6) DEFAULT NULL,
  `todaycount` int(255) DEFAULT NULL,
  `articlecount` int(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8;
