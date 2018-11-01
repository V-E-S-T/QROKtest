insert into books (title, isbn, genre) values
  ('title_1', 'isbn_1', 'DETECTIVE'),
  ('title_2', 'isbn_2', 'FANTASTIC'),
  ('title_3', 'isbn_3', 'NOVEL'),
  ('title_4', 'isbn_4', 'FANTASY'),
  ('title_5', 'isbn_5', 'NOVEL');

insert into authors (firstName, lastName, sex, birthDate) values
  ('firstName_1', 'lastName_1', 'MALE', '1986-08-01'),
  ('firstName_1', 'lastName_1', 'FEMALE', '1976-09-02'),
  ('firstName_1', 'lastName_1', 'FEMALE', '1966-01-03'),
  ('firstName_1', 'lastName_1', 'MALE', '1956-02-04'),
  ('firstName_1', 'lastName_1', 'FEMALE', '1946-03-05'),
  ('firstName_1', 'lastName_1', 'FEMALE', '1936-04-06'),
  ('firstName_1', 'lastName_1', 'MALE', '1926-05-07');

insert into rewards (year, title) values
  (2005, 'title_1'),
  (2000, 'title_2'),
  (2002, 'title_3');

insert into authors_books (author_id, book_id) values
  (1, 5),
  (2, 3),
  (7, 1);