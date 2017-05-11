package gr.haec.rest;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import gr.haec.db.DAOFactory;
import gr.haec.model.Category;
import gr.haec.model.LimitedCategory;

@Path("categories")
public class CategoryResource {

	@GET
	public List<LimitedCategory> allCategories() throws ClassNotFoundException, SQLException {
		List<Category> categories = DAOFactory.getInstance().getCategoryDao().getAll();
		List<LimitedCategory> limitedCategories = new ArrayList<LimitedCategory>();
		limitedCategories.addAll(categories);
		return limitedCategories;
	}
	
	@GET
	@Path("{id}")
	public LimitedCategory category(@PathParam("id") int id) throws ClassNotFoundException, SQLException {
		return DAOFactory.getInstance().getCategoryDao().get(id);
	}
}
