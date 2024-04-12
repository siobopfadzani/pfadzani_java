package usermanagement;
public class UserDOA {
    
    public static String[][] UserData = new String[100][5];
    public static int position = 0;

    public static void createUser(String name, String surname, String email, String dob, String id) 
    {
        UserData[position] = new String[]{name, surname, email, dob, id};
        position++;
    }

    public static String[] getUserByEmail(String email) 
    {
        for (String[] row : UserData) {
            if (row != null && row[2] != null && email.equals(row[2])) {
                return row;
            }
        }
        return null;
    }

    public static String[][] findAll() {
        return UserData;
    }

    public static void updateUser(String name, String surname, String email, String dob, String id) 
    {
        for (int i = 0; i < position; i++) {
            if (UserData[i] != null && email.equals(UserData[i][2])) {
                UserData[i] = new String[]{name, surname, email, dob, id};
                return;
            }
        }
    }

    public static void deleteUser(String email) {
        for (int i = 0; i < position; i++) {
            if (UserData[i] != null && email.equals(UserData[i][2])) {
               
                for (int j = i; j < position - 1; j++) {
                    UserData[j] = UserData[j + 1];
                }
          
                UserData[position - 1] = null;
                
                position--;
                return;
            }
        }
    }
}
