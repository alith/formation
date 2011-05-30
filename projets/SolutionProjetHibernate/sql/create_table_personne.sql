CREATE TABLE `personne` (
  `personne_id` INTEGER NOT NULL AUTO_INCREMENT,
  `nom` VARCHAR(45) NOT NULL,
  `prenom` VARCHAR(45) ,
  `adresse` VARCHAR(45) ,
  `age` INTEGER,
  PRIMARY KEY (`personne_id`)
)TYPE=INNODB;