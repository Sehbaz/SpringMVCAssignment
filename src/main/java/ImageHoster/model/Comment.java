package ImageHoster.model;

import java.util.Date;

public class Comment {
	private Integer id;
	private String text;
	private Date createdDate;
	private User user;
	private Image Image;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public Date getCreateDate() {
		return createdDate;
	}

	public void setCreateDate(Date createDate) {
		this.createdDate = createDate;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Image getImage() {
		return Image;
	}


	public Comment() {
	}

	public Comment(int id, String text, Date createdDate, User user, ImageHoster.model.Image image) {
		this.id = id;
		this.text = text;
		this.createdDate = createdDate;
		this.user = user;
		Image = image;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}


	public void setImage(ImageHoster.model.Image image) {
		Image = image;
	}
}
