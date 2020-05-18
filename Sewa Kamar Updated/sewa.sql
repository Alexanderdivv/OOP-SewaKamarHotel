-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1:3307
-- Generation Time: 18 Mei 2020 pada 03.34
-- Versi Server: 5.5.39
-- PHP Version: 5.4.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `sewakamarpbo`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `sewa`
--

CREATE TABLE IF NOT EXISTS `sewa` (
  `noTransaksi` varchar(30) NOT NULL,
  `harga` int(30) NOT NULL,
  `totalbayar` int(30) NOT NULL,
  `lamanginap` int(3) NOT NULL,
  `idPenyewa` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `sewa`
--

INSERT INTO `sewa` (`noTransaksi`, `harga`, `totalbayar`, `lamanginap`, `idPenyewa`) VALUES
('00002', 2000, 4000, 2, 'pel002'),
('0001', 200, 600, 3, 'pel001');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `sewa`
--
ALTER TABLE `sewa`
 ADD PRIMARY KEY (`noTransaksi`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
