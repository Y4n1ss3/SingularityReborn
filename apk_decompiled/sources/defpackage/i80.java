package defpackage;

import java.util.ConcurrentModificationException;
import java.util.Map;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class i80 implements Map.Entry, p20 {
    public final k80 d;
    public final int e;
    public final int f;

    public i80(k80 k80Var, int i) {
        this.d = k80Var;
        this.e = i;
        this.f = k80Var.k;
    }

    public final void a() {
        if (this.d.k != this.f) {
            throw new ConcurrentModificationException("The backing map has been modified after this entry was obtained.");
        }
    }

    @Override // java.util.Map.Entry
    public final boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        return q10.b(entry.getKey(), getKey()) && q10.b(entry.getValue(), getValue());
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        a();
        return this.d.d[this.e];
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        a();
        Object[] objArr = this.d.e;
        objArr.getClass();
        return objArr[this.e];
    }

    @Override // java.util.Map.Entry
    public final int hashCode() {
        Object key = getKey();
        int hashCode = key != null ? key.hashCode() : 0;
        Object value = getValue();
        return hashCode ^ (value != null ? value.hashCode() : 0);
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        a();
        k80 k80Var = this.d;
        k80Var.b();
        Object[] objArr = k80Var.e;
        if (objArr == null) {
            int length = k80Var.d.length;
            if (length < 0) {
                o.m("capacity must be non-negative.");
                return null;
            }
            objArr = new Object[length];
            k80Var.e = objArr;
        }
        int i = this.e;
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getKey());
        sb.append('=');
        sb.append(getValue());
        return sb.toString();
    }
}
