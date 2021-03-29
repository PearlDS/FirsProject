package OefeningenWorldOfPeaceCraft;

public class Oef2 {
    public static void main(String[] args) {

        final int MAX_FRIENDSHIP_LEVEL = 20;
        int numberOfPresentsYouOwn = 43;
        int currentShopKeeperLevel = 0;

        while (currentShopKeeperLevel < MAX_FRIENDSHIP_LEVEL){
            numberOfPresentsYouOwn--;
            currentShopKeeperLevel++;
            System.out.print("You gave the shopkeeper a present. Current level of shopkeeper: "+currentShopKeeperLevel++);


        }
        System.out.println(numberOfPresentsYouOwn);
    }
}
