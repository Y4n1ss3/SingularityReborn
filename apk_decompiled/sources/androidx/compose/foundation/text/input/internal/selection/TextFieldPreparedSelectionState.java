package androidx.compose.foundation.text.input.internal.selection;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextFieldPreparedSelectionState {
    public static final int $stable = 8;
    private float cachedX = Float.NaN;

    public final float getCachedX() {
        return this.cachedX;
    }

    public final void resetCachedX() {
        this.cachedX = Float.NaN;
    }

    public final void setCachedX(float f) {
        this.cachedX = f;
    }
}
