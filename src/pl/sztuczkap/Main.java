package pl.sztuczkap;

import java.util.Comparator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

/*        int first = 0;
        // nie możemy nazwac zmiennej first gdyz juz jest  w tym zasiegu
        Comparator<String> comparator = (first, second) -> first.compareTo(second);*/

        repeatText(5, "Hello");

/*        // zmienne lokalne wykorzystywane w wyrazeniu lambda musza byc finalne lub efektywnie finalne
        for (int i = 0; i < 5; i++) {
            execute(() -> System.out.println(i)); // i jest podkreślone
        }*/

        List<Integer> numbers = List.of(0, 1, 2, 3, 4, 5);
        for (Integer number : numbers) {
            execute(() -> System.out.println(number));
        }

        // wyrazenia lambda nie moga modyfikowac zadnej z wykorzystywanej wartosci, przykład:
//        repeatText2(5, "Hello");


    }

    private static void execute(Runnable runnable) {
        runnable.run();
    }

    private static void repeatText(int number, String text) {
        Runnable r = () -> {
            for (int j = 0; j <= number; j++) {
                System.out.println(text);
            }
        };
        r.run();
    }

//    private static void repeatText2(int number, String text) {
//        Runnable r = () -> {
//            while (number > 0) {
//                number--;
//                System.out.println(text);
//            }
//        };
//        r.run();
//    }
}
