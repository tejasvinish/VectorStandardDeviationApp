package com.vector.demo.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import com.vector.demo.model.Vector;

public interface IVectorService {
	
	Optional<Vector> getVectorById(int id);

	List<Vector> findVectorByVectorId(Collection<Integer> vector_id);
	
}
