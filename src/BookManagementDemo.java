import java.io.IOException;
import java.sql.Connection;
import java.util.Scanner;

public class BookManagementDemo {
    public static void main(String[] args) throws IOException {
        int menu;
        System.out.println("Welcome to Library book management program DEMO version");
        System.out.println("By: Ceceg");
        Scanner sc = new Scanner(System.in);
        System.out.print("Menu ⤵\n1. Add a new book\n2. Update a information of book\n3. Delete a book\n4. Show all book data\n5. Quit\nChoose menu: ");
        menu = sc.nextInt();
        while (true) {
            if (menu == 5){
                System.out.println("Thank you. Hope you come next time too ( ͡ ◡ ͡)");
                break;
            } else if (menu == 1) {
                System.out.println("Add data");
            } else if (menu == 2) {
                System.out.println("Update");
            } else if (menu == 3) {
                System.out.println("Delete");
            } else if (menu == 4) {
                System.out.println("Show");
            }
            else {
                System.out.println("Please select from menu...ᕙ(⦿‿⦿)ノ");
            }
        }
    }
}
