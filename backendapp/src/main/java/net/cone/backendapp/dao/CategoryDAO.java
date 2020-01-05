package net.cone.backendapp.dao;

import java.util.List;

import net.cone.backendapp.dto.Category;
import net.cone.backendapp.dto.Categoria;

public interface CategoryDAO {
	
	public List<Categoria> list();
	public Categoria get(int id);

}
