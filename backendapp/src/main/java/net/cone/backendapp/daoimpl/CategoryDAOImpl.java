package net.cone.backendapp.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import net.cone.backendapp.config.ConnectionConfig;
import net.cone.backendapp.dao.CategoryDAO;
import net.cone.backendapp.dto.Category;
import net.cone.backendapp.dto.Categoria;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {

	private static List<Category> categories = new ArrayList<>(); 
	
	static {
		Category category = new Category();
		category.setId(1);
		category.setName("Television");
		category.setDescription("This is some description for television!");
		category.setImageURL("CAT_1.png");
		category.setActive(true);
		
		categories.add(category);
		
		category = new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("This is some description for mobile!");
		category.setImageURL("CAT_2.png");
		category.setActive(true);
		
		categories.add(category);
		
		category = new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("This is some description for laptop!");
		category.setImageURL("CAT_3.png");
		category.setActive(true);
		
		categories.add(category);
	}
	
	@Override
	public List<Categoria> list() {
		// TODO Auto-generated method stub
		JdbcTemplate jdbcTemplate = new JdbcTemplate(ConnectionConfig.getDataSource());
		List<Categoria> datos = jdbcTemplate.query("select * from categoria", new BeanPropertyRowMapper<Categoria>(Categoria.class));
		return datos;
	}

	@Override
	public Categoria get(int id) {
		/*for(Category category : categories){
			if(category.getId()==id)
				return category;
		}*/
		JdbcTemplate jdbcTemplate = new JdbcTemplate(ConnectionConfig.getDataSource());
		List<Categoria> datos = jdbcTemplate.query("select * from categoria", new BeanPropertyRowMapper<Categoria>(Categoria.class));
		for(Categoria cat : datos){
			if(cat.getId()==id)
				return cat;
		}
		return null;
	}

}
