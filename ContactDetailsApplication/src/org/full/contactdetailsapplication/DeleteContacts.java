package org.full.contactdetailsapplication;

public class DeleteContacts implements DeleteContactsDetails {

	public void deleteExistingContacts() {

		System.out.println("Enter the Existing Contact: ");
		String name = MobilePhone.contactDetails.nextLine();
		MobilePhone.contactList.remove(name);
		System.out.println(name + " was successfully deleted");

	}

}
