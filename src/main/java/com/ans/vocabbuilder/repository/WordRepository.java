package com.ans.vocabbuilder.repository;


import com.ans.vocabbuilder.model.Word;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface WordRepository extends MongoRepository<Word, String> {
    public List<Word> findByWord(String word);

    List<Word> findSampleNWords(int count);
}
