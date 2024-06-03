package com.project.screanmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Serie(@JsonAlias("Title") String titulo,
                    @JsonAlias("totalSeasons") Integer totalTemporadas,
                    @JsonAlias("imdbRating") String avaliacao) {
}
