import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        String[] namesArray = {
                "вася",
                "коля",
                "коля",
                "коля",
                "ваня",
                "сергей",
                "вася",
                "вася",
                "вася",
                "коля",
                "ваня",
                "сергей",
                "вася",
                "петя",
                "ваня",
                "сергей",
                "вася",
                "петя"
        };

        Map<String, Integer> names = new HashMap<>();

        for (int i = 0; i < namesArray.length; i++) {
            String name = namesArray[i];

            if (!names.containsKey(name)) names.put(name, 1);
            else names.put(name, names.get(name) + 1);
        }

        for (Map.Entry<String, Integer> result : names.entrySet()) {
            System.out.println("Имя " + result.getKey() + " повторяется " + result.getValue() + " раз(а);");
        }
    }
}

