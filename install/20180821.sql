/*
SQLyog  v12.2.6 (64 bit)
MySQL - 5.6.21-log : Database - kerwin_ssm
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`kerwin_ssm` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `kerwin_ssm`;

/*Table structure for table `auth_permission` */

DROP TABLE IF EXISTS `auth_permission`;

CREATE TABLE `auth_permission` (
  `id` char(18) NOT NULL DEFAULT '',
  `parent_key` varchar(18) DEFAULT NULL COMMENT '父权限key',
  `authority_key` varchar(18) DEFAULT NULL COMMENT '权限key',
  `authority_type` varchar(10) DEFAULT NULL COMMENT '权限类型(anon, authc, role)',
  `role` varchar(50) DEFAULT NULL COMMENT '权限url角色',
  `name` varchar(50) DEFAULT '' COMMENT '权限名称',
  `url` varchar(50) DEFAULT NULL COMMENT '权限url',
  `display` tinyint(1) DEFAULT NULL COMMENT '分配权限时是否展示1-展示 0-不展示',
  `status` tinyint(1) NOT NULL DEFAULT '1' COMMENT '1-激活 0-禁用',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `auth_permission` */

insert  into `auth_permission`(`id`,`parent_key`,`authority_key`,`authority_type`,`role`,`name`,`url`,`display`,`status`) values 
('1',NULL,'login','anon',NULL,'登录','/login',0,1),
('2',NULL,'logout','authc',NULL,'登出','/logout',0,1),
('3',NULL,'user_save','perms',NULL,'保存用户','/user/save',1,1),
('9999',NULL,'anyone','anon',NULL,'无权限控制','/**',NULL,0);

/*Table structure for table `auth_role` */

DROP TABLE IF EXISTS `auth_role`;

CREATE TABLE `auth_role` (
  `id` char(18) NOT NULL,
  `role_num` varchar(20) NOT NULL DEFAULT '' COMMENT '角色编号',
  `role_name` varchar(20) NOT NULL DEFAULT '' COMMENT '角色名称',
  `status` tinyint(1) NOT NULL DEFAULT '1' COMMENT '1-激活 0-禁用',
  `del_flag` tinyint(1) NOT NULL DEFAULT '0' COMMENT '1-删除 0-未删除',
  `create_user_id` char(18) DEFAULT NULL COMMENT '创建者id',
  `create_user_name` varchar(100) DEFAULT NULL COMMENT '创建者用户名',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `create_ip` varchar(100) DEFAULT NULL COMMENT '创建者ip',
  `last_modify_user_id` char(18) DEFAULT NULL COMMENT '修改者id',
  `last_modify_user_name` varchar(100) DEFAULT NULL COMMENT '修改者用户名',
  `last_modify_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `last_modify_ip` varchar(100) DEFAULT NULL COMMENT '修改者ip',
  PRIMARY KEY (`id`),
  UNIQUE KEY `role_num` (`role_num`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='角色列表';

/*Data for the table `auth_role` */

insert  into `auth_role`(`id`,`role_num`,`role_name`,`status`,`del_flag`,`create_user_id`,`create_user_name`,`create_time`,`create_ip`,`last_modify_user_id`,`last_modify_user_name`,`last_modify_time`,`last_modify_ip`) values 
('11','A001','超级管理员',1,0,NULL,NULL,'2017-11-01 17:29:35',NULL,NULL,NULL,'2017-11-01 17:31:15',NULL);

/*Table structure for table `auth_role_permission` */

DROP TABLE IF EXISTS `auth_role_permission`;

CREATE TABLE `auth_role_permission` (
  `role_id` char(18) NOT NULL DEFAULT '',
  `authority_id` char(18) NOT NULL DEFAULT '',
  PRIMARY KEY (`role_id`,`authority_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `auth_role_permission` */

insert  into `auth_role_permission`(`role_id`,`authority_id`) values 
('11','2');

/*Table structure for table `auth_user` */

DROP TABLE IF EXISTS `auth_user`;

CREATE TABLE `auth_user` (
  `id` char(18) NOT NULL COMMENT '主键id',
  `user_name` varchar(20) NOT NULL DEFAULT '' COMMENT '用户名',
  `password` varchar(50) NOT NULL DEFAULT '' COMMENT '密码(已加密)',
  `salt` varchar(50) DEFAULT NULL COMMENT '密码加密盐值',
  `employee_name` varchar(20) DEFAULT NULL COMMENT '员工名称',
  `last_login_time` datetime DEFAULT NULL COMMENT '最近一次登录时间',
  `last_login_ip` varchar(20) DEFAULT NULL COMMENT '最近一次登录ip',
  `last_modify_password_time` datetime DEFAULT NULL COMMENT '最近一次修改密码时间',
  `status` tinyint(1) NOT NULL DEFAULT '1' COMMENT '1-激活 0-禁用',
  `del_flag` tinyint(1) NOT NULL DEFAULT '0' COMMENT '1-删除 0-未删除',
  `create_user_id` char(18) DEFAULT NULL COMMENT '创建者id',
  `create_user_name` varchar(20) DEFAULT NULL COMMENT '创建者用户名',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `create_ip` varchar(20) DEFAULT NULL COMMENT '创建者ip',
  `last_modify_user_id` char(18) DEFAULT NULL COMMENT '修改者id',
  `last_modify_user_name` varchar(20) DEFAULT NULL COMMENT '修改者用户名',
  `last_modify_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '修改时间',
  `last_modify_ip` varchar(20) DEFAULT NULL COMMENT '修改者ip',
  PRIMARY KEY (`id`),
  UNIQUE KEY `user_name` (`user_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COMMENT='登录用户';

/*Data for the table `auth_user` */

insert  into `auth_user`(`id`,`user_name`,`password`,`salt`,`employee_name`,`last_login_time`,`last_login_ip`,`last_modify_password_time`,`status`,`del_flag`,`create_user_id`,`create_user_name`,`create_time`,`create_ip`,`last_modify_user_id`,`last_modify_user_name`,`last_modify_time`,`last_modify_ip`) values 
('111','admin','123',NULL,'kerwin',NULL,NULL,NULL,1,0,NULL,NULL,'2017-10-27 11:14:59',NULL,NULL,NULL,'2018-08-12 13:42:53',NULL);

/*Table structure for table `auth_user_role` */

DROP TABLE IF EXISTS `auth_user_role`;

CREATE TABLE `auth_user_role` (
  `user_id` char(18) NOT NULL COMMENT '用户id',
  `role_id` char(18) NOT NULL COMMENT '角色id',
  PRIMARY KEY (`user_id`,`role_id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `auth_user_role` */

insert  into `auth_user_role`(`user_id`,`role_id`) values 
('111','11');

/*Table structure for table `client` */

DROP TABLE IF EXISTS `client`;

CREATE TABLE `client` (
  `id` varchar(20) NOT NULL COMMENT '主键',
  `c_name` varchar(20) DEFAULT NULL COMMENT '客户名称',
  `c_sex` varchar(1) DEFAULT NULL COMMENT '客户性别 0:女 1:男',
  `c_phone` varchar(11) DEFAULT NULL COMMENT '客户手机号',
  `c_address` varchar(100) DEFAULT NULL COMMENT '最后一次客户地址1',
  `c_wx` varchar(20) DEFAULT NULL COMMENT '客户微信',
  `c_qq` varchar(20) DEFAULT NULL COMMENT '客户qq',
  `c_level` varchar(1) DEFAULT NULL COMMENT '客户级别，1初级，2中级，3高级',
  `c_remark` varchar(2000) DEFAULT NULL COMMENT '备注',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  `create_user_id` varchar(20) DEFAULT NULL COMMENT '创建人id',
  PRIMARY KEY (`id`),
  UNIQUE KEY `index_phone` (`c_phone`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `client` */

insert  into `client`(`id`,`c_name`,`c_sex`,`c_phone`,`c_address`,`c_wx`,`c_qq`,`c_level`,`c_remark`,`create_time`,`create_user_id`) values 
('15344747550140000','张三','1','11111111111','张三的收货地址1','1121','1212121','1','','2018-08-17 10:59:15','111'),
('15344747835000001','李四','1','22222222222','李四的收货地址','12212','313223','2','','2018-08-17 10:59:43','111'),
('15344748026250002','王二麻子','0','33333333333','王二麻子','3232','1','2','','2018-08-17 11:00:02','111'),
('15344748375810003','赵武','0','44444444444','赵武的收货地址1','321121','212123','3','','2018-08-17 11:00:37','111'),
('15344748767110004','狄仁杰','1','55555555555','山东泰安','11111112','23232323','2','','2018-08-17 11:11:11','111');

/*Table structure for table `client_address` */

DROP TABLE IF EXISTS `client_address`;

CREATE TABLE `client_address` (
  `id` varchar(20) NOT NULL COMMENT '主键',
  `client_id` varchar(20) DEFAULT NULL COMMENT '客户id',
  `address` varchar(252) DEFAULT NULL COMMENT '客户曾用地址',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `client_address` */

insert  into `client_address`(`id`,`client_id`,`address`) values 
('15344750153630005','15344748767110004','山东泰安'),
('15344754712260006','15344748767110004','山东泰安');

/*Table structure for table `email` */

DROP TABLE IF EXISTS `email`;

CREATE TABLE `email` (
  `id` varchar(20) NOT NULL,
  `e_name` varchar(20) DEFAULT NULL COMMENT '收件人',
  `emailAddress` varchar(50) DEFAULT NULL COMMENT '邮件地址',
  `status` varchar(1) DEFAULT NULL COMMENT '1；发送 0：不发送',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `email` */

insert  into `email`(`id`,`e_name`,`emailAddress`,`status`) values 
('11','刘健','504826455@qq.com','1'),
('15347558829400000','哈哈','1212','0');

/*Table structure for table `inventory` */

DROP TABLE IF EXISTS `inventory`;

CREATE TABLE `inventory` (
  `id` varchar(20) NOT NULL,
  `item_id` varchar(20) DEFAULT NULL COMMENT '商品id',
  `pdf_id` varchar(20) DEFAULT NULL COMMENT '发票id',
  `quantity` decimal(9,0) DEFAULT NULL COMMENT '数量',
  `tax_amount` decimal(20,2) DEFAULT NULL COMMENT '税额',
  `price` decimal(20,2) DEFAULT NULL COMMENT '不含税单价',
  `price_tax` decimal(20,2) DEFAULT NULL COMMENT '含税单价',
  `total_price` decimal(20,2) DEFAULT NULL COMMENT '不含税金额',
  `total_price_tax` decimal(20,2) DEFAULT NULL COMMENT '价税合计金额',
  `stock` decimal(9,0) DEFAULT NULL COMMENT '库存数量',
  `produced_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '生产日期',
  `invoice_status` tinyint(4) DEFAULT NULL COMMENT '1存在发票，0不存在发票',
  `remain_tax_amount` decimal(20,2) DEFAULT NULL COMMENT '剩余税额',
  `remain_total_price` decimal(20,2) DEFAULT NULL COMMENT '剩余金额',
  `remain_total_price_tax` decimal(20,2) DEFAULT NULL COMMENT '剩余价税合计金额',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注',
  `create_id` varchar(20) NOT NULL COMMENT '入库人id',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '入库时间',
  `last_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后修改时间',
  `byzd1` varchar(200) DEFAULT NULL COMMENT '备用字段',
  `byzd2` varchar(200) DEFAULT NULL COMMENT '备用字段',
  `byzd3` varchar(200) DEFAULT NULL COMMENT '备用字段',
  `byzd4` varchar(200) DEFAULT NULL COMMENT '备用字段',
  `byzd5` varchar(200) DEFAULT NULL COMMENT '备用字段',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `inventory` */

insert  into `inventory`(`id`,`item_id`,`pdf_id`,`quantity`,`tax_amount`,`price`,`price_tax`,`total_price`,`total_price_tax`,`stock`,`produced_time`,`invoice_status`,`remain_tax_amount`,`remain_total_price`,`remain_total_price_tax`,`remark`,`create_id`,`create_time`,`last_time`,`byzd1`,`byzd2`,`byzd3`,`byzd4`,`byzd5`) values 
('15344677773360008','15344672252380003',NULL,50,0.00,0.00,0.00,0.00,0.00,45,'2018-08-17 11:11:32',0,0.00,0.00,0.00,NULL,'111','2018-08-17 09:02:57','2018-08-17 11:11:32',NULL,NULL,NULL,NULL,NULL),
('15344677774300010','15344671410160000',NULL,40,0.00,0.00,0.00,0.00,0.00,40,'2017-08-03 00:00:00',0,0.00,0.00,0.00,NULL,'111','2018-08-17 09:02:57','2018-08-17 09:02:57',NULL,NULL,NULL,NULL,NULL),
('15344677775550012','15344671711850001',NULL,45,0.00,0.00,0.00,0.00,0.00,40,'2018-08-17 11:11:32',0,0.00,0.00,0.00,NULL,'111','2018-08-17 09:02:57','2018-08-17 11:11:32',NULL,NULL,NULL,NULL,NULL),
('15344677776720014','15344672052230002',NULL,36,0.00,0.00,0.00,0.00,0.00,36,'2018-04-18 00:00:00',0,0.00,0.00,0.00,NULL,'111','2018-08-17 09:02:57','2018-08-17 09:02:57',NULL,NULL,NULL,NULL,NULL),
('15344677778030016','15344672605400004',NULL,26,0.00,0.00,0.00,0.00,0.00,26,'2018-06-15 00:00:00',0,0.00,0.00,0.00,NULL,'111','2018-08-17 09:02:57','2018-08-17 09:02:57',NULL,NULL,NULL,NULL,NULL),
('15344677778430018','15344672941180005',NULL,21,0.00,0.00,0.00,0.00,0.00,21,'2018-08-02 00:00:00',0,0.00,0.00,0.00,NULL,'111','2018-08-17 09:02:57','2018-08-17 09:02:57',NULL,NULL,NULL,NULL,NULL),
('15344677779370020','15344673160110006',NULL,20,0.00,0.00,0.00,0.00,0.00,20,'2018-08-01 00:00:00',0,0.00,0.00,0.00,NULL,'111','2018-08-17 09:02:57','2018-08-17 09:02:57',NULL,NULL,NULL,NULL,NULL),
('15344677780260022','15344673448760007',NULL,15,0.00,0.00,0.00,0.00,0.00,10,'2018-08-17 11:25:05',0,0.00,0.00,0.00,NULL,'111','2018-08-17 09:02:58','2018-08-17 11:25:05',NULL,NULL,NULL,NULL,NULL),
('15344874531040000','15344673448760007',NULL,10,0.00,0.00,0.00,0.00,0.00,10,'2018-08-07 00:00:00',0,0.00,0.00,0.00,NULL,'111','2018-08-17 14:30:53','2018-08-17 14:30:53',NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `inventory_log` */

DROP TABLE IF EXISTS `inventory_log`;

CREATE TABLE `inventory_log` (
  `id` varchar(20) NOT NULL COMMENT '库存日志表出库信息',
  `client_id` varchar(20) DEFAULT NULL COMMENT '客户id',
  `orderNo` varchar(20) DEFAULT NULL COMMENT '订单号',
  `inventory_id` varchar(20) DEFAULT NULL COMMENT '库存商品id',
  `quantity` decimal(9,0) DEFAULT NULL COMMENT '出入库数量',
  `status` varchar(4) DEFAULT NULL COMMENT '0；出库，1：退货 2:入库',
  `inventory_log_id` varchar(20) DEFAULT NULL COMMENT '退货时的出库id',
  `cause` varchar(200) DEFAULT NULL COMMENT '退货原因',
  `create_id` varchar(20) DEFAULT NULL COMMENT '出库人id',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP COMMENT '出库时间',
  `remark` varchar(100) DEFAULT NULL COMMENT '备注',
  `client_address` varchar(200) DEFAULT NULL COMMENT '收货地址',
  `client_phone` varchar(16) DEFAULT NULL COMMENT '收货电话',
  `transport_company` varchar(50) DEFAULT NULL COMMENT '物流公司',
  `transport_no` varchar(50) DEFAULT NULL COMMENT '物流单号',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `inventory_log` */

insert  into `inventory_log`(`id`,`client_id`,`orderNo`,`inventory_id`,`quantity`,`status`,`inventory_log_id`,`cause`,`create_id`,`create_time`,`remark`,`client_address`,`client_phone`,`transport_company`,`transport_no`) values 
('15344677774140009',NULL,NULL,'15344677773360008',50,'2',NULL,NULL,NULL,'2018-08-17 09:02:57',NULL,NULL,NULL,NULL,NULL),
('15344677774840011',NULL,NULL,'15344677774300010',40,'2',NULL,NULL,NULL,'2018-08-17 09:02:57',NULL,NULL,NULL,NULL,NULL),
('15344677776150013',NULL,NULL,'15344677775550012',45,'2',NULL,NULL,NULL,'2018-08-17 09:02:57',NULL,NULL,NULL,NULL,NULL),
('15344677777220015',NULL,NULL,'15344677776720014',36,'2',NULL,NULL,NULL,'2018-08-17 09:02:57',NULL,NULL,NULL,NULL,NULL),
('15344677778350017',NULL,NULL,'15344677778030016',26,'2',NULL,NULL,NULL,'2018-08-17 09:02:57',NULL,NULL,NULL,NULL,NULL),
('15344677779250019',NULL,NULL,'15344677778430018',21,'2',NULL,NULL,NULL,'2018-08-17 09:02:57',NULL,NULL,NULL,NULL,NULL),
('15344677780200021',NULL,NULL,'15344677779370020',20,'2',NULL,NULL,NULL,'2018-08-17 09:02:58',NULL,NULL,NULL,NULL,NULL),
('15344677781550023',NULL,NULL,'15344677780260022',15,'2',NULL,NULL,NULL,'2018-08-17 09:02:58',NULL,NULL,NULL,NULL,NULL),
('15344754922920007','15344748767110004',NULL,'15344677780260022',7,'0',NULL,NULL,'111','2018-08-17 11:11:32',NULL,'山东泰安','55555555555','顺丰','11111111'),
('15344754923880008','15344748767110004',NULL,'15344677773360008',5,'0',NULL,NULL,'111','2018-08-17 11:11:32',NULL,'山东泰安','55555555555','顺丰','11111111'),
('15344754924700009','15344748767110004',NULL,'15344677775550012',5,'0',NULL,NULL,'111','2018-08-17 11:11:32',NULL,'山东泰安','55555555555','顺丰','11111111'),
('15344763049720000','15344748767110004',NULL,'15344677780260022',2,'1','15344754922920007','用不完','111','2018-08-17 11:25:04',NULL,'山东泰安','55555555555',NULL,NULL),
('15344874531490001',NULL,NULL,'15344874531040000',10,'2',NULL,NULL,NULL,'2018-08-17 14:30:53',NULL,NULL,NULL,NULL,NULL);

/*Table structure for table `items` */

DROP TABLE IF EXISTS `items`;

CREATE TABLE `items` (
  `id` varchar(20) NOT NULL,
  `item_no` varchar(10) DEFAULT NULL COMMENT '商品编号',
  `item_name` varchar(20) DEFAULT NULL COMMENT '商品名称',
  `unit_name` varchar(10) DEFAULT NULL COMMENT '单位名称',
  `rates` varchar(5) DEFAULT NULL COMMENT '税率',
  `models` varchar(20) DEFAULT NULL COMMENT '规格型号',
  `price` varchar(20) DEFAULT NULL COMMENT '单价',
  `warn_quantity` decimal(9,0) DEFAULT NULL COMMENT '库存警告数量',
  `quantity` decimal(9,0) DEFAULT NULL COMMENT '现有库存',
  `create_id` varchar(20) DEFAULT NULL COMMENT '创建人id',
  `create_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP COMMENT '创建时间',
  `last_time` timestamp NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后修改时间',
  PRIMARY KEY (`id`),
  UNIQUE KEY `items_item_no` (`item_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `items` */

insert  into `items`(`id`,`item_no`,`item_name`,`unit_name`,`rates`,`models`,`price`,`warn_quantity`,`quantity`,`create_id`,`create_time`,`last_time`) values 
('15344671410160000','6672','高汤','箱','','1KG*10袋/箱','',50,40,'111','2018-08-17 08:52:21','2018-08-20 22:35:21'),
('15344671711850001','6673','米线调味粉','箱','','1KG*10袋/箱','',10,40,'111','2018-08-17 08:52:51','2018-08-17 11:11:32'),
('15344672052230002','6680','调味鸡油','箱','','1KG*10袋/箱','',50,36,'111','2018-08-17 08:53:25','2018-08-20 22:35:24'),
('15344672252380003','6681','蒜香油','箱','','1KG*15袋/箱','',5,45,'111','2018-08-17 08:53:45','2018-08-17 11:11:32'),
('15344672605400004','6841','麻辣酱','桶','','1KG*18袋/桶','',5,26,'111','2018-08-17 08:54:20','2018-08-17 09:02:57'),
('15344672941180005','6674','老坛酸菜料','箱','','1KG*10袋/箱','',50,21,'111','2018-08-17 08:54:54','2018-08-20 22:35:26'),
('15344673160110006','6691','老坛酸菜料','箱','','500G*30袋/箱','',7,20,'111','2018-08-17 08:55:16','2018-08-17 09:02:58'),
('15344673448760007','6678','鲜鸡上汤','箱','','1KG*10袋/箱','',3,20,'111','2018-08-17 08:55:44','2018-08-17 14:30:53');

/*Table structure for table `logistics` */

DROP TABLE IF EXISTS `logistics`;

CREATE TABLE `logistics` (
  `id` varchar(20) NOT NULL,
  `logistics_name` varchar(50) DEFAULT NULL COMMENT '物流公司名称',
  `remark` varchar(200) DEFAULT NULL COMMENT '备注描述',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `logistics` */

insert  into `logistics`(`id`,`logistics_name`,`remark`) values 
('1','顺丰',NULL),
('2','申通',NULL),
('3','天天',NULL);

/*Table structure for table `menus` */

DROP TABLE IF EXISTS `menus`;

CREATE TABLE `menus` (
  `id` varchar(20) NOT NULL COMMENT '页面导航id',
  `m_name` varchar(20) DEFAULT NULL COMMENT '菜单名称',
  `url` varchar(50) DEFAULT NULL COMMENT '菜单路径',
  `parent_id` varchar(20) DEFAULT NULL,
  `m_level` int(1) DEFAULT NULL COMMENT '1；一级菜单2：二级菜单',
  `m_index` int(2) DEFAULT NULL COMMENT '显示顺序',
  `m_hidden` tinyint(4) DEFAULT NULL COMMENT '0不隐藏，1隐藏',
  `m_status` tinyint(4) DEFAULT NULL COMMENT '1-激活 0-禁用',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `menus` */

insert  into `menus`(`id`,`m_name`,`url`,`parent_id`,`m_level`,`m_index`,`m_hidden`,`m_status`) values 
('1','基础管理','/manager','',1,2,0,1),
('10','客户管理','/clientList','1',2,2,0,1),
('11','按商品统计','/statistics','4',2,6,0,1),
('12','按客户统计','/statisticsByClient','4',2,7,0,1),
('13','邮件管理','/email','1',2,4,0,1),
('2','用户管理','/user','1',2,3,0,1),
('3','商品管理','/item','1',2,1,0,1),
('4','仓库管理','/repertory',NULL,1,1,0,1),
('5','商品入库','/insert','4',2,1,0,1),
('6','库存查询','/query','4',2,2,0,1),
('7','库存日志','/log','4',2,4,0,1),
('8','上传发票','/upload','4',2,5,0,1),
('9','商品出库','/inventoryLog/123','4',2,3,0,1);

/*Table structure for table `pdfs` */

DROP TABLE IF EXISTS `pdfs`;

CREATE TABLE `pdfs` (
  `id` varchar(20) NOT NULL,
  `pdf_url` varchar(100) DEFAULT NULL COMMENT '发票储存位置',
  `invoice_code` varchar(20) DEFAULT NULL COMMENT '发票代码',
  `invoice_no` varchar(10) DEFAULT NULL COMMENT '发票号码',
  `create_id` varchar(20) DEFAULT NULL COMMENT '创建人id',
  `create_time` timestamp NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '创建时间',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `pdfs` */

insert  into `pdfs`(`id`,`pdf_url`,`invoice_code`,`invoice_no`,`create_id`,`create_time`) values 
('1','fhghgfhgfj','1234555','5645354','1','2017-12-15 19:47:40'),
('15188615283790001','\\InvoicePDF2018/02/17/1518861528325088f97cdc9c2d18d2399973b74b95513x400x208x398.gif','123','23433333','111','2018-02-17 17:58:48'),
('2','qqqqqqqq','111111111','11111','1','2017-12-23 19:48:04'),
('3','1wwwwwww','2222222222','222222',NULL,'2017-12-23 19:47:48');

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
