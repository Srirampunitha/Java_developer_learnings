insert into houserent(id,name,paid,amount,paid_date)
values (1001 ,'Sriram',true,1661,'2024-08-24');
insert into houserent(id,name,paid,amount,paid_date)
values (1002 ,'Sriram',true,1661,'2024-08-20');
insert into houserent(id,name,paid,amount,paid_date)
values (1003 ,'Sriram',true,1661,'2024-08-20');
insert into houserent(id,name,paid,amount,paid_date)
values (1004 ,'Sriram',true,1661,'2024-08-20');

insert into boys (username,password,role)
  values('Sriram','$2a$10$/tvfYVAlh5/et59uFo.KIu00mGFEUpkXHvEyIBndBUBfbcjYT3xIS','Admin');
  insert into boys (username,password,role)
  values('Punitha','$2a$10$/tvfYVAlh5/et59uFo.KIu00mGFEUpkXHvEyIBndBUBfbcjYT3xIS','guest');
  insert into boys (username,password,role)
  values('Aarthi','$2a$10$/tvfYVAlh5/et59uFo.KIu00mGFEUpkXHvEyIBndBUBfbcjYT3xIS','user');



 insert into authority(name,boys_id)
  values ('Admin',1);
  insert into authority(name,boys_id)
  values ('User',1);
  
  insert into authority(name,boys_id)
  values ('User',2);
  insert into authority(name,boys_id)
  values ('Admin',3);