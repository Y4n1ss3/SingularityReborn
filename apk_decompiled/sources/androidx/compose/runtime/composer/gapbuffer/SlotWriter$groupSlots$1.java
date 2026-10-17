package androidx.compose.runtime.composer.gapbuffer;

import defpackage.n20;
import java.util.Iterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SlotWriter$groupSlots$1 implements Iterator<Object>, n20 {
    final /* synthetic */ int $end;
    private int current;
    final /* synthetic */ SlotWriter this$0;

    public SlotWriter$groupSlots$1(int i, int i2, SlotWriter slotWriter) {
        this.$end = i2;
        this.this$0 = slotWriter;
        this.current = i;
    }

    public final int getCurrent() {
        return this.current;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.current < this.$end;
    }

    @Override // java.util.Iterator
    public Object next() {
        if (!hasNext()) {
            return null;
        }
        Object[] objArr = this.this$0.slots;
        SlotWriter slotWriter = this.this$0;
        int i = this.current;
        this.current = i + 1;
        return objArr[slotWriter.dataIndexToDataAddress(i)];
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void setCurrent(int i) {
        this.current = i;
    }
}
