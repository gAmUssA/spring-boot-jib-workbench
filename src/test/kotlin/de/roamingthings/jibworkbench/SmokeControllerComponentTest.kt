package de.roamingthings.jibworkbench

import org.junit.jupiter.api.Test
import org.springframework.http.MediaType.TEXT_PLAIN
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.content
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.status
import org.springframework.test.web.servlet.setup.MockMvcBuilders.standaloneSetup


class SmokeControllerComponentTest {
    @Test
    internal fun `smoke endpoint should respond with content type text and status OK`() {
        // given
        val smokeController = SmokeController()
        val mockMvc = aMockMvcFor(smokeController)

        // when
        val requestResponse = mockMvc.perform(get("/smoke"))

        //then
        requestResponse
                .andExpect(status().isOk)
                .andExpect(content().contentTypeCompatibleWith(TEXT_PLAIN))
    }

    @Test
    internal fun `burn endpoint should respond with content type text and status OK`() {
        // given
        val smokeController = SmokeController()
        val mockMvc = aMockMvcFor(smokeController)

        // when
        val requestResponse = mockMvc.perform(get("/burn"))

        //then
        requestResponse
                .andExpect(status().isOk)
                .andExpect(content().contentTypeCompatibleWith(TEXT_PLAIN))
    }

    private fun aMockMvcFor(controller: Any): MockMvc =
            standaloneSetup(controller).build()
}