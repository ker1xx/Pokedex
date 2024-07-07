package com.example.pokedex.DI

import com.example.pokedex.data.remote.PokemonAPI
import com.example.pokedex.repository.PokemonRepository
import com.example.pokedex.utility.Constants.BASE_URL
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {


    @Singleton
    @Provides
    fun providePokemonRepository(
        api : PokemonAPI
    ) = PokemonRepository(api)

    @Singleton
    @Provides
    fun providePokemonAPI() : PokemonAPI{
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(BASE_URL)
            .build()
            .create(PokemonAPI::class.java)
    }
}