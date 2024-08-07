import java.util.Arrays;

public class count_words {

    public static void main(String[] args) {
        
        String str = "At dawn the city awakens with a burst of energy "
                   + "as commuters rush to work, street vendors set up their stalls, "
                   + "and the aroma of fresh coffee mingles with the sounds of traffic, "
                   + "creating a vibrant morning symphony.";

        long count = str.split("\\s+").length;
        System.out.println(count);
    }
}
