package TelephoneDirectory;

public class TelephoneDirectory {
    private String nameAndSurname;
    private  String phoneNumber;
      String month;
      static int numberDays;


    public TelephoneDirectory(String nameAndSurname, String phoneNumber) {
        this.nameAndSurname = nameAndSurname;
        this.phoneNumber = phoneNumber;
    }

    public TelephoneDirectory(String month, int numberOfDays) {
        this.month = month;
        this.numberDays = numberOfDays;
    }

    public String getNameAndSurname() {
        return nameAndSurname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getMonth() {
        return month;
    }

    public static int getNumberDays() {
        return numberDays;
    }

    @Override
    public String toString() {
        return "TelephoneDirectory{" +
                "nameAndSurname='" + nameAndSurname + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", month='" + month + '\'' +
                ", numberDays=" + numberDays +
                '}';
    }

    public String get(String month) {
        return null;
    }
}
