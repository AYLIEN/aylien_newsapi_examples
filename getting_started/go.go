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
		Title:            "trump",
		Language:         []string{"en"},
		NotLanguage:      []string{"it", "es"},
		PublishedAtStart: "NOW-7DAYS",
		PublishedAtEnd:   "NOW",
		EntitiesBodyLinksDbpedia: []string{
			"http://dbpedia.org/resource/Donald_Trump",
			"http://dbpedia.org/resource/Hillary_Rodham_Clinton",
		},
		SortBy: "social_shares_count.facebook"}

	storiesResponse, res, err := api.ListStories(storiesParams)
	if err != nil {
		panic(err)
	}
	_ = res

	for _, story := range storiesResponse.Stories {
		fmt.Println(story.Title, " / ", story.Source.Name)
	}
}
