package com.vector.demo.controller;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.vector.demo.model.Vector;
import com.vector.demo.service.VectorService;

@Controller
public class VectorController {
	
	@Autowired
	private VectorService vectorService;	

	@RequestMapping(value = "/list-vector", method = RequestMethod.POST)
	public String showVectorPage(@RequestParam int id, ModelMap model) {
		Vector vector = vectorService.getVectorById(id).get();
		model.put("vector", vector);
		return "vector";
	}	

	@RequestMapping(value = "/vectorByVectorId", method = RequestMethod.POST)
	public String findVectorByVectorId(@RequestParam Collection<Integer> vector_id, ModelMap model) 
	{ 
		
		double sum = 0.0;
	    double standardDeviation = 0.0;
	    double mean = 0.0;
	    double res = 0.0;
	    double sq = 0.0;
	    
		List<Vector> vectorNumList=vectorService.findVectorByVectorId(vector_id);
		System.out.println(vectorNumList);		
		
		vectorNumList.stream().map(n->n.getVector_num()).forEach(System.out::println);
		
		Object[] objArray = vectorNumList.stream().map(n->n.getVector_num()).toArray();
	      int length = objArray.length;
	      int intArray[] = new int[length];
	      for(int i=0; i<length; i++){
	         intArray[i] = (int) objArray[i];
	      }
       
		int n = intArray.length;
		
		for (int i = 0; i <n; i++) {
            sum = sum + intArray[i];
        }
       
        mean = sum / (n);
 
        for (int i = 0; i < n; i++) {           
            standardDeviation= standardDeviation + Math.pow((intArray[i] - mean), 2);           
        }
       
        sq = standardDeviation / n;
        res = Math.sqrt(sq);
 
        System.out.println("Mean : "+mean);
        System.out.format("Standard Deviation = %.6f", res);
        
		model.put("standarddeviation", res);
		model.put("mean", mean);
		return "vectorNumList"; 
	  }
}
