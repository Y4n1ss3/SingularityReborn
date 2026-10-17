package androidx.compose.ui.graphics.vector;

import defpackage.n20;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VectorGroup$iterator$1 implements Iterator<VectorNode>, n20 {
    private final Iterator<VectorNode> it;

    public VectorGroup$iterator$1(VectorGroup vectorGroup) {
        List list;
        list = vectorGroup.children;
        this.it = list.iterator();
    }

    public final Iterator<VectorNode> getIt() {
        return this.it;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        return this.it.hasNext();
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // java.util.Iterator
    public VectorNode next() {
        return this.it.next();
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
