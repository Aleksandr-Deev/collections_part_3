package phoneBook;

public class Main {
    public static void main(String[] args) {

        PhoneBook phoneBook = new PhoneBook();
        phoneBook.addPhone("Иванов Петр", "+791745612756489");
        phoneBook.addPhone("Петров Иван", "+79174513522489");
        phoneBook.addPhone("Иванов Алексей", "+79174561289");
        phoneBook.addPhone("Алексеев Петр", "+79174561456289");
        phoneBook.addPhone("Михайлов Петр", "+791745615454289");
        phoneBook.addPhone("Иванов Станислав", "+79174561289");
        phoneBook.addPhone("Жуков Дмитрий", "+79174561545289");
        phoneBook.addPhone("Дмитриев Петр", "+79174561445289");
        phoneBook.addPhone("Иванов Сергей", "+79174561278789");
        phoneBook.addPhone("Сергеев Петр", "+79174561265489");
        phoneBook.addPhone("Иванов Константин", "+791744882561289");
        phoneBook.addPhone("Плпхов Петр", "+7917456157854289");
        phoneBook.addPhone("Сергеев Прошка", "+791745664511289");
        phoneBook.addPhone("Пертров Ниф-Ниф", "+79172454561289");
        phoneBook.addPhone("Сорокина Елена", "+791242474561289");
        phoneBook.addPhone("Вожатая Екатерина", "+791145474561289");
        phoneBook.addPhone("Песков Руслан", "+791745612466389");
        phoneBook.addPhone("Гномов Василий", "+79174565421289");
        phoneBook.addPhone("Федосеев Матвей", "+79174564543511289");
        phoneBook.addPhone("Матвеев Федосей", "+791745612455489");

        System.out.print(phoneBook.getPrint());
    }
}