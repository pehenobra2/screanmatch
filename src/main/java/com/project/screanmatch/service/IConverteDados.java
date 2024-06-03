package com.project.screanmatch.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
