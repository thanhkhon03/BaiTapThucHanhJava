public interface PhonebookManager {
    void addContact(String name, String phoneNumber);
    void updateContact(String name, String phoneNumber);
    void deleteContact(String name);
    String findPhoneNumberByName(String name);
}

