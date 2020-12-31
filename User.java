
public class User {
    private String username;
    private String password;
    private int age;
    private boolean girlfriend;


    public User(){

    }

    public User(String username, String password, int age, boolean girlfriend) {
        this.username = username;
        this.password = password;
        this.age = age;
        this.girlfriend = girlfriend;
    }

    public User(Integer a, String b) {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isGirlfriend() {
        return girlfriend;
    }

    public void setGirlfriend(boolean girlfriend) {
        this.girlfriend = girlfriend;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", age=" + age +
                ", girlfriend=" + girlfriend +
                '}';
    }
}

