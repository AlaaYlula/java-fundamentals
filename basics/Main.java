
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;


public class Main {

    public static void main(String[] args) {
	// write your code here
//        int [] arr1 = {1};
//        int [] arr2 = reverse(arr1);
//        System.out.println("Reversed array:");
//        for (int k = 0; k < arr2.length; k++) {
//            System.out.println(arr2[k]);
//        }

        System.out.println("///////// Method 1 ///////////");

        int dogCount = 1;
        System.out.println(" I own " + dogCount + " " + pluralize("dog", dogCount) + ".");

        int catCount = 2;
        System.out.println(" I own " + catCount + " " + pluralize("cat", catCount) + ".");

        int turtleCount = 0;
        System.out.println(" I own " + turtleCount + " " + pluralize("turtle", turtleCount) + ".");

        ////////////////////////////
        System.out.println("///////// Method 2 ///////////");
        flipNHeads(3);

        ////////////////////////////
        System.out.println("///////// Method 3 ///////////");

        LocalClock();
    }
/////////////////////////////////// Methods ///////////////////////////////////////////////////////////

//    static int[] reverse(int arr[])
//    {
//        if(arr.length == 0){
//            System.out.println("Array Is empty");
//        }
//        int s = arr.length;
//        int[] revArr = new int[s];
//        int j = 0;
//        for (int i = s-1; i >= 0; i--) {
//            revArr[j] = arr[i];
//            j = j + 1;
//        }
//        return revArr;
//    }


    // Functions that return String with s or not
    public static String pluralize (String str, int count) {
            if(count >1 || count == 0){
                return str+"s";
            }else {
                return str;
            }
    }

    // Functions that print How many flips until get Heads in Row
    public static void flipNHeads  (int n) {
        String flip="";
        int inRow = 0;
        int count = 0 ;
        while(inRow < n) {
            double rand = Math.random();
            if (rand > 0.5) {
                flip = " heads";
                System.out.println(flip);
                inRow++;
                count++;
            } else if (rand < 0.5) {
                flip = " tails";
                System.out.println(flip);
                count++;
                inRow = 0 ;
            }
        }
        if(count == 1 && n==1){
            System.out.println(" It Tooks "+count+" flip to flip "+n+" head in a row.");
        }else if( count == 1) {
            System.out.println(" It Tooks " + count + " flip to flip " + n + " heads in a row.");
        }else if( n==1){
            System.out.println(" It Tooks " + count + " flips to flip " + n + " head in a row.");
        }else{
            System.out.println(" It Tooks " + count + " flips to flip " + n + " heads in a row.");

        }
    }

    // Functions Command Line Clock
    public static void LocalClock () {
        LocalDateTime  now = LocalDateTime.now(); // the time now
        int count=0;
        double million = 1_000_000;

        while(true) {
            count++;

            LocalDateTime after = LocalDateTime.now(); // the next second
            if(now.getSecond() != after.getSecond()) {

                now = after; // to continue
                System.out.println(after.format(DateTimeFormatter.ofPattern("HH:mm:ss"))+" "+(count/million)+" MHz");
                count=0;
            }
        }
    }
//////////////////////////////////////////////////////////////////////////////////////////////

}

