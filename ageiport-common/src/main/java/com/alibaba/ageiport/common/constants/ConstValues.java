package com.alibaba.ageiport.common.constants;

import java.util.regex.Pattern;

/**
 * Const values
 *
 * @author lingyi
 */
public interface ConstValues {

    Pattern COMMA_SPLIT_PATTERN = Pattern.compile("\\s*[,]+\\s*");

    String PROJECT_NAME = "AgeiPort";

    String PROJECT_LOWER_KEY = "ageiport";


    String DEFAULT_KEY = "default";

    String DOT = ".";

    String AT = "@";

    String SUB = "-";

    String REMOVE_PREFIX = SUB;

    long MAX_TIMEOUT_TIME_MS = 1000 * 60 * 60 * 2;

}
