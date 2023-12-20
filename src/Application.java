import java.io.IOException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public interface Application
{
    static void main(String[] args) throws IOException
    {
        System.out.println("Jak chcesz się zalogować?\n");
        System.out.println("1. Obywatel");
        System.out.println("2. Urzędnik");

        Scanner in = new Scanner(System.in);
        int input = in.nextInt();
        switch (input)
        {
            case 1:
                CitizenView citizen = new CitizenView();
                break;
            case 2:
                ClerkView clerk = new ClerkView();
                break;
        }

    }
    boolean login(long PESEL, String password);
    boolean verifyData(long PESEL, LocalDate birthDate, boolean sex);
    ArrayList<Record> showData(Record criteria);
    boolean changeData(long PESEL, Record record, boolean newData);
    int createAccount(long PESEL, String password);
}
