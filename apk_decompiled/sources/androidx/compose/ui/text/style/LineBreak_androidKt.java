package androidx.compose.ui.text.style;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class LineBreak_androidKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final int packBytes(int i, int i2, int i3) {
        return i | (i2 << 8) | (i3 << 16);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int unpackByte1(int i) {
        return i & 255;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int unpackByte2(int i) {
        return (i >> 8) & 255;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int unpackByte3(int i) {
        return (i >> 16) & 255;
    }
}
