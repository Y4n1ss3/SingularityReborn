package androidx.compose.foundation.lazy;

import androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent;
import defpackage.ky;
import defpackage.oy;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LazyListInterval implements LazyLayoutIntervalContent.Interval {
    public static final int $stable = 0;
    private final oy item;
    private final ky key;
    private final ky type;

    public LazyListInterval(ky kyVar, ky kyVar2, oy oyVar) {
        this.key = kyVar;
        this.type = kyVar2;
        this.item = oyVar;
    }

    public final oy getItem() {
        return this.item;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval
    public ky getKey() {
        return this.key;
    }

    @Override // androidx.compose.foundation.lazy.layout.LazyLayoutIntervalContent.Interval
    public ky getType() {
        return this.type;
    }
}
