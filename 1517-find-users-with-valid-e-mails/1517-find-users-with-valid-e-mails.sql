# Write your MySQL query statement below
SELECT * FROM Users
WHERE REGEXP_LIKE(mail, '^[A-Za-z][a-zA-Z0-9_.-]*@leetcode[.]com$', 'c');

-- REGEXP_LIKE:
-- ^ -> start of string
-- [a-zA-Z] -> first character must be a letter
-- [a-zA-Z0-9_.-]* -> allowed characters (letters, digits, _, ., -)
-- @leetcode\.com -> must end with this domain
-- $ -> end of string
-- c -> case sensitive, i is for insensitive