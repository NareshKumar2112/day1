package com.example.StudentExample.Services;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.data.mapping.PersistentEntity;
import org.springframework.stereotype.Service;

import com.example.StudentExample.Entity.StudentEntity;
import com.example.StudentExample.Repository.StudentRepo;
@Service
public class StudentService 
{
	@Autowired(required=true)
	StudentRepo stRepo;
	
	public StudentEntity saveDetails(StudentEntity e)
	{
		return stRepo.save(e);
	}

}
