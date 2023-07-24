package com.dairy.controller;
import java.util.List;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.dairy.dto.Response;
import com.dairy.model.MilkCollection;
import com.dairy.repository.MilkCollectionRepo;
import com.dairy.service.MilkCollectionService;

import ch.qos.logback.classic.Logger;
@Controller
public class MilkCollectionController  {
	

	
	@Autowired
	private MilkCollectionRepo milkCollectionRepo  ;
	
	@Autowired
	private MilkCollectionService milkCollectionService ;
	
//code-era
	
	
	  // Save Milk Collection Details
	  
	  @PostMapping("/saveMilkCollection")
	  @ResponseBody 
	  public Response saveMilkCollection(@RequestBody MilkCollection milkCollection) {
	  Response response= new Response(); 
	  response.setStatus("Not Success");
	  response.setMessage("Data Not Saved..!!");
	  
	  MilkCollection mc2 = milkCollectionService.save(milkCollection); 
	  if(mc2 !=null) { 
		  response.setStatus("Success"); 
		  response.setMessage("Data Saved..!!");
		  response.setData(mc2); 
		  } 
	  return response ; 
	  }
	  
	  //Retrieve Milk Collection Details By Id
	  
	  @GetMapping("/getMilkCollection") 
	  @ResponseBody 
	  public Response getMilkCollection(@RequestBody MilkCollection milkCollection) {
	  Response response = new Response(); 
	  response.setStatus("Not Success");
	  response.setMessage("Data Not Found");
	  
	  MilkCollection milkCollection2 =milkCollectionService.findgDateBetween(milkCollection.getfDate(),milkCollection.gettDate()); 
	  if(milkCollection2 != null) {
	  response.setStatus("Success"); 
	  response.setMessage("Data Found..!!");
	  response.setData(milkCollection2); 
	  } 
	  return response ; 
	  }
	  
	  //Retrieve All Date
	  
	  @GetMapping("/getAllMilkCollectionData")
	  @ResponseBody 
	  public List<MilkCollection> showmilk(){ 
		  return milkCollectionService.findAll(); }
	  
	  //Delete milk Collection By Id
	  
	  @PostMapping("/deleteMilkCollectionById")
	  @ResponseBody 
	  public ResponseEntity<String>deleteMilkCollectionById(@RequestBody MilkCollection milkCollection){
	  
	  int i = milkCollectionRepo.deleteByid(milkCollection.getId()); 
	  if (i>0) {
		  return ResponseEntity.ok("Data Deleted Successfully..!!"); 
	  } else 
		  return
	  ResponseEntity.badRequest().body("Data Not Deleted..!!");
	  }
	 

}
