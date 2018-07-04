package com.springframework.entities;

import org.springframework.data.annotation.Id;

public class Weather {
	@Id
	private String id;
	private String outlook;
	private String temperature;
	private String humidity;
	private String windy;
	private String play;
	
	public Weather() {
		
	}

	public String getOutlook() {
		return outlook;
	}
	public void setOutlook(String outlook) {
		this.outlook = outlook;
	}
	public String getTemperature() {
		return temperature;
	}
	public void setTemperature(String temperature) {
		this.temperature = temperature;
	}
	public String getHumidity() {
		return humidity;
	}
	public void setHumidity(String humidity) {
		this.humidity = humidity;
	}
	public String getWindy() {
		return windy;
	}
	public void setWindy(String windy) {
		this.windy = windy;
	}
	public String getPlay() {
		return play;
	}
	public void setPlay(String play) {
		this.play = play;
	}

	public String toString() {
		return "[Outlook: " + this.outlook +
				" temperature: " + this.temperature +
				" humidity: " + this.humidity +
				" windy: " + this.windy + 
				" play: " + this.play +
		        "]";
	}
}
