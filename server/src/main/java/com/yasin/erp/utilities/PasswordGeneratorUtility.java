package com.yasin.erp.utilities;

import java.util.UUID;

public class PasswordGeneratorUtility {
    public static String generate() {
        return UUID.randomUUID().toString();
    }
}
