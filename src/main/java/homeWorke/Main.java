package homeWorke;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        HashMap <Integer, String> digitsMap = new HashMap<>();
        digitsMap.put(5,"FIVE");
        digitsMap.put(1,"ONE");
        digitsMap.put(4,"FOUR");
        digitsMap.put(2,"TWO");
        digitsMap.put(3,"THREE");

        System.out.println("Ключь:Значения");
        for (Integer i:digitsMap.keySet()) {
            System.out.println(i + ":" + digitsMap.get(i));
             //Если вы имели ввиду вывисти на экран в том порядке как она заполнена то нужно сделать это
            //без forech а без него нельзя
        }

        System.out.println("\n==============\n");

        //HashMap <Integer, String >digitsMap2  = new HashMap<>();
        for (int i = 0; i < 10; i++) {
            int random = 1 + (int) (Math.random() * 10);//рандом выводит не 10 чисел а по разному: 5,7,9,4
            digitsMap.put(random,"digit"+random);
        }
        for (Integer key: digitsMap.keySet()) {
            if(key != null) {
                System.out.println(key + ":" + digitsMap.get(key));
            }else{
                System.out.println("Нет рандомного числа но вывидим название " + digitsMap.get(key));
            }
        }

        System.out.println("\n==============\n");


        for (Integer key:digitsMap.keySet()) {
            digitsMap.put(key,"digit" + key);
        }

        System.out.println("Ключь:Значения");
        for (Integer i:digitsMap.keySet()) {
            System.out.println(i + ":" + digitsMap.get(i));
        }


        System.out.println("\n==============\n");


        HashMap<String, Integer> digitsMap2 = new HashMap<>();
        for (Integer key:digitsMap.keySet()) 
            digitsMap2.put("Digit" + key, key);


        for (int i = 0; i < digitsMap2.size(); i++) {
            System.out.println(digitsMap2.keySet() + ":" + i);
            //Не нашел ошибку думаю это изза forech
        }


        System.out.println("\n==============\n");

        //1 размер
        digitsMap.size();

        //2 все ключи
        for(Integer i: digitsMap.keySet())
            System.out.println(i);

        // 3 все значения
        for(String i: digitsMap.values())
            System.out.println(i);

        // 4 вывести все
        for(Integer key : digitsMap.keySet())
            System.out.println("key:" + key + "value:" + digitsMap.get(key));

        for(String key : digitsMap2.keySet())
            System.out.println("key:" + key + "value:" + digitsMap.get(key));
    }
}
