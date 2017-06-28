using System;
using Aylien.NewsApi.Api;
using Aylien.NewsApi.Client;
using Aylien.NewsApi.Model;
using System.Collections.Generic;

namespace SortingResultsExample
{
    class Program
    {
        static void Main(string[] args)
        {
            // Configure API key authorization: app_id
            Configuration.Default.ApiKey.Add("X-AYLIEN-NewsAPI-Application-ID", "{{current_app_id}}");

            // Configure API key authorization: app_key
            Configuration.Default.ApiKey.Add("X-AYLIEN-NewsAPI-Application-Key", "{{current_app_key}}");

            var apiInstance = new DefaultApi();

            try
            {
                // List stories
                Stories storiesResponse = apiInstance.ListStories(
                    publishedAtStart: "NOW-1MONTH",
                    publishedAtEnd: "NOW",
                    language: new List<String> { "en" },
                    entitiesBodyLinksDbpedia: new List<String> {
                        "http://dbpedia.org/resource/Baseball"
                    },
                    categoriesTaxonomy: "iab-qag",
                    categoriesId: new List<String> { "IAB17" },
                    sortBy: "source.rankings.alexa.rank.US"
                );

                foreach (var story in storiesResponse._Stories)
                {
                    Console.WriteLine(story.Title + " / " + story.Source.Name);
                }
            }
            catch (Exception e)
            {
                Console.WriteLine("Exception when calling DefaultApi.ListStories: " + e.Message);
            }
        }
    }
}
