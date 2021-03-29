package Examen;
import java.util.Random;

public class Oefening2 {
    public static void main(String[] args) {

        int TotalStocks = 2;

        Random random = new Random();
        int Sellprice = random.nextInt(400);
        System.out.println(Sellprice);

        int result = Sellprice * 2;

        if (result > 700) ;

            {System.out.println("TROUWEN");}


        else if (result > 300 && result<750);

            {System.out.println("IPAD");}


        else if (result > 100 && result<300);

            {System.out.println("RESTAURANT");}


        else (result < 100) ;

        {System.out.println("GEDUMPT");}

    }}



