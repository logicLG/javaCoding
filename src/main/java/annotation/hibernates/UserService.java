package annotation.hibernates;


public class UserService {

    public static void main(String[] args) {
        // TODO Auto-generated constructor stub

        UserDao userDao = new UserDao();
        User user = new User();
        user.setName("cai");
        user.setPassword("123456");
        try {
            System.out.println(userDao.save(user));
        } catch (IllegalArgumentException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }

}
