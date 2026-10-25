# Write your MySQL query statement below
SELECT l.book_id, l.title, l.author, l.genre, l.publication_year, b.b_count AS current_borrowers
FROM library_books l
LEFT JOIN (SELECT book_id, count(book_id) AS b_count FROM borrowing_records WHERE return_date IS NULL GROUP BY book_id HAVING count(*)) b
ON l.book_id = b.book_id
WHERE l.total_copies - b.b_count = 0
ORDER BY current_borrowers DESC, l.title ASC;