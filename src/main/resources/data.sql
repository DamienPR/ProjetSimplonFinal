INSERT INTO `utilisateur` (`username`, `password`) VALUES
('abdel', 'azerty');

INSERT INTO `utilisateur` (`username`, `password`) VALUES
('franck', 'azerty');

INSERT INTO `utilisateur` (`username`, `password`) VALUES
('damien', 'azerty');

INSERT INTO `utilisateur` (`username`, `password`) VALUES
('pierre', 'azerty');

INSERT INTO `utilisateur` (`username`, `password`) VALUES
('nico', 'azerty');

INSERT INTO `utilisateur` (`username`, `password`) VALUES
('manu', 'azerty');

INSERT INTO `role` (`name`) VALUES
('apprenant');

INSERT INTO `role` (`name`) VALUES
('formateur');

INSERT INTO `role` (`name`) VALUES
('tuteur');

INSERT INTO `role` (`name`) VALUES
('administrateur');

INSERT INTO `utilisateur_role` (`utilisateur_id`,`role_id`) VALUES
(1,1);

INSERT INTO `utilisateur_role` (`utilisateur_id`,`role_id`) VALUES
(2,1);

INSERT INTO `utilisateur_role` (`utilisateur_id`,`role_id`) VALUES
(2,4);

INSERT INTO `utilisateur_role` (`utilisateur_id`,`role_id`) VALUES
(3,1);

INSERT INTO `utilisateur_role` (`utilisateur_id`,`role_id`) VALUES
(4,3);

INSERT INTO `utilisateur_role` (`utilisateur_id`,`role_id`) VALUES
(5,1);

INSERT INTO `utilisateur_role` (`utilisateur_id`,`role_id`) VALUES
(5,2);

INSERT INTO `utilisateur_role` (`utilisateur_id`,`role_id`) VALUES
(6,2);