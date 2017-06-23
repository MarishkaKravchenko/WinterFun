package network;


import network.responseModels.House;

import retrofit2.http.GET;
import retrofit2.http.Path;
import rx.Observable;

public interface RestService {

/*    @Headers({
            "Custom-Header : me header Value"
    })*/
    @GET("{number}")
    Observable<House> getHouses(@Path("number") String number);
}
