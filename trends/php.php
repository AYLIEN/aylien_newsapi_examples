<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure API key authorization: app_id
Aylien\NewsApi\Configuration::getDefaultConfiguration()->setApiKey('X-AYLIEN-NewsAPI-Application-ID', '{{current_app_id}}');

// Configure API key authorization: app_key
Aylien\NewsApi\Configuration::getDefaultConfiguration()->setApiKey('X-AYLIEN-NewsAPI-Application-Key', '{{current_app_key}}');

$api_instance = new Aylien\NewsApi\Api\DefaultApi();

$field = "keywords";

$opts = array(
    'id' => array(36521),
    'not_id' => array(36222),
    'title' => "startup AND (raise OR raised OR raising OR raises)",
    'body' => "startup",
    'text' => "startup company",
    'language' => array("en","pt"),
    'not_language' => array("es","it"),
    'categories_taxonomy' => "iptc-subjectcode",
    'categories_confident' => false,
    'categories_id' => array("11000000","11003000"),
    'not_categories_id' => array("04001001"),
    'categories_level' => array(1),
    'not_categories_level' => array(2,3),
    'entities_title_text' => array("GNU/Linux","Microsoft"),
    'not_entities_title_text' => array("Windows","Ireland"),
    'entities_title_type' => array("Software","Organization"),
    'not_entities_title_type' => array("Agent","Person"),
    'entities_title_links_dbpedia' => array("http://dbpedia.org/resource/Linux"),
    'not_entities_title_links_dbpedia' => array("http://dbpedia.org/resource/Microsoft"),
    'entities_body_text' => array("Free Software","Open Source"),
    'not_entities_body_text' => array("Proprietary Software"),
    'entities_body_type' => array("Software","Organization"),
    'not_entities_body_type' => array("Agent","Hardware"),
    'entities_body_links_dbpedia' => array("http://dbpedia.org/resource/Linux"),
    'not_entities_body_links_dbpedia' => array("http://dbpedia.org/resource/Windows"),
    'sentiment_title_polarity' => "positive",
    'not_sentiment_title_polarity' => "neutral",
    'sentiment_body_polarity' => "negative",
    'not_sentiment_body_polarity' => "positive",
    'media_images_count_min' => 1,
    'media_images_count_max' => 4,
    'media_images_width_min' => 640,
    'media_images_width_max' => 1024,
    'media_images_height_min' => 480,
    'media_images_height_max' => 800,
    'media_images_content_length_min' => 25412,
    'media_images_content_length_max' => 369541,
    'media_images_format' => array("JPEG","BMP", "GIF"),
    'not_media_images_format' => array("PNG","TIFF"),
    'media_videos_count_min' => 2,
    'media_videos_count_max' => 5,
    'author_id' => array(4155),
    'not_author_id' => array(3214),
    'author_name' => "John Doe",
    'not_author_name' => "Mike Wally",
    'source_id' => array(122),
    'not_source_id' => array(12, 34),
    'source_name' => array("BBC"),
    'not_source_name' => array("Fox News"),
    'source_domain' => array("bbc.co.uk"),
    'not_source_domain' => array("foxnews.com"),
    'source_locations_country' => array("US", "IE"),
    'not_source_locations_country' => array("IN", "NG"),
    'source_locations_state' => array("California"),
    'not_source_locations_state' => array("Arizona"),
    'source_locations_city' => array("Los Angeles"),
    'not_source_locations_city' => array("Dublin City"),
    'source_scopes_country' => array("IN", "IE"),
    'not_source_scopes_country' => array("US"),
    'source_scopes_state' => array("Wicklow"),
    'not_source_scopes_state' => array("California"),
    'source_scopes_city' => array("Dublin City"),
    'not_source_scopes_city' => array("Cork"),
    'source_scopes_level' => array("local"),
    'not_source_scopes_level' => array("international"),
    'source_links_in_count_min' => 254111,
    'source_links_in_count_max' => 587796,
    'source_rankings_alexa_rank_min' => 255,
    'source_rankings_alexa_rank_max' => 1421,
    'source_rankings_alexa_country' => array("IE"),
    'social_shares_count_facebook_min' => 3521,
    'social_shares_count_facebook_max' => 5841,
    'social_shares_count_google_plus_min' => 65241,
    'social_shares_count_google_plus_max' => 105214,
    'social_shares_count_linkedin_min' => 3254,
    'social_shares_count_linkedin_max' => 5621,
    'social_shares_count_reddit_min' => 255,
    'social_shares_count_reddit_max' => 9541
);

try {
    $result = $api_instance->listTrends($field, $opts);
    print_r($result);
} catch (Exception $e) {
    print_r($e->getResponseObject()->getErrors());
    echo 'Exception when calling DefaultApi->listTrends: ', $e->getMessage(), PHP_EOL;
}
?>
