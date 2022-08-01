import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        //### **Задание 1**
        //Представим, что мы работаем в небольшой компании.
        // Данные сотрудников хранятся в неструктурированном формате, и бухгалтерия попросила написать программу, в которой можно работать с Ф.И.О. сотрудников.
        //Напишите четыре строки:
        //первая с именем firstName — для хранения имени;
        //вторая с именем middleName — для хранения отчества;
        //третья с именем lastName — для хранения фамилии;
        //четвертая с именем fullName — для хранения Ф.И.О. сотрудника в формате "Фамилия Имя Отчество".
        //Выведите в консоль фразу: “ФИО сотрудника — ….”
        //В качестве данных для задачи используйте “Ivanov Ivan Ivanovich”.
        System.out.println("Задание 1");
        String firstName = "Ivan";
        String middleName = "Ivanovich";
        String lastName = "Ivanov";
        String fullName = lastName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName + ".");

        //### **Задание 2**
        //Для подачи ежемесячного отчета и ведения документации нашей бухгалтерии нужны
        // Ф.И.О. сотрудников, полностью написанные заглавными буквами (верхним регистром).
        //Напишите программу, которая изменит написание Ф. И. О. сотрудника с “Ivanov Ivan Ivanovich” на полностью заглавные буквы.
        //В качестве строки с исходными данными используйте строку fullName.
        //Результат программы выведите в консоль в формате: ”Данные ФИО сотрудника для заполнения отчета — …”
        System.out.println("Задание 2");
        String fullNameUpper = fullName.toUpperCase();
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullNameUpper);

        //### **Задание 3**
        //Система, в которой мы работаем, не принимает символ “ё”.
        //Поэтому нам нужно написать программу, которая заменяет символ “ё” на символ “е”.
        //В качестве исходных данных используйте строку fullName и данные в ней “Иванов Семён Семёнович”.
        //Выведите результат программы в консоль в формате: ”Данные ФИО сотрудника — ...”
        System.out.println("Задание 3");
        fullName = "Иванов Семён Семёнович";
        System.out.println("Данные ФИО сотрудника — " + fullName.replace('ё', 'е'));

        //Задание 4
        //К нам снова обратились за помощью, но теперь уже для того, чтобы написать алгоритм,
        // разбивающий одну строку с Ф. И. О. на три — на фамилию, имя и отчество.
        //В качестве исходных данных используйте:
        //Ф. И. О. сотрудника: “Ivanov Ivan Ivanovich”;
        //строка fullName — для хранения Ф. И. О. сотрудника в формате фамилия - имя - отчество;
        //переменная firstName — для хранения имени;
        //переменная middleName — для хранения отчества;
        //переменная lastName — для хранения фамилии.
        //Решите задание с помощью метода substring().
        //Результат программы выведите в формате:
        //“Имя сотрудника — …”
        //“Фамилия сотрудника — …”
        //“Отчество сотрудника — ...”
        //:лампочка: Важно: «в голове» высчитывать позиции пробелов и параметров для обрезания строки запрещено. Их должен вычислить компьютер.
        //:sos: Подсказка - Определить индексы символов помогут методы indexOf() и lastIndexOf().
        System.out.println("Задание 4");
        fullName = "Ivanov Ivan Ivanovich";
        int firstSpace = fullName.indexOf(' ');     //получаем номер ячейки первого пробела
        int lastSpace = fullName.lastIndexOf(' '); //получаем номер ячейки последнего пробела
        lastName = fullName.substring(0, firstSpace);   //выделяем фамилию, что до первого пробела
        firstName = fullName.substring(firstSpace, lastSpace);      //выделяем имя, что между первым и до второго пробела
        middleName = fullName.substring(lastSpace);     //выделяем отчество, что после последнего пробела
        System.out.println("Имя сотрудника — " + firstName);
        System.out.println("Фамилия сотрудника — " + lastName);
        System.out.println("Отчество сотрудника — " + middleName);

        //Задание 5
        //Периодически данные в наших регистрах заполняются неверно, и Ф. И. О. сотрудников записывают со строчных букв.
        //Такую оплошность нужно исправить, написав программу, которая преобразует написанное со строчных букв Ф. И. О. в правильный формат.
        //В качестве исходных данных используйте строку fullName c данными “ivanov ivan ivanovich“, которые нужно преобразовать в “Ivanov Ivan Ivanovich”.
        //Выведите результат программы в консоль в формате: “Верное написание Ф. И. О. сотрудника с заглавных букв — …”
        //:sos: Подсказка 1
        //Метод toCharArray() может быть полезен.
        //:sos: Подсказка 2
        //Для преобразования символа в верхний регистр следует использовать метод Character.toUpperCase(c), где c — символ.
        System.out.println("Задание 5");
        fullName = "ivanov ivan ivanovich";
        int firstNameLetterNum = fullName.indexOf(' ') + 1;     //получаем номер ячейки первой буквы, которая следует после первого пробела
        int firstMiddleNameNum = fullName.lastIndexOf(' ') + 1; //получаем номер ячейки первой буквы, которая следует после последнего пробела
        char[] arrayOfFullName = fullName.toCharArray();        //преобразуем строку в массив для последующих операций
        arrayOfFullName[0] = Character.toUpperCase(arrayOfFullName[0]);
        arrayOfFullName[firstNameLetterNum] = Character.toUpperCase(arrayOfFullName[firstMiddleNameNum]);
        arrayOfFullName[firstMiddleNameNum] = Character.toUpperCase(arrayOfFullName[firstMiddleNameNum]);
        StringBuilder sbf = new StringBuilder();        //создаём сущность для "арифметики" со строкаим
        sbf.append(arrayOfFullName);        //собираем цельную строку из массива символов
        System.out.println("Верное написание Ф. И. О. сотрудника с заглавных букв — " + sbf);

        //Задание 6
        //Имеется две строки.
        //Первая: "135"
        //Вторая: "246"
        //Соберите из двух строк одну, содержащую данные "123456".
        //Использовать сортировку нельзя.
        //Набор чисел задан для понимания позиций, которые они должны занять в итоговой строке.
        //Выведите результат в консоль в формате: “Данные строки — ….”
        //:sos: Подсказка
        //Следует использовать StringBuilder.
        System.out.println("Задание 6");
        String firstString = "135";
        String secondString = "246";
        char[] secondStringArray = secondString.toCharArray();
        StringBuilder summOfStrings = new StringBuilder();        //создаём сущность для "арифметики" со строкаим
        summOfStrings.append(firstString);
        int j = 1;      //переменная  для инкремента
        for (int i = 0; i < 3; i++) {        //создаём цикл перебора массивов
            summOfStrings.insert(j, secondStringArray[i]);        //вставляем значения из второго массива значения в первую строку начиная со 2й "ячейки""
            j = j + 2;      //как-то по другом не придумал )
        }
        System.out.println("Данные строки — " + summOfStrings);

        // Задание 7
        //Дана строка из букв английского алфавита "aabccddefgghiijjkk".
        //Нужно найти и напечатать буквы, которые дублируются в строке.
        //Обратите внимание, что строка отсортирована, т. е. дубли идут друг за другом.
        //В итоге в консоль должен быть выведен результат программы: "acdgijk".
        System.out.println("Задание 7");
        String letters = "aabccddefgghiijjkk";
        char[] lettersArray = letters.toCharArray();        //преобразуем строку в массив символов
        for (int i = 0; i < lettersArray.length - 1; i++) {     //перебираем массив до пердпоследнего значения
            if (lettersArray[i] == lettersArray[i + 1]) {       //сравниваем по очереди два соседних символа, при совпадении выводим первый в консоль
                System.out.print(lettersArray[i]);
            }
        }
    }
}