package FilmKod.StreamsFlatmap;

import java.util.Arrays;
import java.util.List;

public class FriendUtil {

    public static List<Friend> getFriendList(){

        Friend b1 = new Friend("Anna", "Xvägen 1",
                List.of("12345", "5454353534"), true, 35);

        Friend b2 = new Friend("Kalle", "Tvägen",
                List.of("76575654", "2433422"), true, 48);

        Friend b3 = new Friend("Nisse", "Xvägen",
                List.of("444444444"),  true, 43);

        Friend b4 = new Friend("Duffe", "Yvägen",
                List.of("787686876", "2321312", "87878686"), true, 57);



        return Arrays.asList(b1, b2, b3, b4);
    }

}
