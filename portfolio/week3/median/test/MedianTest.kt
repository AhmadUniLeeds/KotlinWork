// COMP2850 Portfolio: Week 3
// Tests for median()

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            median(listOf())
        }
    }

    // Write four more tests here

    "Correct median when size = 1" {
        median(listOf(5.0f)) shouldBe 5.0f
    }

    "Correct median when size = 2" {
        median(listOf(4.0f, 2.0f)) shouldBe 3.0f
    }

    "Correct median when size = 3" {
        median(listOf(1.0f, 5.5f, 2.5f)) shouldBe 2.5f
    }

    "Correct median when size = 4" {
        median(listOf(4.0f, 1.0f, 0.0f, 9.0f)) shouldBe 2.5f
    }

})
