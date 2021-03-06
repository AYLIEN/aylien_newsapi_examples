var AylienNewsApi = require('aylien-news-api');

var apiInstance = new AylienNewsApi.DefaultApi();

// Configure API key authorization: app_id
var app_id = apiInstance.apiClient.authentications['app_id'];
app_id.apiKey = "{{current_app_id}}";

// Configure API key authorization: app_key
var app_key = apiInstance.apiClient.authentications['app_key'];
app_key.apiKey = "{{current_app_key}}";

var opts = {
  'categoriesTaxonomy': 'iab-qag',
  'categoriesId': ['IAB7'],
  'text': 'fitness',
  'language': ['en'],
  'mediaVideosCountMin': 1,
  'mediaVideosCountMax': 1,
  'notMediaImagesFormat': ['GIF'],
  'publishedAtStart': 'NOW-1MONTH',
  'publishedAtEnd': 'NOW',
  'sortBy': 'relevance'
};

var callback = function(error, data, response) {
  if (error) {
    console.error(error);
  } else {
    console.log('The API has been called successfully.');
    console.log('=====================================');
    for (var i = 0; i < data.stories.length; i++){
      console.log(data.stories[i].title + " / " + data.stories[i].source.name);
    }
  }
};
apiInstance.listStories(opts, callback);
