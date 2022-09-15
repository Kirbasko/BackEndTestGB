package retrofit;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;

public class SpoonaccularService {
    private SpoonaccularApi api;
    private static final String API_KEY = "837d12d4a2f247a78bf2e208f74b8cca";

    public SpoonaccularService() {

        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.spoonacular.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        api = retrofit.create(SpoonaccularApi.class);
    }

    public ApiList myList(String hash) {
        Call<ApiList> call = api.myList(API_KEY, hash);
        return RetrofitUtils.execute(call);
    } //проверено

    public ApiList add (@Body AddToShoppingListRequest request, String hash) {
        Call<ApiList> call = api.add(request, API_KEY, hash);
        return RetrofitUtils.execute(call);
    } //проверено
    public ApiList delpos(String hash, Integer id){
        Call<ApiList> call = api.delpos(API_KEY, hash, id);
        return RetrofitUtils.execute(call);
    } //проверено

}
