package org.npci;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;

public class TestSetup {

    @Test
    void shouldWork() {
        assertThat(1+1,is(2));
    }
}
