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
  `NIP` varchar(55) NOT NULL, txt boi
  `NIDN` varchar(55) DEFAULT NULL, txt
  `nmDosen` varchar(55) DEFAULT NULL,txt
  `almtDosen` varchar(55) DEFAULT NULL,txt
  `notelp` varchar(55) DEFAULT NULL,txt
  `email` varchar(55) DEFAULT NULL,txt
  `JK` varchar(55) DEFAULT NULL,rd
  `TTL` varchar(55) DEFAULT NULL, jcal
  `statusPegawai` varchar(55) DEFAULT NULL, centng
  `pendidikan` varchar(55) DEFAULT NULL, cb
  `jabatanAkdmk` varchar(55) DEFAULT NULL txt
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `kelas`
--

CREATE TABLE `kelas` (
  `kdKelas` varchar(55) NOT NULL,txt
  `kelas` varchar(55) DEFAULT NULL, cb
  `pertemuan` varchar(55) DEFAULT NULL, txt
  `waktu` datetime DEFAULT NULL, jcal
  `ruang` varchar(55) DEFAULT NULL txt
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `mahasiswa`
--

CREATE TABLE `mahasiswa` (
  
  `JK` varchar(55) DEFAULT NULL, rd
  `agama` varchar(55) DEFAULT NULL,cb
  `alamat` varchar(55) DEFAULT NULL,txt
  `email` varchar(55) DEFAULT NULL,txt
  `notelp` varchar(55) DEFAULT NULL,txt
  `nama_mahasiswa` varchar(55) DEFAULT NULL,txt
  
  `nrp` varchar(55) NOT NULL,txt
  `prodi` varchar(55) DEFAULT NULL,cb
  `Status` varchar(55) DEFAULT NULL,centang

  `namaAyah` varchar(55) DEFAULT NULL,txt
  `noKTPAyah` varchar(55) DEFAULT NULL,txt
  `namaIbu` varchar(55) DEFAULT NULL,txt
  `noTelpOrtu` varchar(55) DEFAULT NULL,txt
  `almtOrtu` varchar(55) DEFAULT NULL,txt

  `photopath` varchar(55) DEFAULT NULL, image
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Table structure for table `matakuliah`
--

CREATE TABLE `matakuliah` (
  `kdMatkul` varchar(55) NOT NULL, txt
  `periode` varchar(55) DEFAULT NULL, txt
  `nmMatkul` varchar(55) DEFAULT NULL txt
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
