package com.cool.test

import com.blankj.utilcode.util.FileIOUtils
import com.blankj.utilcode.util.FileUtils
import org.junit.Test

import org.junit.Assert.*
import java.io.File
import kotlin.math.abs
import kotlin.math.max
import kotlin.math.min

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    fun addition_isCorrect() {
        assertEquals(4, 2 + 2)

        createDimens("D://dimens.xml")
    }

    private fun createDimens(filePath: String) {
        val file = File(filePath)
        FileUtils.createOrExistsFile(file)
        FileIOUtils.writeFileFromString(file, "<?xml version=\"1.0\" encoding=\"utf-8\"?>\n<resources>\n", false)
        initDP(file, -500 to 2000)
        FileIOUtils.writeFileFromString(file, "\n", true)
        initSP(file, 10 to 100)
        FileIOUtils.writeFileFromString(file, "</resources>", true)
    }

    private fun initDP(file: File, pair: Pair<Int, Int>, needFloat: Boolean = true) {
        var data = ""
        val start = min(pair.first, pair.second)
        val end = max(pair.first, pair.second)
        for (index in start..end) {
            var hint = if (index >= 0) index.toString() else "f_${abs(index)}"
            data += "<dimen name=\"dp_${hint}\">${index}dp</dimen>\n"

            if (needFloat) {
                hint = if (index >= 0) (index + 0.5F).toString() else "f_${abs(index + 0.5F)}"
                data += "<dimen name=\"dp_${hint}\">${index + 0.5F}dp</dimen>\n"
            }
        }
        FileIOUtils.writeFileFromString(file, data, true)
    }

    private fun initSP(file: File, pair: Pair<Int, Int>) {
        var data = ""
        val start = min(pair.first, pair.second)
        val end = max(pair.first, pair.second)
        for (index in start..end) {
            val hint = if (index >= 0) index.toString() else "f_${abs(index)}"
            data += "<dimen name=\"sp_${hint}\">${index}sp</dimen>\n"
        }
        FileIOUtils.writeFileFromString(file, data, true)
    }
}