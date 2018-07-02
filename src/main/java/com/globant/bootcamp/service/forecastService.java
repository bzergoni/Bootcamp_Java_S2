package com.globant.bootcamp.service;

import java.util.*;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
//import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
//import javax.ws.rs.ext.Provider;

import com.globant.bootcamp.domain.*;

//import org.springframework.context.ApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;


@Component
@Path("/forecast")
@Produces("application/json")
@Consumes("application/json")
public class forecastService{
	
	ArrayList<Day> days;
	
	public forecastService() {
        this.init();
    }
	
	private void init() {
		
		//ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
		
		days = new ArrayList<Day>();
		
		Wind wind = new Wind(30,40,50);
		//Location location = new Location("Cordoba","Argentina","Cordoba");
		Atmosphere atmosphere = new Atmosphere(30,30,30); 
		Day day = new Day("Lunes", 20, wind, atmosphere, 20);
		
		days.add(day);
		
	}

	@GET
	@Path("/Lunes/")
	//@Produces("text/plain")
	//public Day day(@PathParam("{day}") String day ){
	public Day day(){
		Day dia = days.get(0); 
		return dia;
	} 
}