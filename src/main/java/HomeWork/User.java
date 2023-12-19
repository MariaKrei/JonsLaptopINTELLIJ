package HomeWork;

public class User {
    protected String name;
    protected int phoneNumber;

    public User(String name, int phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
        public String getName() {
            return name;
        }
        public int getNumber() {
        return phoneNumber;}
        }
        class UserInfo extends User{
    private String address;
            public UserInfo(String name, int phoneNumber, String address) {
                super(name, phoneNumber);
                this.address = address;
            }
            public void userDetails(){
                System.out.println(name+" "+phoneNumber+" "+address);
            }
            public static void main(String[] args) {
                UserInfo n=new UserInfo("Maria", 312654789,"10 Sunny Valley ");
                n.userDetails();
            }
        }
