CREATE TABLE `lien_personne_abonnement` (
  `personne_fk` INTEGER NOT NULL,
  `abonnement_fk` INTEGER NOT NULL,
  FOREIGN KEY (`personne_fk`) REFERENCES `personne`(`personne_id`),
  FOREIGN KEY (`abonnement_fk`) REFERENCES `abonnement`(`abonnement_id`)
)TYPE=INNODB;