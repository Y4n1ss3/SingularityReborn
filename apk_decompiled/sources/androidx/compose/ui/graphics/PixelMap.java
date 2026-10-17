package androidx.compose.ui.graphics;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PixelMap {
    public static final int $stable = 8;
    private final int[] buffer;
    private final int bufferOffset;
    private final int height;
    private final int stride;
    private final int width;

    public PixelMap(int[] iArr, int i, int i2, int i3, int i4) {
        this.buffer = iArr;
        this.width = i;
        this.height = i2;
        this.bufferOffset = i3;
        this.stride = i4;
    }

    /* renamed from: get-WaAFU9c, reason: not valid java name */
    public final long m5072getWaAFU9c(int i, int i2) {
        return ColorKt.Color(this.buffer[(i2 * this.stride) + this.bufferOffset + i]);
    }

    public final int[] getBuffer() {
        return this.buffer;
    }

    public final int getBufferOffset() {
        return this.bufferOffset;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getStride() {
        return this.stride;
    }

    public final int getWidth() {
        return this.width;
    }
}
