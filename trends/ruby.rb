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

field = "keywords"

opts = { 
  id: [5411],
  not_id: [3625],
  title: "startup AND (raise OR raised OR raising OR raises)",
  body: "startup",
  text: "startup company",
  language: ["en", "fr"],
  not_language: ["es", "it"],
  categories_taxonomy: "iptc-subjectcode",
  categories_confident: true,
  categories_id: ["11000000", "02000000"],
  not_categories_id: ["11001000", "10000000"],
  categories_level: [3],
  not_categories_level: [1, 2],
  entities_title_text: ["GNU/Linux", "Microsoft"],
  not_entities_title_text: ["Google", "Windows"],
  entities_title_type: ["Software", "Organization"],
  not_entities_title_type: ["Agent", "Person"],
  entities_title_links_dbpedia: ["http://dbpedia.org/resource/Linux"],
  not_entities_title_links_dbpedia: ["http://dbpedia.org/resource/Windows"],
  entities_body_text: ["Free Software", "Open Source"],
  not_entities_body_text: ["Barack Obama", "Trump"],
  entities_body_type: ["Software", "Organization"],
  not_entities_body_type: ["Agent", "Person"],
  entities_body_links_dbpedia: ["http://dbpedia.org/resource/Linux"],
  not_entities_body_links_dbpedia: ["http://dbpedia.org/resource/Windows"],
  sentiment_title_polarity: "positive",
  not_sentiment_title_polarity: "neutral",
  sentiment_body_polarity: "negative",
  not_sentiment_body_polarity: "positive",
  media_images_count_min: 3,
  media_images_count_max: 3,
  media_images_width_min: 640,
  media_images_width_max: 1024,
  media_images_height_min: 480,
  media_images_height_max: 800,
  media_images_content_length_min: 25411,
  media_images_content_length_max: 369541,
  media_images_format: ["JPEG", "BMP", "GIF"],
  not_media_images_format: ["TIFF", "PNG"],
  media_videos_count_min: 1,
  media_videos_count_max: 2,
  author_id: [4155],
  not_author_id: [2541],
  author_name: "John Doe",
  not_author_name: "Mike Wally",
  source_id: [124],
  not_source_id: [54],
  source_name: ["BBC"],
  not_source_name: ["Fox News"],
  source_domain: ["bbc.co.uk"],
  not_source_domain: ["foxnews.com"],
  source_locations_country: ["US", "IE"],
  not_source_locations_country: ["JP", "GB"],
  source_locations_state: ["California"],
  not_source_locations_state: ["Arizona"],
  source_locations_city: ["Los Angeles"],
  not_source_locations_city: ["Dublin City"],
  source_scopes_country: ["GB", "IE"],
  not_source_scopes_country: ["US", "JP"],
  source_scopes_state: ["Co Dublin"],
  not_source_scopes_state: ["Co Wicklow"],
  source_scopes_city: ["Cork"],
  not_source_scopes_city: ["Galway"],
  source_scopes_level: ["local"],
  not_source_scopes_level: ["national"],
  source_links_in_count_min: 126333,
  source_links_in_count_max: 521000,
  source_rankings_alexa_rank_min: 123,
  source_rankings_alexa_rank_max: 152,
  source_rankings_alexa_country: ["IE"],
  social_shares_count_facebook_min: 3521,
  social_shares_count_facebook_max: 5841,
  social_shares_count_google_plus_min: 2541,
  social_shares_count_google_plus_max: 36541,
  social_shares_count_linkedin_min: 6521,
  social_shares_count_linkedin_max: 32541,
  social_shares_count_reddit_min: 14521,
  social_shares_count_reddit_max: 95841
}

begin
  #List trends
  result = api_instance.list_trends(field, opts)
  puts result
rescue AylienNewsApi::ApiError => e
  puts "Exception when calling DefaultApi->list_trends: #{e}"
  puts e.response_body
end
