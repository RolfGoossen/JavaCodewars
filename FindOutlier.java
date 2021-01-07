/*

FINISHED

You are given an array (which will have a length of at least 3, but could be very large) containing integers.
The array is either entirely comprised of odd integers or entirely comprised of even integers except
for a single integer N. Write a method that takes the array as an argument and returns this "outlier" N.

[2, 4, 0, 100, 4, 11, 2602, 36]
Should return: 11 (the only odd number)

[160, 3, 1719, 19, 11, 13, -21]
Should return: 160 (the only even number)
 */
class Test{
    public static void main(String[] args) {
        int [] arrayOne = new int[]{2, 4, 0, 100, 4, 11, 2602, 36};
        int [] arrayTwo = new int[]{160, 3, 1719, 19, 11, 13, -21};
        FindOutlier.find(arrayTwo);
    }
}

class FindOutlier{
    static int find(int[] integers){
        int countEven=0;
        int countOdd=0;
        int onlyEven=0;
        int onlyOdd=0;
        int result = 0;
        for(int i : integers){
            if(i%2==0){
                ++countEven;
                onlyEven=i;
            }else {
                ++countOdd;
                onlyOdd=i;
            }
        }

        if ((countEven > countOdd)) {
            System.out.println("Should return: " + onlyOdd + " (the only odd number)");
            result = onlyOdd;
        } else if (countOdd > countEven){
            System.out.println("Should return: "+onlyEven + " (the only even number)");
            result = onlyEven;
        }

        return result;

    }}