SELECT*from emp;
--dept ���̺�� ��� ������ Ȯ���ϱ� 
SELECT* FROM dept;

select dname,loc from dept;
--emp���̺��� ����� ��ȣ, ����̸�, ������ ����ϼ���
select empno as "EmployeeNumber",ename "��� �̸�",job ����  from emp e;

--���� ���
select job from emp;
--ȸ�系 ���� �������� ���(�ߺ�x)
select distinct job, deptno from emp;
--����� 10�� �μ� ������ ������ ����ϼ���.
select * from emp where deptno = 10;
--��� �� ���� �޿��� 2000�̸��� �Ǵ� ����� �̸�, �޿��� ����ϼ���
select empno, ename, sal from emp where sal<2000;
--��� �� �̸��� 'scott'�� ����� ���� ���
select * from emp where ename ='SCOTT';
-- 82�� ���Ŀ� �Ի��� ����� �̸��� �Ի��� ���
select ename, hiredate from emp where hiredate>='82/01/01';
-- ����� �����ȣ, �̸�, �޿��� �����ȣ ������� ����ϼ���
select empno, ename, sal from emp order by empno;
-- ����� �����ȣ, �̸�, �޿��� �޿��� ���� ������� ����ϼ���
select empno, ename, sal from emp order by sal desc;

-- ����� �����ȣ, �̸�, �μ���ȣ�� �μ���ȣ���, �����ȣ ������� �����ϼ���.
select empno, ename, deptno from emp order by deptno asc, empno asc;
-- ����� �����ȣ, �̸�, �μ���ȣ�� �μ���ȣ�� ������������, �����ȣ ������������ �����ϼ���.
select empno, ename, deptno from emp order by deptno desc, empno asc;

--�Ի����� ���� �ֱ��� ��� ������ �����ȣ, �̸�, �Ի��� ���
select empno, ename, hiredate hire from emp order by hire desc;

-- �μ���ȣ�� 10���̰� ������ MANAGER�� ����� �̸��� �μ���ȣ, ���� ���
select ename, deptno, job  from emp  where deptno =10 and job= 'MANAGER';
-- �μ���ȣ�� 10���̰ų� ������ MANAGER�� ��� �̸��� �μ���ȣ, �������
select ename, deptno, job  from emp  where deptno =10 or job= 'MANAGER';
-- �����ȣ�� 7844���̰ų� 7654�̰ų� 7521�� ����� �����ȣ�� �̸� ���

--�޿��� 1000���� 3000���̿� �ִ� ����� �̸��� �޿� ���
select ename, sal from emp where sal >=1000 and sal <=3000 order by sal;

select empno, ename from emp where empno in(7844,7654,7521);

select ename, sal from emp where sal between 1000 and 3000;

--1981�⵵�� �Ի��� ����� �̸�, �Ի�����  �Ի��� ������ �����ؼ� ����ϼ���.
select ename, hiredate 
from emp 
where hiredate between '1981/01/01'and '1981/12/31'
order by hiredate;

--�̸��� k�� �����ϴ� ����� ���, �̸�
select empno, ename from emp where ename like 'K%';
--�̸��� N�� ������ ����� ���, �̸�
select empno, ename from emp where ename like '%N';
--�̸��� S�� ���� ����� ���, �̸�
select empno, ename from emp where ename like '%S%';
--�̸��� A�� ���� ����� ���, �̸�
select empno, ename from emp where  not ename like '%A%';

select empno, ename from emp where ename like 'SCOTT';-- ���ϵ�ī��x =(����)

select 100+null from dual; --null
-- Ŀ�̼��� ���� �ʴ� ����� �����ȣ, �̸�, Ŀ�̼�, �μ���ȣ ���
select empno, ename, comm, deptno from emp where  comm is null;

--���� ��簡 ���� ����� �̸��� ����,����ȣ ���
select ename, job, mgr from emp where mgr is null;
-- 10�� �μ� ������� �����ȣ, �̸�, �޿�, �μ���ȣ ���
select empno,ename,sal, deptno  from emp where deptno=10
union--������
select empno,ename,sal, deptno from emp where deptno=10;
-- 20�� �μ� ������� �����ȣ, �̸�, �޿�, �μ���ȣ ���

select empno,ename,sal, deptno  from emp
minus-- ������
select empno,ename,sal, deptno  from emp where deptno=30;

select empno,ename,sal, deptno  from emp
intersect--������
select empno,ename,sal, deptno  from emp where deptno=30;

/*1.  ��� �̸��� S�� ������ ��� �����͸� ��� ����ϼ���
2. 30�� �μ����� �ٹ��ϰ� �ִ� ����߿� ��å�� SALESMAN�� ����� 
��ȣ, �̸�, ��å, �޿�, �μ���ȣ�� ����ϼ���
3. 20��, 30�� �μ����� �ٹ��ϰ� �ִ� ��� �� �޿��� 2000�ʰ��� ����� 
��ȣ, �̸�, �޿� �μ���ȣ ����ϼ���.
 -1 . ���� ������ ���
 -2 . ���� ������ ���X	
4.  �޿��� 2000�̻� 3000������ ���� ������ ���� ���� ��� �����͸� ��� ����ϼ���
5. ��� �̸��� E�� ���ԵǾ� �ִ� 30�� �μ� ��� �� �޿��� 1000~2000 ���̰�
�ƴ� ����� ��ȣ, �̸�, �޿�, �μ���ȣ�� ����ϼ���
6. Ŀ�̼��� �������� �ʰ� ����ڰ� �ְ� ��å�� 'MANAGER','CLERK'��
����� ������ ��� ����ϼ���.*/


select * from emp where ename like '%s';
select empno, ename, job, sal, deptno from emp where deptno=30 and job='SALESMAN';
select empno, ename, sal, deptno from emp where   deptno in(20,30); and sal> 2000;
select * from emp where sal NOT  between 2000 and 3000;
select * from emp where ename like '%E%' and deptno= 30 and sal not between 1000 and 2000;
select * from emp where comm is null and  mgr is not null and job in('MANAGER','CLERK');

select 'DataBase', LOWER('DataBase') from dual;
--��� ���̺��� �μ���ȣ�� 10���� ������� ��� �ҹ��ڷ� ��ȯ
select ename,LOWER(ename)
from emp where deptno=10;

select 'DataBase', UPPER('DataBase') from dual;

--������ 'manager'�� ����� �˻�
select ename, job from emp where UPPER(job)=UPPER('manager');

select INITCAP('DATA BASE PROGRAM') from dual;

--�̸��� 'Smith'�� ����� ���� ���
select * from emp where INITCAP(ename)= 'Smith';
select * from emp where ename= UPPER('Smith');

--�̸��� a�� �ִ� ����� ���� ���
select * from emp where ename like UPPER('%a%');

select concat('Data','Base') from dual;
select 'Data'||'Base' from dual;
select ename||'�� �����ȣ�� '|| empno||'�Դϴ�.' from emp;

select length('data'), length('������') from dual;
select 'DataBase', substr('DataBase',1,4), substr('DataBase',5),
substr('DataBase',-1,1), substr('DataBase', -4,4) from dual;

select ename, hiredate , substr(hiredate, 1,2) year from emp where substr(hiredate,1,2) =81;

--�̸��� K�� ������ ������ ���� ���(like ���� ���� substr���)

select * from emp where substr(ename,-1,1)='K';
select instr('DataBase', 'a'),instr('DataBase', 'a',3), instr('DataBase', 'z') from dual;

--�̸��� �ι�° �ڸ��� 'A'�� �ִ� ����� �̸� ���
select ename from emp where instr(ename,'A',2) = 2; 

select '010-1111-2222', replace('010-1111-2222','-',' '),
replace('010-1111-2222','-')
from dual;




















