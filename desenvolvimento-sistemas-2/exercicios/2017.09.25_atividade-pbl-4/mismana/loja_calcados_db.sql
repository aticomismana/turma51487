- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='TRADITIONAL,ALLOW_INVALID_DATES';

-- -----------------------------------------------------
-- Schema loja_calcados_db
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `loja_calcados_db` DEFAULT CHARACTER SET utf8 ;
USE `loja_calcados_db` ;


-- -----------------------------------------------------
-- Table `loja_calcados_db`.`pessoa`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `loja_calcados_db`.`pessoa` (
  `cod_pessoa` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(60) NOT NULL,
  `cpf` VARCHAR(14) NOT NULL,
  PRIMARY KEY (`cod_pessoa`))
ENGINE = InnoDB;

CREATE UNIQUE INDEX `pessoa_cpf_UNIQUE` ON `loja_calcados_db`.`pessoa` (`cpf` ASC);


-- -----------------------------------------------------
-- Table `loja_calcados_db`.`funcao`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `loja_calcados_db`.`funcao` (
  `cod_funcao` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(60) NOT NULL,
  PRIMARY KEY (`cod_funcao`))
ENGINE = InnoDB;

CREATE UNIQUE INDEX `funcao_nome_UNIQUE` ON `loja_calcados_db`.`funcao` (`nome` ASC);


-- -----------------------------------------------------
-- Table `loja_calcados_db`.`nivel`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `loja_calcados_db`.`nivel` (
  `cod_nivel` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(60) NOT NULL,
  PRIMARY KEY (`cod_nivel`))
ENGINE = InnoDB;

CREATE UNIQUE INDEX `nivel_nome_UNIQUE` ON `loja_calcados_db`.`nivel` (`nome` ASC);


-- -----------------------------------------------------
-- Table `loja_calcados_db`.`salario`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `loja_calcados_db`.`salario` (
  `cod_salario` INT NOT NULL AUTO_INCREMENT,
  `cod_funcao` INT NOT NULL,
  `cod_nivel` INT NOT NULL,
  `data_vigencia` DATE NOT NULL,
  `valor` FLOAT NOT NULL,
  PRIMARY KEY (`cod_salario`),
  CONSTRAINT `fk_salario_funcao1`
    FOREIGN KEY (`cod_funcao`)
    REFERENCES `loja_calcados_db`.`funcao` (`cod_funcao`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_salario_nivel1`
    FOREIGN KEY (`cod_nivel`)
    REFERENCES `loja_calcados_db`.`nivel` (`cod_nivel`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE UNIQUE INDEX `funcao_nivel_vigencia_valor_UNIQUE` ON `loja_calcados_db`.`salario` (`cod_funcao` ASC,
	`cod_nivel` ASC, `data_vigencia` ASC, `valor` ASC);


-- -----------------------------------------------------
-- Table `loja_calcados_db`.`colaborador`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `loja_calcados_db`.`colaborador` (
  `cod_colaborador` INT NOT NULL AUTO_INCREMENT,
  `cod_pessoa` INT NOT NULL,
  `cod_funcao` INT NOT NULL,
  `cod_nivel` INT NOT NULL,
  `data_admissao` DATE NOT NULL,
  PRIMARY KEY (`cod_colaborador`),
  CONSTRAINT `fk_colaborador_pessoa1`
    FOREIGN KEY (`cod_pessoa`)
    REFERENCES `loja_calcados_db`.`pessoa` (`cod_pessoa`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_colaborador_funcao1`
    FOREIGN KEY (`cod_funcao`)
    REFERENCES `loja_calcados_db`.`funcao` (`cod_funcao`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_colaborador_nivel1`
    FOREIGN KEY (`cod_nivel`)
    REFERENCES `loja_calcados_db`.`nivel` (`cod_nivel`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE UNIQUE INDEX `pessoa_funcao_nivel_admissao_UNIQUE` ON `loja_calcados_db`.`colaborador` (`cod_pessoa` ASC,
	`cod_funcao` ASC, `cod_nivel` ASC, `data_admissao` ASC);


-- -----------------------------------------------------
-- Table `loja_calcados_db`.`cliente`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `loja_calcados_db`.`cliente` (
  `cod_cliente` INT NOT NULL AUTO_INCREMENT,
  `cod_pessoa` INT NOT NULL,
  `data_cadastro` DATE NOT NULL,
  PRIMARY KEY (`cod_cliente`),
  CONSTRAINT `fk_cliente_pessoa1`
    FOREIGN KEY (`cod_pessoa`)
    REFERENCES `loja_calcados_db`.`pessoa` (`cod_pessoa`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE INDEX `fk_cliente_pessoa1_idx` ON `loja_calcados_db`.`pessoa` (`cod_pessoa` ASC);

CREATE INDEX `fk_cliente_funcao1_idx` ON `loja_calcados_db`.`funcao` (`cod_funcao` ASC);

CREATE INDEX `fk_cliente_nivel1_idx` ON `loja_calcados_db`.`nivel` (`cod_nivel` ASC);

CREATE UNIQUE INDEX `pessoa_cliente_UNIQUE` ON `loja_calcados_db`.`cliente` (`cod_cliente` ASC, `cod_pessoa` ASC);


-- -----------------------------------------------------
-- Table `loja_calcados_db`.`produto`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `loja_calcados_db`.`produto` (
  `cod_produto` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(60) NOT NULL,
  `valor` FLOAT NOT NULL,
  PRIMARY KEY (`cod_produto`))
ENGINE = InnoDB;

CREATE UNIQUE INDEX `produto_nome_UNIQUE` ON `loja_calcados_db`.`produto` (`nome` ASC);


-- -----------------------------------------------------
-- Table `loja_calcados_db`.`venda`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `loja_calcados_db`.`venda` (
  `cod_venda` INT NOT NULL AUTO_INCREMENT,
  `cod_colaborador` INT NOT NULL,
  `cod_cliente` INT NOT NULL,
  `data` DATE NOT NULL,
  `valor_bruto` FLOAT NOT NULL,
  `valor_desconto` FLOAT NOT NULL,
  `valor` FLOAT NOT NULL,
  PRIMARY KEY (`cod_venda`),
  CONSTRAINT `fk_venda_colaborador1`
    FOREIGN KEY (`cod_colaborador`)
    REFERENCES `loja_calcados_db`.`colaborador` (`cod_colaborador`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_venda_cliente1`
    FOREIGN KEY (`cod_cliente`)
    REFERENCES `loja_calcados_db`.`cliente` (`cod_cliente`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `loja_calcados_db`.`item_venda`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `loja_calcados_db`.`item_venda` (
  `cod_item_venda` INT NOT NULL AUTO_INCREMENT,
  `cod_venda` INT NOT NULL,
  `cod_produto` INT NOT NULL,
  `quantidade_produto` INT NOT NULL,
  PRIMARY KEY (`cod_item_venda`),
  CONSTRAINT `fk_item_venda_venda1`
    FOREIGN KEY (`cod_venda`)
    REFERENCES `loja_calcados_db`.`venda` (`cod_venda`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_item_venda_produto1`
    FOREIGN KEY (`cod_produto`)
    REFERENCES `loja_calcados_db`.`produto` (`cod_produto`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE UNIQUE INDEX `venda_produto_UNIQUE` ON `loja_calcados_db`.`item_venda` (`cod_venda` ASC, `cod_produto` ASC);


-- -----------------------------------------------------
-- Table `loja_calcados_db`.`rubrica`
-- -----------------------------------------------------

CREATE TABLE IF NOT EXISTS `loja_calcados_db`.`rubrica` (
  `cod_rubrica` INT NOT NULL AUTO_INCREMENT,
  `nome` VARCHAR(60) NOT NULL,
  PRIMARY KEY (`cod_rubrica`))
ENGINE = InnoDB;

CREATE UNIQUE INDEX `rubrica_nome_UNIQUE` ON `loja_calcados_db`.`rubrica` (`nome` ASC);


-- -----------------------------------------------------
-- Table `loja_calcados_db`.`folha_pagamento`
-- -----------------------------------------------------

CREATE TABLE IF NOT EXISTS `loja_calcados_db`.`folha_pagamento` (
  `cod_folha_pagamento` INT NOT NULL AUTO_INCREMENT,
  `cod_colaborador` INT NOT NULL,
  `data_inicial_periodo_laboral` FLOAT NOT NULL,
  `data_final_periodo_laboral` FLOAT NOT NULL,
  `data_pagamento` DATE NOT NULL,
  PRIMARY KEY (`cod_folha_pagamento`),
  CONSTRAINT `fk_folha_pagamento_colaborador1`
    FOREIGN KEY (`cod_colaborador`)
    REFERENCES `loja_calcados_db`.`colaborador` (`cod_colaborador`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE UNIQUE INDEX `colaborador_periodo_laboral_UNIQUE` ON `loja_calcados_db`.`folha_pagamento` (`cod_colaborador` ASC,
	`data_inicial_periodo_laboral` ASC, `data_final_periodo_laboral` ASC, `data_pagamento` ASC);


-- -----------------------------------------------------
-- Table `loja_calcados_db`.`item_folha_pagamento`
-- -----------------------------------------------------

CREATE TABLE IF NOT EXISTS `loja_calcados_db`.`item_folha_pagamento` (
  `cod_item_folha_pagamento` INT NOT NULL AUTO_INCREMENT,
  `cod_folha_pagamento` INT NOT NULL,
  `cod_rubrica` INT NOT NULL,
  `quantidade_rubrica` INT NOT NULL,
  `valor` INT NOT NULL,
  PRIMARY KEY (`cod_item_folha_pagamento`),
  CONSTRAINT `fk_item_folha_pagamento_folha1`
    FOREIGN KEY (`cod_folha_pagamento`)
    REFERENCES `loja_calcados_db`.`folha_pagamento` (`cod_folha_pagamento`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_item_folha_pagamento_rubrica1`
    FOREIGN KEY (`cod_rubrica`)
    REFERENCES `loja_calcados_db`.`rubrica` (`cod_rubrica`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

CREATE UNIQUE INDEX `folha_rubrica_UNIQUE` ON `loja_calcados_db`.`item_folha_pagamento` (`cod_folha_pagamento` ASC, `cod_rubrica` ASC);


-- -----------------------------------------------------
--  end
-- -----------------------------------------------------
SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;