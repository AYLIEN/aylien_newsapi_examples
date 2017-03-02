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

        List<Long> id = Arrays.asList(985744L);
        List<Long> notId = Arrays.asList(5241L, 4412L);
        String title = "startup AND (raise OR raised OR raising OR raises)";
        String body = "startup";
        String text = "startup company";
        List<String> language = Arrays.asList("en", "es", "es");
        List<String> notLanguage = Arrays.asList("fr", "pt", "it");
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
        String publishedAtStart = "NOW-7DAYS/DAY";
        String publishedAtEnd = "NOW/DAY";
        String period = "+1DAY";

        TimeSeriesParams.Builder timeSeriesBuilder = TimeSeriesParams.newBuilder();

        timeSeriesBuilder.setId(id);
        timeSeriesBuilder.setNotId(notId);
        timeSeriesBuilder.setTitle(title);
        timeSeriesBuilder.setBody(body);
        timeSeriesBuilder.setText(text);
        timeSeriesBuilder.setLanguage(language);
        timeSeriesBuilder.setNotLanguage(notLanguage);
        timeSeriesBuilder.setCategoriesTaxonomy(categoriesTaxonomy);
        timeSeriesBuilder.setCategoriesConfident(categoriesConfident);
        timeSeriesBuilder.setCategoriesId(categoriesId);
        timeSeriesBuilder.setNotCategoriesId(notCategoriesId);
        timeSeriesBuilder.setCategoriesLevel(categoriesLevel);
        timeSeriesBuilder.setNotCategoriesLevel(notCategoriesLevel);
        timeSeriesBuilder.setEntitiesTitleText(entitiesTitleText);
        timeSeriesBuilder.setNotEntitiesTitleText(notEntitiesTitleText);
        timeSeriesBuilder.setEntitiesTitleType(entitiesTitleType);
        timeSeriesBuilder.setNotEntitiesTitleType(notEntitiesTitleType);
        timeSeriesBuilder.setEntitiesTitleLinksDbpedia(entitiesTitleLinksDbpedia);
        timeSeriesBuilder.setNotEntitiesTitleLinksDbpedia(notEntitiesTitleLinksDbpedia);
        timeSeriesBuilder.setEntitiesBodyText(entitiesBodyText);
        timeSeriesBuilder.setNotEntitiesBodyText(notEntitiesBodyText);
        timeSeriesBuilder.setEntitiesBodyType(entitiesBodyType);
        timeSeriesBuilder.setNotEntitiesBodyType(notEntitiesBodyType);
        timeSeriesBuilder.setEntitiesBodyLinksDbpedia(entitiesBodyLinksDbpedia);
        timeSeriesBuilder.setNotEntitiesBodyLinksDbpedia(notEntitiesBodyLinksDbpedia);
        timeSeriesBuilder.setSentimentTitlePolarity(sentimentTitlePolarity);
        timeSeriesBuilder.setNotSentimentTitlePolarity(notSentimentTitlePolarity);
        timeSeriesBuilder.setSentimentBodyPolarity(sentimentBodyPolarity);
        timeSeriesBuilder.setNotSentimentBodyPolarity(notSentimentBodyPolarity);
        timeSeriesBuilder.setMediaImagesCountMin(mediaImagesCountMin);
        timeSeriesBuilder.setMediaImagesCountMax(mediaImagesCountMax);
        timeSeriesBuilder.setMediaImagesWidthMin(mediaImagesWidthMin);
        timeSeriesBuilder.setMediaImagesWidthMax(mediaImagesWidthMax);
        timeSeriesBuilder.setMediaImagesHeightMin(mediaImagesHeightMin);
        timeSeriesBuilder.setMediaImagesHeightMax(mediaImagesHeightMax);
        timeSeriesBuilder.setMediaImagesContentLengthMin(mediaImagesContentLengthMin);
        timeSeriesBuilder.setMediaImagesContentLengthMax(mediaImagesContentLengthMax);
        timeSeriesBuilder.setMediaImagesFormat(mediaImagesFormat);
        timeSeriesBuilder.setNotMediaImagesFormat(notMediaImagesFormat);
        timeSeriesBuilder.setMediaVideosCountMin(mediaVideosCountMin);
        timeSeriesBuilder.setMediaVideosCountMax(mediaVideosCountMax);
        timeSeriesBuilder.setAuthorId(authorId);
        timeSeriesBuilder.setNotAuthorId(notAuthorId);
        timeSeriesBuilder.setAuthorName(authorName);
        timeSeriesBuilder.setNotAuthorName(notAuthorName);
        timeSeriesBuilder.setSourceId(sourceId);
        timeSeriesBuilder.setNotSourceId(notSourceId);
        timeSeriesBuilder.setSourceName(sourceName);
        timeSeriesBuilder.setNotSourceName(notSourceName);
        timeSeriesBuilder.setSourceDomain(sourceDomain);
        timeSeriesBuilder.setNotSourceDomain(notSourceDomain);
        timeSeriesBuilder.setSourceLocationsCountry(sourceLocationsCountry);
        timeSeriesBuilder.setNotSourceLocationsCountry(notSourceLocationsCountry);
        timeSeriesBuilder.setSourceLocationsState(sourceLocationsState);
        timeSeriesBuilder.setNotSourceLocationsState(notSourceLocationsState);
        timeSeriesBuilder.setSourceLocationsCity(sourceLocationsCity);
        timeSeriesBuilder.setNotSourceLocationsCity(notSourceLocationsCity);
        timeSeriesBuilder.setSourceScopesCountry(sourceScopesCountry);
        timeSeriesBuilder.setNotSourceScopesCountry(notSourceScopesCountry);
        timeSeriesBuilder.setSourceScopesState(sourceScopesState);
        timeSeriesBuilder.setNotSourceScopesState(notSourceScopesState);
        timeSeriesBuilder.setSourceScopesCity(sourceScopesCity);
        timeSeriesBuilder.setNotSourceScopesCity(notSourceScopesCity);
        timeSeriesBuilder.setSourceScopesLevel(sourceScopesLevel);
        timeSeriesBuilder.setNotSourceScopesLevel(notSourceScopesLevel);
        timeSeriesBuilder.setSourceLinksInCountMin(sourceLinksInCountMin);
        timeSeriesBuilder.setSourceLinksInCountMax(sourceLinksInCountMax);
        timeSeriesBuilder.setSourceRankingsAlexaRankMin(sourceRankingsAlexaRankMin);
        timeSeriesBuilder.setSourceRankingsAlexaRankMax(sourceRankingsAlexaRankMax);
        timeSeriesBuilder.setSourceRankingsAlexaCountry(sourceRankingsAlexaCountry);
        timeSeriesBuilder.setSocialSharesCountFacebookMin(socialSharesCountFacebookMin);
        timeSeriesBuilder.setSocialSharesCountFacebookMax(socialSharesCountFacebookMax);
        timeSeriesBuilder.setSocialSharesCountGooglePlusMin(socialSharesCountGooglePlusMin);
        timeSeriesBuilder.setSocialSharesCountGooglePlusMax(socialSharesCountGooglePlusMax);
        timeSeriesBuilder.setSocialSharesCountLinkedinMin(socialSharesCountLinkedinMin);
        timeSeriesBuilder.setSocialSharesCountLinkedinMax(socialSharesCountLinkedinMax);
        timeSeriesBuilder.setSocialSharesCountRedditMin(socialSharesCountRedditMin);
        timeSeriesBuilder.setSocialSharesCountRedditMax(socialSharesCountRedditMax);
        timeSeriesBuilder.setPublishedAtStart(publishedAtStart);
        timeSeriesBuilder.setPublishedAtEnd(publishedAtEnd);
        timeSeriesBuilder.setPeriod(period);

        try {
            TimeSeriesList result = apiInstance.listTimeSeries(timeSeriesBuilder.build());
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#listTimeSeries");
            e.printStackTrace();
        }
    }
}
