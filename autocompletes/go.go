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

	autocompleteType := "dbpedia_resources"
	term := "obam"
	language := "en"
	perPage := int32(5)

	autocompletesParams := &newsapi.AutocompletesParams{
		Type:     autocompleteType,
		Term:     term,
		Language: language,
		PerPage:  perPage}

	autocompletesResponse, res, err := api.ListAutocompletes(autocompletesParams)
	if err != nil {
		panic(err)
	}
	_ = res

	fmt.Println(autocompletesResponse)
}
