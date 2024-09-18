

                         
 insert into students(studnet_id,name,age,grade) 
 values(1,'Sriram',16,'10th');
 insert into students(studnet_id,name,age,grade) 
 values(2,'Rahul',16,'10th');
 insert into students(studnet_id,name,age,grade) 
 values(3,'Aadavan',16,'10th');
 insert into students(studnet_id,name,age,grade) 
 values(4,'Tariq',16,'10th');
   
 
 insert into marks(tamil,english,maths,social,science,student_id)
  values(98,92,100,100,97,1);
  insert into marks(tamil,english,maths,social,science,student_id)
  values(92,54,78,78,80,2);
  
  insert into customers (username,password,role)
  values('Sriram','$2a$10$YlRgdrJ2Z42uFuYNtFzvbOjiurQd12OgmTI2E/MZ2fLB9rgGMZCWq','Admin');
  insert into customers (username,password,role)
  values('Punitha','$2a$10$YlRgdrJ2Z42uFuYNtFzvbOjiurQd12OgmTI2E/MZ2fLB9rgGMZCWq','guest');
  insert into customers (username,password,role)
  values('Aarthi','$2a$10$YlRgdrJ2Z42uFuYNtFzvbOjiurQd12OgmTI2E/MZ2fLB9rgGMZCWq','user');
  
  insert into authorities(name,customer_id)
  values ('ROLE_ADMIN',1);
  insert into authorities(name,customer_id)
  values ('ROLE_USER',1);
  
  insert into authorities(name,customer_id)
  values ('ROLE_USER',2);
  insert into authorities(name,customer_id)
  values ('ROLE_ADMIN',3);