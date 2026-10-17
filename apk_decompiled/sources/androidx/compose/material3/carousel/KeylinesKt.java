package androidx.compose.material3.carousel;

import androidx.compose.ui.graphics.Fields;
import androidx.compose.ui.unit.Density;
import defpackage.ac;
import defpackage.e30;
import defpackage.w01;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class KeylinesKt {
    private static final float calculateMediumChildSize(float f, float f2, float f3) {
        float max = Math.max(1.5f * f3, f);
        float f4 = 0.85f * f2;
        return max > f4 ? Math.min(Math.max(f4, f3 * 1.2f), f2) : max;
    }

    public static final KeylineList createCenterAlignedKeylineList(float f, float f2, float f3, float f4, Arrangement arrangement) {
        return KeylineListKt.m2875keylineListOfWNYm7Xg(f, f2, CarouselAlignment.Companion.m2859getCenterNUL3oTo(), new e30(f3, arrangement, f4, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 createCenterAlignedKeylineList$lambda$16(float f, Arrangement arrangement, float f2, KeylineListScope keylineListScope) {
        keylineListScope.add(f, true);
        int smallCount = arrangement.getSmallCount() / 2;
        for (int i = 0; i < smallCount; i++) {
            KeylineListScope.add$default(keylineListScope, arrangement.getSmallSize(), false, 2, null);
        }
        int mediumCount = arrangement.getMediumCount() / 2;
        for (int i2 = 0; i2 < mediumCount; i2++) {
            KeylineListScope.add$default(keylineListScope, arrangement.getMediumSize(), false, 2, null);
        }
        int largeCount = arrangement.getLargeCount();
        for (int i3 = 0; i3 < largeCount; i3++) {
            KeylineListScope.add$default(keylineListScope, arrangement.getLargeSize(), false, 2, null);
        }
        int mediumCount2 = arrangement.getMediumCount() / 2;
        for (int i4 = 0; i4 < mediumCount2; i4++) {
            KeylineListScope.add$default(keylineListScope, arrangement.getMediumSize(), false, 2, null);
        }
        int smallCount2 = arrangement.getSmallCount() / 2;
        for (int i5 = 0; i5 < smallCount2; i5++) {
            KeylineListScope.add$default(keylineListScope, arrangement.getSmallSize(), false, 2, null);
        }
        keylineListScope.add(f2, true);
        return w01.a;
    }

    public static final KeylineList createLeftAlignedKeylineList(float f, float f2, float f3, float f4, Arrangement arrangement) {
        return KeylineListKt.m2875keylineListOfWNYm7Xg(f, f2, CarouselAlignment.Companion.m2861getStartNUL3oTo(), new e30(f3, arrangement, f4, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 createLeftAlignedKeylineList$lambda$10(float f, Arrangement arrangement, float f2, KeylineListScope keylineListScope) {
        keylineListScope.add(f, true);
        int largeCount = arrangement.getLargeCount();
        for (int i = 0; i < largeCount; i++) {
            KeylineListScope.add$default(keylineListScope, arrangement.getLargeSize(), false, 2, null);
        }
        int mediumCount = arrangement.getMediumCount();
        for (int i2 = 0; i2 < mediumCount; i2++) {
            KeylineListScope.add$default(keylineListScope, arrangement.getMediumSize(), false, 2, null);
        }
        int smallCount = arrangement.getSmallCount();
        for (int i3 = 0; i3 < smallCount; i3++) {
            KeylineListScope.add$default(keylineListScope, arrangement.getSmallSize(), false, 2, null);
        }
        keylineListScope.add(f2, true);
        return w01.a;
    }

    public static final KeylineList heroKeylineList(Density density, float f, Float f2, float f3, int i, boolean z, float f4, float f5) {
        if (f == 0.0f) {
            return KeylineListKt.emptyKeylineList();
        }
        boolean z2 = z && i >= 3;
        int[] iArr = new int[1];
        if (z2) {
            iArr[0] = 2;
        } else {
            iArr[0] = 1;
        }
        float min = Math.min(f2 != null ? f2.floatValue() : f, f);
        float g = y80.g(min / 3.0f, f4, f5);
        if (f < (1.25f * f4) + (ac.j0(iArr) * f4)) {
            iArr = new int[]{0};
        }
        int ceil = (int) Math.ceil(f / min);
        int max = (ceil - Math.max(1, (int) Math.floor((f - (ac.j0(iArr) * f4)) / min))) + 1;
        int[] iArr2 = new int[max];
        for (int i2 = 0; i2 < max; i2++) {
            iArr2[i2] = ceil - i2;
        }
        float mo367toPx0680j_4 = density.mo367toPx0680j_4(CarouselDefaults.INSTANCE.m2862getAnchorSizeD9Ej5fM$material3());
        Arrangement findLowestCostArrangement = Arrangement.Companion.findLowestCostArrangement(f, f3, g, f4, f5, iArr, 0.0f, new int[]{0}, min, iArr2);
        return findLowestCostArrangement == null ? KeylineListKt.emptyKeylineList() : (!z2 || i < findLowestCostArrangement.itemCount()) ? createLeftAlignedKeylineList(f, f3, mo367toPx0680j_4, mo367toPx0680j_4, findLowestCostArrangement) : createCenterAlignedKeylineList(f, f3, mo367toPx0680j_4, mo367toPx0680j_4, findLowestCostArrangement);
    }

    public static /* synthetic */ KeylineList heroKeylineList$default(Density density, float f, Float f2, float f3, int i, boolean z, float f4, float f5, int i2, Object obj) {
        if ((i2 & 32) != 0) {
            z = false;
        }
        boolean z2 = z;
        if ((i2 & 64) != 0) {
            f4 = density.mo367toPx0680j_4(CarouselDefaults.INSTANCE.m2864getMinSmallItemSizeD9Ej5fM());
        }
        float f6 = f4;
        if ((i2 & Fields.SpotShadowColor) != 0) {
            f5 = density.mo367toPx0680j_4(CarouselDefaults.INSTANCE.m2863getMaxSmallItemSizeD9Ej5fM());
        }
        return heroKeylineList(density, f, f2, f3, i, z2, f6, f5);
    }

    public static final KeylineList multiBrowseKeylineList(Density density, float f, float f2, float f3, int i, float f4, float f5) {
        float f6;
        if (f == 0.0f || f2 == 0.0f) {
            return KeylineListKt.emptyKeylineList();
        }
        int[] iArr = {1};
        int[] iArr2 = {1, 0};
        float min = Math.min(f2, f);
        float g = y80.g(min / 3.0f, f4, f5);
        float f7 = (min + g) / 2.0f;
        if (f < 2.0f * f4) {
            iArr = new int[]{0};
        }
        int ceil = (int) Math.ceil(f / min);
        int max = (ceil - Math.max(1, (int) Math.floor(((f - (ac.j0(iArr2) * f7)) - (ac.j0(iArr) * f5)) / min))) + 1;
        int[] iArr3 = new int[max];
        for (int i2 = 0; i2 < max; i2++) {
            iArr3[i2] = ceil - i2;
        }
        float mo367toPx0680j_4 = density.mo367toPx0680j_4(CarouselDefaults.INSTANCE.m2862getAnchorSizeD9Ej5fM$material3());
        Arrangement findLowestCostArrangement = Arrangement.Companion.findLowestCostArrangement(f, f3, g, f4, f5, iArr, f7, iArr2, min, iArr3);
        if (findLowestCostArrangement == null || findLowestCostArrangement.itemCount() <= i) {
            f6 = f;
        } else {
            int smallCount = findLowestCostArrangement.getSmallCount();
            int mediumCount = findLowestCostArrangement.getMediumCount();
            for (int itemCount = findLowestCostArrangement.itemCount() - i; itemCount > 0; itemCount--) {
                if (smallCount > 0) {
                    smallCount--;
                } else if (mediumCount > 1) {
                    mediumCount--;
                }
            }
            f6 = f;
            findLowestCostArrangement = Arrangement.Companion.findLowestCostArrangement(f6, f3, g, f4, f5, new int[]{smallCount}, f7, new int[]{mediumCount}, min, iArr3);
        }
        return findLowestCostArrangement == null ? KeylineListKt.emptyKeylineList() : createLeftAlignedKeylineList(f6, f3, mo367toPx0680j_4, mo367toPx0680j_4, findLowestCostArrangement);
    }

    public static /* synthetic */ KeylineList multiBrowseKeylineList$default(Density density, float f, float f2, float f3, int i, float f4, float f5, int i2, Object obj) {
        if ((i2 & 32) != 0) {
            f4 = density.mo367toPx0680j_4(CarouselDefaults.INSTANCE.m2864getMinSmallItemSizeD9Ej5fM());
        }
        float f6 = f4;
        if ((i2 & 64) != 0) {
            f5 = density.mo367toPx0680j_4(CarouselDefaults.INSTANCE.m2863getMaxSmallItemSizeD9Ej5fM());
        }
        return multiBrowseKeylineList(density, f, f2, f3, i, f6, f5);
    }

    public static final KeylineList uncontainedKeylineList(Density density, float f, float f2, float f3) {
        if (f == 0.0f || f2 == 0.0f) {
            return KeylineListKt.emptyKeylineList();
        }
        float min = Math.min(f2 + f3, f);
        int max = Math.max(1, (int) Math.floor(f / min));
        float f4 = f - (max * min);
        int i = f4 <= 0.0f ? 0 : 1;
        float mo367toPx0680j_4 = density.mo367toPx0680j_4(CarouselDefaults.INSTANCE.m2862getAnchorSizeD9Ej5fM$material3());
        float calculateMediumChildSize = calculateMediumChildSize(mo367toPx0680j_4, min, f4);
        return createLeftAlignedKeylineList(f, f3, Math.max(Math.min(mo367toPx0680j_4, f2), calculateMediumChildSize * 0.5f), mo367toPx0680j_4, new Arrangement(0, 0.0f, 0, calculateMediumChildSize, i, min, max));
    }
}
