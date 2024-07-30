package DZ5;


public class TestUser {
    public static void main(String[] args) {

        String[] firstNames = {"Саша", "Петя", "Коля", "Вася", "Даша", "Оля", "Боря", "Катя", "Федя", "Ира"};
        User.max = firstNames.length;
        String lastName = "Иванов";
        User[] users = new User[User.max];

        for (int i = 0; i < firstNames.length; i++) {
            users[i] = new User(i, firstNames[i], lastName);
            System.out.println(users[i].id);
        }

    }
}
