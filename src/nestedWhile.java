public class nestedWhile {
    public static void main(String[] args) {
        String star = "*";
        int counter = 0;
        int counter1 = 0;
        //Problem One
        while (counter < 4) {
            System.out.println(star);
            star += "*";
            counter++;
        }
        //Problem Two
        counter = 4;
        System.out.println();
        while(counter > 0) {
            counter = counter1;
            while(counter1 > 0) {
                System.out.print("*");
                counter1--;
            }
            System.out.println();
            counter--;
        }
        //Problem Three
        System.out.println();
        counter=0;
        star="";
        while(counter<4){
            star+="***";
            counter++;
            System.out.println(star);
        }
        //Problem Four
        System.out.println();
        for(int i = 1; i < 5; i++){
            for(int j = i; j > 0; j--)
                System.out.println("*");
            System.out.println("X");
        }
        //Problem Five
        System.out.println();
        counter = 0;
        while(counter<3){
            for(int i = 0; i < 5; i++){
                System.out.print("*");
            }
            System.out.println();
            counter++;
        }
        //Problem Six
        System.out.println();
        counter = 0;
        star="*";
        while(counter < 5){
            System.out.println(star);
            star+="*";
            counter++;
        }
        System.out.println();
        //Problem 1a
        counter = 0;
        String prime = "";
        for(int i = 1; i <= 1000; i++){
            counter = 0;
            for(int j = i; j >= 1; j--){
                if(i%j==0){
                    counter++;
                }
            }
            if(counter==2){
                prime = prime + i +"\n";
            }
        }
        System.out.println(prime);
        /*
        The first loop loops 1000 times which make sure the range is from 1 to 1000. The second loop runs every number from the number
        being checked to 1 amd it mods each number. If the number being checked mod any of the other numbers besides itself equal zero,
        it is seen as not being a prime number. These of series of loops keep running until the first loops hits 1000 and during this,
        it prints out all the prime numebers.

         */
    }
}