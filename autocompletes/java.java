import com.aylien.newsapi.*;
import com.aylien.newsapi.auth.*;
import com.aylien.newsapi.models.*;
import com.aylien.newsapi.parameters.*;
import com.aylien.newsapi.api.DefaultApi;

public class Main {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();

        // Configure API key authorization: app_id
        ApiKeyAuth app_id = (ApiKeyAuth) defaultClient.getAuthentication("app_id");
        app_id.setApiKey("{{current_app_id}}");

        // Configure API key authorization: app_key
        ApiKeyAuth app_key = (ApiKeyAuth) defaultClient.getAuthentication("app_key");
        app_key.setApiKey("{{current_app_key}}");

        DefaultApi apiInstance = new DefaultApi();

        String type = "dbpedia_resources";
        String term = "obam";
        String language = "en";
        Integer perPage = 10;

        AutocompletesParams.Builder autocompletesBuilder = AutocompletesParams.newBuilder();

        autocompletesBuilder.setType(type);
        autocompletesBuilder.setTerm(term);
        autocompletesBuilder.setLanguage(language);
        autocompletesBuilder.setPerPage(perPage);

        try {
            Autocompletes result = apiInstance.listAutocompletes(autocompletesBuilder.build());
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#listAutocompletes");
            e.printStackTrace();
        }
    }
}
