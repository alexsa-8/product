package TelephoneDirectory;
import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Map<String, String> stringHashMap = new HashMap<>();
        stringHashMap.put("Иван Иванов", "+71234567890");
        stringHashMap.put("Пётр Петров", "+73562212887");
        stringHashMap.put("Сидор Сидоров", "+7394158247");
        stringHashMap.put("Вася Васечкин", "+7326895624");
        stringHashMap.put("Александр Лебедев", "+72352828917");
        stringHashMap.put("Алексей Пеньков", "+74685245778");
        stringHashMap.put("Олег Волков", "+78952172337");
        stringHashMap.put("Юра Радугин", "+74273762994");
        stringHashMap.put("Дмитрий Аксёнов", "+77963458478");
        stringHashMap.put("Радион Грушевский", "+78635286324");
        stringHashMap.put("Ольга Новикова", "+78523452976");
        stringHashMap.put("Илья Колокольцев", "+77637575263");
        stringHashMap.put("Юля Подорожникова", "+764524393799");
        stringHashMap.put("Катя Васильева", "+73964529991");
        stringHashMap.put("Иван Птичкин", "+72896345279");
        stringHashMap.put("Николай Травкин", "+76372963891");
        stringHashMap.put("Наташа Звон", "+78635245234");
        stringHashMap.put("Олег Лампочкин", "+79345245625");
        stringHashMap.put("Аксана Ручейникова", "+74634245349");
        stringHashMap.put("Юля Зверь", "+74634526391");
        System.out.println(stringHashMap.values());
        for (Map.Entry<String, String> entry : stringHashMap.entrySet()) System.out.println(entry);

        Map<String, Integer> numberOfDays = new HashMap<>();
        numberOfDays.put("Июнь", 30);
        numberOfDays.put("Июнль", 31);
        numberOfDays.put("Август", 31);
        TelephoneDirectory avgust = new TelephoneDirectory("Август", 31);
        System.out.println(numberOfDays.values());

        for (Map.Entry<String, Integer> month : numberOfDays.entrySet())
            if (!month.getKey().equals(avgust.getMonth())) numberOfDays.put("Август", 31);
            else if ((month.getKey().equals(avgust.getMonth()))
                    && (month.getValue() == TelephoneDirectory.getNumberDays())) System.out.println("Исключение");
            else numberOfDays.remove("Август", 31);
        System.out.println(numberOfDays.values());
    }
}
