package com.globant.bootcamp.domain;

public class Day {
	
	private String name;
	private double thermalSensation;
	private Wind wind;
	private Atmosphere atmosphere;
	private double temperature;
	
	public Day(){
		this.setName(null);
		this.setThermalSensation(0);
		this.setWind(null);
		this.setAtmosphere(null);
		this.setTemperature(0);
	}

	public Day(String n, double ts, Wind w, Atmosphere a, double t){
		this.setName(n);
		this.setThermalSensation(ts);
		this.setWind(w);
		this.setAtmosphere(a);
		this.setTemperature(t);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getThermalSensation() {
		return thermalSensation;
	}

	public void setThermalSensation(double thermalSensation) {
		this.thermalSensation = thermalSensation;
	}

	public Wind getWind() {
		return wind;
	}

	public void setWind(Wind wind) {
		this.wind = wind;
	}

	public Atmosphere getAtmosphere() {
		return atmosphere;
	}

	public void setAtmosphere(Atmosphere atmosphere) {
		this.atmosphere = atmosphere;
	}

	public double getTemperature() {
		return temperature;
	}

	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}
	
	

}
