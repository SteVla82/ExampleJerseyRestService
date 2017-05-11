package gr.haec.rest;

import java.sql.SQLException;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

import gr.haec.db.DAOFactory;
import gr.haec.model.Tag;

@Path("tags")
public class TagResource {

	@GET
	public List<Tag> allCategories() throws ClassNotFoundException, SQLException {
		return DAOFactory.getInstance().getTagDao().getAll();
	}
	
	@GET
	@Path("{id}")
	public Tag Tag(@PathParam("id") int id) throws ClassNotFoundException, SQLException {
		return DAOFactory.getInstance().getTagDao().get(id);
	}
}
