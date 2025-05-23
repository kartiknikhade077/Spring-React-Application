package com.smart.dto;

import com.fasterxml.jackson.annotation.JsonIgnore;

public class UserDto {

	private String jwtToken;
	private int id;
	private String name;
	private String email;
	private String role;
	private boolean enabled;
	private byte emailAccess=0;
	private byte integrationAccess=0;
	private byte trackingAccess=0;
	private byte leadDashboardAccess=0;
	private byte taskDashboardAccess=0;
	private byte pipelineAccess=0;
	private String planName;
	private String timeZone;
	private String expiryDate;
	private String empStatus;
	private int empID;
	private int adminId;
	private String companyName;
	private String companyPhone;
	private String work;
	private String phone;
	private String companyAddress;
	private String GSTIN;
	//@JsonIgnore
	private String companyEmail;
	private String shiftTime;
	
	private byte[] logoImage;

	private byte[] signImage;
        
	private byte customDashboardAccess=0;     
   
	private byte accessAcordingShiftTime=0;
	
	private int maxEmployee;
	
	private byte EmailForwardAccess=0;
         
	public UserDto() {
		super();
	}

	
    //for Employee
	public UserDto(int id, String name, String email, String role, boolean enabled, byte emailAccess,
			byte integrationAccess, byte trackingAccess, byte leadDashboardAccess, byte taskDashboardAccess,
			byte pipelineAccess, String planName, String timeZone, String expiryDate, String empStatus, int empID,
			int adminId, String companyName, String companyPhone, String companyAddress, String gSTIN,
			String companyEmail, String jwtToken, byte[] logoImage, byte[] signImage,String shiftTime,String phone,String work, byte customDashboardAccess,byte accessAcordingShiftTime,byte EmailForwardAccess) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.role = role;
		this.enabled = enabled;
		this.emailAccess = emailAccess;
		this.integrationAccess = integrationAccess;
		this.trackingAccess = trackingAccess;
		this.leadDashboardAccess = leadDashboardAccess;
		this.taskDashboardAccess = taskDashboardAccess;
		this.pipelineAccess = pipelineAccess;
		this.planName = planName;
		this.timeZone = timeZone;
		this.expiryDate = expiryDate;
		this.empStatus = empStatus;
		this.empID = empID;
		this.adminId = adminId;
		this.companyName = companyName;
		this.companyPhone = companyPhone;
		this.companyAddress = companyAddress;
		GSTIN = gSTIN;
		this.companyEmail = companyEmail;
		this.jwtToken = jwtToken;
		this.logoImage = logoImage;
		this.signImage = signImage;
		this.shiftTime = shiftTime;
		this.phone = phone;
		this.work = work;
		this.customDashboardAccess=customDashboardAccess;
		this.accessAcordingShiftTime=accessAcordingShiftTime;
		this.EmailForwardAccess=EmailForwardAccess;
	}


    //for Admin
	public UserDto(int id, String name, String email, String role, boolean enabled, byte emailAccess,
			byte integrationAccess, byte trackingAccess, byte leadDashboardAccess, byte taskDashboardAccess,
			byte pipelineAccess, String planName, String timeZone, String expiryDate, String empStatus, int empID,
			int adminId, String companyName, String companyPhone, String companyAddress, String gSTIN,
			String companyEmail, String jwtToken ,byte customDashboardAccess,byte accessAcordingShiftTime,int maxEmployee ) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.role = role;
		this.enabled = enabled;
		this.emailAccess = emailAccess;
		this.integrationAccess = integrationAccess;
		this.trackingAccess = trackingAccess;
		this.leadDashboardAccess = leadDashboardAccess;
		this.taskDashboardAccess = taskDashboardAccess;
		this.pipelineAccess = pipelineAccess;
		this.planName = planName;
		this.timeZone = timeZone;
		this.expiryDate = expiryDate;
		this.empStatus = empStatus;
		this.empID = empID;
		this.adminId = adminId;
		this.companyName = companyName;
		this.companyPhone = companyPhone;
		this.companyAddress = companyAddress;
		GSTIN = gSTIN;
		this.companyEmail = companyEmail;
		this.jwtToken = jwtToken;
		this.customDashboardAccess =customDashboardAccess;
		this.accessAcordingShiftTime=accessAcordingShiftTime;
		this.maxEmployee=maxEmployee;
	}



	public int getAdminId() {
		return adminId;
	}


	public String getShiftTime() {
		return shiftTime;
	}

	public void setShiftTime(String shiftTime) {
		this.shiftTime = shiftTime;
	}



	public String getWork() {
		return work;
	}



	public void setWork(String work) {
		this.work = work;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	public void setAdminId(int adminId) {
		this.adminId = adminId;
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
	public String getTimeZone() {
		return timeZone;
	}
	public void setTimeZone(String timeZone) {
		this.timeZone = timeZone;
	}
	public String getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}
	public String getJwtToken() {
		return jwtToken;
	}
	public void setJwtToken(String jwtToken) {
		this.jwtToken = jwtToken;
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



	public String getEmpStatus() {
		return empStatus;
	}



	public void setEmpStatus(String empStatus) {
		this.empStatus = empStatus;
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






	public int getEmpID() {
		return empID;
	}






	public void setEmpID(int empID) {
		this.empID = empID;
	}



	public byte[] getLogoImage() {
		return logoImage;
	}



	public void setLogoImage(byte[] logoImage) {
		this.logoImage = logoImage;
	}



	public byte[] getSignImage() {
		return signImage;
	}



	public void setSignImage(byte[] signImage) {
		this.signImage = signImage;
	}


	public byte getCustomDashboardAccess() {
		return customDashboardAccess;
	}


	public void setCustomDashboardAccess(byte customDashboardAccess) {
		this.customDashboardAccess = customDashboardAccess;
	}


	public byte getAccessAcordingShiftTime() {
		return accessAcordingShiftTime;
	}


	public void setAccessAcordingShiftTime(byte accessAcordingShiftTime) {
		this.accessAcordingShiftTime = accessAcordingShiftTime;
	}


	public int getMaxEmployee() {
		return maxEmployee;
	}


	public void setMaxEmployee(int maxEmployee) {
		this.maxEmployee = maxEmployee;
	}


	public byte getEmailForwardAccess() {
		return EmailForwardAccess;
	}


	public void setEmailForwardAccess(byte emailForwardAccess) {
		EmailForwardAccess = emailForwardAccess;
	}
	
	
	
	
	
	
	
}
