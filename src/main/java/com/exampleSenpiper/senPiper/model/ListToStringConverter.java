package com.exampleSenpiper.senPiper.model;

import org.springframework.stereotype.Component;

import javax.persistence.AttributeConverter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
@Component

//converting the list from coursesOffered to a string to store in database and then converting the string into a list to display the list in getAPI
public class ListToStringConverter implements AttributeConverter<List<String>, String> {

        @Override
        public String convertToDatabaseColumn(List<String> attribute) {
            return attribute == null ? null : String.join(",",attribute);
        }

        @Override
        public List<String> convertToEntityAttribute(String dbData) {
            return dbData == null ? Collections.emptyList() : Arrays.asList(dbData.split(","));
        }
    }
