package annotation.hibernates;


@Table("t_user")
public class User {

    @Column("name")
    private String name;
    @Column("password")
    private String password;

    public String getName() {
        return name;
    }
    public String getPassword() {
        return password;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPassword(String password) {
        this.password = password;
    }

}
