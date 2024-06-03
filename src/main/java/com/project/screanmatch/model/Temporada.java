package com.project.screanmatch.model;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.core.StandardReflectionParameterNameDiscoverer;

import java.util.List;

@JsonIgnoreProperties(ignoreUnknown = true)
public record Temporada(@JsonAlias("Season")Integer numero,
                        @JsonAlias("Episodes")List<Episodios> episodios) { }
