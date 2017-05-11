package gr.haec.model;

// Post DTO
public class Post {

	// Constants
	public static final int INVALID_ID = -1;

	// Attributes
	private int id;
	private String postTitle;
	private int postAuthorId;
	private String postContent;
	
	// Constructor
	public Post() {
		this.id = INVALID_ID;
		this.postAuthorId = INVALID_ID;
		this.postTitle = "";
		this.postContent = "";
	}

	// Properties
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getPostTitle() {
		return postTitle;
	}

	public void setPostTitle(String postTitle) {
		this.postTitle = postTitle;
	}

	public int getPostAuthorId() {
		return postAuthorId;
	}

	public void setPostAuthorId(int postAuthorId) {
		this.postAuthorId = postAuthorId;
	}

	public String getPostContent() {
		return postContent;
	}

	public void setPostContent(String postContent) {
		this.postContent = postContent;
	}
	

	public String toString() {
		return "Post[id =  " + id + ", Post Author = " + postAuthorId + ", Post Title = " + postTitle + "]";
	}

}
