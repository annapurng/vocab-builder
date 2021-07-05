package com.ans.vocabbuilder.helpers;

import com.ans.vocabbuilder.model.Word;
import org.apache.commons.lang3.StringUtils;

public class ValidationHelper {
    public static void validate(Word wordInput) {
        if (StringUtils.isEmpty(wordInput.getName()) ||
                StringUtils.isEmpty(wordInput.getDefinition())||
                        StringUtils.isEmpty(wordInput.getUsage())) {
            throw new IllegalArgumentException("Invalid word object, missing one of word name, definition or usage");
        }
    }
}
