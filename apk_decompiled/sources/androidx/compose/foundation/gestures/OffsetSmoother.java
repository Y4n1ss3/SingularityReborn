package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import defpackage.yi;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class OffsetSmoother {
    public static final int $stable = 8;
    private List<Offset> eventRotatingArray = new ArrayList();
    private int eventRotatingIndex;

    public final void reset() {
        this.eventRotatingIndex = 0;
        this.eventRotatingArray.clear();
    }

    /* renamed from: smoothEventPosition-MK-Hz9U, reason: not valid java name */
    public final long m493smoothEventPositionMKHz9U(long j) {
        int size = this.eventRotatingArray.size();
        List<Offset> list = this.eventRotatingArray;
        if (size == 3) {
            int i = this.eventRotatingIndex;
            this.eventRotatingIndex = i + 1;
            list.set(i, Offset.m4505boximpl(j));
        } else {
            list.add(Offset.m4505boximpl(j));
        }
        if (this.eventRotatingIndex == 3) {
            this.eventRotatingIndex = 0;
        }
        List<Offset> list2 = this.eventRotatingArray;
        ArrayList arrayList = new ArrayList(list2.size());
        int size2 = list2.size();
        for (int i2 = 0; i2 < size2; i2++) {
            arrayList.add(Float.valueOf(Float.intBitsToFloat((int) (list2.get(i2).m4526unboximpl() >> 32))));
        }
        float l0 = (float) yi.l0(arrayList);
        List<Offset> list3 = this.eventRotatingArray;
        ArrayList arrayList2 = new ArrayList(list3.size());
        int size3 = list3.size();
        for (int i3 = 0; i3 < size3; i3++) {
            arrayList2.add(Float.valueOf(Float.intBitsToFloat((int) (4294967295L & list3.get(i3).m4526unboximpl()))));
        }
        float l02 = (float) yi.l0(arrayList2);
        return Offset.m4508constructorimpl((Float.floatToRawIntBits(l0) << 32) | (Float.floatToRawIntBits(l02) & 4294967295L));
    }
}
