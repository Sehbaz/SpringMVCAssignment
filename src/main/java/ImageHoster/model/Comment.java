package ImageHoster.model;

import javax.persistence.*;

import java.util.Date;

@Entity
@Table(name = "comments")
public class Comment {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="id")
	private Integer id;

	@Column(name = "text", columnDefinition = "TEXT")
	private String text;

	@Column(name = "createdDate")
	private Date createdDate;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "users_id")
	private User user;

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "images_id")
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
