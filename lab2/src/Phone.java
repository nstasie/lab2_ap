public class Phone {
    private int id;
    private String lastName;
    private String firstName;
    private String middleName;
    private int accountNumber;
    private int localCallTime;
    private int longDistanceCallTime;

    // Конструктор
    public Phone(int id, String lastName, String firstName, String middleName, int accountNumber, int localCallTime, int longDistanceCallTime) {
        this.id = id;
        this.lastName = lastName;
        this.firstName = firstName;
        this.middleName = middleName;
        this.accountNumber = accountNumber;
        this.localCallTime = localCallTime;
        this.longDistanceCallTime = longDistanceCallTime;
    }

    // Гетери і сетери
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public int getLocalCallTime() {
        return localCallTime;
    }

    public void setLocalCallTime(int localCallTime) {
        this.localCallTime = localCallTime;
    }

    public int getLongDistanceCallTime() {
        return longDistanceCallTime;
    }

    public void setLongDistanceCallTime(int longDistanceCallTime) {
        this.longDistanceCallTime = longDistanceCallTime;
    }

    public String toString() {
        return "ID: " + id + "\n" +
                "Прізвище: " + lastName + "\n" +
                "Ім'я: " + firstName + "\n" +
                "По батькові: " + middleName + "\n" +
                "Номер рахунку: " + accountNumber + "\n" +
                "Час міських розмов (хв): " + localCallTime + "\n" +
                "Час міжміських розмов (хв): " + longDistanceCallTime + "\n";
    }
}
