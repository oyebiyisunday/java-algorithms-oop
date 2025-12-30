package algorithms;

//class executing the Bubble Sort algorithm
public class BubbleSort {
//Method for sorting the array using the bubble sorts
public static void sort(int[] data) {
if (data == null) {
throw new IllegalArgumentException("Input array must not be null");
}
int n = data.length;
//Outer loop
for (int i = 0; i < n - 1; i++) {
boolean swapped = false;
//comparing adjacent elements inner loop
for (int j = 0; j < n - 1 - i; j++) {
if (data[j] > data[j + 1]) {
//Swapping the elements in wrong order
int temp = data[j];
data[j] = data[j + 1];
data[j + 1] = temp;
swapped = true;
                }
            }
//if there is no element swaps made, the array is already sorted
if (!swapped) {
break;
            }
        }
    }
}
