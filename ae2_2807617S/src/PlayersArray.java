public class PlayersArray {

    public class PersonArray {
        public static void main(String[] args) {
            Player[] players = new Player[2];
            players[0] = new Player("Leo", 22);
            players[1] = new Player("Andy",26);

            // Loop to compute total age
            int totalAge = 0;
            for(int i=0;i<players.length;i++) {
                totalAge += players[i].getAge();
            }
            System.out.println(totalAge);

            // adding children to the person
            Person p = new Person("Zoe",1,"blue");
            players[0].addChild(p); // Zoe is Bill's child

            /*
             * another child for Bill
             * note that we can make it and pass it
             * in one go
             */
            players[0].addChild(new Person("Paul",5,"brown"));

            // A child for clare
            players[3].addChild(new Person("Harris",5,"green"));
            for(int i=0;i<players.length;i++) {
                System.out.println(players[i]);
            }
        }
    }

}
