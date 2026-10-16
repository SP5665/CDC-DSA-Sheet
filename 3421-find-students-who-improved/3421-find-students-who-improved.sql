# Write your MySQL query statement below
SELECT
    s.student_id,
    s.subject,
    s.score AS first_score,
    e.score AS latest_score
FROM Scores s
JOIN Scores e
    ON s.student_id = e.student_id
    AND s.subject = e.subject
    AND s.exam_date < e.exam_date
WHERE s.exam_date = (
    -- Find the first exam date for this student and subject
    SELECT MIN(exam_date)
    FROM Scores
    WHERE student_id = s.student_id
      AND subject = s.subject
)
AND e.exam_date = (
    -- Find the latest exam date for this student and subject
    SELECT MAX(exam_date)
    FROM Scores
    WHERE student_id = e.student_id
      AND subject = e.subject
)
AND e.score > s.score
ORDER BY s.student_id, s.subject;