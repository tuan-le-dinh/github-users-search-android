# Github Search App

## Features
- Show an input field which captures search queries for Github users.
- Search results should be presented in a list, and dynamically appear with each keystroke (once at least 3 characters have been entered).
- Each search result should display Github user with following properties: login, type, score.
- Scroll to end to load more (default 15 items queried per request)
- When an active HTTP request is in progress, a progress indicator will be showed on the page or at the end of the list (when loading new page) to indicate network activity.
- Once the search is performed, clearing the input should also clear the list of users displayed before.

## Architecture
Application is built around MVVM and Clean Architecture concepts, utilizes such popular libraries as: LiveData, Hilt, AndroidX Navigation, AndroidX Paging, OkHttp, Retrofit, Glide.

## Libraries used
- AndroidX Navigation
- AndroidX Paging
- Android Hilt for dependency injection
- Retrofit2, OkHttp
- Glide
