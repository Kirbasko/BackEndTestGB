package retrofit;
public class Main {


    public static void main(String[] args) {

        SpoonaccularService spoonaccularService = new SpoonaccularService();

        ApiList shopList = spoonaccularService.myList(
                "bf41a3cc39d51faca688932612de2e030422142e");
        System.out.println(shopList);


        ApiList addProd = spoonaccularService.add(
                new AddToShoppingListRequest("Green tea", "tea", true),
                "bf41a3cc39d51faca688932612de2e030422142e");
        System.out.println(addProd);


        ApiList deleteProd = spoonaccularService.delpos(
                "3e633e8b71919a216e114cedfed16137cc788464",  1293661);
        System.out.println(deleteProd);
    }
}
