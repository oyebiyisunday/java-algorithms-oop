package algorithms;

public class CompareArrays {
public static boolean compare (int[] arrayOne, int[] arrayTwo) {
if (arrayOne == null || arrayTwo == null) {
throw new IllegalArgumentException("Input arrays must not be null");
}
//initialized so code will compile
boolean areEqual = false;
// compare the two arrays
if (arrayOne.length == arrayTwo.length) {
            areEqual = true; //set to true if lengths are the same
for (int i = 0; i < arrayOne.length; i++) {
if (arrayOne[i] != arrayTwo[i]) {
                areEqual= false; // set to false if any element differs
break;
            }
        }
        }
return areEqual;
    }
}
