import aylien_news_api
from aylien_news_api.rest import ApiException

# Configure API key authorization: app_id
aylien_news_api.configuration.api_key['X-AYLIEN-NewsAPI-Application-ID'] = '{{current_app_id}}'
# Configure API key authorization: app_key
aylien_news_api.configuration.api_key['X-AYLIEN-NewsAPI-Application-Key'] = '{{current_app_key}}'

# create an instance of the API class
api_instance = aylien_news_api.DefaultApi()

opts = {
  'categories_taxonomy': 'iab-qag',
  'categories_id': ['IAB7'],
  'text': 'fitness',
  'language': ['en'],
  'media_videos_count_min': 1,
  'media_videos_count_max': 1,
  'not_media_images_format': ['GIF'],
  'published_at_start': 'NOW-1MONTH',
  'published_at_end': 'NOW',
  'sort_by': 'relevance'
}

try:
    # List stories
    api_response = api_instance.list_stories(**opts)
    print('The API has been called successfully.')
    print('=====================================')
    for story in api_response.stories:
      print(story.title + " / " + story.source.name)
except ApiException as e:
    print("Exception when calling DefaultApi->list_stories: %s\n" % e)
