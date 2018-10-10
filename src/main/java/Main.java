import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        //Очередь
        Queue q = new Queue(5);
        //Заполнили
        q.insert(10);
        q.insert(20);
        q.insert(30);
        q.insert(40);
        q.insert(50);
        //Удалили 2
        q.remove();
        q.remove();

        //Еще добавили 4
        q.insert(50);
        q.insert(60);
        q.insert(70);
        q.insert(80);
        while( !q.isEmpty() ) {
            int n = q.remove();
            System.out.println(n);
        }

        //Переворот фразы
        //Получим фразу
        System.out.println("Введите любую фразу:");
        Scanner scanner = new Scanner(System.in);
        String str_scanner = scanner.next();

        //Запишем фразу в стек
        Stec stec = new Stec(str_scanner.length());
        for (int i = 0; i < str_scanner.length(); i++) {
            stec.push(str_scanner.substring(i, i + 1));
        }

        //Выведем перевернутую фразу
        while (!stec.isEmpty()){
            System.out.print(stec.pop());
        }

        //Двусторонний список
        //Очередь
        Deque d = new Deque(5);
        d.pushFront(10);
        d.pushFront(20);
        d.pushFront(30);
        d.pushFront(40);
        System.out.println();
        System.out.println("Добавили 4 элемента в Deque сначала и вывели 2 сначала:");
        System.out.println(d.popFront());
        System.out.println(d.popFront());

        System.out.println("Вывели 2 с конца:");
        System.out.println(d.popBack());
        System.out.println(d.popBack());

        System.out.println("Добавили 2 элемента в Deque с конца и вывели 2 с конца:");
        d.pushBack(70);
        d.pushBack(80);
        System.out.println(d.popFront());
        System.out.println(d.popFront());

    }
}
