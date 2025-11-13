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

SELECT DEPARTMENT_ID, COUNT(*)
FROM EMPLOYEES
WHERE DEPARTMENT_ID IS NOT NULL
GROUP BY DEPARTMENT_ID
HAVING COUNT(*)<5
ORDER BY COUNT(*) DESC ;

-- TASK 5 - Display first_name and last_name from CUSTOMER table which is matching with address and phone data from ADDRESS table
--inner join
SELECT * FROM CUSTOMER;
SELECT * FROM ADDRESS;

SELECT FIRST_NAME, LAST_NAME, ADDRESS, PHONE
FROM CUSTOMER JOIN ADDRESS
                    ON CUSTOMER.ADDRESS_ID = ADDRESS.ADDRESS_ID;

-- TASK 6 - Display all first_name and last_name from CUSTOMER table with both matching and non-matching data, regardless of whether there is a matching address and phone number in the address table.
--left join
SELECT FIRST_NAME, LAST_NAME, ADDRESS, PHONE
FROM CUSTOMER LEFT JOIN ADDRESS
                   ON CUSTOMER.ADDRESS_ID = ADDRESS.ADDRESS_ID;

-- TASK 7 - Display all address and phone data from ADDRESS table with both matching and non-matching data, regardless of whether there is first_name and last_name from CUSTOMER table.
--right join
SELECT FIRST_NAME, LAST_NAME, ADDRESS, PHONE
FROM CUSTOMER RIGHT JOIN ADDRESS
                        ON CUSTOMER.ADDRESS_ID = ADDRESS.ADDRESS_ID;

-- TASK 8 - Display all matching records from both tables(ADDRESS and CUSTOMER), plus all unique (non-matching) records from each table.
--full join
SELECT FIRST_NAME, LAST_NAME, ADDRESS, PHONE
FROM ADDRESS FULL JOIN CUSTOMER
                    ON CUSTOMER.ADDRESS_ID=ADDRESS.ADDRESS_ID;


-- TASK 9 - How many employees are working in each region ?
--joins with five tables
SELECT R.REGION_NAME, COUNT(*)
FROM EMPLOYEES E
         JOIN DEPARTMENTS D ON E.DEPARTMENT_ID = D.DEPARTMENT_ID
         JOIN LOCATIONS L ON D.LOCATION_ID = L.LOCATION_ID
         JOIN COUNTRIES C ON L.COUNTRY_ID = C.COUNTRY_ID
         JOIN REGIONS R ON C.REGION_ID = R.REGION_ID
GROUP BY R.REGION_NAME
ORDER BY 1;



