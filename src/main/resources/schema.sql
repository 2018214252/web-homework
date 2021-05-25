create table if not exists lab
(
    id bigint(19) not null primary key ,
    machineNumber int(5),
    details varchar(45),
    create_time datetime not null default current_timestamp,
    update_time datetime not null default current_timestamp on update current_timestamp
);