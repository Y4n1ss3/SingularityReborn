package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public class qf0 implements go0, tf {
    public final String a;
    public final lr0 b;
    public final int c;
    public int d = -1;
    public final String[] e;
    public final List[] f;
    public final boolean[] g;
    public Map h;
    public final g30 i;
    public final g30 j;
    public final g30 k;

    public qf0(String str, lr0 lr0Var, int i) {
        this.a = str;
        this.b = lr0Var;
        this.c = i;
        String[] strArr = new String[i];
        final int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            strArr[i3] = "[UNINITIALIZED]";
        }
        this.e = strArr;
        int i4 = this.c;
        this.f = new List[i4];
        this.g = new boolean[i4];
        this.h = vt.d;
        iy iyVar = new iy(this) { // from class: pf0
            public final /* synthetic */ qf0 e;

            {
                this.e = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.iy
            public final Object invoke() {
                ArrayList arrayList;
                int i5 = i2;
                qf0 qf0Var = this.e;
                switch (i5) {
                    case 0:
                        lr0 lr0Var2 = qf0Var.b;
                        return lr0Var2 != null ? new a30[]{nr0.c[0].getValue(), new sb(lr0Var2.a)} : d41.i;
                    case 1:
                        lr0 lr0Var3 = qf0Var.b;
                        if (lr0Var3 != null) {
                            a30[] a30VarArr = {lr0Var3.a};
                            arrayList = new ArrayList(a30VarArr.length);
                            for (a30 a30Var : a30VarArr) {
                                arrayList.add(a30Var.c());
                            }
                        } else {
                            arrayList = null;
                        }
                        return p01.h(arrayList);
                    default:
                        return Integer.valueOf(p01.p(qf0Var, (go0[]) qf0Var.j.getValue()));
                }
            }
        };
        g40 g40Var = g40.d;
        this.i = y80.B(g40Var, iyVar);
        final int i5 = 1;
        this.j = y80.B(g40Var, new iy(this) { // from class: pf0
            public final /* synthetic */ qf0 e;

            {
                this.e = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.iy
            public final Object invoke() {
                ArrayList arrayList;
                int i52 = i5;
                qf0 qf0Var = this.e;
                switch (i52) {
                    case 0:
                        lr0 lr0Var2 = qf0Var.b;
                        return lr0Var2 != null ? new a30[]{nr0.c[0].getValue(), new sb(lr0Var2.a)} : d41.i;
                    case 1:
                        lr0 lr0Var3 = qf0Var.b;
                        if (lr0Var3 != null) {
                            a30[] a30VarArr = {lr0Var3.a};
                            arrayList = new ArrayList(a30VarArr.length);
                            for (a30 a30Var : a30VarArr) {
                                arrayList.add(a30Var.c());
                            }
                        } else {
                            arrayList = null;
                        }
                        return p01.h(arrayList);
                    default:
                        return Integer.valueOf(p01.p(qf0Var, (go0[]) qf0Var.j.getValue()));
                }
            }
        });
        final int i6 = 2;
        this.k = y80.B(g40Var, new iy(this) { // from class: pf0
            public final /* synthetic */ qf0 e;

            {
                this.e = this;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // defpackage.iy
            public final Object invoke() {
                ArrayList arrayList;
                int i52 = i6;
                qf0 qf0Var = this.e;
                switch (i52) {
                    case 0:
                        lr0 lr0Var2 = qf0Var.b;
                        return lr0Var2 != null ? new a30[]{nr0.c[0].getValue(), new sb(lr0Var2.a)} : d41.i;
                    case 1:
                        lr0 lr0Var3 = qf0Var.b;
                        if (lr0Var3 != null) {
                            a30[] a30VarArr = {lr0Var3.a};
                            arrayList = new ArrayList(a30VarArr.length);
                            for (a30 a30Var : a30VarArr) {
                                arrayList.add(a30Var.c());
                            }
                        } else {
                            arrayList = null;
                        }
                        return p01.h(arrayList);
                    default:
                        return Integer.valueOf(p01.p(qf0Var, (go0[]) qf0Var.j.getValue()));
                }
            }
        });
    }

    @Override // defpackage.go0
    public final String a() {
        return this.a;
    }

    @Override // defpackage.tf
    public final Set b() {
        return this.h.keySet();
    }

    @Override // defpackage.go0
    public final boolean c() {
        return false;
    }

    @Override // defpackage.go0
    public y80 d() {
        return ls0.m;
    }

    @Override // defpackage.go0
    public final int e() {
        return this.c;
    }

    public boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj instanceof qf0) {
            go0 go0Var = (go0) obj;
            if (this.a.equals(go0Var.a()) && Arrays.equals((go0[]) this.j.getValue(), (go0[]) ((qf0) obj).j.getValue())) {
                int e = go0Var.e();
                int i2 = this.c;
                if (i2 == e) {
                    for (0; i < i2; i + 1) {
                        i = (q10.b(g(i).a(), go0Var.g(i).a()) && q10.b(g(i).d(), go0Var.g(i).d())) ? i + 1 : 0;
                    }
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.go0
    public final String f(int i) {
        return this.e[i];
    }

    @Override // defpackage.go0
    public go0 g(int i) {
        return ((a30[]) this.i.getValue())[i].c();
    }

    @Override // defpackage.go0
    public final boolean h(int i) {
        return this.g[i];
    }

    public int hashCode() {
        return ((Number) this.k.getValue()).intValue();
    }

    public final void i(String str) {
        str.getClass();
        int i = this.d + 1;
        this.d = i;
        String[] strArr = this.e;
        strArr[i] = str;
        this.g[i] = false;
        this.f[i] = null;
        if (i == this.c - 1) {
            HashMap hashMap = new HashMap();
            int length = strArr.length;
            for (int i2 = 0; i2 < length; i2++) {
                hashMap.put(strArr[i2], Integer.valueOf(i2));
            }
            this.h = hashMap;
        }
    }

    public String toString() {
        return yi.u0(y80.W(0, this.c), ", ", this.a.concat("("), ")", new mb0(this, 4), 24);
    }
}
