# Write your MySQL query statement below
SELECT Employee.name, Bonus.bonus
FROM Employee
LEFT JOIN Bonus ON
employee.empId=Bonus.empId WHERE
bonus < 1000 OR bonus IS NULL;