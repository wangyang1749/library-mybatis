/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50725
 Source Host           : localhost:3306
 Source Schema         : library

 Target Server Type    : MySQL
 Target Server Version : 50725
 File Encoding         : 65001

 Date: 06/10/2019 16:54:38
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for qrtz_blob_triggers
-- ----------------------------
DROP TABLE IF EXISTS `qrtz_blob_triggers`;
CREATE TABLE `qrtz_blob_triggers`  (
  `SCHED_NAME` varchar(120) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `TRIGGER_NAME` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `TRIGGER_GROUP` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `BLOB_DATA` blob NULL,
  PRIMARY KEY (`SCHED_NAME`, `TRIGGER_NAME`, `TRIGGER_GROUP`) USING BTREE,
  CONSTRAINT `qrtz_blob_triggers_ibfk_1` FOREIGN KEY (`SCHED_NAME`, `TRIGGER_NAME`, `TRIGGER_GROUP`) REFERENCES `qrtz_triggers` (`SCHED_NAME`, `TRIGGER_NAME`, `TRIGGER_GROUP`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for qrtz_calendars
-- ----------------------------
DROP TABLE IF EXISTS `qrtz_calendars`;
CREATE TABLE `qrtz_calendars`  (
  `SCHED_NAME` varchar(120) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `CALENDAR_NAME` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `CALENDAR` blob NOT NULL,
  PRIMARY KEY (`SCHED_NAME`, `CALENDAR_NAME`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for qrtz_cron_triggers
-- ----------------------------
DROP TABLE IF EXISTS `qrtz_cron_triggers`;
CREATE TABLE `qrtz_cron_triggers`  (
  `SCHED_NAME` varchar(120) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `TRIGGER_NAME` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `TRIGGER_GROUP` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `CRON_EXPRESSION` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `TIME_ZONE_ID` varchar(80) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`SCHED_NAME`, `TRIGGER_NAME`, `TRIGGER_GROUP`) USING BTREE,
  CONSTRAINT `qrtz_cron_triggers_ibfk_1` FOREIGN KEY (`SCHED_NAME`, `TRIGGER_NAME`, `TRIGGER_GROUP`) REFERENCES `qrtz_triggers` (`SCHED_NAME`, `TRIGGER_NAME`, `TRIGGER_GROUP`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for qrtz_fired_triggers
-- ----------------------------
DROP TABLE IF EXISTS `qrtz_fired_triggers`;
CREATE TABLE `qrtz_fired_triggers`  (
  `SCHED_NAME` varchar(120) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `ENTRY_ID` varchar(95) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `TRIGGER_NAME` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `TRIGGER_GROUP` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `INSTANCE_NAME` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `FIRED_TIME` bigint(13) NOT NULL,
  `SCHED_TIME` bigint(13) NOT NULL,
  `PRIORITY` int(11) NOT NULL,
  `STATE` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `JOB_NAME` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `JOB_GROUP` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `IS_NONCONCURRENT` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `REQUESTS_RECOVERY` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`SCHED_NAME`, `ENTRY_ID`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for qrtz_job_details
-- ----------------------------
DROP TABLE IF EXISTS `qrtz_job_details`;
CREATE TABLE `qrtz_job_details`  (
  `SCHED_NAME` varchar(120) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `JOB_NAME` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `JOB_GROUP` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `DESCRIPTION` varchar(250) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `JOB_CLASS_NAME` varchar(250) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `IS_DURABLE` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `IS_NONCONCURRENT` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `IS_UPDATE_DATA` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `REQUESTS_RECOVERY` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `JOB_DATA` blob NULL,
  PRIMARY KEY (`SCHED_NAME`, `JOB_NAME`, `JOB_GROUP`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for qrtz_locks
-- ----------------------------
DROP TABLE IF EXISTS `qrtz_locks`;
CREATE TABLE `qrtz_locks`  (
  `SCHED_NAME` varchar(120) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `LOCK_NAME` varchar(40) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`SCHED_NAME`, `LOCK_NAME`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of qrtz_locks
-- ----------------------------
INSERT INTO `qrtz_locks` VALUES ('DefaultQuartzScheduler', 'TRIGGER_ACCESS');

-- ----------------------------
-- Table structure for qrtz_paused_trigger_grps
-- ----------------------------
DROP TABLE IF EXISTS `qrtz_paused_trigger_grps`;
CREATE TABLE `qrtz_paused_trigger_grps`  (
  `SCHED_NAME` varchar(120) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `TRIGGER_GROUP` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`SCHED_NAME`, `TRIGGER_GROUP`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for qrtz_scheduler_state
-- ----------------------------
DROP TABLE IF EXISTS `qrtz_scheduler_state`;
CREATE TABLE `qrtz_scheduler_state`  (
  `SCHED_NAME` varchar(120) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `INSTANCE_NAME` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `LAST_CHECKIN_TIME` bigint(13) NOT NULL,
  `CHECKIN_INTERVAL` bigint(13) NOT NULL,
  PRIMARY KEY (`SCHED_NAME`, `INSTANCE_NAME`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for qrtz_simple_triggers
-- ----------------------------
DROP TABLE IF EXISTS `qrtz_simple_triggers`;
CREATE TABLE `qrtz_simple_triggers`  (
  `SCHED_NAME` varchar(120) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `TRIGGER_NAME` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `TRIGGER_GROUP` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `REPEAT_COUNT` bigint(7) NOT NULL,
  `REPEAT_INTERVAL` bigint(12) NOT NULL,
  `TIMES_TRIGGERED` bigint(10) NOT NULL,
  PRIMARY KEY (`SCHED_NAME`, `TRIGGER_NAME`, `TRIGGER_GROUP`) USING BTREE,
  CONSTRAINT `qrtz_simple_triggers_ibfk_1` FOREIGN KEY (`SCHED_NAME`, `TRIGGER_NAME`, `TRIGGER_GROUP`) REFERENCES `qrtz_triggers` (`SCHED_NAME`, `TRIGGER_NAME`, `TRIGGER_GROUP`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for qrtz_simprop_triggers
-- ----------------------------
DROP TABLE IF EXISTS `qrtz_simprop_triggers`;
CREATE TABLE `qrtz_simprop_triggers`  (
  `SCHED_NAME` varchar(120) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `TRIGGER_NAME` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `TRIGGER_GROUP` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `STR_PROP_1` varchar(512) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `STR_PROP_2` varchar(512) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `STR_PROP_3` varchar(512) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `INT_PROP_1` int(11) NULL DEFAULT NULL,
  `INT_PROP_2` int(11) NULL DEFAULT NULL,
  `LONG_PROP_1` bigint(20) NULL DEFAULT NULL,
  `LONG_PROP_2` bigint(20) NULL DEFAULT NULL,
  `DEC_PROP_1` decimal(13, 4) NULL DEFAULT NULL,
  `DEC_PROP_2` decimal(13, 4) NULL DEFAULT NULL,
  `BOOL_PROP_1` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `BOOL_PROP_2` varchar(1) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`SCHED_NAME`, `TRIGGER_NAME`, `TRIGGER_GROUP`) USING BTREE,
  CONSTRAINT `qrtz_simprop_triggers_ibfk_1` FOREIGN KEY (`SCHED_NAME`, `TRIGGER_NAME`, `TRIGGER_GROUP`) REFERENCES `qrtz_triggers` (`SCHED_NAME`, `TRIGGER_NAME`, `TRIGGER_GROUP`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for qrtz_triggers
-- ----------------------------
DROP TABLE IF EXISTS `qrtz_triggers`;
CREATE TABLE `qrtz_triggers`  (
  `SCHED_NAME` varchar(120) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `TRIGGER_NAME` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `TRIGGER_GROUP` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `JOB_NAME` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `JOB_GROUP` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `DESCRIPTION` varchar(250) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `NEXT_FIRE_TIME` bigint(13) NULL DEFAULT NULL,
  `PREV_FIRE_TIME` bigint(13) NULL DEFAULT NULL,
  `PRIORITY` int(11) NULL DEFAULT NULL,
  `TRIGGER_STATE` varchar(16) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `TRIGGER_TYPE` varchar(8) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  `START_TIME` bigint(13) NOT NULL,
  `END_TIME` bigint(13) NULL DEFAULT NULL,
  `CALENDAR_NAME` varchar(200) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `MISFIRE_INSTR` smallint(2) NULL DEFAULT NULL,
  `JOB_DATA` blob NULL,
  PRIMARY KEY (`SCHED_NAME`, `TRIGGER_NAME`, `TRIGGER_GROUP`) USING BTREE,
  INDEX `SCHED_NAME`(`SCHED_NAME`, `JOB_NAME`, `JOB_GROUP`) USING BTREE,
  CONSTRAINT `qrtz_triggers_ibfk_1` FOREIGN KEY (`SCHED_NAME`, `JOB_NAME`, `JOB_GROUP`) REFERENCES `qrtz_job_details` (`SCHED_NAME`, `JOB_NAME`, `JOB_GROUP`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_book
-- ----------------------------
DROP TABLE IF EXISTS `t_book`;
CREATE TABLE `t_book`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `seat_id` int(11) NULL DEFAULT NULL,
  `user_id` int(11) NULL DEFAULT NULL,
  `occupy_status` int(11) NULL DEFAULT NULL,
  `strat_time` timestamp(0) NULL DEFAULT NULL,
  `end_time` timestamp(0) NULL DEFAULT NULL,
  `expire` int(11) NULL DEFAULT NULL COMMENT '是否过期',
  `violation` int(11) NULL DEFAULT NULL,
  `long_trem` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `user_book`(`user_id`) USING BTREE,
  INDEX `seat_book`(`seat_id`) USING BTREE,
  CONSTRAINT `seat_book` FOREIGN KEY (`seat_id`) REFERENCES `t_seat` (`seat_number`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `user_book` FOREIGN KEY (`user_id`) REFERENCES `t_user` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 28 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_book
-- ----------------------------
INSERT INTO `t_book` VALUES (7, 101, 12927286, 1, NULL, NULL, 1, NULL, NULL);
INSERT INTO `t_book` VALUES (8, 102, NULL, 0, NULL, NULL, 1, NULL, NULL);
INSERT INTO `t_book` VALUES (9, 105, NULL, 1, NULL, NULL, 1, NULL, NULL);
INSERT INTO `t_book` VALUES (10, 128, NULL, 0, NULL, NULL, 1, NULL, NULL);
INSERT INTO `t_book` VALUES (11, 107, NULL, 1, NULL, NULL, 1, NULL, NULL);
INSERT INTO `t_book` VALUES (12, 110, NULL, NULL, NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_book` VALUES (13, 103, 12927286, NULL, '2019-06-05 20:33:31', NULL, 1, NULL, NULL);
INSERT INTO `t_book` VALUES (14, 104, 12927286, NULL, '2019-06-05 13:04:20', NULL, 1, NULL, NULL);
INSERT INTO `t_book` VALUES (15, 109, 12927286, NULL, '2019-06-05 13:05:37', NULL, 1, NULL, NULL);
INSERT INTO `t_book` VALUES (16, 111, 12927286, NULL, '2019-06-05 13:06:31', NULL, 1, NULL, NULL);
INSERT INTO `t_book` VALUES (17, 112, 12927286, NULL, '2019-06-05 13:07:09', NULL, 1, NULL, NULL);
INSERT INTO `t_book` VALUES (18, 113, 12927286, NULL, '2019-06-05 13:09:24', NULL, 1, NULL, NULL);
INSERT INTO `t_book` VALUES (19, 123, 12927286, NULL, '2019-06-05 13:11:26', NULL, 1, NULL, NULL);
INSERT INTO `t_book` VALUES (20, 100, 12927286, NULL, '2019-06-05 13:14:06', NULL, 1, NULL, NULL);
INSERT INTO `t_book` VALUES (21, 108, 12927286, NULL, '2019-06-05 13:33:24', NULL, 1, NULL, NULL);
INSERT INTO `t_book` VALUES (22, 122, 12927286, NULL, '2019-06-05 13:36:36', NULL, 1, NULL, NULL);
INSERT INTO `t_book` VALUES (23, 126, 12927286, NULL, '2019-06-05 13:38:08', NULL, 1, NULL, NULL);
INSERT INTO `t_book` VALUES (24, 117, 12927286, NULL, '2019-06-05 13:39:58', NULL, 1, NULL, NULL);
INSERT INTO `t_book` VALUES (25, 118, 12927286, NULL, '2019-06-05 13:40:34', NULL, 1, NULL, NULL);
INSERT INTO `t_book` VALUES (26, 114, 12927286, NULL, '2019-06-05 13:43:11', NULL, 1, NULL, NULL);
INSERT INTO `t_book` VALUES (27, 116, 12927286, NULL, '2019-06-05 13:48:17', NULL, 1, NULL, NULL);

-- ----------------------------
-- Table structure for t_cancel_book
-- ----------------------------
DROP TABLE IF EXISTS `t_cancel_book`;
CREATE TABLE `t_cancel_book`  (
  `id` int(11) NOT NULL,
  `user_id` int(11) NULL DEFAULT NULL,
  `cancel_time` datetime(0) NULL DEFAULT NULL,
  `book_id` int(11) NULL DEFAULT NULL,
  `expire` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `cancel_book`(`book_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_group
-- ----------------------------
DROP TABLE IF EXISTS `t_group`;
CREATE TABLE `t_group`  (
  `id` int(11) NOT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `deasc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_menu
-- ----------------------------
DROP TABLE IF EXISTS `t_menu`;
CREATE TABLE `t_menu`  (
  `id` int(11) NOT NULL,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `pid` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_role
-- ----------------------------
DROP TABLE IF EXISTS `t_role`;
CREATE TABLE `t_role`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '角色的名称\r\n',
  `role_sn` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '角色的编号',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_role
-- ----------------------------
INSERT INTO `t_role` VALUES (1, '管理员', NULL);
INSERT INTO `t_role` VALUES (2, '老师', NULL);
INSERT INTO `t_role` VALUES (3, '学生', NULL);

-- ----------------------------
-- Table structure for t_role_menu
-- ----------------------------
DROP TABLE IF EXISTS `t_role_menu`;
CREATE TABLE `t_role_menu`  (
  `id` int(11) NOT NULL,
  `r_id` int(11) NULL DEFAULT NULL,
  `m_id` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `menu_role`(`r_id`) USING BTREE,
  INDEX `role_menu`(`m_id`) USING BTREE,
  CONSTRAINT `role_menu` FOREIGN KEY (`m_id`) REFERENCES `t_menu` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_role_url
-- ----------------------------
DROP TABLE IF EXISTS `t_role_url`;
CREATE TABLE `t_role_url`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `r_id` int(11) NULL DEFAULT NULL,
  `u_id` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `url_role`(`r_id`) USING BTREE,
  INDEX `role_url`(`u_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_role_url
-- ----------------------------
INSERT INTO `t_role_url` VALUES (1, 1, 1);
INSERT INTO `t_role_url` VALUES (4, 1, 2);

-- ----------------------------
-- Table structure for t_seat
-- ----------------------------
DROP TABLE IF EXISTS `t_seat`;
CREATE TABLE `t_seat`  (
  `seat_number` int(11) NOT NULL AUTO_INCREMENT,
  `room_number` int(11) NULL DEFAULT NULL,
  `qr_date` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `type` int(11) NULL DEFAULT NULL,
  `status` int(11) NULL DEFAULT 0,
  `seat_desc` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `create_date` timestamp(0) NULL DEFAULT NULL,
  PRIMARY KEY (`seat_number`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 129 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_seat
-- ----------------------------
INSERT INTO `t_seat` VALUES (100, 1, NULL, 1, 1, '1', '2019-06-05 15:10:05');
INSERT INTO `t_seat` VALUES (101, 1, '1', 1, 3, NULL, NULL);
INSERT INTO `t_seat` VALUES (102, 1, '1', 1, 2, NULL, NULL);
INSERT INTO `t_seat` VALUES (103, 1, '1', 1, 1, NULL, NULL);
INSERT INTO `t_seat` VALUES (104, 1, '1', 1, 1, NULL, NULL);
INSERT INTO `t_seat` VALUES (105, 1, '1', 1, 1, NULL, NULL);
INSERT INTO `t_seat` VALUES (106, 1, '1', 1, 0, NULL, NULL);
INSERT INTO `t_seat` VALUES (107, 1, '1', 1, 1, NULL, NULL);
INSERT INTO `t_seat` VALUES (108, 1, '1', 1, 1, NULL, NULL);
INSERT INTO `t_seat` VALUES (109, 1, '1', 1, 1, NULL, NULL);
INSERT INTO `t_seat` VALUES (110, 1, '1', 1, 1, NULL, NULL);
INSERT INTO `t_seat` VALUES (111, 1, '1', 1, 1, NULL, NULL);
INSERT INTO `t_seat` VALUES (112, 1, '1', 1, 1, NULL, NULL);
INSERT INTO `t_seat` VALUES (113, 1, '1', 1, 1, NULL, NULL);
INSERT INTO `t_seat` VALUES (114, 1, '1', 1, 1, NULL, NULL);
INSERT INTO `t_seat` VALUES (115, 1, '1', 1, 0, NULL, NULL);
INSERT INTO `t_seat` VALUES (116, 1, '1', 1, 1, NULL, NULL);
INSERT INTO `t_seat` VALUES (117, 1, '1', 1, 1, NULL, NULL);
INSERT INTO `t_seat` VALUES (118, 1, '1', 1, 1, NULL, NULL);
INSERT INTO `t_seat` VALUES (119, 1, '1', 1, 0, NULL, NULL);
INSERT INTO `t_seat` VALUES (120, 1, '1', 1, 0, NULL, NULL);
INSERT INTO `t_seat` VALUES (121, 1, '1', 1, 0, NULL, NULL);
INSERT INTO `t_seat` VALUES (122, 1, '1', 1, 1, NULL, NULL);
INSERT INTO `t_seat` VALUES (123, 1, '1', 1, 1, NULL, NULL);
INSERT INTO `t_seat` VALUES (124, 1, '1', 1, 0, NULL, NULL);
INSERT INTO `t_seat` VALUES (125, 1, '1', 1, 0, NULL, NULL);
INSERT INTO `t_seat` VALUES (126, 1, '1', 1, 1, NULL, NULL);
INSERT INTO `t_seat` VALUES (127, 1, '1', 1, 0, NULL, NULL);
INSERT INTO `t_seat` VALUES (128, 1, '1', 1, 2, NULL, NULL);

-- ----------------------------
-- Table structure for t_student
-- ----------------------------
DROP TABLE IF EXISTS `t_student`;
CREATE TABLE `t_student`  (
  `id` int(11) NULL DEFAULT NULL,
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `collegename` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `classname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `studentid` int(11) NULL DEFAULT NULL,
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `status` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `collegename_id` int(11) NULL DEFAULT NULL,
  `classname_id` int(11) NULL DEFAULT NULL,
  `yb_id` int(11) NULL DEFAULT NULL,
  INDEX `id`(`id`) USING BTREE,
  INDEX `studnet_collenge`(`collegename_id`) USING BTREE,
  INDEX `student_class`(`classname_id`) USING BTREE,
  CONSTRAINT `student_class` FOREIGN KEY (`classname_id`) REFERENCES `t_sys_school` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `studnet_collenge` FOREIGN KEY (`collegename_id`) REFERENCES `t_sys_school` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_sys_school
-- ----------------------------
DROP TABLE IF EXISTS `t_sys_school`;
CREATE TABLE `t_sys_school`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `level` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `pid` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 3 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_sys_school
-- ----------------------------
INSERT INTO `t_sys_school` VALUES (1, '生物医药与食品工程学院', '0', 0);
INSERT INTO `t_sys_school` VALUES (2, '生物技术1702', NULL, 1);

-- ----------------------------
-- Table structure for t_teacher
-- ----------------------------
DROP TABLE IF EXISTS `t_teacher`;
CREATE TABLE `t_teacher`  (
  `id` int(11) NOT NULL,
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `collegename` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `collegename_id` int(11) NULL DEFAULT NULL,
  `classname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `classname_id` int(11) NULL DEFAULT NULL,
  `yb_id` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `teacher_college`(`collegename_id`) USING BTREE,
  INDEX `teacher_class`(`classname_id`) USING BTREE,
  CONSTRAINT `teacher_class` FOREIGN KEY (`classname_id`) REFERENCES `t_sys_school` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `teacher_college` FOREIGN KEY (`collegename_id`) REFERENCES `t_sys_school` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for t_url
-- ----------------------------
DROP TABLE IF EXISTS `t_url`;
CREATE TABLE `t_url`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 4 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_url
-- ----------------------------
INSERT INTO `t_url` VALUES (1, 'com.syyb.web.controller.UserController.index');
INSERT INTO `t_url` VALUES (2, '/userList');
INSERT INTO `t_url` VALUES (3, '/roleList');

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `password` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `sex` int(11) NULL DEFAULT NULL,
  `email` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `status` int(255) NULL DEFAULT NULL,
  `collegename` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `collegename_id` int(11) NULL DEFAULT NULL,
  `classname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `classname_id` int(11) NULL DEFAULT NULL,
  `nickname` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `img` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `user_college`(`collegename_id`) USING BTREE,
  INDEX `user_class`(`classname_id`) USING BTREE,
  CONSTRAINT `user_class` FOREIGN KEY (`classname_id`) REFERENCES `t_sys_school` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT,
  CONSTRAINT `user_college` FOREIGN KEY (`collegename_id`) REFERENCES `t_sys_school` (`id`) ON DELETE RESTRICT ON UPDATE RESTRICT
) ENGINE = InnoDB AUTO_INCREMENT = 12927287 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES (9, 'brte', NULL, NULL, NULL, NULL, '花材', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_user` VALUES (11, 'evvwa', NULL, NULL, NULL, NULL, '花材', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_user` VALUES (14, 'vewa', NULL, NULL, NULL, NULL, '花材', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_user` VALUES (17, 'jujr', NULL, NULL, NULL, NULL, '花材', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_user` VALUES (20, 'dfew', NULL, NULL, NULL, NULL, '花材', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_user` VALUES (21, 'dwfc', NULL, NULL, NULL, NULL, '花材', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_user` VALUES (22, 'cwcw', NULL, NULL, NULL, NULL, '花材', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_user` VALUES (23, 'brte', NULL, NULL, NULL, NULL, '花材', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_user` VALUES (24, 'nreb', NULL, NULL, NULL, NULL, '花材', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_user` VALUES (25, 'evvwa', NULL, NULL, NULL, NULL, '花材', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_user` VALUES (26, 'veea', NULL, NULL, NULL, NULL, '花材', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_user` VALUES (27, 'vea', NULL, NULL, NULL, NULL, '花材', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_user` VALUES (28, 'vewa', NULL, NULL, NULL, NULL, '花材', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_user` VALUES (29, 'trhy', NULL, NULL, NULL, NULL, '花材', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_user` VALUES (30, 'yyjr', NULL, NULL, NULL, NULL, '花材', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_user` VALUES (31, 'jujr', NULL, NULL, NULL, NULL, '花材', NULL, NULL, NULL, NULL, NULL);
INSERT INTO `t_user` VALUES (12927286, 'user', '123456', NULL, NULL, NULL, '生物医药与食品工程学院', NULL, '生技1702', NULL, '王阳', 'http://img02.fs.yiban.cn/12927286/avatar/user/200');

-- ----------------------------
-- Table structure for t_user_role
-- ----------------------------
DROP TABLE IF EXISTS `t_user_role`;
CREATE TABLE `t_user_role`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `u_id` int(11) NULL DEFAULT NULL,
  `r_id` int(11) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `user_role`(`r_id`) USING BTREE,
  INDEX `role_student`(`u_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci COMMENT = '存储用户和角色的关联' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_user_role
-- ----------------------------
INSERT INTO `t_user_role` VALUES (1, 12927286, 1);

-- ----------------------------
-- Table structure for t_violated_book
-- ----------------------------
DROP TABLE IF EXISTS `t_violated_book`;
CREATE TABLE `t_violated_book`  (
  `id` int(11) NOT NULL,
  `book_id` int(11) NULL DEFAULT NULL,
  `user_id` int(11) NULL DEFAULT NULL,
  `violated_time` varchar(0) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `expire` int(255) NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE,
  INDEX `violated_book`(`book_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
