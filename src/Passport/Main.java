package Passport;

public class Main {
    public static void main(String[] args) throws PassportException {
        Passport kuznecov = new Passport(123456, "Кузнецов", "Иван",
                "Петрович", "01.02.1975");
        Passport petrov = new Passport(234567, "Петров", "Дмитрий",
                "Олегович", "02.07.1979");
        Passport vasechkin = new Passport(345678, "Васечкин", "Андрей",
                "Алексеевич", "15.12.1982");
        Passport sokolov = new Passport(456789, "Соколов", "Юрий",
                "Анатольевич", "30.09.1985");
        System.out.println(kuznecov);
        System.out.println(petrov);
        System.out.println(vasechkin);
        System.out.println(sokolov);
        Passport passport=new Passport();
        passport.savePassportData(kuznecov);
        passport.savePassportData(petrov);
        passport.savePassportData(vasechkin);

        System.out.println(passport);

        passport.lookingPassportNumber(888888);
    }
}
