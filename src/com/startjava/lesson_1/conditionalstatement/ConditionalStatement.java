package src.com.startjava.lesson_1.conditionalstatement;

public class ConditionalStatement {
    public static void main(String[] args) {
        int age = 23;
        char firstLetterName = 'N';
        boolean maleGender = true;
        float height = 1.75f;

        if(age > 20) {
            System.out.println("Возраст пользователя: " + age);
        }

        if(maleGender) {
            System.out.println("Пол пользователя: Мужской" );
        }

        if(!maleGender) {
            System.out.println("Пол пользователя: Женский" );
        }

        if(height < 1.80) {
            System.out.println("Рост пользователя ниже 180 см: " + height);
        } else {
            System.out.println("Рост пользователя выше 180 см: " + height);
        }

        if(firstLetterName == 'M') {
            System.out.println("Первая буква в имени пользователя начинается с " + firstLetterName);
        } else if(firstLetterName == 'I') {
            System.out.println("Первая буква в имени пользователя начинается с " + firstLetterName);
        } else {
            System.out.println("Первая буква в имени пользователя начинается с " + firstLetterName);
        }
    }
}







