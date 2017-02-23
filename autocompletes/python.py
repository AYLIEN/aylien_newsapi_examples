import aylien_news_api
from aylien_news_api.rest import ApiException
from pprint import pprint

# Configure API key authorization: app_id
aylien_news_api.configuration.api_key['X-AYLIEN-NewsAPI-Application-ID'] = 'YOUR_APP_ID'
# Configure API key authorization: app_key
aylien_news_api.configuration.api_key['X-AYLIEN-NewsAPI-Application-Key'] = 'YOUR_APP_KEY'

# create an instance of the API class
api_instance = aylien_news_api.DefaultApi()

type = 'dbpedia_resources'
term = 'obam'

opts = {
    'language': 'en',
    'per_page': 3
}

try:
    # List autocompletes
    api_response = api_instance.list_autocompletes(type, term, **opts)
    pprint(api_response)
except ApiException as e:
    pprint("Exception when calling DefaultApi->list_autocompletes: %s\n" % e)
