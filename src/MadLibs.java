import java.util.Scanner;

public class MadLibs {
    public static void main(String[] args) {

        String userObject;
        String userAdjective;
        String userAction;
        String userPlace;

        String secondObject = "";
        String intention = "";
        String howDidItEnd = "";

        int choiceNumber;

        String continueGame;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Пожалуйста, введите КТО?");
            userObject = scanner.nextLine();

            System.out.println("Пожалуйста. введите КАКОЙ/КАКАЯ (в зависимости от первого ввода)?");
            userAdjective = scanner.nextLine();

            System.out.println("Пожалуйста, введите ЧТО ДЕЛАЛИ/ЧТО СДЕЛАЛИ? (просьба ответить во множественном числе)");
            userAction = scanner.nextLine();

            System.out.println("Пожалуйста, введите ГДЕ?");
            userPlace = scanner.nextLine();

            System.out.println("Нажмите 1, 2, 3, 4 или 5 на клавиатуре");
            choiceNumber = scanner.nextInt();

            switch (choiceNumber) {
                case (1) -> secondObject = " Чебурашка";
                case (2) -> secondObject = " Терминатор";
                case (3) -> secondObject = " Путин";
                case (4) -> secondObject = " Бенедикт Камбербэтч";
                case (5) -> secondObject = " Бомж";
            }

            System.out.println("Есть! Спасибо!");

            System.out.println("Нажмите 1, 2, 3, 4 или 5 на клавиатуре");
            choiceNumber = scanner.nextInt();


            switch (choiceNumber) {
                case (1) -> intention = " во благо мира.";
                case (2) -> intention = " потому что так гласит легенда.";
                case (3) -> intention = " потому что могут.";
                case (4) -> intention = " так уж исторически сложилось.";
                case (5) -> intention = "- мы и сами в шоке от этого.";
            }

            System.out.println("Отлично! Продолжим!");

            System.out.println("Нажмите 1, 2, 3, 4 или 5 на клавиатуре");
            choiceNumber = scanner.nextInt();

            switch (choiceNumber) {
                case (1) -> howDidItEnd = " И жили они долго и счастливо!";
                case (2) -> howDidItEnd = " Ну да не будем о грустном!";
                case (3) -> howDidItEnd = " После этого их внесли в книгу рекордов Гинесса!";
                case (4) -> howDidItEnd = " Мир после этого перестал быть прежним!";
                case (5) -> howDidItEnd = " А дальше уже совсем другая история!";
            }

            System.out.println("Вот что у нас получилось: " + userAdjective + " " + userObject + " и "
                    + secondObject + " " + userPlace + " " + userAction + " " + intention + " " + howDidItEnd );

            System.out.println("Хотите сыграть d Чепуху снова (д/н)?");

            continueGame = scanner.next();

        } while (continueGame.equalsIgnoreCase("д"));

        System.out.println("Спасибо за игру! Пока!");

        scanner.close();

    }
}
