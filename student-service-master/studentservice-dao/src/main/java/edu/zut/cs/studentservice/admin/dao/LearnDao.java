package edu.zut.cs.studentservice.admin.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import edu.zut.cs.studentservice.admin.domain.Learn;
import edu.zut.cs.studentservice.admin.domain.Student;
import edu.zut.cs.studentservice.base.dao.GenericDao;

public interface LearnDao extends GenericDao<Learn,Long> {
	@Query("select s from Learn s where s.S_name =?1")
	public List<Learn> findByS_name(String S_name);
}
