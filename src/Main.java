import edu.misena.senaviewer.model.Book;
import edu.misena.senaviewer.model.Chapter;
import edu.misena.senaviewer.model.Magazine;
import edu.misena.senaviewer.model.Serie;


import java.util.Scanner;

public class Main {



    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);

        Book Book = new Book("s","s","d",2);
        Serie Serie = new Serie("f","g",12);
        Chapter Chapter = new Chapter("s",12,2003);
        Magazine Magazine = new Magazine("s","s","as");
        int opcion;
        int opcion1;

        do{
            String message = "\n\n!Bienvenido a SenaViewed¡\n\n";

            message += "1. Book\n";
            message += "2. Chapter\n";
            message += "3. Movie\n";
            message += "4. Serie\n";
            message += "5. Magazine\n";
            message += "6. Salir...\n\n";

            System.out.println(message);

            System.out.println("Elige tu Menu: ");
            opcion = scanner.nextInt();

            switch (opcion){
                case 1:

                   do {
                       System.out.println("1. title \n 2. editionDate \n 3. isbn\n 4. isbn\n 5. Libro completo\n");
                       opcion1 =scanner.nextInt();
                       switch (opcion1){
                           case 1:
                               System.out.println("El titulo del libro es: " + Book.getTitle()+ "\n");
                       break;
                           case 2:
                               System.out.println("La fecha de edicion del libro es: " + Book.getEditionDate()+ "\n");
                               break;
                           case 3:
                               System.out.println("El editorial del libro es: " + Book.getEditorial()+ "\n");
                               break;
                           case 4:
                               System.out.println("El isbn del libro es: " + Book.getIsbnsbn()+ "\n");
                               break;
                           case 5:
                               System.out.println("libro completo: \n" +
                                       "El titulo de la pelicula es: " + Book.getTitle()+ "\n" +
                                       "El titulo de la pelicula es: " + Book.getEditionDate()+ "\n" +
                                       "El titulo de la pelicula es: " + Book.getEditionDate()+ "\n" +
                                       "El titulo de la pelicula es: " + Book.getIsbnsbn() +"\n"
                               );
                               break;

                       }
                   break;
                   }while (opcion1!=6);

                   break;

                case 2:
                    System.out.println("Libros que se encuentran en la lista: \n" + Serie.getTitle());
                    break;
                case 3:
                    System.out.println("Libros que se encuentran en la lista: \n" + Chapter.getTitle());
                    break;
                case 4:
                    System.out.println("Libros que se encuentran en la lista: \n" + Magazine.getTitle());
                    break;
                case 5:
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Ingrese una opción valida");
                    break;

            }


        }while(opcion !=6);

    }



}