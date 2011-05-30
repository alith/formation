CREATE TABLE `zone_ref` (
  `zone_id` INTEGER NOT NULL AUTO_INCREMENT,
  `zone_debut` INTEGER ,
  `zone_fin` INTEGER,
  `prix` FLOAT,
  PRIMARY KEY (`zone_id`)
)TYPE=INNODB;