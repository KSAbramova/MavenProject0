/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
import java.util.List;
/**
 *
 * @author 79031
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        YamlReader reader = new YamlReader();
        List<Person> people = reader.readPeople();
        
        for (Person p : people) {
            System.out.println(p);
        }
    }
}