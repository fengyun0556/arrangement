drop table if exists log;
create table log(
	id             bigint auto_increment primary key,
	login_name     VARCHAR(40) comment "登录名",
    operateMessage varchar(256) comment "操作信息",
    operateDate    datetime comment "操作时间"
);