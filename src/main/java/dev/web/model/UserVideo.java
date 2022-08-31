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
	private String userId;
	
	@Column(name = "VIDEO_ID")
	private String videoId;

	public UserVideo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UserVideo(long no, String userId, String videoId) {
		super();
		this.no = no;
		this.userId = userId;
		this.videoId = videoId;
	}

	@Override
	public String toString() {
		return "UserVideo [no=" + no + ", userId=" + userId + ", videoId=" + videoId + "]";
	}

	public long getNo() {
		return no;
	}

	public void setNo(long no) {
		this.no = no;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getVideoId() {
		return videoId;
	}

	public void setVideoId(String videoId) {
		this.videoId = videoId;
	}
	
	
	
	

}
