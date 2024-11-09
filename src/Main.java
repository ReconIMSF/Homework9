//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


    public static int [] generateRandomArray() {
        java.util.Random random= new java.util.Random();
        int [] expence = new int[5];
            for (int i = 0; i < expence.length; i++) {
                expence[i] = random.nextInt(100_000) + 100_000;
            }
        return expence;
    }

    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        //System.out.printf("Hello and welcome!");

        // Задача 1
        System.out.println("Задача 1");
        int [] expences = generateRandomArray();
        int totalExpences = 0;
        for (int exp : expences) {
            totalExpences += exp;
        }
        System.out.println("Сумма трат за месяц составила " + totalExpences + " рублей");

        // Задача 2
        System.out.println("Задача 2");
        expences = generateRandomArray();
        int minExp = expences[1];
        int maxExp = 0;
        for (int exp : expences) {
            if (exp < minExp) {
                minExp = exp;
            }
            if (exp > maxExp) {
                maxExp = exp;
            }
        }
        System.out.println("Минимальная сумма трат за неделю составила " + minExp + " рублей");
        System.out.println("Максимальная сумма трат за неделю составила " + maxExp + " рублей");

        // Задача 3
        System.out.println("Задача 3");
        expences = generateRandomArray();
        double medExp = 0;
        for (int exp : expences) {
            medExp += exp;
        }
        medExp = medExp / expences.length;
        System.out.println("Средняя сумма трат за месяц составила " + medExp + " рублей");

        // Задача 4
        System.out.println("Задача 4");
        char[] reverseFullName = {'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        char firstChar;
        char lastChar;
        for (int i = reverseFullName.length - 1; i >= reverseFullName.length / 2; i--) {
            firstChar = reverseFullName[reverseFullName.length - (i + 1)];
            lastChar = reverseFullName[i];
            reverseFullName[reverseFullName.length - (i + 1)] = lastChar;
            reverseFullName[i] = firstChar;
        }
        System.out.println(reverseFullName);
    }
}