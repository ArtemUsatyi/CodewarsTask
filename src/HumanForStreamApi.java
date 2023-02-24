public class HumanForStreamApi {
    private int countFriend;
    private String name;
    private String surname;

    public HumanForStreamApi(int countFriend, String name, String surname) {
        this.countFriend = countFriend;
        this.name = name;
        this.surname = surname;
    }

    public int getCountFriend() {
        return countFriend;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    @Override
    public String toString() {
        return "Human {" +
                "countFriend=" + countFriend +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
