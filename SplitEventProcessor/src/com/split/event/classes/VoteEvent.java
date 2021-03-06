package com.split.event.classes;

import java.util.HashMap;
import java.util.Map;

public class VoteEvent {
	private String type;
	private String[] recipients; 
	private String[] voters; 
	private String voteID; 
	private String voteTimeStamp; 
	private String pollID; 
	private String pollTimeStamp;
	
	public VoteEvent() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VoteEvent(String[] recipients, String[] voters, String voteID, String voteTimeStamp, String pollID, String pollTimeStamp) {
		super();
		this.type = "voteEvent";
		this.recipients = recipients;
		this.voters = voters;
		this.voteID = voteID;
		this.voteTimeStamp = voteTimeStamp;
		this.pollID = pollID;
		this.pollTimeStamp = pollTimeStamp;
	}

	public Map<String, String> turnIntoHashMapForRedis() {
		Map<String, String> myMap = new HashMap<String, String> ();
		myMap.put("type", this.getType());
		myMap.put("recipients", this.getRecipients()[0]);
		myMap.put("voters", this.getVoters()[0]);
		myMap.put("voteID", this.getVoteID());
		myMap.put("voteTimeStamp", this.getVoteTimeStamp());
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

	public String[] getVoters() {
		return voters;
	}

	public void setVoters(String[] voters) {
		this.voters = voters;
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


	public String getVoteTimeStamp() {
		return voteTimeStamp;
	}

	public void setVoteTimeStamp(String voteTimeStamp) {
		this.voteTimeStamp = voteTimeStamp;
	}

	public String getVoteID() {
		return voteID;
	}

	public void setVoteID(String voteID) {
		this.voteID = voteID;
	} 
	
}
