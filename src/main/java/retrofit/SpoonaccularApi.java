package retrofit;
import retrofit2.Call;
import retrofit2.http.*;

public interface SpoonaccularApi {
    @POST("/mealplanner/your-users-name292/shopping-list/items")
    Call<ApiList> add(
            @Body AddToShoppingListRequest request,
            @Query("apiKey") String apiKey,
            @Query("hash") String hash
    ); //проверено

    @GET("/mealplanner/your-users-name292/shopping-list")
    Call<ApiList> myList(
            @Query("apiKey") String apiKey,
            @Query("hash") String hash
    ); //проверено


    @DELETE("/mealplanner/your-users-name292/shopping-list/items/1293661")
    Call<ApiList> delpos(
            @Query("apiKey") String apiKey,
            @Query("hash") String hash,
            @Query("id") Integer id
    ); //проверено

}

