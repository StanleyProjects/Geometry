package sp.kx.geometry

import java.util.Objects

class MutableRotation(
    override var aX: Double,
    override var aY: Double,
    override var aZ: Double,
) : Rotation {
    override fun equals(other: Any?): Boolean {
        return when (other) {
            is Rotation -> aX == other.aX && aY == other.aY && aZ == other.aZ
            else -> false
        }
    }

    override fun hashCode(): Int {
        return Objects.hash(aX, aY, aZ)
    }
}

fun Rotation.mut(): MutableRotation {
    return MutableRotation(
        aX = aX,
        aY = aY,
        aZ = aZ,
    )
}
