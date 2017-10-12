package sunspot.com.entity;

import javax.persistence.*;

@Entity
@Table(name = "userNotification")
public class UserNotification {

	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
    private Long id;
	
	@Column(name = "sender",nullable = false)
	private long sender;

	@Column(name = "receiver",nullable = false)
	private long receiver;
	
	@Column(name = "seenStatus",nullable = false)
	private int seenStatus;

	@Column(name = "msgDescription",nullable = false)
	private String msgDescription;

	@Column(name = "course",nullable = false)
	private String course;
	
	@Column(name = "approvalstatus",nullable = false)
	private int approvalstatus;
	
	@Column(name = "receiverName",nullable = false)
	private String receiverName;
	
	@Column(name = "senderName",nullable = false)
	private String senderName;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	
	public int getSeenStatus() {
		return seenStatus;
	}

	public void setSeenStatus(int seenStatus) {
		this.seenStatus = seenStatus;
	}

	public String getMsgDescription() {
		return msgDescription;
	}

	public void setMsgDescription(String msgDescription) {
		this.msgDescription = msgDescription;
	}

	public long getSender() {
		return sender;
	}

	public void setSender(long sender) {
		this.sender = sender;
	}

	public long getReceiver() {
		return receiver;
	}

	public void setReceiver(long receiver) {
		this.receiver = receiver;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getApprovalstatus() {
		return approvalstatus;
	}

	public void setApprovalstatus(int approvalstatus) {
		this.approvalstatus = approvalstatus;
	}

	public String getReceiverName() {
		return receiverName;
	}

	public void setReceiverName(String receiverName) {
		this.receiverName = receiverName;
	}

	public String getSenderName() {
		return senderName;
	}

	public void setSenderName(String senderName) {
		this.senderName = senderName;
	}

	
}