
create table users (username VARCHAR2(100) NOT NULL, password VARCHAR2(500) NOT NULL);

create table emails (to_email VARCHAR2(100) NOT NULL,from_email VARCHAR2(100) NOT NULL,subject VARCHAR2(200) NOT NULL,content VARCHAR2(1000) NOT NULL, flag NUMBER NOT NULL);
