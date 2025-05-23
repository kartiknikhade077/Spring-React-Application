package com.smart.entity;

import java.util.Arrays;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Transient;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cId;
	private String Name;
	private String secondName;
	private String work;
	private String email;
	private String phone;
	private String image;
	@Column(length = 5000)
	private String description;
	private String department;
	private String shiftTime;
	private String Gender;
	private String Hiredate;
	private byte emailAccess = 0;
	private byte integrationAccess = 0;
	private byte trackingAccess = 0;
	private byte leadDashboardAccess=0;
	private byte taskDashboardAccess=0;
	private byte customDashboardAccess=0;
	private byte pipelineAccess=0;
	private String planName;
	private String planPrice;
	@Column(columnDefinition = "MEDIUMBLOB")
	private byte[] images;
	private String timeZone;
	@Transient
	private String base64Content;

	private String leaveDate;
	private String disableDate;
	private String enableDate;
	private boolean status;
	private byte basicInfo=1;
	
	@Column(columnDefinition = "MEDIUMBLOB")
	private byte[] signImage;
	private String groupChatList;
    // existing getters and setters...

	// existing getters and setters...
	
	private byte favouriteFilter = 1; // Default as "Assigned Target"
	
	private byte accessAcordingShiftTime=0;
    
	private String emailServiceLimit;
	
	private byte AddProductAccess;
	
	private byte EmailForwardAccess=0;
	
	public byte getFavouriteFilter() {
		return favouriteFilter;
	}

	public void setFavouriteFilter(byte favouriteFilter) {
		this.favouriteFilter = favouriteFilter;
	}

	public String getBase64Content() {
		return base64Content;
	}

	public String getGroupChatList() {
		return groupChatList;
	}

	public void setGroupChatList(String groupChatList) {
		this.groupChatList = groupChatList;
	}

	

	public void setBase64Content(String base64Content) {
		this.base64Content = base64Content;
	}

	public byte getCustomDashboardAccess() {
		return customDashboardAccess;
	}

	public void setCustomDashboardAccess(byte customDashboardAccess) {
		this.customDashboardAccess = customDashboardAccess;
	}




	@ManyToOne
	private User user;

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	/*
	 * @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY,mappedBy =
	 * "user") private List<Employee> contact=new ArrayList<>();
	 */

	
	
	public String getTimeZone() {
		return timeZone;
	}


	public byte getLeadDashboardAccess() {
		return leadDashboardAccess;
	}

	public void setLeadDashboardAccess(byte leadDashboardAccess) {
		this.leadDashboardAccess = leadDashboardAccess;
	}

	public byte getTaskDashboardAccess() {
		return taskDashboardAccess;
	}

	public void setTaskDashboardAccess(byte taskDashboardAccess) {
		this.taskDashboardAccess = taskDashboardAccess;
	}

	public byte getPipelineAccess() {
		return pipelineAccess;
	}


	public void setPipelineAccess(byte pipelineAccess) {
		this.pipelineAccess = pipelineAccess;
	}

	

	public String getPlanName() {
		return planName;
	}

	public void setPlanName(String planName) {
		this.planName = planName;
	}

	public String getPlanPrice() {
		return planPrice;
	}

	public void setPlanPrice(String planPrice) {
		this.planPrice = planPrice;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public String getShiftTime() {
		return shiftTime;
	}

	public void setShiftTime(String shiftTime) {
		this.shiftTime = shiftTime;
	}

	public String getGender() {
		return Gender;
	}

	public void setGender(String gender) {
		Gender = gender;
	}

	public String getHiredate() {
		return Hiredate;
	}

	public void setHiredate(String hiredate) {
		Hiredate = hiredate;
	}

	/*
	 * public List<Employee> getContact() { return contact; } public void
	 * setContact(List<Employee> contact) { this.contact = contact; }
	 */
	public byte[] getImages() {
		return images;
	}

	public void setImages(byte[] images) {
		this.images = images;
	}

	public byte getEmailAccess() {
		return emailAccess;
	}

	public void setEmailAccess(byte emailAccess) {
		this.emailAccess = emailAccess;
	}

	public byte getIntegrationAccess() {
		return integrationAccess;
	}

	public void setIntegrationAccess(byte integrationAccess) {
		this.integrationAccess = integrationAccess;
	}

	public byte getTrackingAccess() {
		return trackingAccess;
	}

	public void setTrackingAccess(byte trackingAccess) {
		this.trackingAccess = trackingAccess;
	}

	public String getLeaveDate() {
		return leaveDate;
	}

	public void setLeaveDate(String leaveDate) {
		this.leaveDate = leaveDate;
	}

	public String getDisableDate() {
		return disableDate;
	}

	public void setDisableDate(String disableDate) {
		this.disableDate = disableDate;
	}

	public String getEnableDate() {
		return enableDate;
	}

	public void setEnableDate(String enableDate) {
		this.enableDate = enableDate;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	

	public byte[] getSignImage() {
		return signImage;
	}

	public void setSignImage(byte[] signImage) {
		this.signImage = signImage;
	}
	
	

	public byte getBasicInfo() {
		return basicInfo;
	}

	public void setBasicInfo(byte basicInfo) {
		this.basicInfo = basicInfo;
	}
	
	

	public byte getAccessAcordingShiftTime() {
		return accessAcordingShiftTime;
	}

	public void setAccessAcordingShiftTime(byte accessAcordingShiftTime) {
		this.accessAcordingShiftTime = accessAcordingShiftTime;
	}
     
	public String getEmailServiceLimit() {
		return emailServiceLimit;
	}

	public void setEmailServiceLimit(String emailServiceLimit) {
		this.emailServiceLimit = emailServiceLimit;
	}

	public byte getAddProductAccess() {
		return AddProductAccess;
	}

	public void setAddProductAccess(byte addProductAccess) {
		AddProductAccess = addProductAccess;
	}

	 
	public byte getEmailForwardAccess() {
		return EmailForwardAccess;
	}

	public void setEmailForwardAccess(byte emailForwardAccess) {
		EmailForwardAccess = emailForwardAccess;
	}

	public Employee(int cId, String name, String secondName, String work, String email, String phone, String image,
			String description, String department, String shiftTime, String gender, String hiredate, byte emailAccess,
			byte integrationAccess, byte trackingAccess, byte leadDashboardAccess, byte taskDashboardAccess,
			byte customDashboardAccess, byte pipelineAccess, String planName, String planPrice, byte[] images,
			String timeZone, String base64Content,  String leaveDate,
			String disableDate, String enableDate, boolean status, byte[] signImage, User user, byte accessAcordingShiftTime,byte EmailForwardAccess) {
		super();
		this.cId = cId;
		Name = name;
		this.secondName = secondName;
		this.work = work;
		this.email = email;
		this.phone = phone;
		this.image = image;
		this.description = description;
		this.department = department;
		this.shiftTime = shiftTime;
		Gender = gender;
		Hiredate = hiredate;
		this.emailAccess = emailAccess;
		this.integrationAccess = integrationAccess;
		this.trackingAccess = trackingAccess;
		this.leadDashboardAccess = leadDashboardAccess;
		this.taskDashboardAccess = taskDashboardAccess;
		this.customDashboardAccess = customDashboardAccess;
		this.pipelineAccess = pipelineAccess;
		this.planName = planName;
		this.planPrice = planPrice;
		this.images = images;
		this.timeZone = timeZone;
		this.base64Content = base64Content;
		this.leaveDate = leaveDate;
		this.disableDate = disableDate;
		this.enableDate = enableDate;
		this.status = status;
		this.signImage = signImage;
		this.user = user;
		this.accessAcordingShiftTime=accessAcordingShiftTime;
		this.EmailForwardAccess=EmailForwardAccess;
	}

	@Override
	public String toString() {
		return "Employee [cId=" + cId + ", Name=" + Name + ", secondName=" + secondName + ", work=" + work + ", email="
				+ email + ", phone=" + phone + ", image=" + image + ", description=" + description + ", department="
				+ department + ", shiftTime=" + shiftTime + ", Gender=" + Gender + ", Hiredate=" + Hiredate
				+ ", emailAccess=" + emailAccess + ", integrationAccess=" + integrationAccess + ", trackingAccess="
				+ trackingAccess + ", leadDashboardAccess=" + leadDashboardAccess + ", taskDashboardAccess="
				+ taskDashboardAccess + ", customDashboardAccess=" + customDashboardAccess + ", pipelineAccess="
				+ pipelineAccess + ", planName=" + planName + ", planPrice=" + planPrice + ", images="
				+ Arrays.toString(images) + ", timeZone=" + timeZone + ", base64Content=" + base64Content
			    + ", leaveDate=" + leaveDate + ", disableDate=" + disableDate
				+ ", enableDate=" + enableDate + ", status=" + status + ", signImage=" + Arrays.toString(signImage)
				+ ", user=" + user + "]";
	}

	
	
	
}