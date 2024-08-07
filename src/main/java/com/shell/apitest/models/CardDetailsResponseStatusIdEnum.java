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
 * CardDetailsResponseStatusIdEnum to be used.
 */
public enum CardDetailsResponseStatusIdEnum {
    ENUM_1,

    ENUM_7,

    ENUM_8,

    ENUM_9,

    ENUM_10,

    ENUM_23,

    ENUM_31,

    ENUM_41,

    ENUM_42,

    ENUM_43,

    ENUM_101,

    ENUM_102,

    ENUM_103,

    ENUM_104,

    ENUM_105,

    ENUM_106,

    ENUM_107,

    ENUM_108;


    private static TreeMap<Integer, CardDetailsResponseStatusIdEnum> valueMap = new TreeMap<>();
    private Integer value;

    static {
        ENUM_1.value = 1;
        ENUM_7.value = 7;
        ENUM_8.value = 8;
        ENUM_9.value = 9;
        ENUM_10.value = 10;
        ENUM_23.value = 23;
        ENUM_31.value = 31;
        ENUM_41.value = 41;
        ENUM_42.value = 42;
        ENUM_43.value = 43;
        ENUM_101.value = 101;
        ENUM_102.value = 102;
        ENUM_103.value = 103;
        ENUM_104.value = 104;
        ENUM_105.value = 105;
        ENUM_106.value = 106;
        ENUM_107.value = 107;
        ENUM_108.value = 108;

        valueMap.put(1, ENUM_1);
        valueMap.put(7, ENUM_7);
        valueMap.put(8, ENUM_8);
        valueMap.put(9, ENUM_9);
        valueMap.put(10, ENUM_10);
        valueMap.put(23, ENUM_23);
        valueMap.put(31, ENUM_31);
        valueMap.put(41, ENUM_41);
        valueMap.put(42, ENUM_42);
        valueMap.put(43, ENUM_43);
        valueMap.put(101, ENUM_101);
        valueMap.put(102, ENUM_102);
        valueMap.put(103, ENUM_103);
        valueMap.put(104, ENUM_104);
        valueMap.put(105, ENUM_105);
        valueMap.put(106, ENUM_106);
        valueMap.put(107, ENUM_107);
        valueMap.put(108, ENUM_108);
    }

    /**
     * Returns the enum member associated with the given integer value.
     * @param toConvert String value to get enum member.
     * @return The enum member against the given integer value.
     * @throws IOException when provided value is not mapped to any enum member.
     */
    @JsonCreator
    public static CardDetailsResponseStatusIdEnum constructFromInteger(Integer toConvert) throws IOException {
        CardDetailsResponseStatusIdEnum enumValue = fromInteger(toConvert);
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
    public static CardDetailsResponseStatusIdEnum fromInteger(Integer toConvert) {
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
     * Convert list of CardDetailsResponseStatusIdEnum values to list of integer values.
     * @param toConvert The list of CardDetailsResponseStatusIdEnum values to convert.
     * @return List of representative integer values.
     */
    public static List<Integer> toValue(List<CardDetailsResponseStatusIdEnum> toConvert) {
        if (toConvert == null) {
            return null;
        }
        List<Integer> convertedValues = new ArrayList<>();
        for (CardDetailsResponseStatusIdEnum enumValue : toConvert) {
            convertedValues.add(enumValue.value);
        }
        return convertedValues;
    }
} 