package com.study;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringTest {

    @Test
    @DisplayName("\"1,2\"을 ,로 split 했을 때 1과 2로 잘 분리되는지 확인하는 학습 테스트를 구현한다.")
    void split() {
        String[] result = "1,2,".split(",");
        System.out.println(result.length);
        assertThat(result).contains("1");
    }

    @Test
    @DisplayName("\"1\"을 ,로 split 했을 때 1만을 포함하는 배열이 반환되는지에 대한 학습 테스트를 구현한다.")
    void splitSingle() {
        String[] result = "1".split(",");
        assertThat(result).contains("1");
    }

    @Test
    void indexOutOfException() {
        assertThatThrownBy(() -> {
            int index = 3;
            String inputString = "abc";
            char result = inputString.charAt(index);
        }).isInstanceOf(IndexOutOfBoundsException.class)
                .hasMessageContaining("String index out of range: 3");
    }
}
