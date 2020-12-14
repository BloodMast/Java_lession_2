package lession3;

public class Main2 {
    public static void main(String[] args){

        // Создаем новый телефонный справочник
        PhoneBook PhoneBook = new PhoneBook();

        // Вносим номера и фамилии
        PhoneBook.add("Кириленко", "112233");
        PhoneBook.add("Прокопенко", "123456");
        PhoneBook.add("Москвиченко", "654321");
        PhoneBook.add("Кириленко", "7890");
        PhoneBook.add("Прокопенко", "0987");


      // получаем номера по фамилии
        System.out.println(PhoneBook.get("Кириленко"));
        System.out.println(PhoneBook.get("Москвиченко"));
        System.out.println(PhoneBook.get("Прокопенко"));


        // Запрашиваем фамилию, которой нет в справочнике
        System.out.println(PhoneBook.get("Кузнецов"));


        // Запись уже имеющегося номера
        PhoneBook.add("Прокопенко", "123456");
        System.out.println(PhoneBook.get("Прокопенко"));
    }
}
