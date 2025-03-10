package sp.kx.geometry

operator fun Size.times(scale: Double): Size {
    return MutableSize(
        width = width * scale,
        height = height * scale,
    )
}

operator fun Size.div(scale: Double): Size {
    return MutableSize(
        width = width / scale,
        height = height / scale,
    )
}

fun Size.center(dZ: Double): Offset {
    return MutableOffset(
        dX = width / 2,
        dY = height / 2,
        dZ = dZ,
    )
}
