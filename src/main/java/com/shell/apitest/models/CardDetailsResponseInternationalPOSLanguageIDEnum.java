/*
 * ShellCardManagementAPIsLib
 *
 * This file was automatically generated by APIMATIC v3.0 ( https://www.apimatic.io ).
 */

package com.shell.apitest.models;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;


/**
 * CardDetailsResponseInternationalPOSLanguageIDEnum to be used.
 */
public enum CardDetailsResponseInternationalPOSLanguageIDEnum {
    ENUM_1,

    ENUM_2,

    ENUM_3,

    ENUM_4,

    ENUM_5,

    ENUM_6,

    ENUM_7,

    ENUM_8,

    ENUM_9,

    ENUM_10,

    ENUM_11,

    ENUM_12,

    ENUM_13,

    ENUM_14,

    ENUM_15,

    ENUM_16,

    ENUM_17,

    ENUM_18,

    ENUM_19,

    ENUM_20,

    ENUM_21,

    ENUM_22,

    ENUM_23,

    ENUM_24,

    ENUM_25,

    ENUM_26,

    ENUM_27,

    ENUM_28,

    ENUM_29,

    ENUM_30,

    ENUM_31;


    private static TreeMap<Integer, CardDetailsResponseInternationalPOSLanguageIDEnum> valueMap = new TreeMap<>();
    private Integer value;

    static {
        ENUM_1.value = 1;
        ENUM_2.value = 2;
        ENUM_3.value = 3;
        ENUM_4.value = 4;
        ENUM_5.value = 5;
        ENUM_6.value = 6;
        ENUM_7.value = 7;
        ENUM_8.value = 8;
        ENUM_9.value = 9;
        ENUM_10.value = 10;
        ENUM_11.value = 11;
        ENUM_12.value = 12;
        ENUM_13.value = 13;
        ENUM_14.value = 14;
        ENUM_15.value = 15;
        ENUM_16.value = 16;
        ENUM_17.value = 17;
        ENUM_18.value = 18;
        ENUM_19.value = 19;
        ENUM_20.value = 20;
        ENUM_21.value = 21;
        ENUM_22.value = 22;
        ENUM_23.value = 23;
        ENUM_24.value = 24;
        ENUM_25.value = 25;
        ENUM_26.value = 26;
        ENUM_27.value = 27;
        ENUM_28.value = 28;
        ENUM_29.value = 29;
        ENUM_30.value = 30;
        ENUM_31.value = 31;

        valueMap.put(1, ENUM_1);
        valueMap.put(2, ENUM_2);
        valueMap.put(3, ENUM_3);
        valueMap.put(4, ENUM_4);
        valueMap.put(5, ENUM_5);
        valueMap.put(6, ENUM_6);
        valueMap.put(7, ENUM_7);
        valueMap.put(8, ENUM_8);
        valueMap.put(9, ENUM_9);
        valueMap.put(10, ENUM_10);
        valueMap.put(11, ENUM_11);
        valueMap.put(12, ENUM_12);
        valueMap.put(13, ENUM_13);
        valueMap.put(14, ENUM_14);
        valueMap.put(15, ENUM_15);
        valueMap.put(16, ENUM_16);
        valueMap.put(17, ENUM_17);
        valueMap.put(18, ENUM_18);
        valueMap.put(19, ENUM_19);
        valueMap.put(20, ENUM_20);
        valueMap.put(21, ENUM_21);
        valueMap.put(22, ENUM_22);
        valueMap.put(23, ENUM_23);
        valueMap.put(24, ENUM_24);
        valueMap.put(25, ENUM_25);
        valueMap.put(26, ENUM_26);
        valueMap.put(27, ENUM_27);
        valueMap.put(28, ENUM_28);
        valueMap.put(29, ENUM_29);
        valueMap.put(30, ENUM_30);
        valueMap.put(31, ENUM_31);
    }

    /**
     * Returns the enum member associated with the given integer value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given integer value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static CardDetailsResponseInternationalPOSLanguageIDEnum constructFromInteger(Integer toConvert) throws IOException {
        CardDetailsResponseInternationalPOSLanguageIDEnum enumValue = fromInteger(toConvert);
        if (enumValue == null) {
            throw new IOException("Unable to create enum instance with value: " + toConvert);
        }
        return enumValue;
    }

    /**
     * Returns the enum member associated with the given integer value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given integer value.
     */
    public static CardDetailsResponseInternationalPOSLanguageIDEnum fromInteger(Integer toConvert) {
        return valueMap.get(toConvert);
    }

    /**
     * Returns the integer value associated with the enum member.
     * @return The integer value against enum member.
     */
    @JsonValue
    public Integer value() {
        return value;
    }
        
    /**
     * Get string representation of this enum.
     */
    @Override
    public String toString() {
        return value.toString();
    }

    /**
     * Convert list of CardDetailsResponseInternationalPOSLanguageIDEnum values to list of integer values.
     * @param toConvert The list of CardDetailsResponseInternationalPOSLanguageIDEnum values to convert.
     * @return List of representative integer values.
     */
    public static List<Integer> toValue(List<CardDetailsResponseInternationalPOSLanguageIDEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<Integer> convertedValues = new ArrayList<>();
        for (CardDetailsResponseInternationalPOSLanguageIDEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 