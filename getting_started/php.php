<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure API key authorization: app_id
Aylien\NewsApi\Configuration::getDefaultConfiguration()->setApiKey('X-AYLIEN-NewsAPI-Application-ID', '{{current_app_id}}');

// Configure API key authorization: app_key
Aylien\NewsApi\Configuration::getDefaultConfiguration()->setApiKey('X-AYLIEN-NewsAPI-Application-Key', '{{current_app_key}}');

$api_instance = new Aylien\NewsApi\Api\DefaultApi();

$opts = array(
  'title' => 'trump',
  'published_at_start' => 'NOW-7DAYS',
  'published_at_end' => 'NOW',
  'entities_body_links_dbpedia' => [
    'http://dbpedia.org/resource/Donald_Trump',
    'http://dbpedia.org/resource/Hillary_Rodham_Clinton'
  ],
  'language' => ['en'],
  'not_language' => ['es', 'it'],
  'sort_by' => 'social_shares_count.facebook'
);

try {
    $result = $api_instance->listStories($opts);
    for($i = 0; $i < sizeof($result->getStories()); $i++){
      print_r($result->getStories()[$i]->getTitle() . " / " .
        $result->getStories()[$i]->getSource()->getName() . "\n");
    }
} catch (Exception $e) {
    print_r($e->getResponseObject()->getErrors());
    echo 'Exception when calling DefaultApi->listStories: ', $e->getMessage(), "\n";
}
?>
