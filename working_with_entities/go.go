package main

// Import the library
import (
	"fmt"
	newsapi "github.com/AYLIEN/aylien_newsapi_go"
)

func main() {
	api := newsapi.NewDefaultApi()

	// Configure API key authorization: app_id
	api.Configuration.APIKeyPrefix["X-AYLIEN-NewsAPI-Application-ID"] = "{{current_app_id}}"

	// Configure API key authorization: app_key
	api.Configuration.APIKeyPrefix["X-AYLIEN-NewsAPI-Application-Key"] = "{{current_app_key}}"

	storiesParams := &newsapi.StoriesParams{
		EntitiesBodyLinksDbpedia: []string{
			"http://dbpedia.org/resource/Harvey_Norman",
			"http://dbpedia.org/resource/Apple_Inc."},
		Language:         []string{"en"},
		PublishedAtStart: "NOW-1DAY",
		PublishedAtEnd:   "NOW"}

	storiesResponse, res, err := api.ListStories(storiesParams)
	if err != nil {
		panic(err)
	}
	_ = res

	fmt.Println("The API has been called successfully.")
	fmt.Println("=====================================")
	for _, story := range storiesResponse.Stories {
		fmt.Println(story.Title, "/", story.Source.Name)
	}
}
