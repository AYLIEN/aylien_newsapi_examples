import aylien_news_api
from aylien_news_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: app_id
aylien_news_api.configuration.api_key['X-AYLIEN-NewsAPI-Application-ID'] = 'YOUR_APP_ID'
# Configure API key authorization: app_key
aylien_news_api.configuration.api_key['X-AYLIEN-NewsAPI-Application-Key'] = 'YOUR_APP_KEY'

# create an instance of the API class
api_instance = aylien_news_api.DefaultApi()

field = 'hashtags'

opts = { 
    'id': [521411],
    'not_id': [2511],
    'title': 'startup AND (raise OR raised OR raising OR raises)',
    'body': 'startup',
    'text': 'startup company',
    'language': ['en', 'it'],
    'not_language': ['es', 'pt'],
    'categories_taxonomy': 'iab-qag',
    'categories_confident': True,
    'categories_id': ['IAB15', 'IAB1-2'],
    'not_categories_id': ['IAB10', 'IAB3'],
    'categories_level': [1],
    'not_categories_level': [2],
    'entities_title_text': ['GNU/Linux'],
    'not_entities_title_text': ['Microsoft', 'Google'],
    'entities_title_type': ['Software', 'Organization'],
    'not_entities_title_type': ['Agent', 'Person'],
    'entities_title_links_dbpedia': ['http://dbpedia.org/resource/Donald_Trump'],
    'not_entities_title_links_dbpedia': ['http://dbpedia.org/resource/Windows'],
    'entities_body_text': ['GNU/Linux', 'Microsoft'],
    'not_entities_body_text': ['Windows Vista', 'Windows XP'],
    'entities_body_type': ['Software', 'Organization'],
    'not_entities_body_type': ['Agent', 'Person'],
    'entities_body_links_dbpedia': ['http://dbpedia.org/resource/Microsoft'],
    'not_entities_body_links_dbpedia': ['http://dbpedia.org/resource/Google'],
    'sentiment_title_polarity': 'positive',
    'not_sentiment_title_polarity': 'neutral',
    'sentiment_body_polarity': 'negative',
    'not_sentiment_body_polarity': 'positive',
    'media_images_count_min': 1,
    'media_images_count_max': 10,
    'media_images_width_min': 640,
    'media_images_width_max': 1024,
    'media_images_height_min': 480,
    'media_images_height_max': 800,
    'media_images_content_length_min': 25411,
    'media_images_content_length_max': 369541,
    'media_images_format': ['JPEG', 'BMP', 'GIF'],
    'not_media_images_format': ['PNG', 'TIFF'],
    'media_videos_count_min': 3,
    'media_videos_count_max': 5,
    'author_id': [352],
    'not_author_id': [541],
    'author_name': 'John Doe',
    'not_author_name': 'Mike Wally',
    'source_id': [1456],
    'not_source_id': [142],
    'source_name': ['BBC'],
    'not_source_name': ['Fox News'],
    'source_domain': ['bbc.co.uk'],
    'not_source_domain': ['foxnews.com'],
    'source_locations_country': ['US'],
    'not_source_locations_country': ['BR'],
    'source_locations_state': ['California'],
    'not_source_locations_state': ['Berkshire'],
    'source_locations_city': ['London'],
    'not_source_locations_city': ['Dublin'],
    'source_scopes_country': ['IE'],
    'not_source_scopes_country': ['IN'],
    'source_scopes_state': ['Tehran'],
    'not_source_scopes_state': ['Berkshire'],
    'source_scopes_city': ['Dublin'],
    'not_source_scopes_city': ['New York City'],
    'source_scopes_level': ['local'],
    'not_source_scopes_level': ['national'],
    'source_links_in_count_min': 401444,
    'source_links_in_count_max': 500000,
    'source_rankings_alexa_rank_min': 3,
    'source_rankings_alexa_rank_max': 100,
    'source_rankings_alexa_country': ['IE'],
    'social_shares_count_facebook_min': 3521,
    'social_shares_count_facebook_max': 2514,
    'social_shares_count_google_plus_min': 6521,
    'social_shares_count_google_plus_max': 36524,
    'social_shares_count_linkedin_min': 6528,
    'social_shares_count_linkedin_max': 952141,
    'social_shares_count_reddit_min': 14251,
    'social_shares_count_reddit_max': 95874
}

try: 
    # List trends
    api_response = api_instance.list_trends(field, **opts)
    pprint(api_response)
except ApiException as e:
    pprint("Exception when calling DefaultApi->list_trends: %s\n" % e)
