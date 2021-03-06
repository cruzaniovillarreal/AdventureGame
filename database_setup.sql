use adventuregame_db;

create table if not exists alignment_list
(
    id   int unsigned auto_increment,
    type varchar(15) not null,
    primary key (id)
);

create table if not exists items_list
(
    id          int unsigned auto_increment,
    description varchar(255) not null,
    primary key (id)
);

create table if not exists followers_list
(
    id       int unsigned not null,
    life     int unsigned not null,
    strength int unsigned not null,
    attack   int unsigned not null,
    primary key (id)
);

create table if not exists base_characters
(
    id        int unsigned auto_increment,
    name      varchar(50)  not null,
    life      int unsigned not null,
    fate      int unsigned not null,
    strength  int unsigned not null,
    craft     int unsigned not null,
    gold      int unsigned not null,
    alignment int unsigned not null,
    image     text     not null,
    objects   int unsigned,
    followers int unsigned,
    PRIMARY KEY (id),
    foreign key (alignment) references alignment_list (id),
    foreign key (objects) references items_list (id),
    foreign key (followers) references followers_list (id)
);