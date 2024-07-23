import assertk.assertThat
import assertk.assertions.isEqualTo
import kotlin.test.Test

class GetInitialsKtTest {

    @Test
    fun testGetInitials() {
        val fullName = "Olga Bakhur"

        assertThat(getInitials(fullName)).isEqualTo("OB")
    }
}