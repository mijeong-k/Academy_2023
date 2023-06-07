
-- 조회
SELECT * FROM CLASS

SELECT * FROM tab

SELECT * FROM DEPARTMENT

SELECT * FROM PROFESSOR

SELECT * FROM TAKES

SELECT * FROM COURSE

SELECT * FROM EMP

SELECT * FROM DEPT

SELECT * FROM STUDENT


-- 중복제거
SELECT DISTINCT address
FROM STUDENT


-- 데이터 수정
UPDATE STUDENT 
SET YEAR = YEAR -1

UPDATE PROFESSOR 
SET POSITION = '교수', dept_id='923'
WHERE name = '고희석'

UPDATE PROFESSOR 
SET POSITION = '부교수', dept_id='920'
WHERE name = '고희석'

INSERT INTO PROFESSOR VALUES('92302','750728*2203569','김태석','923','교수',1999)


-- 데이터 삭제
DELETE FROM PROFESSOR
WHERE name='김태석'


-- 데이터 선택 조회
SELECT dept_name, office, department.DEPT_ID, student.DEPT_ID, 
stu_id, resident_id, name, YEAR, address
FROM DEPARTMENT, STUDENT
WHERE department.DEPT_ID =student.DEPT_ID 

SELECT name, dept_name
FROM DEPARTMENT, STUDENT
WHERE department.DEPT_ID =student.DEPT_ID 

SELECT name, year_emp, 2023-year_emp
FROM PROFESSOR

SELECT name, stu_id, DEPT_name
FROM STUDENT, DEPARTMENT
WHERE student.DEPT_ID = department.DEPT_ID

SELECT student.STU_ID 
FROM STUDENT, DEPARTMENT
WHERE student.DEPT_ID = department.DEPT_ID 
AND YEAR = 3 
AND dept_name = '컴퓨터공학과'


-- 정렬 : name으로 우선 정렬하고, 동명이인이 있을 경우 stu_id로 정렬
SELECT name, stu_id
FROM STUDENT
WHERE YEAR = 3 OR YEAR = 4
ORDER BY name, stu_id

SELECT name, stu_id
FROM STUDENT
WHERE YEAR = 3 OR YEAR = 4
ORDER BY name DESC, stu_id

-- 데이터 선택 조회
SELECT name, dept_name
FROM STUDENT s , DEPARTMENT d 
WHERE s.DEPT_ID = d.DEPT_ID 

SELECT address
FROM STUDENT
WHERE name='김광식'

SELECT name, address
FROM STUDENT
WHERE address='서울'

SELECT s2.name, s2.ADDRESS
FROM STUDENT s1, STUDENT s2
WHERE s1.ADDRESS = s2.ADDRESS
AND s1.name = '김광식'


-- 데이터 선택 조회 추가 & 필드명 수정
SELECT name 이름, POSITION 직위, 2023-year_emp 재직연수
FROM PROFESSOR


-- 연습
SELECT stu_id, dept_name
FROM (
SELECT *
FROM STUDENT s, DEPARTMENT d 
WHERE s.DEPT_ID = d.DEPT_ID
)
ORDER BY stu_id


-- 문자열 검색
SELECT *
FROM STUDENT
WHERE name LIKE '김%'

SELECT name, YEAR 
FROM STUDENT
WHERE resident_id LIKE '%*2%' 
OR resident_id LIKE '_______4%'


-- 합집합
SELECT name FROM STUDENT
UNION
SELECT name FROM PROFESSOR

SELECT dept_id FROM STUDENT
UNION all
SELECT dept_id FROM PROFESSOR


-- 교집합
SELECT s.stu_id
FROM STUDENT s , DEPARTMENT d , TAKES t 
WHERE s.DEPT_ID = d.DEPT_ID 
AND s.stu_id = t.STU_ID 
AND d.DEPT_ID  = '920'
AND grade = 'A+'

SELECT stu_id FROM STUDENT s , DEPARTMENT d 
WHERE s.DEPT_ID = d.DEPT_ID AND dept_name = '컴퓨터공학과'
INTERSECT 
SELECT stu_id FROM TAKES 
WHERE grade = 'A+'


-- 휴지통 정리
SELECT * FROM tab

purge recyclebin;


-- 차집합
SELECT s.STU_ID
FROM STUDENT s , DEPARTMENT d ,TAKES t 
WHERE s.DEPT_ID = d.DEPT_ID 
AND s.stu_id = t.STU_ID 
AND dept_name = '산업공학과'
AND grade != 'A+'

select stu_id from student s, department d
where s.dept_id = d.dept_id and dept_name='산업공학과'
minus
select stu_id from takes
where grade = 'A+'


-- 외부조인
SELECT title, credit, YEAR, semester
FROM course, CLASS
WHERE course.COURSE_ID = class.COURSE_ID 

-- 왼쪽 외부조인 case 1
SELECT title, credit, YEAR, semester
FROM COURSE LEFT OUTER JOIN CLASS
USING (COURSE_id)

-- 왼쪽 외부조인 case 2_오라클에서만 사용됨
SELECT title, credit, YEAR, semester
FROM course, CLASS
WHERE course.COURSE_ID = class.COURSE_ID (+)

-- 오른쪽 외부조인 case 1
SELECT title, credit, YEAR, semester
FROM COURSE RIGHT OUTER JOIN CLASS
USING (COURSE_id)

-- 오른쪽 외부조인 case 2_오라클에서만 사용됨
SELECT title, credit, YEAR, semester
FROM COURSE, CLASS
WHERE course.COURSE_ID (+) = class.COURSE_ID 

-- 완전 외부조인
SELECT title, credit, YEAR, semester
FROM course FULL OUTER JOIN CLASS
USING (COURSE_id)


-- 정렬 case 2
SELECT *
FROM EMP
ORDER BY sal DESC

SELECT *
FROM EMP
ORDER BY 6 DESC


-- count
SELECT COUNT(*)
FROM STUDENT
WHERE YEAR = 3

SELECT count(comm)
FROM emp

SELECT count(DISTINCT dept_id)
FROM STUDENT

SELECT count(d.dept_id)
FROM STUDENT s , DEPARTMENT d 
WHERE s.DEPT_ID = d.DEPT_ID 
AND d.DEPT_NAME = '컴퓨터공학과'

SELECT count(job)
FROM EMP
WHERE job = 'SALESMAN'

SELECT count(*)
FROM EMP
WHERE job like 'S%'

SELECT count(*)
FROM EMP
WHERE job like 'S%'
AND sal >= 1500

SELECT count(*)
FROM EMP
WHERE job like 'S%'
AND sal >= '1500'


-- sum
SELECT sum(2012-year_emp)
FROM PROFESSOR

SELECT name, year_emp, 2012-year_emp
FROM PROFESSOR

SELECT sum(SAL)
FROM EMP
WHERE job like 'S%'

SELECT sum(sal)
FROM EMP e , DEPT d 
WHERE e.DEPTNO = d.DEPTNO 
AND DNAME LIKE 'R%' 


-- AVG
SELECT AVG(2012-year_emp)
FROM PROFESSOR

SELECT DISTINCT job
FROM EMP

SELECT *
FROM EMP

SELECT avg(sal) 점원평균급여
FROM EMP
WHERE job like 'C%'

SELECT avg(sal) 영업직평균급여
FROM EMP
WHERE job like 'S%'

SELECT avg(sal) 매니저평균급여
FROM EMP
WHERE job like 'M%'

SELECT avg(sal) 분석가평균급여
FROM EMP
WHERE job like 'A%' 

SELECT avg(sal) 사장평균급여
FROM EMP
WHERE job like 'P%'


-- MAX()
SELECT max(SAL), avg(SAL), min(SAL)
FROM EMP e , DEPT d 
WHERE e.DEPTNO = d.DEPTNO 
AND dname LIKE 'A%'


-- GROUP BY 
SELECT ename, max(sal)
FROM emp

SELECT dept_id, COUNT(*)
FROM STUDENT
GROUP BY DEPT_ID 

SELECT dept_id
FROM STUDENT

SELECT *
FROM emp

SELECT dept_name, count(*)
FROM STUDENT s , DEPARTMENT d 
WHERE s.DEPT_ID = d.DEPT_ID 
GROUP BY dept_name

SELECT dname, count(*), avg(sal), max(sal), min(sal)
FROM EMP e , DEPT d 
WHERE e.DEPTNO = d.DEPTNO 
GROUP BY dname
ORDER BY dname

SELECT job, count(*), AVG(sal)
FROM EMP
GROUP BY job

SELECT dept_name, count(*), avg(2012-year_emp) 평균재직연수, max(2012-year_emp) 최대재직연수
FROM PROFESSOR p , DEPARTMENT d 
WHERE p.DEPT_ID = d.DEPT_ID 
GROUP BY dept_name

SELECT dept_name, count(*), avg(2012-year_emp), max(2012-year_emp)
FROM PROFESSOR p , DEPARTMENT d
WHERE p.DEPT_ID = d.DEPT_ID 
AND avg(2012-year_emp) >=10
GROUP BY dept_name

-- Having
SELECT dept_name, count(*), avg(2012-year_emp), max(2012-year_emp)
FROM PROFESSOR p , DEPARTMENT d
WHERE p.DEPT_ID = d.DEPT_ID 
GROUP BY dept_name
HAVING avg(2012-year_emp) >=10

SELECT dname, count(*), avg(sal), max(sal), min(sal)
FROM EMP e , DEPT d 
WHERE e.DEPTNO = d.DEPTNO 
GROUP BY dname
HAVING count(*)>=5


-- null 처리
SELECT *
FROM EMP
WHERE comm IS null

SELECT *
FROM EMP
WHERE comm IS NOT null

SELECT stu_id
FROM TAKES
WHERE grade != 'A+'

SELECT count(*)
FROM TAKES
WHERE grade <> 'A+'

SELECT *
FROM EMP
WHERE comm = 1400

SELECT *
FROM EMP
WHERE comm <> 1400

SELECT count(comm)
FROM EMP
WHERE comm IS NULL

SELECT title
FROM CLASS, COURSE
WHERE class.COURSE_ID = course.COURSE_ID  
AND CLASSROOM = '301호'

SELECT title
FROM COURSE
WHERE COURSE_ID IN (
	SELECT COURSE_ID
	FROM CLASS
	WHERE classroom = '301호'
)

SELECT title
FROM CLASS c1, COURSE c2
WHERE c1.COURSE_ID = c2.COURSE_ID 
AND YEAR = '2012'
AND SEMESTER != 2

SELECT title
FROM COURSE
WHERE COURSE_ID NOT IN (
	SELECT COURSE_ID 
	FROM CLASS
	WHERE YEAR = '2012'
	AND semester = 2
)

CREATE OR REPLACE VIEW v_takes AS
SELECT stu_id , class_id
FROM takes

SELECT *
FROM V_TAKES 


