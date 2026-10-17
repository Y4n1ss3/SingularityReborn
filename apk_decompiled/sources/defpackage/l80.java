package defpackage;

import java.util.Collection;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class l80 extends z {
    public final /* synthetic */ int d;
    public final k80 e;

    public /* synthetic */ l80(k80 k80Var, int i) {
        this.d = i;
        this.e = k80Var;
    }

    @Override // defpackage.z, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean add(Object obj) {
        switch (this.d) {
            case 0:
                ((Map.Entry) obj).getClass();
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean addAll(Collection collection) {
        int i = this.d;
        collection.getClass();
        switch (i) {
            case 0:
                throw new UnsupportedOperationException();
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final void clear() {
        int i = this.d;
        k80 k80Var = this.e;
        switch (i) {
            case 0:
                k80Var.clear();
                break;
            default:
                k80Var.clear();
                break;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean contains(Object obj) {
        int i = this.d;
        k80 k80Var = this.e;
        switch (i) {
            case 0:
                if (!(obj instanceof Map.Entry)) {
                    return false;
                }
                Map.Entry entry = (Map.Entry) obj;
                int f = k80Var.f(entry.getKey());
                if (f < 0) {
                    return false;
                }
                Object[] objArr = k80Var.e;
                objArr.getClass();
                return q10.b(objArr[f], entry.getValue());
            default:
                return k80Var.containsKey(obj);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public boolean containsAll(Collection collection) {
        switch (this.d) {
            case 0:
                collection.getClass();
                return this.e.d(collection);
            default:
                return super.containsAll(collection);
        }
    }

    @Override // defpackage.z
    public final int getSize() {
        int i = this.d;
        k80 k80Var = this.e;
        switch (i) {
        }
        return k80Var.l;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean isEmpty() {
        int i = this.d;
        k80 k80Var = this.e;
        switch (i) {
        }
        return k80Var.isEmpty();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set
    public final Iterator iterator() {
        int i = this.d;
        k80 k80Var = this.e;
        switch (i) {
            case 0:
                return new h80(k80Var, 0);
            default:
                return new h80(k80Var, 1);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean remove(Object obj) {
        int i = this.d;
        k80 k80Var = this.e;
        switch (i) {
            case 0:
                if (obj instanceof Map.Entry) {
                    Map.Entry entry = (Map.Entry) obj;
                    k80Var.b();
                    int f = k80Var.f(entry.getKey());
                    if (f >= 0) {
                        Object[] objArr = k80Var.e;
                        objArr.getClass();
                        if (q10.b(objArr[f], entry.getValue())) {
                            k80Var.j(f);
                            break;
                        }
                    }
                }
                break;
            default:
                k80Var.b();
                int f2 = k80Var.f(obj);
                if (f2 >= 0) {
                    k80Var.j(f2);
                    break;
                } else {
                    break;
                }
        }
        return true;
    }

    @Override // java.util.AbstractSet, java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean removeAll(Collection collection) {
        int i = this.d;
        k80 k80Var = this.e;
        collection.getClass();
        switch (i) {
            case 0:
                k80Var.b();
                break;
            default:
                k80Var.b();
                break;
        }
        return super.removeAll(collection);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final boolean retainAll(Collection collection) {
        int i = this.d;
        k80 k80Var = this.e;
        collection.getClass();
        switch (i) {
            case 0:
                k80Var.b();
                break;
            default:
                k80Var.b();
                break;
        }
        return super.retainAll(collection);
    }
}
