SELECT*from emp;
--dept 테이블읭 모든 데이터 확인하기 
SELECT* FROM dept;

select dname,loc from dept;
--emp테이블에서 사원의 번호, 사원이름, 직급을 출력하세요
select empno as "EmployeeNumber",ename "사원 이름",job 직급  from emp e;

--직급 출력
select job from emp;
--회사내 직급 종류별로 출력(중복x)
select distinct job, deptno from emp;
--사원중 10번 부서 직원의 정보를 출력하세요.
select * from emp where deptno = 10;
--사원 중 에서 급여가 2000미만이 되는 사원의 이름, 급여를 출력하세요
select empno, ename, sal from emp where sal<2000;
--사원 중 이름이 'scott'인 사람의 정보 출력
select * from emp where ename ='SCOTT';
-- 82년 이후에 입사한 사원의 이름과 입사일 출력
select ename, hiredate from emp where hiredate>='82/01/01';
-- 사원의 사원번호, 이름, 급여를 사원번호 순서대로 출력하세요
select empno, ename, sal from emp order by empno;
-- 사원의 사원번호, 이름, 급여를 급여가 높은 순서대로 출력하세요
select empno, ename, sal from emp order by sal desc;

-- 사원의 사원번호, 이름, 부서번호를 부서번호대로, 사원번호 순서대로 정렬하세요.
select empno, ename, deptno from emp order by deptno asc, empno asc;
-- 사원의 사원번호, 이름, 부서번호를 부서번호를 내림차순으로, 사원번호 오름차순으로 정렬하세요.
select empno, ename, deptno from emp order by deptno desc, empno asc;

--입사일이 가장 최근인 사원 순으로 사원번호, 이름, 입사일 출력
select empno, ename, hiredate hire from emp order by hire desc;

-- 부서번호가 10번이고 직급이 MANAGER인 사원의 이름과 부서번호, 직급 출력
select ename, deptno, job  from emp  where deptno =10 and job= 'MANAGER';
-- 부서번호가 10번이거나 직급이 MANAGER인 사원 이름과 부서번호, 직급출력
select ename, deptno, job  from emp  where deptno =10 or job= 'MANAGER';
-- 사원번호가 7844번이거나 7654이거나 7521인 사원의 사원번호와 이름 출력

--급여가 1000에서 3000사이에 있는 사원의 이름과 급여 출력
select ename, sal from emp where sal >=1000 and sal <=3000 order by sal;

select empno, ename from emp where empno in(7844,7654,7521);

select ename, sal from emp where sal between 1000 and 3000;

--1981년도에 입사한 사원의 이름, 입사일을  입사일 순으로 정렬해서 출력하세요.
select ename, hiredate 
from emp 
where hiredate between '1981/01/01'and '1981/12/31'
order by hiredate;

--이름이 k로 시작하는 사원의 사번, 이름
select empno, ename from emp where ename like 'K%';
--이름이 N로 끝나는 사원의 사번, 이름
select empno, ename from emp where ename like '%N';
--이름이 S가 들어가는 사원의 사번, 이름
select empno, ename from emp where ename like '%S%';
--이름이 A로 없는 사원의 사번, 이름
select empno, ename from emp where  not ename like '%A%';

select empno, ename from emp where ename like 'SCOTT';-- 와일드카드x =(같다)

select 100+null from dual; --null
-- 커미션을 받지 않는 사원의 사원번호, 이름, 커미션, 부서번호 출력
select empno, ename, comm, deptno from emp where  comm is null;

--직속 상사가 없는 사원의 이름과 직급,상사번호 출력
select ename, job, mgr from emp where mgr is null;
-- 10번 부서 사원들의 사원번호, 이름, 급여, 부서번호 출력
select empno,ename,sal, deptno  from emp where deptno=10
union--합집합
select empno,ename,sal, deptno from emp where deptno=10;
-- 20번 부서 사원들의 사원번호, 이름, 급여, 부서번호 출력

select empno,ename,sal, deptno  from emp
minus-- 차집합
select empno,ename,sal, deptno  from emp where deptno=30;

select empno,ename,sal, deptno  from emp
intersect--교집합
select empno,ename,sal, deptno  from emp where deptno=30;

/*1.  사원 이름이 S로 끝나는 사원 데이터를 모두 출력하세요
2. 30번 부서에서 근무하고 있는 사원중에 직책이 SALESMAN인 사원의 
번호, 이름, 직책, 급여, 부서번호를 출력하세요
3. 20번, 30번 부서에서 근무하고 있는 사원 중 급여가 2000초과인 사원의 
번호, 이름, 급여 부서번호 출력하세요.
 -1 . 집합 연산자 사용
 -2 . 집합 연산자 사용X	
4.  급여가 2000이상 3000이하의 범위 이하의 값을 가진 사원 데이터를 모두 출력하세요
5. 사원 이름에 E가 포함되어 있는 30번 부서 사원 중 급여가 1000~2000 사이가
아닌 사원의 번호, 이름, 급여, 부서번호를 출력하세요
6. 커미션이 존재하지 않고 상급자가 있고 직책이 'MANAGER','CLERK'인
사원의 정보를 모두 출력하세요.*/


select * from emp where ename like '%s';
select empno, ename, job, sal, deptno from emp where deptno=30 and job='SALESMAN';
select empno, ename, sal, deptno from emp where   deptno in(20,30); and sal> 2000;
select * from emp where sal NOT  between 2000 and 3000;
select * from emp where ename like '%E%' and deptno= 30 and sal not between 1000 and 2000;
select * from emp where comm is null and  mgr is not null and job in('MANAGER','CLERK');

select 'DataBase', LOWER('DataBase') from dual;
--사원 테이블에서 부서번호가 10번인 사원명을 모두 소문자로 변환
select ename,LOWER(ename)
from emp where deptno=10;

select 'DataBase', UPPER('DataBase') from dual;

--직급이 'manager'인 사원을 검색
select ename, job from emp where UPPER(job)=UPPER('manager');

select INITCAP('DATA BASE PROGRAM') from dual;

--이름이 'Smith'인 사람의 정보 출력
select * from emp where INITCAP(ename)= 'Smith';
select * from emp where ename= UPPER('Smith');

--이름에 a가 있는 사원의 정보 출력
select * from emp where ename like UPPER('%a%');

select concat('Data','Base') from dual;
select 'Data'||'Base' from dual;
select ename||'의 사원번호는 '|| empno||'입니다.' from emp;

select length('data'), length('데이터') from dual;
select 'DataBase', substr('DataBase',1,4), substr('DataBase',5),
substr('DataBase',-1,1), substr('DataBase', -4,4) from dual;

select ename, hiredate , substr(hiredate, 1,2) year from emp where substr(hiredate,1,2) =81;

--이름이 K로 끝나는 직원의 정보 출력(like 쓰지 말고 substr사용)

select * from emp where substr(ename,-1,1)='K';
select instr('DataBase', 'a'),instr('DataBase', 'a',3), instr('DataBase', 'z') from dual;

--이름의 두번째 자리에 'A'가 있는 사원의 이름 출력
select ename from emp where instr(ename,'A',2) = 2; 

select '010-1111-2222', replace('010-1111-2222','-',' '),
replace('010-1111-2222','-')
from dual;




















