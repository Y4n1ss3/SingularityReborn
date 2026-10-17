package defpackage;

import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class wb implements Iterator, Map.Entry {
    public int d;
    public int e = -1;
    public boolean f;
    public final /* synthetic */ yb g;

    public wb(yb ybVar) {
        this.g = ybVar;
        this.d = ybVar.f - 1;
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!this.f) {
            o.f("This container does not support retaining Map.Entry objects");
            return false;
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            int i = this.e;
            yb ybVar = this.g;
            if (q10.b(key, ybVar.e(i)) && q10.b(entry.getValue(), ybVar.h(this.e))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        if (this.f) {
            return this.g.e(this.e);
        }
        o.f("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.f) {
            return this.g.h(this.e);
        }
        o.f("This container does not support retaining Map.Entry objects");
        return null;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.e < this.d;
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        if (!this.f) {
            o.f("This container does not support retaining Map.Entry objects");
            return 0;
        }
        int i = this.e;
        yb ybVar = this.g;
        Object e = ybVar.e(i);
        Object h = ybVar.h(this.e);
        return (e == null ? 0 : e.hashCode()) ^ (h != null ? h.hashCode() : 0);
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            o.q();
            return null;
        }
        this.e++;
        this.f = true;
        return this;
    }

    @Override // java.util.Iterator
    public final void remove() {
        if (!this.f) {
            throw new IllegalStateException();
        }
        this.g.f(this.e);
        this.e--;
        this.d--;
        this.f = false;
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (this.f) {
            return this.g.g(this.e, obj);
        }
        o.f("This container does not support retaining Map.Entry objects");
        return null;
    }

    public final String toString() {
        return getKey() + "=" + getValue();
    }
}
