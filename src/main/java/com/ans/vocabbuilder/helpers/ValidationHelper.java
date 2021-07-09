package com.ans.vocabbuilder.helpers;

import com.ans.vocabbuilder.model.Word;
import org.apache.commons.lang3.StringUtils;
import org.springframework.util.CollectionUtils;

public class ValidationHelper {
    public static void validate(Word wordInput) {
        if (StringUtils.isEmpty(wordInput.getName()) ||
                CollectionUtils.isEmpty(wordInput.getDefinitions())||
                        StringUtils.isEmpty(wordInput.getUsage())) {
            throw new IllegalArgumentException("Invalid word object, missing one of word name, definition or usage");
        }
    }
}
