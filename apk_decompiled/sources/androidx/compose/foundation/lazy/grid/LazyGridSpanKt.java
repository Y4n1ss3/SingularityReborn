package androidx.compose.foundation.lazy.grid;

import androidx.compose.foundation.internal.InlineClassHelperKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyGridSpanKt {
    public static final long GridItemSpan(int i) {
        if (!(i > 0)) {
            InlineClassHelperKt.throwIllegalArgumentException("The span value should be higher than 0");
        }
        return GridItemSpan.m879constructorimpl(i);
    }
}
