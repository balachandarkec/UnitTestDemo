package in.stack.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import in.stack.repository.SampleRepository;

public class SampleService {
	 private SampleRepository repo;
	 
	 public SampleService(SampleRepository r) {
		 this.repo=r;
	 }
	 
	 
	 public List<String> getFruits(){
		 try {
			 
			 return repo.getFruits().stream()                       
					 .filter((fruit)-> fruit.length()>6)
					 .collect(Collectors.toList());
		 
		 }catch(Exception e) {
			 return Arrays.asList(); 
		 }
		
	 }


}
