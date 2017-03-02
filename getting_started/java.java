import com.aylien.newsapi.*;
import com.aylien.newsapi.auth.*;
import com.aylien.newsapi.models.*;
import com.aylien.newsapi.parameters.*;
import com.aylien.newsapi.api.DefaultApi;

import java.util.*;

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

        StoriesParams.Builder storiesBuilder = StoriesParams.newBuilder();

        storiesBuilder.setTitle("trump");
        storiesBuilder.setSortBy("social_shares_count.facebook");
        storiesBuilder.setLanguage(Arrays.asList("en"));
        storiesBuilder.setNotLanguage(Arrays.asList("es", "it"));
        storiesBuilder.setPublishedAtStart("NOW-7DAYS");
        storiesBuilder.setPublishedAtEnd("NOW");
        storiesBuilder.setEntitiesBodyLinksDbpedia(Arrays.asList(
                "http://dbpedia.org/resource/Donald_Trump",
                "http://dbpedia.org/resource/Hillary_Rodham_Clinton"
        ));

        try {
            Stories result = apiInstance.listStories(storiesBuilder.build());
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#listStories");
            e.printStackTrace();
        }
    }
}
