package Ejercicios_Clase_10;

import java.time.LocalDate;

public class Client extends Person{

    //Constructor
    public Client() {
    }
    public Client(String name, String surname, String phoneNumber, String email, LocalDate dateOfBirth) {
        super(name, surname, phoneNumber, email, dateOfBirth);
    }
}
