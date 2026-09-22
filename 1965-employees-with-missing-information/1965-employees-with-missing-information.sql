# Write your MySQL query statement below
SELECT employee_id
FROM Employees AS e
LEFT JOIN Salaries AS s
USING (employee_id)
WHERE e.name IS NULL OR s.salary IS NULL

UNION

SELECT employee_id
FROM Employees AS e
RIGHT JOIN Salaries AS s
USING (employee_id)
WHERE e.name IS NULL OR s.salary IS NULL

ORDER BY employee_id;