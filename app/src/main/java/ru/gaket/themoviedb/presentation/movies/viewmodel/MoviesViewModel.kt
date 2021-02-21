package ru.gaket.themoviedb.ru.gaket.themoviedb.presentation.movies.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.channels.SendChannel
import ru.gaket.themoviedb.model.movies.entities.Movie
import ru.gaket.themoviedb.presentation.movies.viewmodel.MoviesResult

abstract class MoviesViewModel : ViewModel() {

    abstract val queryChannel: SendChannel<String>

    abstract val searchResult: LiveData<MoviesResult>
    abstract val searchState: LiveData<SearchState>

    abstract fun onMovieAction(movie: Movie)
}
