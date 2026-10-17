package defpackage;

import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.function.BiFunction;
import java.util.function.Function;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class o80 implements Map, n20 {
    public final pl0 d;
    public au e;
    public au f;
    public f11 g;

    public o80(pl0 pl0Var) {
        pl0Var.getClass();
        this.d = pl0Var;
    }

    @Override // java.util.Map
    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object compute(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfAbsent(Object obj, Function function) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object computeIfPresent(Object obj, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean containsKey(Object obj) {
        return this.d.b(obj);
    }

    @Override // java.util.Map
    public final boolean containsValue(Object obj) {
        return this.d.c(obj);
    }

    @Override // java.util.Map
    public final Set entrySet() {
        au auVar = this.e;
        if (auVar != null) {
            return auVar;
        }
        au auVar2 = new au(this.d, 0);
        this.e = auVar2;
        return auVar2;
    }

    @Override // java.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o80.class != obj.getClass()) {
            return false;
        }
        return q10.b(this.d, ((o80) obj).d);
    }

    @Override // java.util.Map
    public final Object get(Object obj) {
        return this.d.d(obj);
    }

    @Override // java.util.Map
    public final int hashCode() {
        return this.d.hashCode();
    }

    @Override // java.util.Map
    public final boolean isEmpty() {
        return this.d.e();
    }

    @Override // java.util.Map
    public final Set keySet() {
        au auVar = this.f;
        if (auVar != null) {
            return auVar;
        }
        au auVar2 = new au(this.d, 1);
        this.f = auVar2;
        return auVar2;
    }

    @Override // java.util.Map
    public final Object merge(Object obj, Object obj2, BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object put(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object putIfAbsent(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final Object replace(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final void replaceAll(BiFunction biFunction) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final int size() {
        return this.d.e;
    }

    public final String toString() {
        return this.d.toString();
    }

    @Override // java.util.Map
    public final Collection values() {
        f11 f11Var = this.g;
        if (f11Var != null) {
            return f11Var;
        }
        f11 f11Var2 = new f11(this.d);
        this.g = f11Var2;
        return f11Var2;
    }

    @Override // java.util.Map
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Map
    public final boolean replace(Object obj, Object obj2, Object obj3) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
