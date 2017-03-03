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

	id := []int64{2541}
	notId := []int64{5411, 6565}
	title := "startup AND (raise OR raised OR raising OR raises)"
	body := "startup"
	text := "startup company"
	language := []string{"en", "de"}
	notLanguage := []string{"it", "es"}
	publishedAtStart := "NOW-2MONTHS"
	publishedAtEnd := "NOW"
	categoriesTaxonomy := "iptc-subjectcode"
	categoriesConfident := "true"
	categoriesId := []string{"11000000"}
	notCategoriesId := []string{"10000000", "04001000"}
	categoriesLevel := []int32{3}
	notCategoriesLevel := []int32{1, 2}
	entitiesTitleText := []string{"GNU/Linux"}
	notEntitiesTitleText := []string{"Windows", "Microsoft"}
	entitiesTitleType := []string{"Software", "Organization"}
	notEntitiesTitleType := []string{"Person", "Agent"}
	entitiesTitleLinksDbpedia := []string{"http://dbpedia.org/resource/Linux"}
	notEntitiesTitleLinksDbpedia := []string{"http://dbpedia.org/resource/Windows"}
	entitiesBodyText := []string{"Free Software"}
	notEntitiesBodyText := []string{"Open Source Software"}
	entitiesBodyType := []string{"Software", "Organization"}
	notEntitiesBodyType := []string{"Agent", "Person"}
	entitiesBodyLinksDbpedia := []string{"http://dbpedia.org/resource/Linux"}
	notEntitiesBodyLinksDbpedia := []string{"http://dbpedia.org/resource/Microsoft"}
	sentimentTitlePolarity := "positive"
	notSentimentTitlePolarity := "neutral"
	sentimentBodyPolarity := "neutral"
	notSentimentBodyPolarity := "neutral"
	mediaImagesCountMin := "3"
	mediaImagesCountMax := "4"
	mediaImagesWidthMin := "640"
	mediaImagesWidthMax := "1024"
	mediaImagesHeightMin := "480"
	mediaImagesHeightMax := "800"
	mediaImagesContentLengthMin := "25412"
	mediaImagesContentLengthMax := "369521"
	mediaImagesFormat := []string{"JPEG", "BMP", "GIF"}
	notMediaImagesFormat := []string{"PNG", "TIFF"}
	mediaVideosCountMin := "1"
	mediaVideosCountMax := "2"
	authorId := []int32{144}
	notAuthorId := []int32{142, 455}
	authorName := "John Doe"
	notAuthorName := "Mike Wally"
	sourceId := []int32{163}
	notSourceId := []int32{354, 141}
	sourceName := []string{"BBC"}
	notSourceName := []string{"Fox News"}
	sourceDomain := []string{"bbc.co.uk"}
	notSourceDomain := []string{"foxnews.com"}
	sourceLocationsCountry := []string{"US"}
	notSourceLocationsCountry := []string{"IE", "IR"}
	sourceLocationsState := []string{"California"}
	notSourceLocationsState := []string{"Arizona"}
	sourceLocationsCity := []string{"Los Angeles"}
	notSourceLocationsCity := []string{"New York City"}
	sourceScopesCountry := []string{"IE"}
	notSourceScopesCountry := []string{"IE"}
	sourceScopesState := []string{"Co Dublin"}
	notSourceScopesState := []string{"Wicklow"}
	sourceScopesCity := []string{"Dublin City"}
	notSourceScopesCity := []string{"Cork"}
	sourceScopesLevel := []string{"local"}
	notSourceScopesLevel := []string{"national"}
	sourceLinksInCountMin := int32(142221)
	sourceLinksInCountMax := int32(325000)
	sourceRankingsAlexaRankMin := int32(1)
	sourceRankingsAlexaRankMax := int32(10)
	sourceRankingsAlexaCountry := []string{"IE"}
	socialSharesCountFacebookMin := "3521"
	socialSharesCountFacebookMax := "5841"
	socialSharesCountGooglePlusMin := "2514"
	socialSharesCountGooglePlusMax := "36521"
	socialSharesCountLinkedinMin := "6521"
	socialSharesCountLinkedinMax := "36521"
	socialSharesCountRedditMin := "14125"
	socialSharesCountRedditMax := "95412"
	intervalStart := int32(2500)
	intervalEnd := int32(200000)
	intervalWidth := int32(2000)
	field := "social_shares_count.linkedin"

	histogramsParams := &newsapi.HistogramsParams{
		Id:                             id,
		NotId:                          notId,
		Title:                          title,
		Body:                           body,
		Text:                           text,
		Language:                       language,
		NotLanguage:                    notLanguage,
		PublishedAtStart:               publishedAtStart,
		PublishedAtEnd:                 publishedAtEnd,
		CategoriesTaxonomy:             categoriesTaxonomy,
		CategoriesConfident:            categoriesConfident,
		CategoriesId:                   categoriesId,
		NotCategoriesId:                notCategoriesId,
		CategoriesLevel:                categoriesLevel,
		NotCategoriesLevel:             notCategoriesLevel,
		EntitiesTitleText:              entitiesTitleText,
		NotEntitiesTitleText:           notEntitiesTitleText,
		EntitiesTitleType:              entitiesTitleType,
		NotEntitiesTitleType:           notEntitiesTitleType,
		EntitiesTitleLinksDbpedia:      entitiesTitleLinksDbpedia,
		NotEntitiesTitleLinksDbpedia:   notEntitiesTitleLinksDbpedia,
		EntitiesBodyText:               entitiesBodyText,
		NotEntitiesBodyText:            notEntitiesBodyText,
		EntitiesBodyType:               entitiesBodyType,
		NotEntitiesBodyType:            notEntitiesBodyType,
		EntitiesBodyLinksDbpedia:       entitiesBodyLinksDbpedia,
		NotEntitiesBodyLinksDbpedia:    notEntitiesBodyLinksDbpedia,
		SentimentTitlePolarity:         sentimentTitlePolarity,
		NotSentimentTitlePolarity:      notSentimentTitlePolarity,
		SentimentBodyPolarity:          sentimentBodyPolarity,
		NotSentimentBodyPolarity:       notSentimentBodyPolarity,
		MediaImagesCountMin:            mediaImagesCountMin,
		MediaImagesCountMax:            mediaImagesCountMax,
		MediaImagesWidthMin:            mediaImagesWidthMin,
		MediaImagesWidthMax:            mediaImagesWidthMax,
		MediaImagesHeightMin:           mediaImagesHeightMin,
		MediaImagesHeightMax:           mediaImagesHeightMax,
		MediaImagesContentLengthMin:    mediaImagesContentLengthMin,
		MediaImagesContentLengthMax:    mediaImagesContentLengthMax,
		MediaImagesFormat:              mediaImagesFormat,
		NotMediaImagesFormat:           notMediaImagesFormat,
		MediaVideosCountMin:            mediaVideosCountMin,
		MediaVideosCountMax:            mediaVideosCountMax,
		AuthorId:                       authorId,
		NotAuthorId:                    notAuthorId,
		AuthorName:                     authorName,
		NotAuthorName:                  notAuthorName,
		SourceId:                       sourceId,
		NotSourceId:                    notSourceId,
		SourceName:                     sourceName,
		NotSourceName:                  notSourceName,
		SourceDomain:                   sourceDomain,
		NotSourceDomain:                notSourceDomain,
		SourceLocationsCountry:         sourceLocationsCountry,
		NotSourceLocationsCountry:      notSourceLocationsCountry,
		SourceLocationsState:           sourceLocationsState,
		NotSourceLocationsState:        notSourceLocationsState,
		SourceLocationsCity:            sourceLocationsCity,
		NotSourceLocationsCity:         notSourceLocationsCity,
		SourceScopesCountry:            sourceScopesCountry,
		NotSourceScopesCountry:         notSourceScopesCountry,
		SourceScopesState:              sourceScopesState,
		NotSourceScopesState:           notSourceScopesState,
		SourceScopesCity:               sourceScopesCity,
		NotSourceScopesCity:            notSourceScopesCity,
		SourceScopesLevel:              sourceScopesLevel,
		NotSourceScopesLevel:           notSourceScopesLevel,
		SourceLinksInCountMin:          sourceLinksInCountMin,
		SourceLinksInCountMax:          sourceLinksInCountMax,
		SourceRankingsAlexaRankMin:     sourceRankingsAlexaRankMin,
		SourceRankingsAlexaRankMax:     sourceRankingsAlexaRankMax,
		SourceRankingsAlexaCountry:     sourceRankingsAlexaCountry,
		SocialSharesCountFacebookMin:   socialSharesCountFacebookMin,
		SocialSharesCountFacebookMax:   socialSharesCountFacebookMax,
		SocialSharesCountGooglePlusMin: socialSharesCountGooglePlusMin,
		SocialSharesCountGooglePlusMax: socialSharesCountGooglePlusMax,
		SocialSharesCountLinkedinMin:   socialSharesCountLinkedinMin,
		SocialSharesCountLinkedinMax:   socialSharesCountLinkedinMax,
		SocialSharesCountRedditMin:     socialSharesCountRedditMin,
		SocialSharesCountRedditMax:     socialSharesCountRedditMax,
		IntervalStart:                  intervalStart,
		IntervalEnd:                    intervalEnd,
		IntervalWidth:                  intervalWidth,
		Field:                          field}

	histogramsResponse, res, err := api.ListHistograms(histogramsParams)
	if err != nil {
		panic(err)
	}
	_ = res

	fmt.Println(histogramsResponse)
}
