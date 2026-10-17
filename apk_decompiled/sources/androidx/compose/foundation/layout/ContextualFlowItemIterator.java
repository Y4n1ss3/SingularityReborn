package androidx.compose.foundation.layout;

import androidx.compose.ui.layout.Measurable;
import defpackage.my;
import defpackage.n20;
import defpackage.yi;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ContextualFlowItemIterator implements Iterator<Measurable>, n20 {
    public static final int $stable = 8;
    private final List<Measurable> _list = new ArrayList();
    private final my getMeasurables;
    private final int itemCount;
    private int itemIndex;
    private int listIndex;

    public ContextualFlowItemIterator(int i, my myVar) {
        this.itemCount = i;
        this.getMeasurables = myVar;
    }

    public static /* synthetic */ Measurable getNext$foundation_layout$default(ContextualFlowItemIterator contextualFlowItemIterator, FlowLineInfo flowLineInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            flowLineInfo = new FlowLineInfo(0, 0, 0.0f, 0.0f, 15, null);
        }
        return contextualFlowItemIterator.getNext$foundation_layout(flowLineInfo);
    }

    public final List<Measurable> getList() {
        return this._list;
    }

    public final Measurable getNext$foundation_layout(FlowLineInfo flowLineInfo) {
        if (this.listIndex < getList().size()) {
            Measurable measurable = getList().get(this.listIndex);
            this.listIndex++;
            return measurable;
        }
        int i = this.itemIndex;
        if (i >= this.itemCount) {
            throw new IndexOutOfBoundsException("No item returned at index call. Index: " + this.itemIndex);
        }
        List list = (List) this.getMeasurables.invoke(Integer.valueOf(i), flowLineInfo);
        this.itemIndex++;
        if (list.isEmpty()) {
            return next();
        }
        Measurable measurable2 = (Measurable) yi.p0(list);
        this._list.addAll(list);
        this.listIndex++;
        return measurable2;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.listIndex < getList().size() || this.itemIndex < this.itemCount;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public Measurable next() {
        return getNext$foundation_layout$default(this, null, 1, null);
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
