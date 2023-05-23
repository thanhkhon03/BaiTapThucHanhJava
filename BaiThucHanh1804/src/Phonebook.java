import java.util.HashMap;
import java.util.Map;

public class Phonebook implements PhonebookManager {
    private Map<String, String> contacts = new HashMap<>();

    @Override
    public void addContact(String name, String phoneNumber) {
        contacts.put(name, phoneNumber);
        System.out.println("Added contact " + name + " with phone number " + phoneNumber);
    }

    @Override
    public void updateContact(String name, String phoneNumber) {
        if (contacts.containsKey(name)) {
            contacts.replace(name, phoneNumber);
            System.out.println("Updated phone number of " + name + " to " + phoneNumber);
        } else {
            System.out.println("Contact " + name + " does not exist in the phonebook.");
        }
    }

    @Override
    public void deleteContact(String name) {
        if (contacts.containsKey(name)) {
            contacts.remove(name);
            System.out.println("Deleted contact " + name);
        } else {
            System.out.println("Contact " + name + " does not exist in the phonebook.");
        }
    }

    @Override
    public String findPhoneNumberByName(String name) {
        if (contacts.containsKey(name)) {
            return contacts.get(name);
        } else {
            System.out.println("Contact " + name + " does not exist in the phonebook.");
            return null;
        }
    }

    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        phonebook.addContact("Alice", "0123456789");
        phonebook.addContact("Bob", "0987654321");
        phonebook.updateContact("Alice", "9876543210");
        phonebook.deleteContact("Charlie");
        System.out.println(phonebook.findPhoneNumberByName("Bob"));
    }
}

