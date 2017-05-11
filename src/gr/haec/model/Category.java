package gr.haec.model;

public class Category extends Term implements LimitedCategory {
	public String toString() {
		return "Category[id =  " + id + ", Category Name = " + termName + ", Category Slug = " + termSlug
				+ ", Category Group = " + termGroup + "]";
	}
}
