package com.project.screanmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Episodios(@JsonAlias("Title")String titulo,
                        @JsonAlias("Episode")Integer numero,
                        @JsonAlias("imdbRating")String avaliacao,
                        @JsonAlias("Released")String dtLancamento) { }
