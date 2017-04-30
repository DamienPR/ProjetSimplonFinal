-- apprenant
INSERT INTO `utilisateur` (`firstname`,`lastname`, `password`,`persomail`,`pair_id`,`role_id`,`promo_id` ) VALUES
('abdel', 'dupont1', 'azerty', 'abdel@simplon.co', 1, 4, 1);
INSERT INTO `utilisateur` (`firstname`,`lastname`, `password`,`persomail`,`pair_id`,`role_id`,`promo_id` ) VALUES
('damien', 'dupont2', 'azerty', 'damien@simplon.co', 2, 4, 1);
-- formateur
INSERT INTO `utilisateur` (`firstname`,`lastname`, `password`,`persomail`,`pair_id`,`role_id`,`promo_id` ) VALUES
('manu', 'dupont3', 'azerty', 'manu@simplon.co', null, 1, 1);
INSERT INTO `utilisateur` (`firstname`,`lastname`, `password`,`persomail`,`pair_id`,`role_id`,`promo_id` ) VALUES
('nico', 'dupont4', 'azerty', 'nico@simplon.co', null, 1, 1);
-- tuteur
INSERT INTO `utilisateur` (`firstname`,`lastname`, `password`,`persomail`,`pair_id`,`role_id`,`promo_id` ) VALUES
('michael', 'dupont5', 'azerty', 'michael@simplon.co', 1, 2, null);
INSERT INTO `utilisateur` (`firstname`,`lastname`, `password`,`persomail`,`pair_id`,`role_id`,`promo_id` ) VALUES
('ali', 'dupont6', 'azerty', 'ali@simplon.co', 2, 2, null);
-- administrateur
INSERT INTO `utilisateur` (`firstname`,`lastname`, `password`,`persomail`,`pair_id`,`role_id`,`promo_id` ) VALUES
('laeticia', 'dupont7', 'azerty', 'laeticia@simplon.co', null, 3, null);
-- roles
INSERT INTO `role` (`name`) VALUES
('formateur');
INSERT INTO `role` (`name`) VALUES
('tuteur');
INSERT INTO `role` (`name`) VALUES
('administrateur');
INSERT INTO `role` (`name`) VALUES
('apprenant');
-- promo
INSERT INTO `promo` (`name`,`startdate`,`enddate`) VALUES
('laposte1',2016-11-01,2017-07-30);
-- diary
INSERT INTO `diary` (`name`,`startdate`,`enddate`,`introduction`,`promo_id`) VALUES
('session1',2017-01-01,2017-01-15,'ceci sera ma premiere introduction',1);
-- question
INSERT INTO `question` (`content`,`diary_id`,`role_id`) VALUES
(2,1);
INSERT INTO `question` (`content`,`diary_id`,`role_id`) VALUES
(2,1);
INSERT INTO `question` (`content`,`diary_id`,`role_id`) VALUES
(2,1);
INSERT INTO `question` (`content`,`diary_id`,`role_id`) VALUES
(2,1);
INSERT INTO `question` (`content`,`diary_id`,`role_id`) VALUES
(2,1);
INSERT INTO `question` (`content`,`diary_id`,`role_id`) VALUES
(2,1);
INSERT INTO `question` (`content`,`diary_id`,`role_id`) VALUES
(2,1);
INSERT INTO `question` (`content`,`diary_id`,`role_id`) VALUES
(2,1);
INSERT INTO `question` (`content`,`diary_id`,`role_id`) VALUES
(2,1);
INSERT INTO `question` (`content`,`diary_id`,`role_id`) VALUES
(2,1);
-- answer
INSERT INTO `answer` (`content`,`user_id`,`question_id`) VALUES
(2,1);
INSERT INTO `answer` (`content`,`user_id`,`question_id`) VALUES
(2,1);
INSERT INTO `answer` (`content`,`user_id`,`question_id`) VALUES
(2,1);
INSERT INTO `answer` (`content`,`user_id`,`question_id`) VALUES
(2,1);
INSERT INTO `answer` (`content`,`user_id`,`question_id`) VALUES
(2,1);
INSERT INTO `answer` (`content`,`user_id`,`question_id`) VALUES
(2,1);
INSERT INTO `answer` (`content`,`user_id`,`question_id`) VALUES
(2,1);
INSERT INTO `answer` (`content`,`user_id`,`question_id`) VALUES
(2,1);
INSERT INTO `answer` (`content`,`user_id`,`question_id`) VALUES
(2,1);
INSERT INTO `answer` (`content`,`user_id`,`question_id`) VALUES
(2,1);
-- conclusion
INSERT INTO `conclusion` (`content`,`user_id`,`diary_id`) VALUES
(2,1);
INSERT INTO `conclusion` (`content`,`user_id`,`diary_id`) VALUES
(2,1);

