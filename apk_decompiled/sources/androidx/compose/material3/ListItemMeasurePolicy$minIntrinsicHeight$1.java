package androidx.compose.material3;

import androidx.compose.ui.layout.IntrinsicMeasurable;
import defpackage.my;
import defpackage.xy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public /* synthetic */ class ListItemMeasurePolicy$minIntrinsicHeight$1 extends xy implements my {
    public static final ListItemMeasurePolicy$minIntrinsicHeight$1 INSTANCE = new ListItemMeasurePolicy$minIntrinsicHeight$1();

    public ListItemMeasurePolicy$minIntrinsicHeight$1() {
        super(2, IntrinsicMeasurable.class, "minIntrinsicHeight", "minIntrinsicHeight(I)I", 0);
    }

    @Override // defpackage.my
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return invoke((IntrinsicMeasurable) obj, ((Number) obj2).intValue());
    }

    public final Integer invoke(IntrinsicMeasurable intrinsicMeasurable, int i) {
        return Integer.valueOf(intrinsicMeasurable.minIntrinsicHeight(i));
    }
}
