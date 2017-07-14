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
  :categories_taxonomy => 'iab-qag',
  :categories_id => ['IAB7'],
  :text => 'fitness',
  :language => ['en'],
  :media_videos_count_min => 1,
  :media_videos_count_max => 1,
  :not_media_images_format => ['GIF'],
  :published_at_start => "NOW-1MONTH",
  :published_at_end => "NOW",
  :sort_by => 'relevance'
}


begin
  #List stories
  result = api_instance.list_stories(opts)
  
  puts 'The API has been called successfully.'
  puts '====================================='
  result.stories.each do |story|
    puts "#{story.title} / #{story.source.name}"
  end
rescue AylienNewsApi::ApiError => e
  puts "Exception when calling DefaultApi->list_stories: #{e}"
  puts e.response_body
end
