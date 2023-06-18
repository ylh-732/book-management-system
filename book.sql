CREATE DATABASE IF NOT EXISTS ssm_db;
USE ssm_db;

DROP TABLE IF EXISTS book_table;

CREATE TABLE book_table (
    id INT PRIMARY KEY AUTO_INCREMENT,
    author VARCHAR(100),
    name VARCHAR(50),
    description VARCHAR(255)
);

INSERT INTO book_table (author, name, description)
VALUE 
('Fyodor Mikhailovich Dostoevsky', 'The idiot', 'novel'),
('Fyodor Mikhailovich Dostoevsky', 'The Brothers Karamazov', 'novel'),
('Ted Chiang', 'Story of your life', 'science fiction novel'),
('Milan Kundera', 'The unbearable lightness of being', 'novel'),
('W. Somerset Maugham', 'The Moon and Sixpence', 'novel');