//Napisz program, w którym wczytasz od użytkownika 5 imion,
// a następnie wyświetlisz na ekranie powitanie każdej z osób, ale w kolejności odwrotnej niż je wprowadzono.

public class Names {
    public static void main(String[] args) {
        String [] person = new String [5];
        person [0] = "Agata";
        person [1] = "Wojtek";
        person [2] = "Kasia";
        person [3] = "Karol";
        person [4] = "Dominika";

        System.out.println("Cześć " + person[4]);
        System.out.println("Cześć " + person[3]);
        System.out.println("Cześć " + person[2]);
        System.out.println("Cześć " + person[1]);
        System.out.println("Cześć " + person[0]);

    }
}

