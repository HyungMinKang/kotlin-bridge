package bridge


import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.assertThrows

class BridgeTest {

    @Test
    fun `다리 길이 입력 예외 테스트1`(){
        val exception = assertThrows<IllegalArgumentException>(Constants.ERROR_NOT_ONLY_NUMBER) {
            InputValidator.checkOnlyNumber("ab")
        }
        Assertions.assertEquals(Constants.ERROR_NOT_ONLY_NUMBER, exception.message)
    }

    @Test
    fun `다리 길이 입력 예외 테스트2`(){
        val exception = assertThrows<IllegalArgumentException>(Constants.ERROR_OUT_OF_RANGE_BRIDGE) {
            InputValidator.checkInBridgeRange("2")
        }
        Assertions.assertEquals(Constants.ERROR_OUT_OF_RANGE_BRIDGE, exception.message)
    }

    @Test
    fun `다리 길이 입력 예외 테스트3`(){
        val exception = assertThrows<IllegalArgumentException>(Constants.ERROR_OUT_OF_RANGE_BRIDGE) {
            InputValidator.checkInBridgeRange("-1")
        }
        Assertions.assertEquals(Constants.ERROR_OUT_OF_RANGE_BRIDGE, exception.message)
    }

    @Test
    fun `다리 길이 입력 예외 테스트4`(){
        val exception = assertThrows<IllegalArgumentException>(Constants.ERROR_OUT_OF_RANGE_BRIDGE) {
            InputValidator.checkInBridgeRange("35")
        }
        Assertions.assertEquals(Constants.ERROR_OUT_OF_RANGE_BRIDGE, exception.message)
    }

    @Test
    fun `사용자 움직임 입력 예외 테스트1`(){
        val exception = assertThrows<IllegalArgumentException>(Constants.ERROR_NOT_ONLY_CHARACTER) {
            InputValidator.checkOnlyCharacter("1")
        }
        Assertions.assertEquals(Constants.ERROR_NOT_ONLY_CHARACTER, exception.message)
    }

    @Test
    fun `사용자 움직임 입력 예외 테스트2`(){
        val exception = assertThrows<IllegalArgumentException>(Constants.ERROR_OUT_OF_RANGE_MOVE) {
            InputValidator.checkUorD("A")
        }
        Assertions.assertEquals(Constants.ERROR_OUT_OF_RANGE_MOVE, exception.message)

    }

    @Test
    fun `사용자 움직임 입력 예외 테스트3`(){
        val exception = assertThrows<IllegalArgumentException>(Constants.ERROR_OUT_OF_RANGE_MOVE) {
            InputValidator.checkUorD("")
        }
        Assertions.assertEquals(Constants.ERROR_OUT_OF_RANGE_MOVE, exception.message)
    }

    @Test
    fun `게임 커멘트 입력 테스트1`(){
        val exception = assertThrows<IllegalArgumentException>(Constants.ERROR_NOT_ONLY_CHARACTER) {
            InputValidator.checkOnlyCharacter("1")
        }
        Assertions.assertEquals(Constants.ERROR_NOT_ONLY_CHARACTER, exception.message)
    }

    @Test
    fun `게임 커멘트 입력 테스트2`(){
        val exception = assertThrows<IllegalArgumentException>(Constants.ERROR_OUT_OF_RANGE_QUIT_OR_RESTART) {
            InputValidator.checkQorR("s")
        }
        Assertions.assertEquals(Constants.ERROR_OUT_OF_RANGE_QUIT_OR_RESTART, exception.message)
    }

    @Test
    fun `게임 커멘트 입력 테스트3`(){
        val exception = assertThrows<IllegalArgumentException>(Constants.ERROR_OUT_OF_RANGE_QUIT_OR_RESTART) {
            InputValidator.checkQorR("q")
        }
        Assertions.assertEquals(Constants.ERROR_OUT_OF_RANGE_QUIT_OR_RESTART, exception.message)
    }

    @Test
    fun `리트라이 진입테스트1`(){
        Assertions.assertEquals(BridgeGame().retry("R"), true)
    }

    @Test
    fun `리트라이 진입테스트2`(){
        Assertions.assertEquals(BridgeGame().retry("Q"), false)
    }
}