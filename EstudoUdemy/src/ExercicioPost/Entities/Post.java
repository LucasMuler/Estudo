package ExercicioPost.Entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

	public static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
	
	private Date moment;
	private String title;
	private String postComent;
	private int likes;
	
	List<Comment> comments = new ArrayList<>();
	
	public Post() {
	}

	public Post(Date moment, String title, String postComent, int likes) {
		this.moment = moment;
		this.title = title;
		this.postComent = postComent;
		this.likes = likes;
	}

	public Date getMoment() {
		return moment;
	}

	public void setMoment(Date moment) {
		this.moment = moment;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPostComent() {
		return postComent;
	}

	public void setPostComent(String postComent) {
		this.postComent = postComent;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes += likes;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void addComment(Comment comment) {
		comments.add(comment);
	}
	
	public void removeComment(Comment comment) {
		comments.remove(comment);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(title + "\n");
		sb.append(likes);
		sb.append(" Likes - ");
		sb.append(sdf.format(moment) + "\n");
		sb.append("Comments: " + "\n");
		
		for (Comment comment : comments) {
			sb.append(comment).append("\n");
		}
		
		return sb.toString();
		
	}
	
}
