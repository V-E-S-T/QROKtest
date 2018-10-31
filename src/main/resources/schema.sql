# DROP TABLE IF EXISTS user_roles;
# DROP TABLE IF EXISTS meals;
# DROP TABLE IF EXISTS users;
# DROP SEQUENCE IF EXISTS global_seq;
#
# CREATE SEQUENCE global_seq START 100000;
#
# CREATE TABLE users
# (
#   id               INTEGER PRIMARY KEY,
#   name             VARCHAR()                NOT NULL,
#   email            VARCHAR                 NOT NULL,
#   password         VARCHAR                 NOT NULL,
#   registered       TIMESTAMP DEFAULT now() NOT NULL,
#   enabled          BOOL DEFAULT TRUE       NOT NULL,
#   calories_per_day INTEGER DEFAULT 2000    NOT NULL
# );
# CREATE UNIQUE INDEX users_unique_email_idx ON users (email);
#
# CREATE TABLE user_roles
# (
#   user_id INTEGER NOT NULL,
#   role    VARCHAR,
#   CONSTRAINT user_roles_idx UNIQUE (user_id, role),
#   FOREIGN KEY (user_id) REFERENCES users (id) ON DELETE CASCADE
# );
#
# CREATE TABLE meals (
#   id          INTEGER PRIMARY KEY DEFAULT nextval('global_seq'),
#   user_id     INTEGER   NOT NULL,
#   date_time   TIMESTAMP NOT NULL,
#   description TEXT      NOT NULL,
#   calories    INT       NOT NULL,
#   FOREIGN KEY (user_id) REFERENCES users (id) ON DELETE CASCADE
# );
# CREATE UNIQUE INDEX meals_unique_user_datetime_idx ON meals (user_id, date_time);


create schema if not exists qrok default character set utf8;
use qrok;
drop table if exists books;
create table books(

                   id int(10) not null auto_increment,
                   title varchar(100),
                   isbn varchar(255),
                  genre varchar(100),
  primary key (id))
  default character set = utf8;


drop table if exists authors;
create table authors(

  id int(10) not null auto_increment,
  firstName varchar(100),
  lastName varchar(255),
  sex varchar(100),
  birthDate DATE,
  primary key (id))
  default character set = utf8;

drop table if exists rewards;
create table rewards(

  id int(10) not null auto_increment,
  year INT(20),
  title varchar(255),
  primary key (id))
  default character set = utf8;


