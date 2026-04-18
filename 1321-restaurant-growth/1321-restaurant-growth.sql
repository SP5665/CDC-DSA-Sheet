# Write your MySQL query statement below
SELECT 
    DISTINCT visited_on,
    SUM(amount) OVER w AS amount,
    ROUND((SUM(amount) OVER w)/7, 2) AS average_amount
FROM customer
WINDOW w AS ( # define window
    ORDER BY visited_on
    RANGE BETWEEN INTERVAL 6 DAY PRECEDING AND CURRENT ROW
    # For each row, look back 6 days + current day = 7 days total
    # This is date-based, not row-based
    # Even if some dates are missing, it still considers the date range
)
LIMIT 6, 999