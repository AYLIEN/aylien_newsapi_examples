<?php
require_once(__DIR__ . '/vendor/autoload.php');

// Configure API key authorization: app_id
Aylien\NewsApi\Configuration::getDefaultConfiguration()->setApiKey('X-AYLIEN-NewsAPI-Application-ID', '{{current_app_id}}');

// Configure API key authorization: app_key
Aylien\NewsApi\Configuration::getDefaultConfiguration()->setApiKey('X-AYLIEN-NewsAPI-Application-Key', '{{current_app_key}}');

$api_instance = new Aylien\NewsApi\Api\DefaultApi();

$type = "dbpedia_resources";
$term = "obam";

$opts = array(
    'language' => "en", 
    'per_page' => 3
);

try {
    $result = $api_instance->listAutocompletes($type, $term, $opts);
    print_r($result);
} catch (Exception $e) {
    print_r($e->getResponseObject()->getErrors());
    echo 'Exception when calling DefaultApi->listAutocompletes: ', $e->getMessage(), PHP_EOL;
}
?>
