package com.ans.vocabbuilder.controller;

import com.ans.vocabbuilder.exception.VocabBuilderException;
import com.ans.vocabbuilder.helpers.ValidationHelper;
import com.ans.vocabbuilder.model.Word;
import com.ans.vocabbuilder.repository.WordRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.UUID;


@RestController
@RequestMapping("/words")
public class WordController {
    
    @Autowired
    WordRepository wordRepository;
    
    @GetMapping(produces="application/json")
    public List<Word> getAllWords() {
        return wordRepository.findAll();
    }
    
    @GetMapping(value="/{word}", produces="application/json")
    public List<Word> getWord(@PathVariable String word) {
        return wordRepository.findByWordId(word);
    }

    @GetMapping(value="/random", produces="application/json")
    public List<Word> getRandomWords(@RequestParam int count) {
        return wordRepository.findSampleNWords(count);

    }
    
    @PostMapping(produces="application/json", consumes="application/json")
    public Word addWord(@RequestBody Word wordInput) {
        ValidationHelper.validate(wordInput);

        wordInput.setWordId(UUID.randomUUID().toString());
        return wordRepository.save(wordInput);
    }

    @DeleteMapping("/{wordId}")
    public void removeWord(String wordId) {
        Optional<Word> word = wordRepository.findById(wordId);

        if (!word.isPresent()) {
            throw new VocabBuilderException("Failed to find word for id " + wordId);
        }

        wordRepository.delete(word.get());

        if (wordRepository.findById(wordId).isPresent()) {
            throw new VocabBuilderException("Failed to delete word " + wordId);
        }
    }
    
}
