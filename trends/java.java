import com.aylien.newsapi.*;
import com.aylien.newsapi.auth.*;
import com.aylien.newsapi.models.*;
import com.aylien.newsapi.parameters.*;
import com.aylien.newsapi.api.DefaultApi;

import java.util.Arrays;
import java.util.List;

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

        String field = "keywords";
        List<Long> id = Arrays.asList(985744L);
        List<Long> notId = Arrays.asList(5241L, 4412L);
        String title = "startup AND (raise OR raised OR raising OR raises)";
        String body = "startup";
        String text = "startup company";
        List<String> language = Arrays.asList("en", "es", "es");
        List<String> notLanguage = Arrays.asList("fr", "pt", "it");
        String publishedAtStart = "NOW-3MONTHS/DAY";
        String publishedAtEnd = "NOW-10DAYS";
        String categoriesTaxonomy = "iab-qag";
        Boolean categoriesConfident = true;
        List<String> categoriesId = Arrays.asList("IAB15", "IAB13-1");
        List<String> notCategoriesId = Arrays.asList("IAB3-2");
        List<Integer> categoriesLevel = Arrays.asList(2);
        List<Integer> notCategoriesLevel = Arrays.asList(1, 3);
        List<String> entitiesTitleText = Arrays.asList("GNU/Linux", "Microsoft Windows");
        List<String> notEntitiesTitleText = Arrays.asList("Ireland", "Dublin");
        List<String> entitiesTitleType = Arrays.asList("Software", "Organization");
        List<String> notEntitiesTitleType = Arrays.asList("Agent", "Person");
        List<String> entitiesTitleLinksDbpedia = Arrays.asList("http://dbpedia.org/resource/Linux");
        List<String> notEntitiesTitleLinksDbpedia = Arrays.asList("http://dbpedia.org/resource/Windows");
        List<String> entitiesBodyText = Arrays.asList("GNU/Linux", "Microsoft Windows");
        List<String> notEntitiesBodyText = Arrays.asList("Trump");
        List<String> entitiesBodyType = Arrays.asList("Agent", "Person");
        List<String> notEntitiesBodyType = Arrays.asList("Software", "Organization");
        List<String> entitiesBodyLinksDbpedia = Arrays.asList("entitiesBodyLinksDbpedia_example");
        List<String> notEntitiesBodyLinksDbpedia = Arrays.asList("http://dbpedia.org/resource/Linux");
        String sentimentTitlePolarity = "negative";
        String notSentimentTitlePolarity = "positive";
        String sentimentBodyPolarity = "neutral";
        String notSentimentBodyPolarity = "negative";
        Integer mediaImagesCountMin = 2;
        Integer mediaImagesCountMax = 4;
        Integer mediaImagesWidthMin = 640;
        Integer mediaImagesWidthMax = 1024;
        Integer mediaImagesHeightMin = 480;
        Integer mediaImagesHeightMax = 800;
        Integer mediaImagesContentLengthMin = 25411;
        Integer mediaImagesContentLengthMax = 369541;
        List<String> mediaImagesFormat = Arrays.asList("JPEG", "BMP", "GIF");
        List<String> notMediaImagesFormat = Arrays.asList("PNG", "TIFF");
        Integer mediaVideosCountMin = 1;
        Integer mediaVideosCountMax = 2;
        List<Integer> authorId = Arrays.asList(36521);
        List<Integer> notAuthorId = Arrays.asList(2541);
        String authorName = "John Doe";
        String notAuthorName = "Mike Wally";
        List<Integer> sourceId = Arrays.asList(1411);
        List<Integer> notSourceId = Arrays.asList(251);
        List<String> sourceName = Arrays.asList("BBC");
        List<String> notSourceName = Arrays.asList("Fox News");
        List<String> sourceDomain = Arrays.asList("bbc.co.uk");
        List<String> notSourceDomain = Arrays.asList("foxnews.com");
        List<String> sourceLocationsCountry = Arrays.asList("US", "IE");
        List<String> notSourceLocationsCountry = Arrays.asList("IR");
        List<String> sourceLocationsState = Arrays.asList("California");
        List<String> notSourceLocationsState = Arrays.asList("Arizona");
        List<String> sourceLocationsCity = Arrays.asList("Los Angeles");
        List<String> notSourceLocationsCity = Arrays.asList("Dublin City");
        List<String> sourceScopesCountry = Arrays.asList("IE", "NG");
        List<String> notSourceScopesCountry = Arrays.asList("US", "GB");
        List<String> sourceScopesState = Arrays.asList("Co Dublin");
        List<String> notSourceScopesState = Arrays.asList("Co Wicklow");
        List<String> sourceScopesCity = Arrays.asList("Dublin City");
        List<String> notSourceScopesCity = Arrays.asList("Cork");
        List<String> sourceScopesLevel = Arrays.asList("national");
        List<String> notSourceScopesLevel = Arrays.asList("local");
        Integer sourceLinksInCountMin = 354211;
        Integer sourceLinksInCountMax = 587412;
        Integer sourceRankingsAlexaRankMin = 10;
        Integer sourceRankingsAlexaRankMax = 2500;
        List<String> sourceRankingsAlexaCountry = Arrays.asList("IE");
        Integer socialSharesCountFacebookMin = 3521;
        Integer socialSharesCountFacebookMax = 5841;
        Integer socialSharesCountGooglePlusMin = 2514;
        Integer socialSharesCountGooglePlusMax = 36521;
        Integer socialSharesCountLinkedinMin = 6521;
        Integer socialSharesCountLinkedinMax = 36521;
        Integer socialSharesCountRedditMin = 14125;
        Integer socialSharesCountRedditMax = 95412;

        TrendsParams.Builder trendsBuilder = TrendsParams.newBuilder();

        trendsBuilder.setField(field);
        trendsBuilder.setId(id);
        trendsBuilder.setNotId(notId);
        trendsBuilder.setTitle(title);
        trendsBuilder.setBody(body);
        trendsBuilder.setText(text);
        trendsBuilder.setLanguage(language);
        trendsBuilder.setNotLanguage(notLanguage);
        trendsBuilder.setPublishedAtStart(publishedAtStart);
        trendsBuilder.setPublishedAtEnd(publishedAtEnd);
        trendsBuilder.setCategoriesTaxonomy(categoriesTaxonomy);
        trendsBuilder.setCategoriesConfident(categoriesConfident);
        trendsBuilder.setCategoriesId(categoriesId);
        trendsBuilder.setNotCategoriesId(notCategoriesId);
        trendsBuilder.setCategoriesLevel(categoriesLevel);
        trendsBuilder.setNotCategoriesLevel(notCategoriesLevel);
        trendsBuilder.setEntitiesTitleText(entitiesTitleText);
        trendsBuilder.setNotEntitiesTitleText(notEntitiesTitleText);
        trendsBuilder.setEntitiesTitleType(entitiesTitleType);
        trendsBuilder.setNotEntitiesTitleType(notEntitiesTitleType);
        trendsBuilder.setEntitiesTitleLinksDbpedia(entitiesTitleLinksDbpedia);
        trendsBuilder.setNotEntitiesTitleLinksDbpedia(notEntitiesTitleLinksDbpedia);
        trendsBuilder.setEntitiesBodyText(entitiesBodyText);
        trendsBuilder.setNotEntitiesBodyText(notEntitiesBodyText);
        trendsBuilder.setEntitiesBodyType(entitiesBodyType);
        trendsBuilder.setNotEntitiesBodyType(notEntitiesBodyType);
        trendsBuilder.setEntitiesBodyLinksDbpedia(entitiesBodyLinksDbpedia);
        trendsBuilder.setNotEntitiesBodyLinksDbpedia(notEntitiesBodyLinksDbpedia);
        trendsBuilder.setSentimentTitlePolarity(sentimentTitlePolarity);
        trendsBuilder.setNotSentimentTitlePolarity(notSentimentTitlePolarity);
        trendsBuilder.setSentimentBodyPolarity(sentimentBodyPolarity);
        trendsBuilder.setNotSentimentBodyPolarity(notSentimentBodyPolarity);
        trendsBuilder.setMediaImagesCountMin(mediaImagesCountMin);
        trendsBuilder.setMediaImagesCountMax(mediaImagesCountMax);
        trendsBuilder.setMediaImagesWidthMin(mediaImagesWidthMin);
        trendsBuilder.setMediaImagesWidthMax(mediaImagesWidthMax);
        trendsBuilder.setMediaImagesHeightMin(mediaImagesHeightMin);
        trendsBuilder.setMediaImagesHeightMax(mediaImagesHeightMax);
        trendsBuilder.setMediaImagesContentLengthMin(mediaImagesContentLengthMin);
        trendsBuilder.setMediaImagesContentLengthMax(mediaImagesContentLengthMax);
        trendsBuilder.setMediaImagesFormat(mediaImagesFormat);
        trendsBuilder.setNotMediaImagesFormat(notMediaImagesFormat);
        trendsBuilder.setMediaVideosCountMin(mediaVideosCountMin);
        trendsBuilder.setMediaVideosCountMax(mediaVideosCountMax);
        trendsBuilder.setAuthorId(authorId);
        trendsBuilder.setNotAuthorId(notAuthorId);
        trendsBuilder.setAuthorName(authorName);
        trendsBuilder.setNotAuthorName(notAuthorName);
        trendsBuilder.setSourceId(sourceId);
        trendsBuilder.setNotSourceId(notSourceId);
        trendsBuilder.setSourceName(sourceName);
        trendsBuilder.setNotSourceName(notSourceName);
        trendsBuilder.setSourceDomain(sourceDomain);
        trendsBuilder.setNotSourceDomain(notSourceDomain);
        trendsBuilder.setSourceLocationsCountry(sourceLocationsCountry);
        trendsBuilder.setNotSourceLocationsCountry(notSourceLocationsCountry);
        trendsBuilder.setSourceLocationsState(sourceLocationsState);
        trendsBuilder.setNotSourceLocationsState(notSourceLocationsState);
        trendsBuilder.setSourceLocationsCity(sourceLocationsCity);
        trendsBuilder.setNotSourceLocationsCity(notSourceLocationsCity);
        trendsBuilder.setSourceScopesCountry(sourceScopesCountry);
        trendsBuilder.setNotSourceScopesCountry(notSourceScopesCountry);
        trendsBuilder.setSourceScopesState(sourceScopesState);
        trendsBuilder.setNotSourceScopesState(notSourceScopesState);
        trendsBuilder.setSourceScopesCity(sourceScopesCity);
        trendsBuilder.setNotSourceScopesCity(notSourceScopesCity);
        trendsBuilder.setSourceScopesLevel(sourceScopesLevel);
        trendsBuilder.setNotSourceScopesLevel(notSourceScopesLevel);
        trendsBuilder.setSourceLinksInCountMin(sourceLinksInCountMin);
        trendsBuilder.setSourceLinksInCountMax(sourceLinksInCountMax);
        trendsBuilder.setSourceRankingsAlexaRankMin(sourceRankingsAlexaRankMin);
        trendsBuilder.setSourceRankingsAlexaRankMax(sourceRankingsAlexaRankMax);
        trendsBuilder.setSourceRankingsAlexaCountry(sourceRankingsAlexaCountry);
        trendsBuilder.setSocialSharesCountFacebookMin(socialSharesCountFacebookMin);
        trendsBuilder.setSocialSharesCountFacebookMax(socialSharesCountFacebookMax);
        trendsBuilder.setSocialSharesCountGooglePlusMin(socialSharesCountGooglePlusMin);
        trendsBuilder.setSocialSharesCountGooglePlusMax(socialSharesCountGooglePlusMax);
        trendsBuilder.setSocialSharesCountLinkedinMin(socialSharesCountLinkedinMin);
        trendsBuilder.setSocialSharesCountLinkedinMax(socialSharesCountLinkedinMax);
        trendsBuilder.setSocialSharesCountRedditMin(socialSharesCountRedditMin);
        trendsBuilder.setSocialSharesCountRedditMax(socialSharesCountRedditMax);

        try {
            Trends result = apiInstance.listTrends(trendsBuilder.build());
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#listTrends");
            e.printStackTrace();
        }
    }
}
