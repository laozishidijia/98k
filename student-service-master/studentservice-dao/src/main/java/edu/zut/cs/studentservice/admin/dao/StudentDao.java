package edu.zut.cs.studentservice.admin.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;

import edu.zut.cs.studentservice.admin.domain.Student;
import edu.zut.cs.studentservice.base.dao.GenericDao;

public interface StudentDao extends GenericDao<Student,Long> {
@Query("select s from Student s where s.S_name =?1")
public List<Student> findByS_name(String S_name);
}
