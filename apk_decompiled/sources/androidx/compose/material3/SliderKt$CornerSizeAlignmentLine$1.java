package androidx.compose.material3;

import defpackage.my;
import defpackage.xy;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public /* synthetic */ class SliderKt$CornerSizeAlignmentLine$1 extends xy implements my {
    public static final SliderKt$CornerSizeAlignmentLine$1 INSTANCE = new SliderKt$CornerSizeAlignmentLine$1();

    public SliderKt$CornerSizeAlignmentLine$1() {
        super(2, y80.class, "min", "min(II)I", 1);
    }

    @Override // defpackage.my
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke(((Number) obj).intValue(), ((Number) obj2).intValue());
    }

    public final Integer invoke(int i, int i2) {
        return Integer.valueOf(Math.min(i, i2));
    }
}
