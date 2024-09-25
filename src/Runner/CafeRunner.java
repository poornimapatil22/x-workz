package Runner;

import com.Exception.Cafe;

public class CafeRunner {

    public static void main(String[] args) throws Cafe {
        throw new Cafe("punit");
    }
}
