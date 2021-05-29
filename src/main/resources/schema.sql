create table if not exists lab
(
    id bigint(19) not null primary key ,
    machineNumber int(5),
    details varchar(45),
    create_time datetime not null default current_timestamp,
    update_time datetime not null default current_timestamp on update current_timestamp
);

create table if not exists teacher
(
    id bigint(19) not null primary key ,
    name varchar(45),
    profession varchar(45),
    create_time datetime not null default current_timestamp,
    update_time datetime not null default current_timestamp on update current_timestamp
);

create table if not exists course
(
    id bigint(19) not null primary key ,
    tid bigint(19),
    name varchar(45),
    class_hour int(5),
    student_number int(5),
    create_time datetime not null default current_timestamp,
    update_time datetime not null default current_timestamp on update current_timestamp,
    index (tid)
);