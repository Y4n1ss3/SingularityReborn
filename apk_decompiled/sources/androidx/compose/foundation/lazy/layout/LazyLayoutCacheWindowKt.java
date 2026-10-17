package androidx.compose.foundation.lazy.layout;

import androidx.compose.ui.unit.Dp;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyLayoutCacheWindowKt {
    public static final LazyLayoutCacheWindow LazyLayoutCacheWindow(float f, float f2) {
        return new FractionLazyLayoutCacheWindow(f, f2);
    }

    public static /* synthetic */ LazyLayoutCacheWindow LazyLayoutCacheWindow$default(float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = 0.0f;
        }
        if ((i & 2) != 0) {
            f2 = 0.0f;
        }
        return LazyLayoutCacheWindow(f, f2);
    }

    /* renamed from: LazyLayoutCacheWindow-YgX7TsA, reason: not valid java name */
    public static final LazyLayoutCacheWindow m910LazyLayoutCacheWindowYgX7TsA(float f, float f2) {
        return new DpLazyLayoutCacheWindow(f, f2, null);
    }

    /* renamed from: LazyLayoutCacheWindow-YgX7TsA$default, reason: not valid java name */
    public static /* synthetic */ LazyLayoutCacheWindow m911LazyLayoutCacheWindowYgX7TsA$default(float f, float f2, int i, Object obj) {
        if ((i & 1) != 0) {
            f = Dp.m7611constructorimpl(0.0f);
        }
        if ((i & 2) != 0) {
            f2 = Dp.m7611constructorimpl(0.0f);
        }
        return m910LazyLayoutCacheWindowYgX7TsA(f, f2);
    }
}
