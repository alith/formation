CREATE TABLE `abonnement` (
  `abonnement_id` INTEGER NOT NULL AUTO_INCREMENT,
  `zone_fk` INTEGER NOT NULL,
  `date_debut` DATE ,
  `date_fin` DATE,
  PRIMARY KEY (`abonnement_id`),
  INDEX(`zone_fk`),
  FOREIGN KEY (`zone_fk`) REFERENCES `zone_ref`(`zone_id`)
)TYPE=INNODB;