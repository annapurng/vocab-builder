package com.ans.vocabbuilder.model;

import com.ans.vocabbuilder.enums.PartOfSpeech;
import org.springframework.data.mongodb.core.index.IndexDirection;
import org.springframework.data.mongodb.core.index.Indexed;

import java.util.List;

public class Word {
    @Indexed(name = "word_id_index", direction = IndexDirection.DESCENDING)
    private String wordId;
    private String name;
    private List<String> definition;
    private PartOfSpeech partOfSpeech;
    private String usage;
    private List<String> synonyms;
    private List<String> antonyms;

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

    public List<String> getDefinitions() {
        return definition;
    }

    public void setDefinitions(List<String> definition) {
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

    public List<String> getSynonyms() {
        return synonyms;
    }

    public void setSynonyms(List<String> synonyms) {
        this.synonyms = synonyms;
    }

    public List<String> getAntonyms() {
        return antonyms;
    }

    public void setAntonyms(List<String> antonyms) {
        this.antonyms = antonyms;
    }
}
