package com.Spring_Orm.dao;


import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.orm.hibernate5.HibernateTemplate;
import com.Spring_Orm.entity.Student;

@Repository
@Transactional(readOnly = false)
public class StudentDao {
	
	private HibernateTemplate hibernateTemplate;
	
	
//	to save student=
	@Transactional(readOnly = false)
	public int insert(Student st) {
		Integer i=(Integer) this.hibernateTemplate.save(st);
		return i;
	}


	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}


	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
}
