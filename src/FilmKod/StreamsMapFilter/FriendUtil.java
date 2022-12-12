package FilmKod.StreamsMapFilter;

import java.util.Arrays;
import java.util.List;

public class FriendUtil {

    public static List<Friend> getFriendList(){

        Friend b1 = new Friend("Anna", "Xvägen 1",
                "12345", true, 35);
        Friend b2 = new Friend("Kalle", "Tvägen",
                "123543", true, 48);
        Friend b3 = new Friend("Nisse", "Xvägen",
                "76543",  true, 43);

        Friend b4 = new Friend("Duffe", "Yvägen",
                "87654", true, 57);
        Friend b5 = new Friend("Fnatte", "Xvägen",
                "23465", true, 38);
        Friend b6 = new Friend("Rullan", "Yvägen",
                "98765",  false, 65);

        Friend b7 = new Friend("JUllan", "Xvägen",
                "235465",  false, 23);

        Friend b8 = new Friend("Åke", "Åvägen",
                "235465",  true, 89);

        Friend b9 = new Friend("Ärling", "Ävägen",
                "235465",  false, 76);


        return Arrays.asList(b1, b2, b3, b4, b5, b6, b7, b8, b9);
    }

}
