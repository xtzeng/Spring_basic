package com.xt.dao.impl;

import java.util.List;
import java.util.Map;
import java.util.Set;

import com.xt.dao.UserDAO;
import com.xt.model.User;

public class UserDAOImpl implements UserDAO{

	private Set<String> sets;
	private List<String> lists;
	private Map<String , String> maps;
	
	

	public Set<String> getSets() {
		return sets;
	}



	public void setSets(Set<String> sets) {
		this.sets = sets;
	}



	public List<String> getLists() {
		return lists;
	}



	public void setLists(List<String> lists) {
		this.lists = lists;
	}



	public Map<String, String> getMaps() {
		return maps;
	}



	public void setMaps(Map<String, String> maps) {
		this.maps = maps;
	}



	@Override
	public String toString() {
		return "sets size:" + sets.size() + "| lists size:" + lists.size() + "| maps size:" + maps.size() ; 
	}



	@Override
	public void save(User u) {
		System.out.println("user saved!");
		
	}

	
	
}
