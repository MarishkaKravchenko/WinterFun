package realm;


import io.realm.RealmObject;
import io.realm.annotations.PrimaryKey;

public class HouseRealm extends RealmObject{
    @PrimaryKey
    private String name;

    public String getName() {
        return name;
    }
}
