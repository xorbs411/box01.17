create table dept_tcl0
as select * from dept;

select * from dept_tcl1;

--40�� �μ��� �ٹ����� JEJU�� ����
update  dept_tcl0 set loc='JEJU' where deptno =40;
--�μ����� 'RESEARCH'�� �μ� ����

rollback;

