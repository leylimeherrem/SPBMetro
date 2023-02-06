public class Main {
    public static void main(String[] args) {
        Container container = new Container();
        container.addCount(5672);
        System.out.println(container.getCount());

        // TODO: ниже напишите код для выполнения задания:
        //  С помощью цикла и преобразования чисел в символы найдите все коды
        //  букв русского алфавита — заглавных и строчных, в том числе буквы Ё.


        char[] russianUpperCase = {'А', 'Б', 'В', 'Г', 'Д', 'Е', 'Ё', 'Ж', 'З', 'И', 'Й', 'К', 'Л', 'М', 'Н', 'О', 'П', 'Р', 'С', 'Т', 'У', 'Ф', 'Х', 'Ц', 'Ч', 'Ш', 'Щ', 'Ъ', 'Ы', 'Ь', 'Э', 'Ю', 'Я'};
        char[] russianLowerCase = {'а', 'б', 'в', 'г', 'д', 'е', 'ё', 'ж', 'з', 'и', 'й', 'к', 'л', 'м', 'н', 'о', 'п', 'р', 'с', 'т', 'у', 'ф', 'х', 'ц', 'ч', 'ш', 'щ', 'ъ', 'ы', 'ь', 'э', 'ю', 'я'};

        System.out.println("\n" + "Числовые коды заглавных букв русского алфавита: " + "\n");

        for (int i = 0; i < russianUpperCase.length; i++) {
            System.out.println("Код для " + russianUpperCase[i] + ": " + (int) russianUpperCase[i]);
        }
        System.out.println("\n" + "Числовые коды строчных букв русского алфавита: " + "\n");
        for (int i = 0; 1 < russianLowerCase.length; i++) {
            System.out.println("Код для " + russianLowerCase[i] + ": " + (int) russianLowerCase[i]);
        }

    }
}
