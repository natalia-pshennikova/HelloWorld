import java.util.List;

public class HelloWorld {

    private int code;
    private String name;
    private String surname;

    public HelloWorld(int code, String name, String surname) {
        this.code = code;
        this.name = name;
        this.surname = surname;
    }

    private String printClassInstance() {
        return "Hi again," + this.code + "," + this.name + "," + this.surname;
    }

    public static void main(String[] args) {
        System.out.print("Hello");
        for (int i = 0; i < args.length; i++) {
            System.out.print(" " + args[i]);
        }
    }

    void checkValues(int i, int j) {

        if (i < j) {
            System.out.println("First argument is greater");
        }
        if (i == j) {
            System.out.println("Arguments are equal");
        } else {
            System.out.println("Second argument is greater");
        }
    }

    String getDayOfTheWeekByTwoLetters(String letters) {

        switch (letters){
            case "Mo": return "Monday";
            case "Tu": return "Tuesday";
            case "We": return "Wednesday";
            case "Th": return "Thursday";
            case "Fr": return "Friday";
            case "Sa": return "Saturday";
            case "Su": return "Sunday";
            default: return "No such day...";
        }
    }

    void printCharArrayAsString1(char[] letters) {

        for (int i = 0; i < letters.length; i++){
            System.out.print(letters[i]);
        }
    }

    void printCharArrayAsString2(char[] letters) {

        for (char c : letters){
            System.out.print(c);
        }
    }

    void printCharArrayAsString3(char[] letters) {
        int i = 0;
        while (i < letters.length){
            System.out.print(letters[i]);
            i++;
        }
    }

    void printCharArrayAsString4(char[] letters) {
        int i = 0;
        do {
            System.out.print(letters[i]);
            i++;
        } while (i < letters.length);
    }

    void printCharArrayAsString5(List<String> strings) {

        strings.forEach(letter -> System.out.print(letter));

        //Or we can add filter
        strings.stream().filter(string -> !string.equals("")).forEach(string -> System.out.print(string));

        //Or even with method reference
        strings.stream().filter(string -> !string.equals("")).forEach(System.out::print);
    }
}
