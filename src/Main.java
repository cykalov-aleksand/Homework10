public class Main {
    public static void main(String[] args) {
        System.out.println("-----------------Задание №1------------------------");
        System.out.println("Исходные данные");
        String firstName="Ivan ";
        System.out.println("Имя: "+firstName);
        firstName = firstName.replace(" ", "");
        String midleName="Ivanovich ";
        System.out.println("Отчество: "+midleName);
        midleName=midleName.replace(" ","");
        String lastName="Ivanov";
        System.out.println("Фамилия: "+lastName);
        System.out.println("Первоночально удаляем все возможные пробелы которые могли возникнуть при вводе данных и формируем строку");
        lastName=lastName.replace(" ","");
        String fullName=lastName+' '+firstName+' '+midleName;
        System.out.println("Ф. И. О. сотрудника — "+fullName);

        System.out.println("\n-----------------Задание №2------------------------");
        System.out.println("Исходная строка: "+fullName);
        fullName=fullName.toUpperCase();
        System.out.println("Данные Ф. И. О. сотрудника для заполнения отчета — "+fullName);

        System.out.println("\n-----------------Задание №3------------------------");
        fullName="Иванов Семён Семёнович";
        System.out.println("Исходная строка - "+fullName);
        fullName=fullName.replace("ё", "е");
        System.out.println("Данные Ф. И. О. сотрудника — "+fullName);

    }
}