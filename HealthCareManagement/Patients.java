public class Patients extends User
{
	private String gender,status,address,city,state,department,docname, zipcode, phoneno, followupdate, noofvisit,billing;
	
	
	public Patients(int id)
	{ 
		DatabaseReader dbs = new DatabaseReader();
		String[][] user = dbs.DB();
		super.setId(user[id][0]);
		super.setFname(user[id][1]);
		super.setLname(user[id][2]);
		super.setUsername(user[id][16]);
		super.setPassword(user[id][3]);
		this.setGender(user[id][4]);
		this.setStatus(user[id][5]);
		this.setAddress(user[id][7]);
		this.setCity(user[id][8]);
		this.setState(user[id][9]);
		this.setZipcode(user[id][10]);
		this.setPhoneno(user[id][6]);
		this.setDepartment(user[id][12]);
		this.setDocname(user[id][13]);
		this.setBilling(user[id][15]);
		this.setFollowupdate(user[id][14]);
		this.setNoofvisit(user[id][11]);
		
		
		

	}

	public String getAddress()
	{
		return this.address;
	}
	
	public void setAddress(String address) 
	 {
		 this.address=address;
	 }
	
	public String getStatus()
	{
		return this.status;
	}
	
	public void setStatus(String status) 
	 {
		 this.status=status;
	 }
	
	public String getCity()
	{
		return this.city;
	}
	
	public void setCity(String city) 
	 {
		 this.city=city;
	 }
	
	public String getState()
	{
		return this.state;
	}
	
	public void setState(String state) 
	 {
		 this.state=state;
	 }
	
	public String getGender()
	{
		return this.gender;
	}
	
	public void setGender(String gender) 
	 {
		 this.gender=gender;
	 }
	
	public String getDocname()
	{
		return this.docname;
	}
	
	public void setDocname(String docname) 
	 {
		 this.docname=docname;
	 }
	
	public String getZipcode()
	{
		return this.zipcode;
	}
	
	public void setZipcode(String zipcode) 
	 {
		 this.zipcode=zipcode;
	 }

	public String getDepartment()
	{
		return this.department;
	}
	
	public void setDepartment(String department) 
	 {
		 this.department=department;
	 }
	
	public String getBilling()
	{
		return this.billing;
	}
	
	public void setBilling(String billing) 
	 {
		 this.billing=billing;
	 }
	
	public String getPhoneno()
	{
		return this.phoneno;
	}
	
	public void setPhoneno(String phoneno) 
	 {
		 this.phoneno=phoneno;
	 }
	
	public String getFollowupdate()
	{
		return this.followupdate;
	}
	
	public void setFollowupdate(String followupdate) 
	 {
		 this.followupdate=followupdate;
	 }
	
	public String getNoofvisit()
	{
		return this.noofvisit;
	}
	
	public void setNoofvisit(String noofvisit) 
	 {
		 this.noofvisit=noofvisit;
	 }
	
	
	
}
