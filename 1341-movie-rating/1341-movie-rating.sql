# Write your MySQL query statement below
(SELECT name AS results
FROM Users
JOIN MovieRating
ON Users.user_id = MovieRating.user_id
GROUP BY name # since user_id is not in join
ORDER BY COUNT(*) DESC, name
LIMIT 1) # select 1

UNION ALL # includes duplicated unlike union

(SELECT title AS results
FROM Movies
JOIN MovieRating
ON Movies.movie_id = MovieRating.movie_id
WHERE created_at LIKE '2020-02-__'
GROUP BY title
ORDER BY AVG(rating) DESC, title
LIMIT 1);