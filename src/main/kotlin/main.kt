import kotlinx.coroutines.*
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow

fun flowExample(): Flow<Int> {
    return flow {
        for (i in 1..10) {
            emit(i)
            delay(1000L)
        }
    }
}

fun main() {
    println("Flow started")
    runBlocking {
        flowExample().collect {
            println("$it at ${System.currentTimeMillis()}")
        }
    }
    println("Flow ended")
}
