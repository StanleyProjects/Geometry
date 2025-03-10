package sp.kx.geometry

import kotlin.time.Duration
import kotlin.time.Duration.Companion.seconds

@Deprecated("physics")
fun Interval<Duration>.diff(): Duration {
    return b - a
}

@Deprecated("physics")
fun Interval<Duration>.frequency(value: Duration = 1.seconds): Double {
    return value / (b - a)
}
