# Write your MySQL query statement below
WITH sub AS (
    SELECT requester_id,accepter_id from RequestAccepted
    UNION
    SELECT accepter_id,requester_id from RequestAccepted
)
SELECT requester_id AS id, COUNT(accepter_id) AS num
FROM sub
GROUP BY 1
ORDER BY 2 DESC
LIMIT 1
