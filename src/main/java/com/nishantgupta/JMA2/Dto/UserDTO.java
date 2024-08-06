
package com.nishantgupta.JMA2.Dto;

import java.time.Instant;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@NoArgsConstructor
public class UserDTO {

      private String name;
        private String age;
        private String gender;
        private String dob;
        private String nationality;
        private String verificationStatus;
        private Instant dateCreated;
        private Instant dateModified;
		


        public UserDTO(String name, String age, String gender, String dob, String nationality,
                String verificationStatus, Instant dateCreated, Instant dateModified) {
            super();
            this.name = name;
            this.age = age;
            this.gender = gender;
            this.dob = dob;
            this.nationality = nationality;
            this.verificationStatus = verificationStatus;
            this.dateCreated = dateCreated;
            this.dateModified = dateModified;
        }



		


		public String getName() {
			return name;
		}



		public void setName(String name) {
			this.name = name;
		}



		public String getAge() {
			return age;
		}



		public void setAge(String age) {
			this.age = age;
		}



		public String getGender() {
			return gender;
		}



		public void setGender(String gender) {
			this.gender = gender;
		}



		public String getDob() {
			return dob;
		}



		public void setDob(String dob) {
			this.dob = dob;
		}



		public String getNationality() {
			return nationality;
		}



		public void setNationality(String nationality) {
			this.nationality = nationality;
		}



		public String getVerificationStatus() {
			return verificationStatus;
		}



		public void setVerificationStatus(String verificationStatus) {
			this.verificationStatus = verificationStatus;
		}



		public Instant getDateCreated() {
			return dateCreated;
		}



		public void setDateCreated(Instant dateCreated) {
			this.dateCreated = dateCreated;
		}



		public Instant getDateModified() {
			return dateModified;
		}



		public void setDateModified(Instant dateModified) {
			this.dateModified = dateModified;
		}
        


	
}

