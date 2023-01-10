

public class Resident {

	/**
	 * 
	 */
	public physician attendingphysician ;
	/**
	 * 
	 */
	public Integer residencyYear;
	/**
	 * 
	 */
	public ConsultantDoctor consultantdoctor;
	/**
	 * Getter of attendingphysician 
	 */
	public physician getAttendingphysician () {
	 	 return attendingphysician ; 
	}
	/**
	 * Setter of attendingphysician 
	 */
	public void setAttendingphysician (physician attendingphysician ) { 
		 this.attendingphysician  = attendingphysician ; 
	}
	/**
	 * Getter of residencyYear
	 */
	public Integer getResidencyYear() {
	 	 return residencyYear; 
	}
	/**
	 * Setter of residencyYear
	 */
	public void setResidencyYear(Integer residencyYear) { 
		 this.residencyYear = residencyYear; 
	}
	/**
	 * Getter of consultantdoctor
	 */
	public ConsultantDoctor getConsultantdoctor() {
	 	 return consultantdoctor; 
	}
	/**
	 * Setter of consultantdoctor
	 */
	public void setConsultantdoctor(ConsultantDoctor consultantdoctor) { 
		 this.consultantdoctor = consultantdoctor; 
	} 

}