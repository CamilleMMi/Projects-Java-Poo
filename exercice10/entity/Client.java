package projectjavajpoo.exercice10.entity;

public class Client {
    private int id;

    private String firstName;

    private String lastName;

    private int[] accountIds;

    public Client(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountIds = null;
    }

    public Client(int id, String firstName, String lastName, int[] accountIds) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.accountIds = accountIds;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int[] getAccountIds() {
        return accountIds;
    }

    public void setAccountIds(int[] accountIds) {
        this.accountIds = accountIds;
    }
}

