package network;


import network.responseModels.House;

import retrofit2.Call;
import retrofit2.http.GET;

public interface RestService {

/*    @Headers({
            "Custom-Header : me header Value"
    })*/
    @GET("houses/362")
    Call<House> getHouses();
}
