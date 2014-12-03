package com.split.event.classes;

import java.util.HashMap;
import java.util.Map;

public class LikeEvent {
	private String type;
	private String[] recipients; 
	private String[] likers; 
	private String commentID;
	private String commentTimeStamp;
	private String pollID;
	private String pollTimeStamp;
	
	public LikeEvent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public LikeEvent(String[] recipients, String[] likers, String commentID, String commentTimeStamp, String pollID,
			String pollTimeStamp) {
		super();
		this.type = "likeEvent";
		this.recipients = recipients;
		this.likers = likers;
		this.commentID = commentID;
		this.commentTimeStamp = commentTimeStamp;
		this.pollID = pollID;
		this.pollTimeStamp = pollTimeStamp;
	}


	
	public Map<String, String> turnIntoHashMapForRedis () {
		Map<String, String> myMap = new HashMap<String, String> ();
		myMap.put("type", this.getType());
		myMap.put("recipients", this.getRecipients()[0]);
		myMap.put("likers", this.getLikers()[0]);
		myMap.put("commentID", this.getCommentID());
		myMap.put("commentTimeStamp", this.getCommentTimeStamp());
		myMap.put("pollID", this.getPollID());
		myMap.put("pollTimeStamp", this.getPollTimeStamp());
		return myMap;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String[] getRecipients() {
		return recipients;
	}

	public void setRecipients(String[] recipients) {
		this.recipients = recipients;
	}

	public String[] getLikers() {
		return likers;
	}

	public void setLikers(String[] likers) {
		this.likers = likers;
	}

	public String getCommentID() {
		return commentID;
	}

	public void setCommentID(String commentID) {
		this.commentID = commentID;
	}

	public String getCommentTimeStamp() {
		return commentTimeStamp;
	}

	public void setCommentTimeStamp(String commentTimeStamp) {
		this.commentTimeStamp = commentTimeStamp;
	}

	public String getPollID() {
		return pollID;
	}

	public void setPollID(String pollID) {
		this.pollID = pollID;
	}

	public String getPollTimeStamp() {
		return pollTimeStamp;
	}

	public void setPollTimeStamp(String pollTimeStamp) {
		this.pollTimeStamp = pollTimeStamp;
	} 
	
	
	
	
	
	
}
