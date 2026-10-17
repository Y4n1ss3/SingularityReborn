package androidx.compose.foundation.gestures;

import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.indirect.IndirectPointerInputChange;
import defpackage.dq;
import defpackage.yi;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class IndirectPointerInputEventSmoother {
    private static final int SmoothingFactor = 3;
    private List<IndirectPointerInputChange> eventRotatingArray = new ArrayList();
    private int eventRotatingIndex;
    public static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: smoothEventPosition-tuRUvjQ, reason: not valid java name */
    public final long m481smoothEventPositiontuRUvjQ(IndirectPointerInputChange indirectPointerInputChange) {
        boolean changedToDownIgnoreConsumed;
        boolean changedToUpIgnoreConsumed;
        boolean changedToDownIgnoreConsumed2;
        float intBitsToFloat = Float.intBitsToFloat((int) (indirectPointerInputChange.m5605getPositionF1C5BW0() >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (indirectPointerInputChange.m5605getPositionF1C5BW0() & 4294967295L));
        changedToDownIgnoreConsumed = IndirectPointerInputDragCycleDetectorKt.changedToDownIgnoreConsumed(indirectPointerInputChange);
        if (changedToDownIgnoreConsumed) {
            this.eventRotatingIndex = 0;
            this.eventRotatingArray.clear();
        }
        changedToUpIgnoreConsumed = IndirectPointerInputDragCycleDetectorKt.changedToUpIgnoreConsumed(indirectPointerInputChange);
        if (!changedToUpIgnoreConsumed) {
            changedToDownIgnoreConsumed2 = IndirectPointerInputDragCycleDetectorKt.changedToDownIgnoreConsumed(indirectPointerInputChange);
            if (!changedToDownIgnoreConsumed2) {
                int size = this.eventRotatingArray.size();
                List<IndirectPointerInputChange> list = this.eventRotatingArray;
                if (size == 3) {
                    int i = this.eventRotatingIndex;
                    this.eventRotatingIndex = i + 1;
                    list.set(i, indirectPointerInputChange);
                } else {
                    list.add(indirectPointerInputChange);
                }
                if (this.eventRotatingIndex == 3) {
                    this.eventRotatingIndex = 0;
                }
                List<IndirectPointerInputChange> list2 = this.eventRotatingArray;
                ArrayList arrayList = new ArrayList(list2.size());
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    arrayList.add(Float.valueOf(Float.intBitsToFloat((int) (list2.get(i2).m5605getPositionF1C5BW0() >> 32))));
                }
                intBitsToFloat = (float) yi.l0(arrayList);
                List<IndirectPointerInputChange> list3 = this.eventRotatingArray;
                ArrayList arrayList2 = new ArrayList(list3.size());
                int size3 = list3.size();
                for (int i3 = 0; i3 < size3; i3++) {
                    arrayList2.add(Float.valueOf(Float.intBitsToFloat((int) (list3.get(i3).m5605getPositionF1C5BW0() & 4294967295L))));
                }
                intBitsToFloat2 = (float) yi.l0(arrayList2);
            }
        }
        return Offset.m4508constructorimpl((Float.floatToRawIntBits(intBitsToFloat) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L));
    }

    /* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
    public static final class Companion {
        public /* synthetic */ Companion(dq dqVar) {
            this();
        }

        private Companion() {
        }
    }
}
