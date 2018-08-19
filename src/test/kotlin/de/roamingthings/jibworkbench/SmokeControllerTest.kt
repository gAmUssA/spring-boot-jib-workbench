package de.roamingthings.jibworkbench

import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

internal class SmokeControllerTest {

    @Test
    internal fun `smoke endpoint should respond with smoking`() {
        // given
        val smokeController = SmokeController()

        // when
        val smokeResponse = smokeController.smoke()

        // them
        assertThat(smokeResponse).isEqualTo("smoking")
    }

    @Test
    internal fun `burn endpoint should respond with burning`() {
        // given
        val smokeController = SmokeController()

        // when
        val burnResponse = smokeController.burn()

        // them
        assertThat(burnResponse).isEqualTo("burning")
    }

}