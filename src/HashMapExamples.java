package lesson31;

import java.lang.reflect.Array;
import java.util.*;

public class HashMapExamples {
    publuc static void main(String[] args){
        /*   Map<Integer, String> studLst = new HashMap<>();
        studLst.put(1, "alisionok Ekatyerina");
        studLst.put(3, "Kozlovskiy Kostya");
        studLst.put(5, "Klasyco Denis");
        studLst.put(2, "Kalckiy Pavel");
        studLst.put(4, "Kondratenko Vladimir");

        for(Integer key : studLst.entrySet()){
            System.out.println(key + " " + studLst.get(key));
        }*/
/*
        //картотека котов"кличка - вес"
        Map<String,Integer> catCabinet = new HashMap<>();
        Random gen = new Random();
        String[] catNames = {"Vasyka","Barsic","Myrzik", "Boris", "Kesha","Murka"};
        for(int i =0; i<catNames.length;i++){
            Integer catRandomIndex = gen.nextInt(catNames.length);
            String catName = catNames[catRandomIndex];
            Integer weight = gen.nextInt(10)+1;
            System.out.println(catName+" "+ weight);
            catCabinet.put(catName,weight);
        }
        System.out.println("Kartoteka");
        for (String key : catCabinet.keySet()){
            System.out.println(key+" "+catCabinet.get(key));
        }

        if (catCabinet.containsValue(5)){
            for (Map.Entry<String, Integer> pair: catCabinet.entrySet()){
                if (pair.getValue().equals(5)){
                    System.out.println(pair.getKey());
                }
            }
        }
        else {
            System.out.println("No have");
        }


        String str = "My mum is 41 years old. She is very nice. My mum is small and slim. She has got blue eyes and short hair. Her favorite clothes are skirts, blouses, and dresses. Her favorite colors are green and yellow. Her favorite food is salad and all kinds of vegetables. Her favorite animal is fish. She loves walking in the forest, but she hates skiing. Her hobbies are shopping and cooking. She can cook very well, and she always cleans the house. My mum always says to me that I should be a good student. I love my mum because she is very nice." ;
        String[] words = str.split("\\\\s|,|!|;|-|[0-9]| |\\.\\\\" );
        Map<String, Integer> dict = new HashMap<>();
        for (String word:words){
            if (dict.containsKey(word)){
                dict.put(word,dict.get(word)+1);
            }
            else{
                dict.put(word,1);
            }
        }
        System.out.println("dictionary");
        for (String key: dict.keySet()){
            System.out.println(key + " " + dict.get(key));
        }
*/


        Map<Person, List<? extends Pet>> hm1 = new HashMap<>();
        hm1.put(new Person("Ivan"), Arrays.asList(new Cat("Vasya"),new Dog("Borya")));
    }
}
