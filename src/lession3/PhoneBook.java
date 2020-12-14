package lession3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class PhoneBook {

    private HashMap<String, List<String>> pb;

    public PhoneBook(){
        this.pb = new HashMap<>();
    }
     public void add(String surname, String number){
        if(pb.containsKey(surname)){
            List<String> numbers = pb.get(surname);
            if(!numbers.contains(number)){
                numbers.add(number);
                System.out.println(String.format("Номер " + number + " для " + surname));
            } else {
                System.out.println(String.format("Номер " + number + " для " + surname + " Уже существует"));
            }
        } else {
            pb.put(surname, new ArrayList<>(Arrays.asList(number)));
            System.out.println(String.format("Номер " + number + " для " + surname));
        }
    }

    public List<String> get(String surname){
        if(pb.containsKey(surname)){
            return pb.get(surname);
        } else {
            System.out.println(String.format("Такой фамилии нет ", surname));
            return new ArrayList<>();
        }
    }
}
