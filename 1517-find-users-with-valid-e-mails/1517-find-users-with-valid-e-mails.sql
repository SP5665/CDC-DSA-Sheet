# Write your MySQL query statement below
SELECT * FROM Users
WHERE 
    mail REGEXP '^[a-zA-Z][a-zA-Z0-9_.-]*@leetcode\\.com$' 
    AND mail LIKE BINARY '%@leetcode.com';

-- REGEXP:
-- ^ → start of string
-- [a-zA-Z] → first character must be a letter
-- [a-zA-Z0-9_.-]* → allowed characters (letters, digits, _, ., -)
-- @leetcode\.com → must end with this domain
-- $ → end of string

-- LIKE BINARY:
-- ensures email ends with lowecase '@leetcode.com'