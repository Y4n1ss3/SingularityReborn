package androidx.compose.ui.text.android;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
final class HorizontalPositionCache {
    private int cachedKey = -1;
    private float cachedValue;
    private final TextLayout layout;

    public HorizontalPositionCache(TextLayout textLayout) {
        this.layout = textLayout;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final float get(int i, boolean z, boolean z2, boolean z3) {
        boolean z4;
        int i2;
        int i3 = 1;
        if (z) {
            int lineForOffset = LayoutCompat_androidKt.getLineForOffset(this.layout.getLayout(), i, z);
            int lineStart = this.layout.getLineStart(lineForOffset);
            int lineEnd = this.layout.getLineEnd(lineForOffset);
            if (i == lineStart || i == lineEnd) {
                z4 = true;
                int i4 = i * 4;
                if (z3) {
                    i3 = z4 ? 2 : 3;
                } else if (z4) {
                    i3 = 0;
                }
                i2 = i4 + i3;
                if (this.cachedKey != i2) {
                    return this.cachedValue;
                }
                TextLayout textLayout = this.layout;
                float primaryHorizontal = z3 ? textLayout.getPrimaryHorizontal(i, z) : textLayout.getSecondaryHorizontal(i, z);
                if (z2) {
                    this.cachedKey = i2;
                    this.cachedValue = primaryHorizontal;
                }
                return primaryHorizontal;
            }
        }
        z4 = false;
        int i42 = i * 4;
        if (z3) {
        }
        i2 = i42 + i3;
        if (this.cachedKey != i2) {
        }
    }

    public final TextLayout getLayout() {
        return this.layout;
    }

    public final float getPrimaryDownstream(int i) {
        return get(i, false, false, true);
    }

    public final float getPrimaryUpstream(int i) {
        return get(i, true, true, true);
    }

    public final float getSecondaryDownstream(int i) {
        return get(i, false, false, false);
    }

    public final float getSecondaryUpstream(int i) {
        return get(i, true, true, false);
    }
}
