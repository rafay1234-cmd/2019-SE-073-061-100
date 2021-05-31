
public class CUSTOMER {


	    String username;
	    String fullName;

	    long contactNo;
	    String address;

	    public CUSTOMER(String username, String password, long contactNo, String address) {
	        this.username = username;

	        this.contactNo = contactNo;
	        this.address = address;
	    }

	    private String getUsername() {
	        return username;
	    }

	    public void setUsername(String username) {
	        this.username = username;
	    }

	    public String getFullName() {
	        return fullName;
	    }

	    public void setFullName(String fullName) {
	        this.fullName = fullName;
	    }

	   
	    public long getContactNo() {
	        return contactNo;
	    }

	    public void setContactNo(long contactNo) {
	        this.contactNo = contactNo;
	    }

	    public String getAddress() {
	        return address;
	    }

	    public void setAddress(String address) {
	        this.address = address;
	    }
	}



