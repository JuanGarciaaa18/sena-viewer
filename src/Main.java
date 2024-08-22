import edu.misena.senaviewer.model.*;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static List<Movie> movies = new ArrayList<>();
    private static List<Serie> series = new ArrayList<>();
    private static List<Book> books = new ArrayList<>();
    private static List<Magazine> magazines = new ArrayList<>();

    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);



        Book Book = new Book("s","s","d",2);
        Movie Movie= new Movie("s","s","s",12,2000);
        Serie Serie = new Serie("f","g",12);
        Chapter Chapter = new Chapter("s",12,2003);
        Magazine Magazine = new Magazine("s","s","as");
        int opcion;
        int opcion1;
        int opcion2;
        int opcion3;
        int opcion4;
        do{
            String message = "\n\n!Bienvenido a SenaViewed¡\n\n";

            message += "1. Book\n";
            message += "2. Serie\n";
            message += "3. Movie\n";
            message += "4. Serie\n";
            message += "5. Magazine\n";
            message += "6. Reporte\n";
            message += "7. Salir...\n\n";

            System.out.println(message);

            System.out.println("Elige tu Menu: ");
            opcion = scanner.nextInt();

            switch (opcion){
                case 1:

                   do {
                       System.out.println("1. title \n 2. editionDate \n 3. isbn\n 4. isbn\n 5. Libro completo\n");
                       opcion =scanner.nextInt();
                       switch (opcion){
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
                                       "El titulo del libro es: " + Book.getTitle()+ "\n" +
                                       "La fecha de edicion del libro es: " + Book.getEditionDate()+ "\n" +
                                       "El editorial del libro es: " + Book.getEditionDate()+ "\n" +
                                       "El isbn del libro es: " + Book.getIsbnsbn() +"\n"
                               );
                               break;

                       }
                   break;
                   }while (opcion!=6);

                   break;

                case 2:
                    do {
                        System.out.println("1. title \n 2. genero \n 3. duracion\n 4. serie completa\n");
                        opcion1 =scanner.nextInt();
                        switch (opcion1){
                            case 1:
                                System.out.println("El titulo de la serie es: " + Serie.getTitle()+ "\n");
                                break;
                            case 2:
                                System.out.println("El genero de la serie es: " + Serie.getGenre()+ "\n");
                                break;
                            case 3:
                                System.out.println("La duracion de la serie es: " + Serie.getDuration()+ "\n");
                                break;
                            case 4:
                                System.out.println("Serie completa: \n" +
                                        "El titulo de la serie es: " + Serie.getTitle()+ "\n" +
                                        "El genero de la serie es: " + Serie.getGenre()+ "\n" +
                                        "La duracion de la serie es: " + Serie.getDuration() +"\n"
                                );
                                break;

                        }
                        break;
                    }while (opcion1!=5);

                    break;

                case 3:
                    do {
                        System.out.println("1. title \n 2. genre \n 3. creator\n 4. Duration\n 5.Movie completo");
                        opcion2 =scanner.nextInt();
                        switch (opcion2){
                            case 1:
                                System.out.println("El titulo de la movie es: " + Movie.getTitle()+ "\n");
                                break;
                            case 2:
                                System.out.println("el genre de la movie es: " + Movie.getGenre()+ "\n");

                                break;
                            case 3:
                                System.out.println("El creator de la movie es: " + Movie.getCreator()+ "\n");
                                break;
                            case 4:
                                System.out.println("la duracion de la movie es: " + Movie.getDuration()+ "\n");
                                break;

                            case 5:
                                System.out.println("Movie completa: \n" +
                                        "El titulo de la movie es: " + Movie.getTitle()+ "\n" +
                                        "el genre de la movie es: " + Movie.getGenre()+ "\n" +
                                        "El creator de la movie es: " + Movie.getCreator()+
                                        "la duracion de la movie es: " + Movie.getDuration()
                                );
                                break;

                        }
                        break;
                    }while (opcion2!=5);
                    break;


                case 4:
                    do {
                        System.out.println("1. title \n 2. duracion \n 3. año\n 4. chapter completo\n");
                        opcion3 =scanner.nextInt();
                        switch (opcion3){
                            case 1:
                                System.out.println("El titulo del chapter es: " + Chapter.getTitle()+ "\n");
                                break;
                            case 2:
                                System.out.println("La duracion del chapter es: " + Chapter.getDuration()+ "\n");

                                break;
                            case 3:
                                System.out.println("El año del chapter es: " + Chapter.getYear()+ "\n");
                                break;
                            case 4:
                                System.out.println("Chapter completo: \n" +
                                        "El titulo del chapter es: " + Chapter.getTitle()+ "\n" +
                                        "La duracion del chapter es: " + Chapter.getDuration() +"\n" +
                                        "El año del chapter es: " + Chapter.getYear()+ "\n"
                                );
                                break;

                        }
                        break;
                    }while (opcion3!=5);
                    break;
                case 5:
                    do {
                        System.out.println("1. title \n 2. editiondate \n 3. editorial \n 4. magazine completo\n");
                        opcion4 =scanner.nextInt();
                        switch (opcion4){
                            case 1:
                                System.out.println("El titulo del magazine es: " + Magazine.getTitle()+ "\n");
                                break;
                            case 2:
                                System.out.println("la fecha de edicion del magazine es: " + Magazine.getEditionDate()+ "\n");

                                break;
                            case 3:
                                System.out.println("El editorial del magazine es: " + Magazine.getEditorial()+ "\n");
                                break;
                            case 4:
                                System.out.println("Magazine completo: \n" +
                                        "El titulo del magazine es: " + Magazine.getTitle()+ "\n" +
                                        "La fecha de duracion del magazine es: " + Magazine.getEditionDate() +"\n" +
                                        "El editorial del magazine es: " + Magazine.getEditorial()+ "\n"
                                );
                                break;

                        }
                        break;
                    }while (opcion4!=5);
                    break;

                case 6:
                    generateReport();
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Ingrese una opción valida");
                    break;

            }


        }while(opcion !=8);

    }

    private static void generateReport() {
        System.out.println("\n--- General Report ---");
        System.out.println("Total Movies: " + movies.size());
        System.out.println("Total Series: " + series.size());
        System.out.println("Total Books: " + books.size());
        System.out.println("Total Magazines: " + magazines.size());
    }

}