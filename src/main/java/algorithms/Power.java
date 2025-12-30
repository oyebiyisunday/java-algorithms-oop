package algorithms;

public class Power {
//Calculate base ^ exponent for recursive method
public static int power(int base, int exponent) {
if (exponent < 0) {
throw new IllegalArgumentException("Exponent must be non-negative");
        }
if (exponent == 0) {
return 1;
        }
if (exponent == 1) {
//condition for termination: base^1=base
return base;
        }
//perform recursive: base^exponent = base * base ^ (exponent -1)
return base * power(base, exponent - 1);
    }
}
