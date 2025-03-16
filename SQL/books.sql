CREATE TABLE books (
    id  INTEGER PRIMARY KEY AUTOINCREMENT,
    title TEXT NOT NULL,
    author TEXT NOT NULL,
    isbn TEXT NOT NULL UNIQUE,
    genre TEXT,
    publication_year INTEGER,
    price FLOAT,
    stock_quantity INTEGER
);