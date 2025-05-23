package com.smart.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	@Column(unique = true)
	private String email;
	@JsonIgnore
	private String password;
	@Column(length = 500)
	private String about;
	private String role;
	private boolean enabled;
	@Column(columnDefinition = "MEDIUMBLOB")
	private byte[] images;
	private String image;
	private String dateOfBirh;
	private String gender;
	private String phone;
	private String permanantAddr;
	private String jobTitle;
	private String dept;
	private String empStatus;
	private byte emailAccess=0;
	private String serviceEmail;
	private String serviceEmailPassKey;
	
	private String serviceEmailLimit;
	private String remainingEmail;
	private byte integrationAccess=0;
	private byte trackingAccess=0;
	private String expiryDate;
	private String startDate;
	private String endDate;
	private int maxEmployee;
	
	private String companyName;
	private String companyPhone;
	private String companyAddress;
	private String GSTIN;
	private String companyEmail;
	
	@Column(columnDefinition = "MEDIUMBLOB")
	private byte[] logioImage;
	private String contentType;
	
	private String timeZone;
	//plan wise 01032024
	private byte leadDashboardAccess=0;
	private byte taskDashboardAccess=0;
	private byte customDashboardAccess=0;
	private byte pipelineAccess=0;
	private String planName;
	private String planPrice;
	private String loginStatus;
    private String country;
    private String groupChatList;
	
	private String state;
	
	private String city;
	
	private byte accessAcordingShiftTime=0;
	
	private byte AddProductAccess;
	
	
	
	

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public User(int id, String name, String email, String password, String about, String role, boolean enabled,
			byte[] images, String image, String dateOfBirh, String gender, String phone, String permanantAddr,
			String jobTitle, String dept, String empStatus, byte emailAccess, String serviceEmail,
			String serviceEmailPassKey, String serviceEmailLimit, String remainingEmail, byte integrationAccess,
			byte trackingAccess, String expiryDate, String startDate, String endDate, int maxEmployee,
			String companyName, String companyPhone, String companyAddress, String gSTIN, String companyEmail,
			byte[] logioImage, String contentType, String timeZone, byte leadDashboardAccess, byte taskDashboardAccess,
			byte customDashboardAccess, byte pipelineAccess, String planName, String planPrice, String loginStatus,
			String country, String groupChatList, String state, String city, byte accessAcordingShiftTime,
			byte addProductAccess) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.about = about;
		this.role = role;
		this.enabled = enabled;
		this.images = images;
		this.image = image;
		this.dateOfBirh = dateOfBirh;
		this.gender = gender;
		this.phone = phone;
		this.permanantAddr = permanantAddr;
		this.jobTitle = jobTitle;
		this.dept = dept;
		this.empStatus = empStatus;
		this.emailAccess = emailAccess;
		this.serviceEmail = serviceEmail;
		this.serviceEmailPassKey = serviceEmailPassKey;
		this.serviceEmailLimit = serviceEmailLimit;
		this.remainingEmail = remainingEmail;
		this.integrationAccess = integrationAccess;
		this.trackingAccess = trackingAccess;
		this.expiryDate = expiryDate;
		this.startDate = startDate;
		this.endDate = endDate;
		this.maxEmployee = maxEmployee;
		this.companyName = companyName;
		this.companyPhone = companyPhone;
		this.companyAddress = companyAddress;
		GSTIN = gSTIN;
		this.companyEmail = companyEmail;
		this.logioImage = logioImage;
		this.contentType = contentType;
		this.timeZone = timeZone;
		this.leadDashboardAccess = leadDashboardAccess;
		this.taskDashboardAccess = taskDashboardAccess;
		this.customDashboardAccess = customDashboardAccess;
		this.pipelineAccess = pipelineAccess;
		this.planName = planName;
		this.planPrice = planPrice;
		this.loginStatus = loginStatus;
		this.country = country;
		this.groupChatList = groupChatList;
		this.state = state;
		this.city = city;
		this.accessAcordingShiftTime = accessAcordingShiftTime;
		AddProductAccess = addProductAccess;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAbout() {
		return about;
	}

	public void setAbout(String about) {
		this.about = about;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public boolean isEnabled() {
		return enabled;
	}

	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	public byte[] getImages() {
		return images;
	}

	public void setImages(byte[] images) {
		this.images = images;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDateOfBirh() {
		return dateOfBirh;
	}

	public void setDateOfBirh(String dateOfBirh) {
		this.dateOfBirh = dateOfBirh;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPermanantAddr() {
		return permanantAddr;
	}

	public void setPermanantAddr(String permanantAddr) {
		this.permanantAddr = permanantAddr;
	}

	public String getJobTitle() {
		return jobTitle;
	}

	public void setJobTitle(String jobTitle) {
		this.jobTitle = jobTitle;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public String getEmpStatus() {
		return empStatus;
	}

	public void setEmpStatus(String empStatus) {
		this.empStatus = empStatus;
	}

	public byte getEmailAccess() {
		return emailAccess;
	}

	public void setEmailAccess(byte emailAccess) {
		this.emailAccess = emailAccess;
	}

	public String getServiceEmail() {
		return serviceEmail;
	}

	public void setServiceEmail(String serviceEmail) {
		this.serviceEmail = serviceEmail;
	}

	public String getServiceEmailPassKey() {
		return serviceEmailPassKey;
	}

	public void setServiceEmailPassKey(String serviceEmailPassKey) {
		this.serviceEmailPassKey = serviceEmailPassKey;
	}

	public String getServiceEmailLimit() {
		return serviceEmailLimit;
	}

	public void setServiceEmailLimit(String serviceEmailLimit) {
		this.serviceEmailLimit = serviceEmailLimit;
	}

	public String getRemainingEmail() {
		return remainingEmail;
	}

	public void setRemainingEmail(String remainingEmail) {
		this.remainingEmail = remainingEmail;
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

	public String getExpiryDate() {
		return expiryDate;
	}

	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	public String getStartDate() {
		return startDate;
	}

	public void setStartDate(String startDate) {
		this.startDate = startDate;
	}

	public String getEndDate() {
		return endDate;
	}

	public void setEndDate(String endDate) {
		this.endDate = endDate;
	}

	public int getMaxEmployee() {
		return maxEmployee;
	}

	public void setMaxEmployee(int maxEmployee) {
		this.maxEmployee = maxEmployee;
	}

	public String getCompanyName() {
		return companyName;
	}

	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}

	public String getCompanyPhone() {
		return companyPhone;
	}

	public void setCompanyPhone(String companyPhone) {
		this.companyPhone = companyPhone;
	}

	public String getCompanyAddress() {
		return companyAddress;
	}

	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}

	public String getGSTIN() {
		return GSTIN;
	}

	public void setGSTIN(String gSTIN) {
		GSTIN = gSTIN;
	}

	public String getCompanyEmail() {
		return companyEmail;
	}

	public void setCompanyEmail(String companyEmail) {
		this.companyEmail = companyEmail;
	}

	public byte[] getLogioImage() {
		return logioImage;
	}

	public void setLogioImage(byte[] logioImage) {
		this.logioImage = logioImage;
	}

	public String getContentType() {
		return contentType;
	}

	public void setContentType(String contentType) {
		this.contentType = contentType;
	}

	public String getTimeZone() {
		return timeZone;
	}

	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
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

	public byte getCustomDashboardAccess() {
		return customDashboardAccess;
	}

	public void setCustomDashboardAccess(byte customDashboardAccess) {
		this.customDashboardAccess = customDashboardAccess;
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

	public String getLoginStatus() {
		return loginStatus;
	}

	public void setLoginStatus(String loginStatus) {
		this.loginStatus = loginStatus;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getGroupChatList() {
		return groupChatList;
	}

	public void setGroupChatList(String groupChatList) {
		this.groupChatList = groupChatList;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public byte getAccessAcordingShiftTime() {
		return accessAcordingShiftTime;
	}

	public void setAccessAcordingShiftTime(byte accessAcordingShiftTime) {
		this.accessAcordingShiftTime = accessAcordingShiftTime;
	}

	public byte getAddProductAccess() {
		return AddProductAccess;
	}

	public void setAddProductAccess(byte addProductAccess) {
		AddProductAccess = addProductAccess;
	}

	
	
}
