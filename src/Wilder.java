
public class Wilder {

	// attributes
	private String firstname;
	private boolean aware;
	
	
	public Wilder(String firstname, boolean aware) {
		this.firstname = firstname;
		this.aware = aware;
	}
	
	/**
	 * @return the firstname
	 */
	public String getFirstname() {
		return firstname;
	}

	/**
	 * @param firstname the firstname to set
	 */
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	/**
	 * @return the aware
	 */
	public boolean isAware() {
		return aware;
	}

	/**
	 * @param aware the aware to set
	 */
	public void setAware(boolean aware) {
		this.aware = aware;
	}

	// instance method
    public String whoAmI() {
    	if(this.aware) {
        return "Je m'appelle " + this.getFirstname() +  " et je suis aware";}
    	else {
    		return "Je m'appelle " + this.getFirstname() +  " et je ne suis pas aware";}
    }
	
}
