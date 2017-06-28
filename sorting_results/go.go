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
		Language:                 []string{"en"},
		PublishedAtStart:         "NOW-1MONTH",
		PublishedAtEnd:           "NOW",
		EntitiesBodyLinksDbpedia: []string{"http://dbpedia.org/resource/Baseball"},
		CategoriesTaxonomy:       "iab-qag",
		CategoriesId:             []string{"IAB17"},
		SortBy:                   "source.rankings.alexa.rank.US"}

	storiesResponse, res, err := api.ListStories(storiesParams)
	if err != nil {
		panic(err)
	}
	_ = res

	for _, story := range storiesResponse.Stories {
		fmt.Println(story.Title, " / ", story.Source.Name)
	}
}
