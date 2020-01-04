package net.cone.backendapp.dao;

import java.util.List;

import net.cone.backendapp.dto.Category;

public interface CategoryDAO {
	
	public List<Category> list();
	public Category get(int id);

}
