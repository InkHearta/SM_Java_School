package Java1.DZ5;

public class User {
    static int max; // поле для вычисления верхнего предела id всех пользователей
    int id = randomId();
    int age;
    String firstName;
    String lastName;

public User(int age, String firstName, String lastName){
this.age = age;
this.firstName = firstName;
this.lastName = lastName;
}
public int randomId(){
    int randomId = (int) (Math.random()*max);
    return randomId;
}


}
