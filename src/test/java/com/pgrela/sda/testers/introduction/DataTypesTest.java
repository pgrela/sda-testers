package com.pgrela.sda.testers.introduction;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class DataTypesTest {

    @Test
    public void test() {
        int a = 2 + 2;
        Assertions.assertThat(a).isEqualTo(4);
    }

}