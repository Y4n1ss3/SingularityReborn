package androidx.compose.runtime.composer.gapbuffer;

import defpackage.n20;
import defpackage.p10;
import java.util.Iterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SlotTable$getSlots$1 implements Iterable<Object>, n20 {
    final /* synthetic */ SlotTable this$0;

    public SlotTable$getSlots$1(SlotTable slotTable) {
        this.this$0 = slotTable;
    }

    @Override // java.lang.Iterable
    public Iterator<Object> iterator() {
        return p10.y(new SlotTable$getSlots$1$iterator$1(this.this$0, null));
    }
}
