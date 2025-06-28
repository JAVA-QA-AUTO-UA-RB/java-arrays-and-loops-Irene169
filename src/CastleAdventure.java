import java.util.Scanner;

public class CastleAdventure {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        // Частина 1: Увійди в Замок
        int[] secretCode = {7, 14, 28, 56, 112};

        System.out.println("Введіть 5 чисел, щоб відкрити двері замку:");
        boolean isCodeCorrect = true;

        for (int i = 0; i < secretCode.length; i++) {
            int userInput = scanner.nextInt(); // питаємо в користувача чергове число
            if (userInput != secretCode[i]) { // перевіряємо число проти i-го елемента масиву з правильним кодом
                isCodeCorrect = false; // якщо натрапляємо на неправильно введене число - усю комбінацію вважаємо невірною
            }
        }

        if (isCodeCorrect) {
            System.out.println("Замок відкрито! Заходьте всередину.");
        } else {
            System.out.println("Невірний код. Спробуйте ще.");
        }


        // Частина 2: Магіічна загадка
        int[] magicBoard = {3, 6, 9, 12, 15, 18, 21, 24, 27, 30}; // масив із магічними числами
        int sum = 0; // змінна для накопичення суми

        for (int num : magicBoard) { // проходимо по кожному числу в масиві
            sum += num; // додаємо поточне число до суми
        }
        System.out.println("Сума чисел на магічній дошці: " + sum);


        // Частина 3: Перемогти залізного дракона
        int[] dragonAttack = {8, 16, 24, 32, 40}; // масив, що містить значення атак дракону
        boolean allEven = true; // логічна змінна, припускає,що всі атаки парні

         for (int attack : dragonAttack) { // проходимо по кожному значенню атаці
             if (attack % 2 != 0) { // перевірка, якщо атака не ділиться на 2
                 allEven = false;
                 break; // виходимо із циклу, коли знайшли непарну атаку
             }
         }
          if (allEven) { // якщо жодна атака не була непарною
              System.out.println("Атаки парні! Захист активовано!");
          } else { // якщо хоча б одна атака була непарною
              System.out.println("Увага! Непарна атака!");
          }


        //  Частина 4: Знайти магічний ключ
        System.out.println("Введіть своє улюблене число: ");
          int favouriteNumber = scanner.nextInt(); // питаємо у користувача улюблене число
          boolean found = false;

           for(int n : secretCode) if (n == favouriteNumber) found = true; // перевіряємо,чи є улюблене число у масиві secretCode
           for(int n : magicBoard) if (n == favouriteNumber) found = true; // перевіряємо чи улюблене число у масиві magicBoard
           for(int n : dragonAttack) if (n == favouriteNumber) found = true; // перевіряємо чи є улюблене число у масиві dragonAttack

           if(found) { // якщо число знайдене в будь-якому із масивів
               System.out.println("Твій ключ знайдено!");
           } else { // якщо число не знайдено в жодному з масивів
               System.out.println("Треба більше магії...");

           }
           scanner.close();
    }
            }





