package androidx.compose.ui.text.android;

import android.text.Spanned;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class SpannedExtensions_androidKt {
    public static final boolean hasSpan(Spanned spanned, Class<?> cls) {
        return spanned.nextSpanTransition(-1, spanned.length(), cls) != spanned.length();
    }

    public static final boolean hasSpan(Spanned spanned, Class<?> cls, int i, int i2) {
        return spanned.nextSpanTransition(i - 1, i2, cls) != i2;
    }
}
