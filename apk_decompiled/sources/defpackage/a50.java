package defpackage;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class a50 extends s40 {
    public final boolean b;
    public kv c;
    public r40 d;
    public final WeakReference e;
    public int f;
    public boolean g;
    public boolean h;
    public final ArrayList i;
    public final wr0 j;

    public a50(y40 y40Var, boolean z) {
        this.a = new p7(1, false);
        this.b = z;
        this.c = new kv();
        r40 r40Var = r40.e;
        this.d = r40Var;
        this.i = new ArrayList();
        this.e = new WeakReference(y40Var);
        this.j = p10.b(r40Var);
    }

    @Override // defpackage.s40
    public final void a(x40 x40Var) {
        w40 lqVar;
        z40 z40Var;
        y40 y40Var;
        x40Var.getClass();
        d("addObserver");
        r40 r40Var = this.d;
        r40 r40Var2 = r40.d;
        if (r40Var != r40Var2) {
            r40Var2 = r40.e;
        }
        z40 z40Var2 = new z40();
        HashMap hashMap = b50.a;
        boolean z = x40Var instanceof w40;
        boolean z2 = x40Var instanceof jq;
        int i = 2;
        Object obj = null;
        if (z && z2) {
            lqVar = new lq(r6, (jq) x40Var, (w40) x40Var);
        } else if (z2) {
            lqVar = new lq(r6, (jq) x40Var, obj);
        } else if (z) {
            lqVar = (w40) x40Var;
        } else {
            Class<?> cls = x40Var.getClass();
            if (b50.b(cls) == 2) {
                Object obj2 = b50.b.get(cls);
                obj2.getClass();
                List list = (List) obj2;
                if (list.size() == 1) {
                    b50.a((Constructor) list.get(0), x40Var);
                    throw null;
                }
                int size = list.size();
                cz[] czVarArr = new cz[size];
                if (size > 0) {
                    b50.a((Constructor) list.get(0), x40Var);
                    throw null;
                }
                lqVar = new di0(czVarArr, i);
            } else {
                lqVar = new lq(x40Var);
            }
        }
        z40Var2.b = lqVar;
        z40Var2.a = r40Var2;
        kv kvVar = this.c;
        jk0 jk0Var = (jk0) kvVar.h.get(x40Var);
        if (jk0Var != null) {
            z40Var = jk0Var.e;
        } else {
            HashMap hashMap2 = kvVar.h;
            jk0 jk0Var2 = new jk0(x40Var, z40Var2);
            kvVar.g++;
            jk0 jk0Var3 = kvVar.e;
            if (jk0Var3 == null) {
                kvVar.d = jk0Var2;
                kvVar.e = jk0Var2;
            } else {
                jk0Var3.f = jk0Var2;
                jk0Var2.g = jk0Var3;
                kvVar.e = jk0Var2;
            }
            hashMap2.put(x40Var, jk0Var2);
            z40Var = null;
        }
        if (z40Var == null && (y40Var = (y40) this.e.get()) != null) {
            r6 = (this.f != 0 || this.g) ? 1 : 0;
            r40 c = c(x40Var);
            this.f++;
            while (z40Var2.a.compareTo(c) < 0 && this.c.h.containsKey(x40Var)) {
                r40 r40Var3 = z40Var2.a;
                ArrayList arrayList = this.i;
                arrayList.add(r40Var3);
                o40 o40Var = q40.Companion;
                r40 r40Var4 = z40Var2.a;
                o40Var.getClass();
                r40Var4.getClass();
                int ordinal = r40Var4.ordinal();
                q40 q40Var = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? null : q40.ON_RESUME : q40.ON_START : q40.ON_CREATE;
                if (q40Var == null) {
                    o.s(z40Var2.a, "no event up from ");
                    return;
                } else {
                    z40Var2.a(y40Var, q40Var);
                    arrayList.remove(arrayList.size() - 1);
                    c = c(x40Var);
                }
            }
            if (r6 == 0) {
                g();
            }
            this.f--;
        }
    }

    @Override // defpackage.s40
    public final void b(x40 x40Var) {
        x40Var.getClass();
        d("removeObserver");
        kv kvVar = this.c;
        WeakHashMap weakHashMap = kvVar.f;
        HashMap hashMap = kvVar.h;
        jk0 jk0Var = (jk0) hashMap.get(x40Var);
        if (jk0Var != null) {
            kvVar.g--;
            if (!weakHashMap.isEmpty()) {
                Iterator it = weakHashMap.keySet().iterator();
                while (it.hasNext()) {
                    ((lk0) it.next()).a(jk0Var);
                }
            }
            jk0 jk0Var2 = jk0Var.g;
            jk0 jk0Var3 = jk0Var.f;
            if (jk0Var2 != null) {
                jk0Var2.f = jk0Var3;
            } else {
                kvVar.d = jk0Var3;
            }
            jk0 jk0Var4 = jk0Var.f;
            if (jk0Var4 != null) {
                jk0Var4.g = jk0Var2;
            } else {
                kvVar.e = jk0Var2;
            }
            jk0Var.f = null;
            jk0Var.g = null;
        }
        hashMap.remove(x40Var);
    }

    public final r40 c(x40 x40Var) {
        HashMap hashMap = this.c.h;
        jk0 jk0Var = hashMap.containsKey(x40Var) ? ((jk0) hashMap.get(x40Var)).g : null;
        r40 r40Var = jk0Var != null ? jk0Var.e.a : null;
        ArrayList arrayList = this.i;
        r40 r40Var2 = arrayList.isEmpty() ? null : (r40) arrayList.get(arrayList.size() - 1);
        r40 r40Var3 = this.d;
        r40Var3.getClass();
        if (r40Var == null || r40Var.compareTo(r40Var3) >= 0) {
            r40Var = r40Var3;
        }
        return (r40Var2 == null || r40Var2.compareTo(r40Var) >= 0) ? r40Var : r40Var2;
    }

    public final void d(String str) {
        if (this.b) {
            lb.a0().getClass();
            if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
                throw new IllegalStateException(uo.d("Method ", str, " must be called on the main thread").toString());
            }
        }
    }

    public final void e(q40 q40Var) {
        q40Var.getClass();
        d("handleLifecycleEvent");
        f(q40Var.a());
    }

    public final void f(r40 r40Var) {
        if (this.d == r40Var) {
            return;
        }
        y40 y40Var = (y40) this.e.get();
        r40 r40Var2 = this.d;
        r40Var2.getClass();
        r40 r40Var3 = r40.e;
        r40 r40Var4 = r40.d;
        if (r40Var2 == r40Var3 && r40Var == r40Var4) {
            throw new IllegalStateException(("State must be at least '" + r40.f + "' to be moved to '" + r40Var + "' in component " + y40Var).toString());
        }
        if (r40Var2 == r40Var4 && r40Var2 != r40Var) {
            throw new IllegalStateException(("State is '" + r40Var4 + "' and cannot be moved to `" + r40Var + "` in component " + y40Var).toString());
        }
        this.d = r40Var;
        if (this.g || this.f != 0) {
            this.h = true;
            return;
        }
        this.g = true;
        g();
        this.g = false;
        if (this.d == r40Var4) {
            this.c = new kv();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x002c, code lost:
    
        r11.h = false;
        r11.j.i(r11.d);
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0035, code lost:
    
        return;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g() {
        y40 y40Var = (y40) this.e.get();
        if (y40Var == null) {
            o.f("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
            return;
        }
        while (true) {
            kv kvVar = this.c;
            if (kvVar.g != 0) {
                jk0 jk0Var = kvVar.d;
                jk0Var.getClass();
                r40 r40Var = jk0Var.e.a;
                jk0 jk0Var2 = this.c.e;
                jk0Var2.getClass();
                r40 r40Var2 = jk0Var2.e.a;
                if (r40Var == r40Var2 && this.d == r40Var2) {
                    break;
                }
                this.h = false;
                r40 r40Var3 = this.d;
                jk0 jk0Var3 = this.c.d;
                jk0Var3.getClass();
                int compareTo = r40Var3.compareTo(jk0Var3.e.a);
                ArrayList arrayList = this.i;
                if (compareTo < 0) {
                    kv kvVar2 = this.c;
                    ik0 ik0Var = new ik0(kvVar2.e, kvVar2.d, 1);
                    kvVar2.f.put(ik0Var, Boolean.FALSE);
                    while (ik0Var.hasNext() && !this.h) {
                        Map.Entry entry = (Map.Entry) ik0Var.next();
                        entry.getClass();
                        x40 x40Var = (x40) entry.getKey();
                        z40 z40Var = (z40) entry.getValue();
                        while (z40Var.a.compareTo(this.d) > 0 && !this.h && this.c.h.containsKey(x40Var)) {
                            o40 o40Var = q40.Companion;
                            r40 r40Var4 = z40Var.a;
                            o40Var.getClass();
                            r40Var4.getClass();
                            int ordinal = r40Var4.ordinal();
                            q40 q40Var = ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? null : q40.ON_PAUSE : q40.ON_STOP : q40.ON_DESTROY;
                            if (q40Var == null) {
                                o.s(z40Var.a, "no event down from ");
                                return;
                            } else {
                                arrayList.add(q40Var.a());
                                z40Var.a(y40Var, q40Var);
                                arrayList.remove(arrayList.size() - 1);
                            }
                        }
                    }
                }
                jk0 jk0Var4 = this.c.e;
                if (!this.h && jk0Var4 != null && this.d.compareTo(jk0Var4.e.a) > 0) {
                    kv kvVar3 = this.c;
                    kvVar3.getClass();
                    kk0 kk0Var = new kk0(kvVar3);
                    kvVar3.f.put(kk0Var, Boolean.FALSE);
                    while (kk0Var.hasNext() && !this.h) {
                        Map.Entry entry2 = (Map.Entry) kk0Var.next();
                        x40 x40Var2 = (x40) entry2.getKey();
                        z40 z40Var2 = (z40) entry2.getValue();
                        while (z40Var2.a.compareTo(this.d) < 0 && !this.h && this.c.h.containsKey(x40Var2)) {
                            arrayList.add(z40Var2.a);
                            o40 o40Var2 = q40.Companion;
                            r40 r40Var5 = z40Var2.a;
                            o40Var2.getClass();
                            r40Var5.getClass();
                            int ordinal2 = r40Var5.ordinal();
                            q40 q40Var2 = ordinal2 != 1 ? ordinal2 != 2 ? ordinal2 != 3 ? null : q40.ON_RESUME : q40.ON_START : q40.ON_CREATE;
                            if (q40Var2 == null) {
                                o.s(z40Var2.a, "no event up from ");
                                return;
                            } else {
                                z40Var2.a(y40Var, q40Var2);
                                arrayList.remove(arrayList.size() - 1);
                            }
                        }
                    }
                }
            } else {
                break;
            }
        }
    }
}
