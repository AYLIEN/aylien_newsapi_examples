# Load the gem
require 'aylien_news_api'

# Setup authorization
AylienNewsApi.configure do |config|
  # Configure API key authorization: app_id
  config.api_key['X-AYLIEN-NewsAPI-Application-ID'] = '{{current_app_id}}'
  
  # Configure API key authorization: app_key
  config.api_key['X-AYLIEN-NewsAPI-Application-Key'] = '{{current_app_key}}'
end

api_instance = AylienNewsApi::DefaultApi.new

opts = {
  :title => 'trump',
  :published_at_start => "NOW-7DAYS",
  :published_at_end => "NOW",
  :entities_body_links_dbpedia => [
    'http://dbpedia.org/resource/Donald_Trump',
    'http://dbpedia.org/resource/Hillary_Rodham_Clinton'
  ],
  :language => ['en'],
  :not_language => ['it', 'es'],
  :sort_by => 'social_shares_count.facebook'
}


begin
  #List stories
  result = api_instance.list_stories(opts)
  result.stories.each do |story|
    puts "#{story.title} / #{story.source.name}"
  end
rescue AylienNewsApi::ApiError => e
  puts "Exception when calling DefaultApi->list_stories: #{e}"
  puts e.response_body
end
