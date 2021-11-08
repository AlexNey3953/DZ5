package OOP;

public class employee {

    private String firstName;
    private String patronymic;
    private String lastName;

    private String post;

    private String email;

    private String phoneNumber;

    private int salary;

    private int age;

    public employee(String firstName, String patronymic, String lastName, String post, String email, String phoneNumber, int salary, int age){

        this.firstName   = firstName;
        this.patronymic  = patronymic;
        this.lastName    = lastName;
        this.post        = post;
        this.email       = email;
        this.phoneNumber = phoneNumber;
        this.salary      = salary;
        this.age         = age;

    }

    public void Info(){

        System.out.printf("%s  %s  %s\n", lastName, firstName, patronymic);
        System.out.println("\tpost: \t\t"   + post);
        System.out.println("\temail: \t\t"  + email);
        System.out.println("\tphone: \t\t"  + phoneNumber);
        System.out.println("\tsalary: \t" + salary);
        System.out.println("\tagy: \t\t"    + age);

    }

    public int getAge(){
        return age;
    }



}
