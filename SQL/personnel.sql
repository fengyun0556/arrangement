/**Privilege 权限
function 功能
role 角色*/

drop table if exists person_user;
create table person_user(
    login_name  VARCHAR(40) primary key comment "登录名称/昵称",
    user_password   varchar(60) comment "用户密码",
    user_name	varchar(40) comment "用户名",
    sex			char(1) comment "性别",
    birthday	date comment "生日",
    eMail		VARCHAR(40) comment "邮箱",
    mobile_phone	VARCHAR(20) comment "手机号码",
    department_id   tinyint unsigned comment "部门编号",
    employee_type_id tinyint unsigned comment "员工类型编码"
);

/*
 *角色表
 */
drop table if exists person_role;
create table person_role(
	role_id		 tinyint unsigned auto_increment primary key,
	role_name    varchar(40) comment "角色名称"
);

/*
 *权限表
 */
drop table if exists person_privilege;
create table person_privilege(
	privilege_id	  tinyint unsigned auto_increment primary key,
	privilege_name    varchar(40) comment "权限名称"
);

/*
 *功能表
 */
drop table if exists person_function;
create table person_function(
	function_id		 tinyint unsigned auto_increment primary key,
	function_name    varchar(40) comment "功能名称"
);


/*
角色权限关联
*/
drop table if exists person_role_privilege;
create table person_role_privilege(
	role_id		 	tinyint unsigned comment "角色编码",
	privilege_id 	tinyint unsigned comment "权限编码",
    primary key (role_id, privilege_id)
);

/*
权限功能关联表
*/
drop table if exists person_privilege_function;
create table person_privilege_function(
	privilege_id	tinyint unsigned comment "权限编码",
    function_id		tinyint unsigned comment "功能编码",
    primary key (privilege_id, function_id)
);
