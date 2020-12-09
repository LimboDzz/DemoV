CREATE TABLE `t_emp` (
  `id` varchar(40) NOT NULL COMMENT 'primary key',
  `name` varchar(20) default NULL COMMENT 'name',
  `salary` double(7,2) default NULL COMMENT 'salary',
  `age` varchar(3) default NULL,
  PRIMARY KEY  (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;

CREATE TABLE `t_user` (
  `id` varchar(40) NOT NULL COMMENT 'primary key',
  `username` varchar(20) default NULL COMMENT 'username',
  `realname` varchar(20) default NULL COMMENT 'realname',
  `password` varchar(20) default NULL COMMENT 'password',
  `sex` varchar(2) default NULL COMMENT 'sex',
  PRIMARY KEY  (`id`)
) ENGINE=MyISAM DEFAULT CHARSET=utf8;