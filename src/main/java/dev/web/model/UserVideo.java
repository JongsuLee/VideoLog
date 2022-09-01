package dev.web.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class UserVideo {
	
	@Id
	@Column(name = "NO")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long no;

	@Column(name = "USER_ID")
	private int userId;
	
	@Column(name = "VIDEO_ID")
	private int videoId;

	public UserVideo() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "UserVideo [no=" + no + ", userId=" + userId + ", videoId=" + videoId + "]";
	}

	public Long getNo() {
		return no;
	}

	public void setNo(Long no) {
		this.no = no;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public int getVideoId() {
		return videoId;
	}

	public void setVideoId(int videoId) {
		this.videoId = videoId;
	}

	public UserVideo(Long no, int userId, int videoId) {
		super();
		this.no = no;
		this.userId = userId;
		this.videoId = videoId;
	}

	
	
	
	

}
