import io.restassured.RestAssured;
import io.restassured.builder.RequestSpecBuilder;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.*;
import static io.restassured.RestAssured.given;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)


public class SpoonTest {

    @BeforeAll
    static void beforeAll() {
        RestAssured.baseURI = "https://api.spoonacular.com";
        RestAssured.requestSpecification = new RequestSpecBuilder()
                .addParam("apiKey", "837d12d4a2f247a78bf2e208f74b8cca")
                .build();
    }

    @Order(1)
    @Test
    void testAddToList(){
        Pojo pojo = new Pojo("red apple", "apple", true);
        String actually = RestAssured.given().log().all()
                .queryParam("hash", "bf41a3cc39d51faca688932612de2e030422142e")
                .body(pojo)
                .expect()
                .statusCode(201)
                .when().post("/mealplanner/your-users-name292/shopping-list/items")
                .asPrettyString();
    }

    @Order(2)
    @Test
    void getList(){
        String list = given().log().all()
                .param("hash", "bf41a3cc39d51faca688932612de2e030422142e")
                .when().get("/mealplanner/your-users-name292/shopping-list")
                .then().assertThat().statusCode(200)
                .assertThat().body("aisles.aisle[0]", Matchers.is("Apple"))
                .log().body()
                .extract().body().asPrettyString();

    }

    @Order(3)
    @Test
    void delList(){
            String delItems = given().log().all()
            .param("hash", "bf41a3cc39d51faca688932612de2e030422142e")
            .when().delete("/mealplanner/your-users-name292/shopping-list/items/1293661")
            .then().assertThat().statusCode(200)
            .assertThat().body("status", Matchers.is("success"))
            .log().body()
            .extract().body().asPrettyString();
    }





}
