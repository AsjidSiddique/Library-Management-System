-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 29, 2025 at 11:19 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `markethub`
--

-- --------------------------------------------------------

--
-- Table structure for table `cart`
--

CREATE TABLE `cart` (
  `ID` int(10) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `Category` varchar(20) NOT NULL,
  `Quantity` int(10) NOT NULL,
  `Price` int(10) NOT NULL,
  `Total` int(20) NOT NULL,
  `User_ID` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `cart`
--

INSERT INTO `cart` (`ID`, `Name`, `Category`, `Quantity`, `Price`, `Total`, `User_ID`) VALUES
(1, 'HP CORE I7 7GEN', 'Laptops', 1, 73500, 73500, 2);

-- --------------------------------------------------------

--
-- Table structure for table `category`
--

CREATE TABLE `category` (
  `ID` int(10) NOT NULL,
  `Name` varchar(30) NOT NULL,
  `Description` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `category`
--

INSERT INTO `category` (`ID`, `Name`, `Description`) VALUES
(1, 'Laptop', 'Excellent'),
(2, 'Mobiles', 'Nice'),
(5, 'TV', 'erdftgh'),
(6, 'wer', 'wsedrf'),
(7, 'AC', 'Nice'),
(8, 'PC', 'NICE'),
(9, 'HOUSEHOLD', 'NICE');

-- --------------------------------------------------------

--
-- Table structure for table `customer`
--

CREATE TABLE `customer` (
  `ID` int(10) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `Email` varchar(100) NOT NULL,
  `Password` varchar(100) NOT NULL,
  `Question` varchar(100) NOT NULL,
  `Answer` varchar(200) NOT NULL,
  `Phone` varchar(15) NOT NULL,
  `Address` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `customer`
--

INSERT INTO `customer` (`ID`, `Name`, `Email`, `Password`, `Question`, `Answer`, `Phone`, `Address`) VALUES
(2, 'Ali Ahsan', 'ali@gmail.com', '111', 'What is your favorite color?', 'green', '03247896896', 'ICT'),
(10, 'Asad Imran', 'asad.edu', '111', 'What is your favorite color?', 'green', '03237535787', 'Lahore'),
(13, 'Aman', '5fdrtg', 'rft', 'What is your pet\'s name?', 'g', '03464774335 ', 'Lahore'),
(15, 'Hassan', 'hassan@gmail.com', '111', 'What is your favorite color?', 'Green', '+923239394567', 'ICt'),
(16, 'Akram Ali', 'aram2@gmaail.com', '1111', 'What is your birth city?', 'Karachi', '+923239349975', 'Chichawatni,Dis Vehari');

-- --------------------------------------------------------

--
-- Table structure for table `products`
--

CREATE TABLE `products` (
  `ID` int(10) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `Category` varchar(100) NOT NULL,
  `Quantity` int(10) NOT NULL,
  `Price` int(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `products`
--

INSERT INTO `products` (`ID`, `Name`, `Category`, `Quantity`, `Price`) VALUES
(1, 'HP CORE I7 7GEN', 'Laptop', 1, 73500),
(5, 'IPHONE 17', 'Mobiles', 0, 100200),
(6, 'Lenovo core i9 13Gen', 'Laptop', 4, 169000),
(7, 'Hp I7 10 GEn', 'Laptop', 3, 188338),
(8, 'Orient', 'AC', 1, 150000),
(9, 'Dewalnce', 'AC', 3, 120000),
(10, 'DELL', 'PC', 2, 49000),
(11, 'hp', 'PC', 7, 50000);

-- --------------------------------------------------------

--
-- Table structure for table `purchase`
--

CREATE TABLE `purchase` (
  `ID` int(11) NOT NULL,
  `User_ID` int(11) NOT NULL,
  `User_NAME` varchar(100) NOT NULL,
  `User_PHONE` varchar(11) NOT NULL,
  `Product_ID` int(11) NOT NULL,
  `Product_Name` varchar(100) NOT NULL,
  `Quantity` int(11) NOT NULL,
  `Price` int(11) NOT NULL,
  `Total` int(11) NOT NULL,
  `Order_Date` varchar(50) NOT NULL,
  `User_Address` varchar(100) NOT NULL,
  `Received_Date` varchar(100) NOT NULL,
  `Supplier` varchar(10) NOT NULL,
  `Status` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `purchase`
--

INSERT INTO `purchase` (`ID`, `User_ID`, `User_NAME`, `User_PHONE`, `Product_ID`, `Product_Name`, `Quantity`, `Price`, `Total`, `Order_Date`, `User_Address`, `Received_Date`, `Supplier`, `Status`) VALUES
(8, 2, 'Ali Ahsan', '03247896896', 5, 'IPHONE 17', 1, 100200, 100200, '2025-05-16', 'ICT', '', '', 'Pending'),
(9, 2, 'Ali Ahsan', '03247896896', 5, 'IPHONE 17', 2, 100200, 200400, '2025-05-16', 'ICT', '', 'Ali Khan', 'Pending'),
(10, 2, 'Ali Ahsan', '03247896896', 5, 'IPHONE 17', 5, 100200, 501000, '2025-05-16', 'ICT', '', 'moez', 'Pending'),
(11, 2, 'Ali Ahsan', '03247896896', 1, 'HP CORE I7 7GEN', 1, 73500, 73500, '2025-05-16', 'ICT', '2025-05-16', 'ASAD', 'Delivered'),
(12, 2, 'Ali Ahsan', '03247896896', 5, 'IPHONE 17', 1, 100200, 100200, '2025-05-16', 'ICT', '', 'ASAD', 'Delivered'),
(13, 2, 'Ali Ahsan', '03247896896', 6, 'Lenovo core i9 13Gen', 1, 169000, 169000, '2025-05-16', 'ICT', '2025-05-16', 'ASAD', 'Delivered'),
(14, 2, 'Ali Ahsan', '03247896896', 7, 'hp', 1, 33898, 33898, '2025-05-16', 'ICT', '2025-05-19', 'Ali Khan', 'Delivered'),
(15, 2, 'Ali Ahsan', '03247896896', 6, 'Lenovo core i9 13Gen', 2, 169000, 338000, '2025-05-16', 'ICT', '', 'moez', 'On the WAY!'),
(16, 2, 'Ali Ahsan', '03247896896', 8, 'Orient', 1, 150000, 150000, '2025-05-19', 'ICT', '2025-05-19', 'Ali Khan', 'Delivered'),
(17, 2, 'Ali Ahsan', '03247896896', 5, 'IPHONE 17', 1, 100200, 100200, '2025-05-19', 'ICT', '', '', 'Pending'),
(18, 2, 'Ali Ahsan', '03247896896', 11, 'hp', 1, 50000, 50000, '2025-05-19', 'ICT', '', '', 'Pending'),
(19, 2, 'Ali Ahsan', '03247896896', 6, 'Lenovo core i9 13Gen', 5, 169000, 845000, '2025-05-27', 'ICT', '2025-05-27', 'Ali Khan', 'Delivered'),
(20, 2, 'Ali Ahsan', '03247896896', 5, 'IPHONE 17', 2, 100200, 200400, '2025-05-27', 'ICT', '', '', 'Pending'),
(21, 2, 'Ali Ahsan', '03247896896', 11, 'DELL', 3, 50000, 150000, '2025-05-27', 'ICT', '2025-05-27', 'Ali Khan', 'Delivered');

-- --------------------------------------------------------

--
-- Table structure for table `supplier`
--

CREATE TABLE `supplier` (
  `ID` int(20) NOT NULL,
  `Name` varchar(100) NOT NULL,
  `Email` varchar(100) NOT NULL,
  `Password` varchar(100) NOT NULL,
  `Phone` varchar(15) NOT NULL,
  `Address` varchar(200) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `supplier`
--

INSERT INTO `supplier` (`ID`, `Name`, `Email`, `Password`, `Phone`, `Address`) VALUES
(3, 'Ali Khan', 'ali.pk', '111', '+923495957469', 'Multan'),
(4, 'Zain ul', 'zain.edu', '111', '+923239493527', 'ICT'),
(5, 'moez', 'moez.edu', '111', '+923465943568', 'Multan'),
(6, 'ASAD', 'asd.pk', '111', '046744654656', 'ICT');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `category`
--
ALTER TABLE `category`
  ADD PRIMARY KEY (`ID`),
  ADD UNIQUE KEY `Name` (`Name`);

--
-- Indexes for table `customer`
--
ALTER TABLE `customer`
  ADD PRIMARY KEY (`ID`),
  ADD UNIQUE KEY `Email` (`Email`);

--
-- Indexes for table `products`
--
ALTER TABLE `products`
  ADD PRIMARY KEY (`ID`),
  ADD UNIQUE KEY `Name` (`Name`),
  ADD KEY `fk` (`Category`);

--
-- Indexes for table `purchase`
--
ALTER TABLE `purchase`
  ADD PRIMARY KEY (`ID`),
  ADD KEY `fk2` (`User_ID`);

--
-- Indexes for table `supplier`
--
ALTER TABLE `supplier`
  ADD PRIMARY KEY (`ID`),
  ADD UNIQUE KEY `Email` (`Email`),
  ADD UNIQUE KEY `Name` (`Name`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `category`
--
ALTER TABLE `category`
  MODIFY `ID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;

--
-- AUTO_INCREMENT for table `customer`
--
ALTER TABLE `customer`
  MODIFY `ID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT for table `products`
--
ALTER TABLE `products`
  MODIFY `ID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT for table `purchase`
--
ALTER TABLE `purchase`
  MODIFY `ID` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=22;

--
-- AUTO_INCREMENT for table `supplier`
--
ALTER TABLE `supplier`
  MODIFY `ID` int(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- Constraints for dumped tables
--

--
-- Constraints for table `products`
--
ALTER TABLE `products`
  ADD CONSTRAINT `fk` FOREIGN KEY (`Category`) REFERENCES `category` (`Name`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `purchase`
--
ALTER TABLE `purchase`
  ADD CONSTRAINT `fk2` FOREIGN KEY (`User_ID`) REFERENCES `customer` (`ID`) ON DELETE CASCADE ON UPDATE CASCADE;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
