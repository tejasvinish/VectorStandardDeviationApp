package com.vector.demo.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vector.demo.model.Vector;
import com.vector.demo.repository.VectorRepository;

@Service
public class VectorService implements IVectorService {

	@Autowired
	private VectorRepository vectorRepository;

	@Override
	public Optional<Vector> getVectorById(int id) {
		return vectorRepository.findById(id);
	}
	
	public List<Vector> findVectorByVectorId(Collection<Integer> vector_id) {
		// TODO Auto-generated method stub
		return vectorRepository.temp(vector_id);
	}	
}
