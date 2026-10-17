package androidx.compose.foundation.text;

import defpackage.iy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextRangeLayoutMeasureResult {
    public static final int $stable = 0;
    private final int height;
    private final iy place;
    private final int width;

    public TextRangeLayoutMeasureResult(int i, int i2, iy iyVar) {
        this.width = i;
        this.height = i2;
        this.place = iyVar;
    }

    public final int getHeight() {
        return this.height;
    }

    public final iy getPlace() {
        return this.place;
    }

    public final int getWidth() {
        return this.width;
    }
}
