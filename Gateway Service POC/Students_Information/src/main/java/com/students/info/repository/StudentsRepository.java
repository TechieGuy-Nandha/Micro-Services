package com.students.info.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.students.info.sthudent.Students;
@Repository
public interface StudentsRepository extends JpaRepository<Students,Long>{

}
