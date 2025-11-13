-- TASK 1 - How many employees is working for EACH department

SELECT DEPARTMENT_ID, COUNT(*)
FROM EMPLOYEES
GROUP BY DEPARTMENT_ID;

-- TASK 2 - What is Max_salary / min_salary / total_expense / avg for each department

SELECT DEPARTMENT_ID, MAX(SALARY), MIN(SALARY), SUM(SALARY), ROUND(AVG(SALARY)) AS "AVERAGE"
FROM EMPLOYEES
GROUP BY DEPARTMENT_ID;

-- TASK 3 - Ignore null departments
SELECT DEPARTMENT_ID, COUNT(*)
FROM EMPLOYEES
WHERE DEPARTMENT_ID IS NOT NULL
GROUP BY DEPARTMENT_ID;

-- TASK 4 - Display department id where employees count is less than 5 and order the result descending