package defpackage;

import java.util.ListIterator;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class r extends q implements ListIterator {
    public final /* synthetic */ t g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(t tVar, int i) {
        super(tVar, 0);
        this.g = tVar;
        p pVar = t.Companion;
        int size = tVar.size();
        pVar.getClass();
        p.b(i, size);
        this.e = i;
    }

    @Override // java.util.ListIterator
    public final void add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.e > 0;
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.e;
    }

    @Override // java.util.ListIterator
    public final Object previous() {
        if (!hasPrevious()) {
            o.q();
            return null;
        }
        int i = this.e - 1;
        this.e = i;
        return this.g.get(i);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.e - 1;
    }

    @Override // java.util.ListIterator
    public final void set(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
