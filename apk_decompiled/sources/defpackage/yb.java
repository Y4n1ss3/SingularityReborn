package defpackage;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class yb extends bq0 implements Map {
    public tb g;
    public vb h;
    public xb i;

    @Override // java.util.Map
    public final Set entrySet() {
        tb tbVar = this.g;
        if (tbVar != null) {
            return tbVar;
        }
        tb tbVar2 = new tb(this);
        this.g = tbVar2;
        return tbVar2;
    }

    public final boolean i(Collection collection) {
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            if (!super.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public final boolean j(Collection collection) {
        int i = this.f;
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            super.remove(it.next());
        }
        return i != this.f;
    }

    @Override // java.util.Map
    public final Set keySet() {
        vb vbVar = this.h;
        if (vbVar != null) {
            return vbVar;
        }
        vb vbVar2 = new vb(this);
        this.h = vbVar2;
        return vbVar2;
    }

    @Override // java.util.Map
    public final void putAll(Map map) {
        int size = map.size() + this.f;
        int i = this.f;
        int[] iArr = this.d;
        if (iArr.length < size) {
            this.d = Arrays.copyOf(iArr, size);
            this.e = Arrays.copyOf(this.e, size * 2);
        }
        if (this.f != i) {
            o.a();
            return;
        }
        for (Map.Entry entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // java.util.Map
    public final Collection values() {
        xb xbVar = this.i;
        if (xbVar != null) {
            return xbVar;
        }
        xb xbVar2 = new xb(this);
        this.i = xbVar2;
        return xbVar2;
    }
}
