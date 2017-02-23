import aylien_news_api
from aylien_news_api.rest import ApiException

# Configure API key authorization: app_id
aylien_news_api.configuration.api_key['X-AYLIEN-NewsAPI-Application-ID'] = 'YOUR_APP_ID'
# Configure API key authorization: app_key
aylien_news_api.configuration.api_key['X-AYLIEN-NewsAPI-Application-Key'] = 'YOUR_APP_KEY'

# create an instance of the API class
api_instance = aylien_news_api.DefaultApi()

opts = {
  'title': 'trump',
  'sort_by': 'social_shares_count.facebook',
  'language': ['en'],
  'not_language': ['es', 'it'],
  'published_at_start': 'NOW-7DAYS',
  'published_at_end': 'NOW',
  'entities_body_links_dbpedia': [
    'http://dbpedia.org/resource/Donald_Trump',
    'http://dbpedia.org/resource/Hillary_Rodham_Clinton'
  ]
}

try:
    # List stories
    api_response = api_instance.list_stories(**opts)
    print("API called successfully. Returned data: ")
    print("========================================")
    for story in api_response.stories:
      print(story.title + " / " + story.source.name)
except ApiException as e:
    print("Exception when calling DefaultApi->list_stories: %s\n" % e)
