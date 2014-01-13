-- phpMyAdmin SQL Dump
-- version 3.5.8.1deb1
-- http://www.phpmyadmin.net
--
-- Host: localhost
-- Generation Time: Jan 13, 2014 at 01:11 PM
-- Server version: 5.5.34-0ubuntu0.13.04.1
-- PHP Version: 5.4.9-4ubuntu2.3

SET SQL_MODE="NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `uQasarBinding`
--

-- --------------------------------------------------------

--
-- Table structure for table `System`
--

CREATE TABLE IF NOT EXISTS `System` (
  `id_system` int(11) NOT NULL AUTO_INCREMENT,
  `uri` varchar(300) NOT NULL,
  `id_type` int(11) NOT NULL,
  PRIMARY KEY (`id_system`),
  KEY `id_type` (`id_type`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=7 ;

--
-- Dumping data for table `System`
--

INSERT INTO `System` (`id_system`, `uri`, `id_type`) VALUES
(1, 'http://localhost:8082/', 1),
(2, 'http://95.211.223.9:8084', 1);

-- --------------------------------------------------------

--
-- Table structure for table `SystemType`
--

CREATE TABLE IF NOT EXISTS `SystemType` (
  `id_type` int(11) NOT NULL AUTO_INCREMENT,
  `description` varchar(100) NOT NULL,
  PRIMARY KEY (`id_type`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=3 ;

--
-- Dumping data for table `SystemType`
--

INSERT INTO `SystemType` (`id_type`, `description`) VALUES
(1, 'JIRA'),
(2, 'sonarQube');

-- --------------------------------------------------------

--
-- Table structure for table `User`
--

CREATE TABLE IF NOT EXISTS `User` (
  `id_user` int(11) NOT NULL AUTO_INCREMENT,
  `username` varchar(100) NOT NULL,
  `password` varchar(50) NOT NULL,
  `id_system` int(11) NOT NULL,
  PRIMARY KEY (`id_user`),
  KEY `id_system` (`id_system`)
) ENGINE=InnoDB  DEFAULT CHARSET=utf8 AUTO_INCREMENT=7 ;

--
-- Dumping data for table `User`
--

INSERT INTO `User` (`id_user`, `username`, `password`, `id_system`) VALUES
(1, 'nkotopoulou', 'volossed', 1),
(2, 'soaptester', 'soaptester', 2);

--
-- Constraints for dumped tables
--

--
-- Constraints for table `System`
--
ALTER TABLE `System`
  ADD CONSTRAINT `id_type` FOREIGN KEY (`id_type`) REFERENCES `SystemType` (`id_type`) ON DELETE NO ACTION ON UPDATE NO ACTION;

--
-- Constraints for table `User`
--
ALTER TABLE `User`
  ADD CONSTRAINT `id_system` FOREIGN KEY (`id_system`) REFERENCES `System` (`id_system`) ON DELETE NO ACTION ON UPDATE NO ACTION;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
