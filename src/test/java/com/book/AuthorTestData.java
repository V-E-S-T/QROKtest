package com.book;

import com.book.model.Author;
import com.book.model.Reward;
import com.book.model.Sex;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.test.web.servlet.ResultMatcher;

import java.util.Arrays;
import java.util.Date;

import static org.assertj.core.api.Assertions.assertThat;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.content;

public class AuthorTestData {

    private static final ObjectMapper MAPPER = new ObjectMapper();

    public static final Author author_1 = new Author("firstName_1", "lastName_1", Sex.FEMALE, new Date(1975, 5, 5));
    public static final Author author_2 = new Author("firstName_2", "lastName_2", Sex.FEMALE, new Date(1977, 7, 7));
    public static final Author author_3 = new Author("firstName_3", "lastName_3", Sex.FEMALE, new Date(1978, 8, 8));
    public static final Author author_4 = new Author("firstName_4", "lastName_4", Sex.FEMALE, new Date(1979, 9, 9));

    public static final Reward reward_1 = new Reward(2000, "reward_1");
    public static final Reward reward_2 = new Reward(2000, "reward_2");
    public static final Reward reward_3 = new Reward(2000, "reward_3");

    public static void assertMatch(Author actual, Author expected) {
        assertThat(actual).isEqualTo(expected);
    }

    public static void assertMatch(Iterable<Author> actual, Author... expected) {
        assertMatch(actual, Arrays.asList(expected));
    }

    public static void assertMatch(Iterable<Author> actual, Iterable<Author> expected) {
        assertThat(actual).usingFieldByFieldElementComparator().isEqualTo(expected);
    }

    public static ResultMatcher contentJson(Author... expected) {

        try {
            return content().json(MAPPER.writeValueAsString(Arrays.asList(expected)));
        } catch (JsonProcessingException e) {
            throw new IllegalStateException("Invalid write to JSON:\n'" + Arrays.asList(expected) + "'", e);
        }
    }

    public static ResultMatcher contentJson(Author expected) {

        try {
            return content().json(MAPPER.writeValueAsString(expected));
        } catch (JsonProcessingException e) {
            throw new IllegalStateException("Invalid write to JSON:\n'" + expected + "'", e);
        }
    }
}
