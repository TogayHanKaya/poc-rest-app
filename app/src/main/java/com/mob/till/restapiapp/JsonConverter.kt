package com.mob.till.restapiapp

import com.fasterxml.jackson.core.JsonProcessingException
import com.fasterxml.jackson.databind.ObjectMapper
import ru.skornei.restserver.server.converter.BaseConverter
import java.io.IOException


class JsonConverter : BaseConverter {
    private val mapper: ObjectMapper = ObjectMapper()
    override fun writeValueAsBytes(value: Any): ByteArray {
        return try {
            mapper.writeValueAsBytes(value)
        } catch (e: JsonProcessingException) {
            throw RuntimeException(e)
        }
    }

    override fun <T> writeValue(src: ByteArray, valueType: Class<T>): T {
        return try {
            mapper.readValue(src, valueType)
        } catch (e: IOException) {
            throw RuntimeException(e)
        }
    }
}