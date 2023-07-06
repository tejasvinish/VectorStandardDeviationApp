package com.vector.demo.repository;

import java.util.Collection;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.vector.demo.model.Vector;

public interface VectorRepository extends JpaRepository<Vector, Integer> {

	@Query(value = "SELECT * FROM vector1 R WHERE R.vector_id IN :ids", nativeQuery = true)
	List<Vector> temp(@Param("ids") Collection<Integer> ids);
	
}
