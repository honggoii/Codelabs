package com.example.affirmations

import android.content.Context
import com.example.affirmations.adapter.ItemAdapter
import com.example.affirmations.model.Affirmation
import org.junit.Assert.assertEquals
import org.junit.Test
import org.mockito.Mockito.mock

class AffirmationsAdapterTests {

    /**
     * unit test는 실제 기기가 아닌 JVM 위에서 동작하므로 Context가 없다.
     * 따라서 Context의 인스턴스인 "mocked"를 만들어준다.
     */
    private val context = mock(Context::class.java)

    @Test
    fun adpater_size() {

        val data = listOf(
            Affirmation(R.string.affirmation1),
            Affirmation(R.string.affirmation2)
        )

        val adapter = ItemAdapter(context, data)

        /**
         * first parameter: 테스트 실패시 노출되는 메세지
         * second parameter: expected value
         * third parameter: actual value
         */
        assertEquals("ItemAdapter is not the correct size", data.size, adapter.itemCount)
    }
}