package com.ans.vocabbuilder.model;

import com.ans.vocabbuilder.enums.PartOfSpeech;

import java.util.List;

public class Word {
    private String wordId;
    private String name;
    private String definition;
    private PartOfSpeech partOfSpeech;
    private String usage;
    private List<Word> synonyms;
    private List<Word> antonyms;

    public String getWordId() {
        return wordId;
    }

    public void setWordId(String wordId) {
        this.wordId = wordId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDefinition() {
        return definition;
    }

    public void setDefinition(String definition) {
        this.definition = definition;
    }

    public PartOfSpeech getPartOfSpeech() {
        return partOfSpeech;
    }

    public void setPartOfSpeech(PartOfSpeech partOfSpeech) {
        this.partOfSpeech = partOfSpeech;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public List<Word> getSynonyms() {
        return synonyms;
    }

    public void setSynonyms(List<Word> synonyms) {
        this.synonyms = synonyms;
    }

    public List<Word> getAntonyms() {
        return antonyms;
    }

    public void setAntonyms(List<Word> antonyms) {
        this.antonyms = antonyms;
    }
}
