package defpackage;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class kv implements Iterable {
    public jk0 d;
    public jk0 e;
    public final WeakHashMap f = new WeakHashMap();
    public int g = 0;
    public final HashMap h = new HashMap();

    /* JADX WARN: Code restructure failed: missing block: B:31:0x0048, code lost:
    
        if (r1.hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0050, code lost:
    
        if (((defpackage.ik0) r6).hasNext() != false) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0052, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0053, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof kv)) {
            return false;
        }
        kv kvVar = (kv) obj;
        if (this.g != kvVar.g) {
            return false;
        }
        Iterator it = iterator();
        Iterator it2 = kvVar.iterator();
        while (true) {
            ik0 ik0Var = (ik0) it;
            if (!ik0Var.hasNext()) {
                break;
            }
            ik0 ik0Var2 = (ik0) it2;
            if (!ik0Var2.hasNext()) {
                break;
            }
            Map.Entry entry = (Map.Entry) ik0Var.next();
            Object next = ik0Var2.next();
            if ((entry != null || next == null) && (entry == null || entry.equals(next))) {
            }
        }
        return false;
    }

    public final int hashCode() {
        Iterator it = iterator();
        int i = 0;
        while (true) {
            ik0 ik0Var = (ik0) it;
            if (!ik0Var.hasNext()) {
                return i;
            }
            i += ((Map.Entry) ik0Var.next()).hashCode();
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        ik0 ik0Var = new ik0(this.d, this.e, 0);
        this.f.put(ik0Var, Boolean.FALSE);
        return ik0Var;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        Iterator it = iterator();
        while (true) {
            ik0 ik0Var = (ik0) it;
            if (!ik0Var.hasNext()) {
                sb.append("]");
                return sb.toString();
            }
            sb.append(((Map.Entry) ik0Var.next()).toString());
            if (ik0Var.hasNext()) {
                sb.append(", ");
            }
        }
    }
}
