# load the gem
require 'aylien_news_api'

# setup authorization
AylienNewsApi.configure do |config|
  # Configure API key authorization: app_id
  config.api_key['X-AYLIEN-NewsAPI-Application-ID'] = '{{current_app_id}}'

  # Configure API key authorization: app_key
  config.api_key['X-AYLIEN-NewsAPI-Application-Key'] = '{{current_app_key}}'
end

api_instance = AylienNewsApi::DefaultApi.new

type = "dbpedia_resources"
term = "obam"

opts = { 
  language: "en",
  per_page: 3
}

begin
  #List autocompletes
  result = api_instance.list_autocompletes(type, term, opts)
  puts result
rescue AylienNewsApi::ApiError => e
  puts "Exception when calling DefaultApi->list_autocompletes: #{e}"
end
