<?php
require_once(__DIR__ . '/../vendor/autoload.php');

// Configure API key authorization: app_id
Aylien\NewsApi\Configuration::getDefaultConfiguration()->setApiKey('X-AYLIEN-NewsAPI-Application-ID', '{{current_app_id}}');

// Configure API key authorization: app_key
Aylien\NewsApi\Configuration::getDefaultConfiguration()->setApiKey('X-AYLIEN-NewsAPI-Application-Key', '{{current_app_key}}');

$api_instance = new Aylien\NewsApi\Api\DefaultApi();

$opts = array(
  'entities_body_links_dbpedia' => [
    'http://dbpedia.org/resource/Harvey_Norman',
    'http://dbpedia.org/resource/Apple_Inc.'
  ],
  'language' => ['en'],
  'published_at_start' => 'NOW-1DAY',
  'published_at_end' => 'NOW'
);

try {
    $result = $api_instance->listStories($opts);
    print_r("The API has been called successfully.\n");
    print_r("=====================================\n");
    for($i = 0; $i < sizeof($result->getStories()); $i++){
      print_r($result->getStories()[$i]->getTitle() . " / " .
        $result->getStories()[$i]->getSource()->getName() . "\n");
    }
} catch (Exception $e) {
    print_r($e->getResponseObject()->getErrors());
    echo 'Exception when calling DefaultApi->listStories: ', $e->getMessage(), "\n";
}
?>
