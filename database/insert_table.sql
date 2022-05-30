/*
-- Query: SELECT * FROM jspservletjdbc.category
LIMIT 0, 1000

-- Date: 2022-05-30 15:55
*/
use jspservletjdbc;

insert into role(code,name) values('ADMIN','ADMIN');
insert into role(code,name) values('USER','USER');

insert into user(username,password,fullname,status, roleid) values('admin','123456','admin',1,1);
insert into user(username,password,fullname,status, roleid) values('nguyenvana','123456','nguyen van a',1,2);
insert into user(username,password,fullname,status, roleid) values('nguyenvanb','123456','nguyen van b',1,2);

INSERT INTO `category` (`id`,`name`,`code`,`createddate`,`modifieddate`,`createdby`,`modifiedby`) VALUES (1,'Thể thao','the-thao',NULL,NULL,NULL,NULL);
INSERT INTO `category` (`id`,`name`,`code`,`createddate`,`modifieddate`,`createdby`,`modifiedby`) VALUES (2,'Chính trị','chinh-tri',NULL,NULL,NULL,NULL);
INSERT INTO `category` (`id`,`name`,`code`,`createddate`,`modifieddate`,`createdby`,`modifiedby`) VALUES (3,'Thế giới','the-gioi',NULL,NULL,NULL,NULL);
INSERT INTO `category` (`id`,`name`,`code`,`createddate`,`modifieddate`,`createdby`,`modifiedby`) VALUES (4,'Thời sự','thoi-su',NULL,NULL,NULL,NULL);

INSERT INTO `news` (`id`,`title`,`thumbnail`,`shortdescription`,`content`,`categoryid`,`createddate`,`modifieddate`,`createdby`,`modifiedby`) VALUES (1,'Aston Villa mua đứt Coutinho từ Barca','no_image','CLB Anh quyết định ký hợp đồng dài hạn với tiền vệ người Brazil sau khi kết thúc hợp đồng mượn cuối mùa 2021-2022','<p>a</p>\n',1,'2022-05-05 16:08:57',NULL,'admin',NULL);
INSERT INTO `news` (`id`,`title`,`thumbnail`,`shortdescription`,`content`,`categoryid`,`createddate`,`modifieddate`,`createdby`,`modifiedby`) VALUES (2,'Người được trợ cấp nhầm 360.000 USD hứa \'trả dần\'','no_image','Người đàn ông được hỗ trợ nhầm 360.000 USD đồng ý \"trả lại từng chút\" sau khi tiêu sạch số tiền này vào các sòng bạc trực tuyến.',NULL,3,NULL,NULL,NULL,NULL);
INSERT INTO `news` (`id`,`title`,`thumbnail`,`shortdescription`,`content`,`categoryid`,`createddate`,`modifieddate`,`createdby`,`modifiedby`) VALUES (3,'Benzema ghi bàn thứ 44 cho Real mùa này','no_image',' Karim Benzema thành cầu thủ ghi bàn nhiều thứ hai trong lịch sử Real, khi lập công trong trận thắng Levante 6-0 ở vòng 36 La Liga tối 12/5.',NULL,1,NULL,NULL,NULL,NULL);
INSERT INTO `news` (`id`,`title`,`thumbnail`,`shortdescription`,`content`,`categoryid`,`createddate`,`modifieddate`,`createdby`,`modifiedby`) VALUES (4,'Arsenal thua thảm Tottenham','no_image','Mất người từ hiệp một, Arsenal nhận thất bại 0-3 trên sân Tottenham ở trận đá bù vòng 22 và lỡ cơ hội sớm cán đích trong top 4 Ngoại hạng Anh.',NULL,1,NULL,NULL,NULL,NULL);
INSERT INTO `news` (`id`,`title`,`thumbnail`,`shortdescription`,`content`,`categoryid`,`createddate`,`modifieddate`,`createdby`,`modifiedby`) VALUES (5,'Nhiều bãi giữ xe bệnh viện chiếm hết vỉa hè','no_image','Bãi giữ xe tự phát ở nhiều bệnh viện lớn tại các quận trung tâm chiếm trọn vỉa hè, người đi bộ phải xuống lòng đường dễ nguy cơ tai nạn.',NULL,4,NULL,NULL,NULL,NULL);
INSERT INTO `news` (`id`,`title`,`thumbnail`,`shortdescription`,`content`,`categoryid`,`createddate`,`modifieddate`,`createdby`,`modifiedby`) VALUES (7,'HLV Park: \'Quá sớm để nói ai mạnh nhất SEA Games\'','no image','Theo HLV Park Hang-seo, Việt Nam còn nhiều việc phải làm, nhất là vấn đề tâm lý của các cầu thủ, trước trận bán kết với Malaysia ở SEA Games 31. ','<p>aaaa</p>\n',1,'2022-05-18 22:38:16',NULL,'admin',NULL);
INSERT INTO `news` (`id`,`title`,`thumbnail`,`shortdescription`,`content`,`categoryid`,`createddate`,`modifieddate`,`createdby`,`modifiedby`) VALUES (8,'Năm 2030 Việt Nam sẽ có hơn 1.000 đô thị','image','Toàn quốc sẽ có 1.000-1.200 đô thị năm 2030, trong đó 3-5 thành phố có thương hiệu được công nhận tầm khu vực và quốc tế.','<p>xin chao</p>\n',4,'2022-05-18 23:15:01',NULL,'admin',NULL);
INSERT INTO `news` (`id`,`title`,`thumbnail`,`shortdescription`,`content`,`categoryid`,`createddate`,`modifieddate`,`createdby`,`modifiedby`) VALUES (9,'Trường quốc tế nhận \'có phần trách nhiệm\' vụ học sinh đánh nhau','no_image','Trường Quốc tế TP HCM (ISHCMC) thừa nhận có phần trách nhiệm khi để xảy ra việc học sinh đánh nhau, làm phụ huynh lo lắng. ','<p><a href=\"https://vnexpress.net/truong-quoc-te-nhan-co-phan-trach-nhiem-vu-hoc-sinh-danh-nhau-4469640.html\" title=\"Trường quốc tế nhận \'có phần trách nhiệm\' vụ học sinh đánh nhau&gt;\">Trường Quốc tế TP HCM (ISHCMC) thừa nhận c&oacute; phần tr&aacute;ch nhiệm khi để xảy ra việc học sinh đ&aacute;nh nhau, l&agrave;m phụ huynh lo lắng.</a>&nbsp;</p>\n',4,'2022-05-30 15:15:14','2022-05-30 15:37:00','admin','admin');
INSERT INTO `news` (`id`,`title`,`thumbnail`,`shortdescription`,`content`,`categoryid`,`createddate`,`modifieddate`,`createdby`,`modifiedby`) VALUES (10,'Châu Âu lo vũ khí viện trợ Ukraine bị bán ra chợ đen','no_image','Giám đốc điều hành Europol cho biết cơ quan này đang chuẩn bị kịch bản lượng lớn vũ khí bị tuồn ra chợ đen sau xung đột Ukraine.','<p><a href=\"https://vnexpress.net/chau-au-lo-vu-khi-vien-tro-ukraine-bi-ban-ra-cho-den-4469729.html\" title=\"Châu Âu lo vũ khí viện trợ Ukraine bị bán ra chợ đen\">Gi&aacute;m đốc điều h&agrave;nh Europol cho biết cơ quan n&agrave;y đang chuẩn bị kịch bản lượng lớn vũ kh&iacute; bị tuồn ra chợ đen sau xung đột Ukraine.</a></p>\n',3,'2022-05-30 15:19:27',NULL,'admin',NULL);
INSERT INTO `news` (`id`,`title`,`thumbnail`,`shortdescription`,`content`,`categoryid`,`createddate`,`modifieddate`,`createdby`,`modifiedby`) VALUES (11,'test_update1','test_update1','test_update1','<p>test_update1</p>\n',1,'2022-05-30 15:50:03','2022-05-30 15:52:33','admin','admin');
INSERT INTO `news` (`id`,`title`,`thumbnail`,`shortdescription`,`content`,`categoryid`,`createddate`,`modifieddate`,`createdby`,`modifiedby`) VALUES (12,'test2_update','test2_update','test2_update','<p>test2_update</p>\n',2,'2022-05-30 15:53:14','2022-05-30 15:53:33','admin','admin');
