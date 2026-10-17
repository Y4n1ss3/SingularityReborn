package defpackage;

import androidx.compose.ui.text.font.TypefaceRequest;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public class s60 {
    public final int a;
    public final t60 b;
    public final ts c;
    public int d;
    public int e;
    public int f;

    public s60(int i) {
        this.a = i;
        if (i <= 0) {
            o.m("maxSize <= 0");
            throw null;
        }
        this.b = new t60(0);
        this.c = new ts(20);
    }

    public final Object a(Object obj) {
        obj.getClass();
        synchronized (this.c) {
            Object obj2 = this.b.a.get(obj);
            if (obj2 != null) {
                this.e++;
                return obj2;
            }
            this.f++;
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x00a9, code lost:
    
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!");
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00a1, code lost:
    
        return r5;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Object obj, Object obj2) {
        Object put;
        obj.getClass();
        obj2.getClass();
        synchronized (this.c) {
            this.d++;
            put = this.b.a.put(obj, obj2);
            if (put != null) {
                this.d--;
            }
        }
        int i = this.a;
        while (true) {
            synchronized (this.c) {
                try {
                    if (this.d < 0 || (this.b.a.isEmpty() && this.d != 0)) {
                        break;
                    }
                    if (this.d <= i || this.b.a.isEmpty()) {
                        break;
                    }
                    Set entrySet = this.b.a.entrySet();
                    entrySet.getClass();
                    Set set = entrySet;
                    Object obj3 = null;
                    if (set instanceof List) {
                        List list = (List) set;
                        if (!list.isEmpty()) {
                            obj3 = list.get(0);
                        }
                    } else {
                        Iterator it = set.iterator();
                        if (it.hasNext()) {
                            obj3 = it.next();
                        }
                    }
                    Map.Entry entry = (Map.Entry) obj3;
                    if (entry == null) {
                        return put;
                    }
                    Object key = entry.getKey();
                    Object value = entry.getValue();
                    t60 t60Var = this.b;
                    key.getClass();
                    t60Var.a.remove(key);
                    int i2 = this.d;
                    value.getClass();
                    this.d = i2 - 1;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final Object c(TypefaceRequest typefaceRequest) {
        Object remove;
        typefaceRequest.getClass();
        synchronized (this.c) {
            remove = this.b.a.remove(typefaceRequest);
            if (remove != null) {
                this.d--;
            }
        }
        return remove;
    }

    public final String toString() {
        String str;
        synchronized (this.c) {
            try {
                int i = this.e;
                int i2 = this.f + i;
                str = "LruCache[maxSize=" + this.a + ",hits=" + this.e + ",misses=" + this.f + ",hitRate=" + (i2 != 0 ? (i * 100) / i2 : 0) + "%]";
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }
}
