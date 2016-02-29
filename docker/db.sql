DROP TABLE IF EXISTS `model`;

CREATE TABLE `model` (
  `id`  INT(20) not null AUTO_INCREMENT,
  `name` varchar(255) NOT NULL,
  `description` varchar(255) DEFAULT NULL,
  `createTime` varchar(255) DEFAULT NULL,
  `updateTime` varchar(255) DEFAULT NULL,
  `createUserId` varchar(255) DEFAULT NULL,
  `createUserName` varchar(255) DEFAULT NULL,
  `gqimContext` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

