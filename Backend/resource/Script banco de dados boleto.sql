-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema Boletos
-- -----------------------------------------------------
-- MER da base de dados para o trabalho da pos graduação UECE Engenharia de Software DEVOPS
DROP SCHEMA IF EXISTS `Boletos` ;

-- -----------------------------------------------------
-- Schema Boletos
--
-- MER da base de dados para o trabalho da pos graduação UECE Engenharia de Software DEVOPS
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `Boletos` DEFAULT CHARACTER SET utf8 COLLATE utf8_bin ;
USE `Boletos` ;

-- -----------------------------------------------------
-- Table `Boletos`.`cliente`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Boletos`.`cliente` ;

CREATE TABLE IF NOT EXISTS `Boletos`.`cliente` (
  `idcliente` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(45) NOT NULL,
  `senha` VARCHAR(45) NULL,
  PRIMARY KEY (`idcliente`, `nome`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `Boletos`.`boleto`
-- -----------------------------------------------------
DROP TABLE IF EXISTS `Boletos`.`boleto` ;

CREATE TABLE IF NOT EXISTS `Boletos`.`boleto` (
  `idboleto` INT NOT NULL AUTO_INCREMENT,
  `apelido` VARCHAR(45) NULL,
  `banco` VARCHAR(45) NULL,
  `dtvencimento` DATE NULL,
  `status` VARCHAR(45) NULL,
  `dtpagamento` DATE NULL,
  `juros` DECIMAL(4) NULL,
  `cliente_idcliente` INT NOT NULL,
  PRIMARY KEY (`idboleto`),
  CONSTRAINT `fk_boleto_cliente`
    FOREIGN KEY (`cliente_idcliente`)
    REFERENCES `Boletos`.`cliente` (`idcliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE INDEX `fk_boleto_cliente_idx` ON `Boletos`.`boleto` (`cliente_idcliente` ASC) VISIBLE;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;
