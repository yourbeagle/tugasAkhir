-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 16, 2021 at 05:35 AM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 8.0.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `mahasiswa_sakti`
--

-- --------------------------------------------------------

--
-- Table structure for table `dosen`
--

CREATE TABLE `dosen` (
  `NIP` varchar(55) NOT NULL,
  `NIDN` varchar(55) DEFAULT NULL,
  `nmDosen` varchar(55) DEFAULT NULL,
  `almtDosen` varchar(55) DEFAULT NULL,
  `notelp` varchar(55) DEFAULT NULL,
  `email` varchar(55) DEFAULT NULL,
  `JK` varchar(55) DEFAULT NULL,
  `TTL` varchar(55) DEFAULT NULL,
  `statusPegawai` varchar(55) DEFAULT NULL,
  `pendidikan` varchar(55) DEFAULT NULL,
  `jabatanAkdmk` varchar(55) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `kelas`
--

CREATE TABLE `kelas` (
  `kdKelas` varchar(55) NOT NULL,
  `kelas` varchar(55) DEFAULT NULL,
  `pertemuan` varchar(55) DEFAULT NULL,
  `waktu` datetime DEFAULT NULL,
  `ruang` varchar(55) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `mahasiswa`
--

CREATE TABLE `mahasiswa` (
  `nrp` varchar(55) NOT NULL,
  `nama_mahasiswa` varchar(55) DEFAULT NULL,
  `prodi` varchar(55) DEFAULT NULL,
  `Status` varchar(55) DEFAULT NULL,
  `JK` varchar(55) DEFAULT NULL,
  `agama` varchar(55) DEFAULT NULL,
  `alamat` varchar(55) DEFAULT NULL,
  `email` varchar(55) DEFAULT NULL,
  `notelp` varchar(55) DEFAULT NULL,
  `namaAyah` varchar(55) DEFAULT NULL,
  `noKTPAyah` varchar(55) DEFAULT NULL,
  `namaIbu` varchar(55) DEFAULT NULL,
  `noTelpOrtu` varchar(55) DEFAULT NULL,
  `almtOrtu` varchar(55) DEFAULT NULL,
  `photopath` varchar(55) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `matakuliah`
--

CREATE TABLE `matakuliah` (
  `kdMatkul` varchar(55) NOT NULL,
  `periode` varchar(55) DEFAULT NULL,
  `nmMatkul` varchar(55) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `dosen`
--
ALTER TABLE `dosen`
  ADD PRIMARY KEY (`NIP`);

--
-- Indexes for table `kelas`
--
ALTER TABLE `kelas`
  ADD PRIMARY KEY (`kdKelas`);

--
-- Indexes for table `mahasiswa`
--
ALTER TABLE `mahasiswa`
  ADD PRIMARY KEY (`nrp`);

--
-- Indexes for table `matakuliah`
--
ALTER TABLE `matakuliah`
  ADD PRIMARY KEY (`kdMatkul`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
