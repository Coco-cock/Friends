-- --------------------------------------------------------
-- 主机:                           127.0.0.1
-- 服务器版本:                        10.2.11-MariaDB - mariadb.org binary distribution
-- 服务器操作系统:                      Win64
-- HeidiSQL 版本:                  9.4.0.5125
-- --------------------------------------------------------

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET NAMES utf8 */;
/*!50503 SET NAMES utf8mb4 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;


-- 导出 friends 的数据库结构
CREATE DATABASE IF NOT EXISTS `friends` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `friends`;

-- 导出  表 friends.message 结构
CREATE TABLE IF NOT EXISTS `message` (
  `Id` int(11) NOT NULL AUTO_INCREMENT,
  `Metuid` char(50) NOT NULL DEFAULT '0',
  `fromid` char(50) NOT NULL DEFAULT '0',
  `content` varchar(50) NOT NULL DEFAULT '',
  `Datetime` timestamp NOT NULL DEFAULT current_timestamp(),
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- 正在导出表  friends.message 的数据：~2 rows (大约)
/*!40000 ALTER TABLE `message` DISABLE KEYS */;
REPLACE INTO `message` (`Id`, `Metuid`, `fromid`, `content`, `Datetime`) VALUES
	(1, '1406014301', '1406014302', '啊实打实大苏打实打实大苏打实打实大苏打', '2018-03-29 23:14:14'),
	(2, '1406014305', '1406014301', '喜欢你', '2018-03-30 00:36:25'),
	(3, '1406014305', '1406014301', '喜欢你偶', '2018-03-30 00:42:22');
/*!40000 ALTER TABLE `message` ENABLE KEYS */;

-- 导出  表 friends.starlist 结构
CREATE TABLE IF NOT EXISTS `starlist` (
  `Id` int(10) unsigned NOT NULL AUTO_INCREMENT,
  `MeStuid` char(50) NOT NULL,
  `Fromid` char(50) NOT NULL,
  PRIMARY KEY (`Id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8;

-- 正在导出表  friends.starlist 的数据：~1 rows (大约)
/*!40000 ALTER TABLE `starlist` DISABLE KEYS */;
REPLACE INTO `starlist` (`Id`, `MeStuid`, `Fromid`) VALUES
	(1, '1406014301', '1406014302'),
	(6, '1406014303', '1406014302');
/*!40000 ALTER TABLE `starlist` ENABLE KEYS */;

-- 导出  表 friends.user 结构
CREATE TABLE IF NOT EXISTS `user` (
  `id` int(1) NOT NULL AUTO_INCREMENT,
  `Stuid` char(50) NOT NULL,
  `name` char(50) NOT NULL,
  `passwd` char(50) NOT NULL,
  `qq` char(50) DEFAULT NULL,
  `likes` char(50) DEFAULT NULL,
  `wechat` char(50) DEFAULT NULL,
  `classId` char(50) NOT NULL,
  `Phtoto` char(50) DEFAULT NULL,
  `Email` char(50) DEFAULT NULL,
  `signature` char(100) DEFAULT '生如夏花之绚烂，死如秋叶之静美',
  `userlogo` varchar(50) DEFAULT '/img/user.jpg',
  `speciality` char(50) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;

-- 正在导出表  friends.user 的数据：~5 rows (大约)
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
REPLACE INTO `user` (`id`, `Stuid`, `name`, `passwd`, `qq`, `likes`, `wechat`, `classId`, `Phtoto`, `Email`, `signature`, `userlogo`, `speciality`) VALUES
	(1, '1406014301', '闫宇峰', '123123', NULL, NULL, NULL, '14060143', NULL, NULL, '请问请问', '/img/user.jpg', '计算机科学与技术'),
	(2, '1406014302', '杨业博', '654321', '56465', '', '2132132', '14060143', '4654654', 'sdfsdf@163.com', '生如夏花之绚烂，死如秋叶之静美', '/img/user.jpg', '计算机科学与技术'),
	(3, '1406014303', '刘新文', '222', '879879', '', '546546', '14060143', '54646546', '54646546@qq.com', '生如夏花之绚烂，死如秋叶之静美', '/img/user.jpg', '计算机科学与技术'),
	(4, '1406014304', '李少博', 'sdfsdf', '65465456', '', '7987988', '14060143', '10086', 'asdasd@qq.com', '生如夏花之绚烂，死如秋叶之静美', '/img/user.jpg', '计算机科学与技术'),
	(5, '1406014305', '杨可爱', 'yangkeai', '123', '123', '123', '14060143', '123', '123', '123', '/img/user.jpg', '计算机科学与技术');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;

/*!40101 SET SQL_MODE=IFNULL(@OLD_SQL_MODE, '') */;
/*!40014 SET FOREIGN_KEY_CHECKS=IF(@OLD_FOREIGN_KEY_CHECKS IS NULL, 1, @OLD_FOREIGN_KEY_CHECKS) */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
