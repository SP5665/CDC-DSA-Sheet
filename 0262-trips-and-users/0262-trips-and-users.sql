# Write your MySQL query statement below
SELECT request_at AS Day,
ROUND(SUM(
    CASE WHEN status = 'cancelled_by_driver' OR STATUS = 'cancelled_by_client' THEN 1 ELSE 0 END) / COUNT(request_at), 2) AS "Cancellation Rate"
FROM Trips AS t
JOIN Users AS u
    ON t.client_id = u.users_id
    AND u.banned = 'No'
JOIN Users AS s
    ON t.driver_id = s.users_id
    AND s.banned = 'No'
WHERE request_at BETWEEN '2013-10-01' AND '2013-10-03'
GROUP BY day;