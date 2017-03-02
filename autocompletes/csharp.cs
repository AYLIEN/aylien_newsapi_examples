using System;
using System.Diagnostics;
using Aylien.NewsApi.Api;
using Aylien.NewsApi.Client;
using Aylien.NewsApi.Model;

namespace Example
{
    public class ListAutocompletesExample
    {
        public void main()
        {
            // Configure API key authorization: app_id
            Configuration.Default.ApiKey.Add("X-AYLIEN-NewsAPI-Application-ID", "{{current_app_id}}");

            // Configure API key authorization: app_key
            Configuration.Default.ApiKey.Add("X-AYLIEN-NewsAPI-Application-Key", "{{current_app_key}}");

            var apiInstance = new DefaultApi();

            var type = "dbpedia_resources";
            var term = "obam";
            var language = "en";
            var perPage = 7;

            try
            {
                // List autocompletes
                Autocompletes result = apiInstance.ListAutocompletes(
                    type: type,
                    term: term,
                    language: language,
                    perPage: perPage
                );
                Debug.WriteLine(result);
            }
            catch (Exception e)
            {
                Debug.Print("Exception when calling DefaultApi.ListAutocompletes: " + e.Message );
            }
        }
    }
}
