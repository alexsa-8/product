package Passport;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Passport {
    Integer numberPassport;
    private  String lastName;
    private  String name;
    private  String patronymic;
    private  String dateOfBirth;

    public Passport() {

    }

    public Passport(Integer numberPassport, String lastName, String name,
                    String patronymic, String dateOfBirth) throws PassportException {
        if (numberPassport == null || numberPassport < 0) {
            throw new PassportException("Не указаны данные");
        } else {
            this.numberPassport = numberPassport;
        }
        //setNumberPassport(numberPassport);
        setLastName(lastName);
        setName(name);
        this.patronymic = patronymic;
        setDateOfBirth(dateOfBirth);
    }

    public int getNumberPassport() {
        return numberPassport;
    }

    public void setNumberPassport(Integer numberPassport) throws PassportException {
        if (numberPassport == null) {
            throw new PassportException("Номер паспорта не указан");
        }else {
            this.numberPassport = numberPassport;
        }
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) throws PassportException {
        if (lastName == null || lastName.isBlank()) {
            throw new PassportException("Фамилия не указана");
        } else {
            this.lastName = lastName;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) throws PassportException {
        if (name == null || name.isBlank()) {
            throw new PassportException("Имя не указано");
        }else {
            this.name = name;
        }
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) throws PassportException {
        if (dateOfBirth == null || dateOfBirth.isBlank()) {
            throw new PassportException("Дата рождения не указана");
        }else {
            this.dateOfBirth = dateOfBirth;
        }
    }
    private final List<Passport> passportList = new ArrayList<>();

    public void savePassportData(Passport passport) throws PassportException {
        Passport passport1 = lookingPassportNumber(passport.getNumberPassport());
        if (passport1 == null) {
            passportList.add(passport);
        } else {
            passport1.setLastName(passport.getLastName());
            passport1.setName(passport.getName());
            passport1.setPatronymic(passport.getPatronymic());
            passport1.setDateOfBirth(passport.getDateOfBirth());
        }
    }
    public Passport lookingPassportNumber(int number) {
        for (Passport passport : passportList) {
            if (Objects.equals(numberPassport, number)) {
                return passport;
            }
        }
        return null;
    }
    @Override
    public String toString() {
        return "ФИО: " + lastName + " " + name + " " + patronymic +
                ", дата рождения: " + dateOfBirth +
                ", номер паспорта: " + numberPassport + ".";
    }
}
