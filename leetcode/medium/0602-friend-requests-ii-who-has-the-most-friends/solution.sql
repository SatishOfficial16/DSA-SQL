SELECT id,
       (SELECT COUNT(*)
        FROM RequestAccepted
        WHERE id = requester_id OR id = accepter_id) AS num
FROM (
    SELECT requester_id AS id
    FROM RequestAccepted

    UNION

    SELECT accepter_id AS id
    FROM RequestAccepted
) AS people
ORDER BY num DESC
LIMIT 1;