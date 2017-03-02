using System;
using System.Diagnostics;
using Aylien.NewsApi.Api;
using Aylien.NewsApi.Client;
using Aylien.NewsApi.Model;
using System.Collections.Generic;

namespace Example
{
    public class ListRelatedStoriesExample
    {
        static void Main(string[] args)
        {
            // Configure API key authorization: app_id
            Configuration.Default.ApiKey.Add("X-AYLIEN-NewsAPI-Application-ID", "{{current_app_id}}");

            // Configure API key authorization: app_key
            Configuration.Default.ApiKey.Add("X-AYLIEN-NewsAPI-Application-Key", "{{current_app_key}}");

            var apiInstance = new DefaultApi();

            var id = new List<long?>() { 54121 };
            var notId = new List<long?>() { 21451 };
            var title = "startup AND (raise OR raised OR raising OR raises)";
            var body = "startup";
            var text = "startup company";
            var language = new List<string>() { "en", "it" };
            var notLanguage = new List<string>() { "es", "pt" };
            var publishedAtStart = "NOW-10DAYS";
            var publishedAtEnd = "NOW";
            var categoriesTaxonomy = "iab-qag";
            var categoriesConfident = true;
            var categoriesId = new List<string>() { "IAB15" };
            var notCategoriesId = new List<string>() { "IAB2-3" };
            var categoriesLevel = new List<int?>() { 1 };
            var notCategoriesLevel = new List<int?>() { 2 };
            var entitiesTitleText = new List<string>() { "GNU/Linux", "Microsoft" };
            var notEntitiesTitleText = new List<string>() { "Windows" };
            var entitiesTitleType = new List<string>() { "Organization", "Software" };
            var notEntitiesTitleType = new List<string>() { "Person", "Agent" };
            var entitiesTitleLinksDbpedia = new List<string>() { "http://dbpedia.org/resource/Donald_Trump" };
            var notEntitiesTitleLinksDbpedia = new List<string>() { "http://dbpedia.org/resource/Linux" };
            var entitiesBodyText = new List<string>() { "GNU/Linux", "Apple" };
            var notEntitiesBodyText = new List<string>() { "Windows" };
            var entitiesBodyType = new List<string>() { "Person", "Agent" };
            var notEntitiesBodyType = new List<string>() { "Organization", "Software" };
            var entitiesBodyLinksDbpedia = new List<string>() { "http://dbpedia.org/resource/Windows" };
            var notEntitiesBodyLinksDbpedia = new List<string>() { "http://dbpedia.org/resource/Linux" };
            var sentimentTitlePolarity = "positive";
            var notSentimentTitlePolarity = "negative";
            var sentimentBodyPolarity = "neutral";
            var notSentimentBodyPolarity = "negative";
            var mediaImagesCountMin = 2;
            var mediaImagesCountMax = 10;
            var mediaImagesWidthMin = 640;
            var mediaImagesWidthMax = 1024;
            var mediaImagesHeightMin = 480;
            var mediaImagesHeightMax = 800;
            var mediaImagesContentLengthMin = 25411;
            var mediaImagesContentLengthMax = 369541;
            var mediaImagesFormat = new List<string>() { "JPEG", "BMP", "GIF" };
            var notMediaImagesFormat = new List<string>() { "PNG", "TIFF" };
            var mediaVideosCountMin = 1;
            var mediaVideosCountMax = 4;
            var authorId = new List<int?>() { 2154 };
            var notAuthorId = new List<int?>() { 5412 };
            var authorName = "John Doe";
            var notAuthorName = "Mike Wally";
            var sourceId = new List<int?>() { 1467 };
            var notSourceId = new List<int?>() { 1524 };
            var sourceName = new List<string>() { "BBC" };
            var notSourceName = new List<string>() { "Fox News" };
            var sourceDomain = new List<string>() { "bbc.co.uk" };
            var notSourceDomain = new List<string>() { "foxnews.com" };
            var sourceLocationsCountry = new List<string>() { "US", "IE" };
            var notSourceLocationsCountry = new List<string>() { "NG" };
            var sourceLocationsState = new List<string>() { "California" };
            var notSourceLocationsState = new List<string>() { "Arizona" };
            var sourceLocationsCity = new List<string>() { "Los Angeles" };
            var notSourceLocationsCity = new List<string>() { "New York City" };
            var sourceScopesCountry = new List<string>() { "NG", "IE" };
            var notSourceScopesCountry = new List<string>() { "US", "IR" };
            var sourceScopesState = new List<string>() { "Co Dublin" };
            var notSourceScopesState = new List<string>() { "Co Wicklow" };
            var sourceScopesCity = new List<string>() { "Dublin City" };
            var notSourceScopesCity = new List<string>() { "Cork" };
            var sourceScopesLevel = new List<string>() { "local" };
            var notSourceScopesLevel = new List<string>() { "national" };
            var sourceLinksInCountMin = 5000;
            var sourceLinksInCountMax = 10000;
            var sourceRankingsAlexaRankMin = 1;
            var sourceRankingsAlexaRankMax = 2000;
            var sourceRankingsAlexaCountry = new List<string>() { "IE" };
            var socialSharesCountFacebookMin = 3521;
            var socialSharesCountFacebookMax = 5841;
            var socialSharesCountGooglePlusMin = 251;
            var socialSharesCountGooglePlusMax = 6521;
            var socialSharesCountLinkedinMin = 4125;
            var socialSharesCountLinkedinMax = 15214;
            var socialSharesCountRedditMin = 1584;
            var socialSharesCountRedditMax = 95412;
            var cluster = true;
            var clusterAlgorithm = "kmeans";
            var _return = new List<string>() { "id", "title", "entities" };
            var storyId = 789;
            var storyUrl = "https://techcrunch.com/2016/04/07/aylien-launches-news-analysis-api-powered-by-its-deep-learning-tech/";
            var storyTitle = "Aylien launches news analysis API powered by its deep learning tech";
            var storyBody = "Text analysis startup Aylien...";
            var boostBy = "recency";
            var storyLanguage = "en";
            var perPage = 10;

            try
            {
                // List related stories
                RelatedStories result = apiInstance.ListRelatedStories(
                    id: id,
                    notId: notId,
                    title: title,
                    body: body,
                    text: text,
                    language: language,
                    notLanguage: notLanguage,
                    publishedAtStart: publishedAtStart,
                    publishedAtEnd: publishedAtEnd,
                    categoriesTaxonomy: categoriesTaxonomy,
                    categoriesConfident: categoriesConfident,
                    categoriesId: categoriesId,
                    notCategoriesId: notCategoriesId,
                    categoriesLevel: categoriesLevel,
                    notCategoriesLevel: notCategoriesLevel,
                    entitiesTitleText: entitiesTitleText,
                    notEntitiesTitleText: notEntitiesTitleText,
                    entitiesTitleType: entitiesTitleType,
                    notEntitiesTitleType: notEntitiesTitleType,
                    entitiesTitleLinksDbpedia: entitiesTitleLinksDbpedia,
                    notEntitiesTitleLinksDbpedia: notEntitiesTitleLinksDbpedia,
                    entitiesBodyText: entitiesBodyText,
                    notEntitiesBodyText: notEntitiesBodyText,
                    entitiesBodyType: entitiesBodyType,
                    notEntitiesBodyType: notEntitiesBodyType,
                    entitiesBodyLinksDbpedia: entitiesBodyLinksDbpedia,
                    notEntitiesBodyLinksDbpedia: notEntitiesBodyLinksDbpedia,
                    sentimentTitlePolarity: sentimentTitlePolarity,
                    notSentimentTitlePolarity: notSentimentTitlePolarity,
                    sentimentBodyPolarity: sentimentBodyPolarity,
                    notSentimentBodyPolarity: notSentimentBodyPolarity,
                    mediaImagesCountMin: mediaImagesCountMin,
                    mediaImagesCountMax: mediaImagesCountMax,
                    mediaImagesWidthMin: mediaImagesWidthMin,
                    mediaImagesWidthMax: mediaImagesWidthMax,
                    mediaImagesHeightMin: mediaImagesHeightMin,
                    mediaImagesHeightMax: mediaImagesHeightMax,
                    mediaImagesContentLengthMin: mediaImagesContentLengthMin,
                    mediaImagesContentLengthMax: mediaImagesContentLengthMax,
                    mediaImagesFormat: mediaImagesFormat,
                    notMediaImagesFormat: notMediaImagesFormat,
                    mediaVideosCountMin: mediaVideosCountMin,
                    mediaVideosCountMax: mediaVideosCountMax,
                    authorId: authorId,
                    notAuthorId: notAuthorId,
                    authorName: authorName,
                    notAuthorName: notAuthorName,
                    sourceId: sourceId,
                    notSourceId: notSourceId,
                    sourceName: sourceName,
                    notSourceName: notSourceName,
                    sourceDomain: sourceDomain,
                    notSourceDomain: notSourceDomain,
                    sourceLocationsCountry: sourceLocationsCountry,
                    notSourceLocationsCountry: notSourceLocationsCountry,
                    sourceLocationsState: sourceLocationsState,
                    notSourceLocationsState: notSourceLocationsState,
                    sourceLocationsCity: sourceLocationsCity,
                    notSourceLocationsCity: notSourceLocationsCity,
                    sourceScopesCountry: sourceScopesCountry,
                    notSourceScopesCountry: notSourceScopesCountry,
                    sourceScopesState: sourceScopesState,
                    notSourceScopesState: notSourceScopesState,
                    sourceScopesCity: sourceScopesCity,
                    notSourceScopesCity: notSourceScopesCity,
                    sourceScopesLevel: sourceScopesLevel,
                    notSourceScopesLevel: notSourceScopesLevel,
                    sourceLinksInCountMin: sourceLinksInCountMin,
                    sourceLinksInCountMax: sourceLinksInCountMax,
                    sourceRankingsAlexaRankMin: sourceRankingsAlexaRankMin,
                    sourceRankingsAlexaRankMax: sourceRankingsAlexaRankMax,
                    sourceRankingsAlexaCountry: sourceRankingsAlexaCountry,
                    socialSharesCountFacebookMin: socialSharesCountFacebookMin,
                    socialSharesCountFacebookMax: socialSharesCountFacebookMax,
                    socialSharesCountGooglePlusMin: socialSharesCountGooglePlusMin,
                    socialSharesCountGooglePlusMax: socialSharesCountGooglePlusMax,
                    socialSharesCountLinkedinMin: socialSharesCountLinkedinMin,
                    socialSharesCountLinkedinMax: socialSharesCountLinkedinMax,
                    socialSharesCountRedditMin: socialSharesCountRedditMin,
                    socialSharesCountRedditMax: socialSharesCountRedditMax,
                    cluster: cluster,
                    clusterAlgorithm: clusterAlgorithm,
                    _return: _return,
                    storyId: storyId,
                    storyUrl: storyUrl,
                    storyTitle: storyTitle,
                    storyBody: storyBody,
                    boostBy: boostBy,
                    storyLanguage: storyLanguage,
                    perPage: perPage
                );
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DefaultApi.ListRelatedStories: " + e.Message);
            }
        }
    }
}
