create database FriendDB;

create table FriendDB.userinfo(
username varchar(15) not null,
userpass varchar(8) not null,
constraint pk_userinfo primary key(username)
);

create table FriendDB.friend(
fid integer not null auto_increment,
fname varchar(15) not null,
fgender varchar(6) not null,
ftelephone char(12),
fcellphone char(11),
fremark varchar(30),
username varchar(15) not null,
constraint pk_friend primary key(fid),
constraint fk_friend foreign key(username) references FriendDB.userinfo(username) 
);
