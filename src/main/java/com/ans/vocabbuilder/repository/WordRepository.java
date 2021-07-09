package com.ans.vocabbuilder.repository;


import com.ans.vocabbuilder.model.Word;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import java.util.List;

public interface WordRepository extends MongoRepository<Word, String> {
    List<Word> findByWordId(String word);
    @Query("{'$sample' : { 'size': ?0}}")
    List<Word> findSampleNWords(int count);
}
