package registry;

import registry.exception.*;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            Persona persona = new Persona();
            System.out.print("ID: ");
            String id = input.next();
            persona.setId(id);
            System.out.print("Name: ");
            String name = input.next();
            persona.setName(name);
            System.out.print("Phone: ");
            String phone = input.next();
            persona.setPhone(phone);
            System.out.print("Email: ");
            String email = input.next();
            persona.setEmail(email);
            System.out.println("New Persona: " + persona.toString());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("Registry finished");
        }
    }
}
