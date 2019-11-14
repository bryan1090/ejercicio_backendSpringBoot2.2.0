# ejercicio_backendSpringBoot2.2.0

Importar el proyecto, puede ser en Netbeans 11, ejecutar "build" y posteriormente "run". El proyecto se conecta con una base en mysql de nombre "ejemplo", con usuario "root",contraseña "root12345"(jdbc:mysql://localhost:3306/ejemplo).

El script de la base es el siguiente:


SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `ejemplo`
--

-- --------------------------------------------------------

--
-- Table structure for table `persona`
--

CREATE TABLE `persona` (
  `perId` int(11) NOT NULL,
  `perCedula` int(10) NOT NULL,
  `perNombres` varchar(255) NOT NULL,
  `perApellidoPaterno` varchar(255) NOT NULL,
  `perApellidoMaterno` varchar(255) NOT NULL,
  `perTelefonoConvencional` int(10) NOT NULL,
  `perTelefonoCelular` int(10) NOT NULL,
  `perCorreo` varchar(255) NOT NULL,
  `perCiudad` varchar(255) NOT NULL,
  `perEstadoCivil` char(1) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

--
-- Dumping data for table `persona`
--

INSERT INTO `persona` (`perId`, `perCedula`, `perNombres`, `perApellidoPaterno`, `perApellidoMaterno`, `perTelefonoConvencional`, `perTelefonoCelular`, `perCorreo`, `perCiudad`, `perEstadoCivil`) VALUES
(1, 1719928212, 'Juan Carlosss', 'Mestre', 'Serrano', 2222222, 999999992, 'usuario2@gmail.com', 'Quito', 'S'),
(2, 1719928213, 'Jose Ramón', 'Mayo', 'Pareja', 3333333, 999999993, 'usuario3@gmail.com', 'Quito', 'S');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`perId`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `persona`
--
ALTER TABLE `persona`
  MODIFY `perId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=13;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
