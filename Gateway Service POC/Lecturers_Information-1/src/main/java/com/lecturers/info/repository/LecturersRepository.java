package com.lecturers.info.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lecturers.info.lecturers.Lecturers;


@Repository
public interface LecturersRepository extends JpaRepository<Lecturers,Long> {

}
