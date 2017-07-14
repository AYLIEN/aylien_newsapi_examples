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
		CategoriesTaxonomy:   "iab-qag",
		CategoriesId:         []string{"IAB7"},
		Text:                 "fitness",
		Language:             []string{"en"},
		MediaVideosCountMin:  "1",
		MediaVideosCountMax:  "1",
		NotMediaImagesFormat: []string{"GIF"},
		PublishedAtStart:     "NOW-1MONTH",
		PublishedAtEnd:       "NOW",
		SortBy:               "relevance"}

	storiesResponse, res, err := api.ListStories(storiesParams)
	if err != nil {
		panic(err)
	}
	_ = res

	for _, story := range storiesResponse.Stories {
		fmt.Println(story.Title, "/", story.Source.Name)
	}
}
