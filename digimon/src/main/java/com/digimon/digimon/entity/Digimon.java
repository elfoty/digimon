package com.digimon.digimon.entity;

import com.digimon.digimon.entity.Digimon;

public class Digimon {

	String name;
	String img;
	String level;
	
	public Digimon(Digimon digimon) {
		this.name = digimon.getName();
		this.img = digimon.getImg();
		this.level = digimon.getLevel();
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setLevel(String level) {
		this.level = level;
	}
	
	public String getLevel() {
		return level;
	}
	
	public void setImg(String img) {
		this.img = img;
	}
	
	public String getImg() {
		return img;
	}
}
