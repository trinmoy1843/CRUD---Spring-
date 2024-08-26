package Entities;

public class UpdateUser {
	
	//GETTER AND SETTERS FOR UID
		private int uid;
		public int getUid() {
			return uid;
		}
		public void setUid(int uid) {
			this.uid = uid;
		}

		private String name;
		private String email;
		private Long contact;
		private String oldPassword;
		private String newPassword;
		
		//GETTER AND SETTERS
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
		public Long getContact() {
			return contact;
		}
		public void setContact(Long contact) {
			this.contact = contact;
		}
		public String getOldPassword() {
			return oldPassword;
		}
		public void setOldPassword(String oldPassword) {
			this.oldPassword = oldPassword;
		}
		public String getNewPassword() {
			return newPassword;
		}
		public void setNewPassword(String newPassword) {
			this.newPassword = newPassword;
		}
		
		//CONSTRUCTORS
		public UpdateUser(int uid, String name, String email, Long contact, String oldPassword, String newPassword) {
			super();
			this.uid = uid;
			this.name = name;
			this.email = email;
			this.contact = contact;
			this.oldPassword = oldPassword;
			this.newPassword = newPassword;
		}
		public UpdateUser() {
			super();
			// TODO Auto-generated constructor stub
		}
		
		//TO STRING
		@Override
		public String toString() {
			return "UpdateUser uid=" + uid + ", name=" + name + ", email=" + email + ", contact=" + contact
					+ ", oldPassword=" + oldPassword + ", newPassword=" + newPassword ;
		}
		
		
}
