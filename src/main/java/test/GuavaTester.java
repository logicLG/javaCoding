package test;

import com.google.common.base.Optional;
import com.google.common.base.Preconditions;

public class GuavaTester {
    public static void main(String args[]){
        GuavaTester guavaTester = new GuavaTester();

        System.out.println(guavaTester.sqrt(-3.0));
    }

    public double sqrt(double input) throws IllegalArgumentException {
        Preconditions.checkArgument(input > 0.0,
                "Illegal Argument passed: Negative value %s.", input);
        return Math.sqrt(input);
    }
}
