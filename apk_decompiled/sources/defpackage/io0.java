package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class io0 implements go0, tf {
    public final String a;
    public final y80 b;
    public final int c;
    public final HashSet d;
    public final String[] e;
    public final go0[] f;
    public final List[] g;
    public final boolean[] h;
    public final Map i;
    public final go0[] j;
    public final ys0 k;

    public io0(String str, y80 y80Var, int i, List list, ki kiVar) {
        this.a = str;
        this.b = y80Var;
        this.c = i;
        ArrayList arrayList = kiVar.b;
        HashSet hashSet = new HashSet(p80.L(zi.a0(arrayList, 12)));
        yi.G0(arrayList, hashSet);
        this.d = hashSet;
        int i2 = 0;
        this.e = (String[]) arrayList.toArray(new String[0]);
        this.f = p01.h(kiVar.d);
        this.g = (List[]) kiVar.e.toArray(new List[0]);
        ArrayList arrayList2 = kiVar.f;
        boolean[] zArr = new boolean[arrayList2.size()];
        int size = arrayList2.size();
        int i3 = 0;
        while (i3 < size) {
            Object obj = arrayList2.get(i3);
            i3++;
            zArr[i2] = ((Boolean) obj).booleanValue();
            i2++;
        }
        this.h = zArr;
        String[] strArr = this.e;
        strArr.getClass();
        bc bcVar = new bc(new i2(strArr, 6), 5);
        ArrayList arrayList3 = new ArrayList(zi.a0(bcVar, 10));
        Iterator it = bcVar.iterator();
        while (true) {
            q00 q00Var = (q00) it;
            if (!q00Var.f.hasNext()) {
                this.i = p80.P(arrayList3);
                this.j = p01.h(list);
                this.k = new ys0(new hm0(this, 4));
                return;
            }
            p00 p00Var = (p00) q00Var.next();
            arrayList3.add(new xe0(p00Var.b, Integer.valueOf(p00Var.a)));
        }
    }

    @Override // defpackage.go0
    public final String a() {
        return this.a;
    }

    @Override // defpackage.tf
    public final Set b() {
        return this.d;
    }

    @Override // defpackage.go0
    public final boolean c() {
        return false;
    }

    @Override // defpackage.go0
    public final y80 d() {
        return this.b;
    }

    @Override // defpackage.go0
    public final int e() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        int i;
        if (this == obj) {
            return true;
        }
        if (obj instanceof io0) {
            go0 go0Var = (go0) obj;
            if (this.a.equals(go0Var.a()) && Arrays.equals(this.j, ((io0) obj).j)) {
                int e = go0Var.e();
                int i2 = this.c;
                if (i2 == e) {
                    for (0; i < i2; i + 1) {
                        go0[] go0VarArr = this.f;
                        i = (q10.b(go0VarArr[i].a(), go0Var.g(i).a()) && q10.b(go0VarArr[i].d(), go0Var.g(i).d())) ? i + 1 : 0;
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
    public final go0 g(int i) {
        return this.f[i];
    }

    @Override // defpackage.go0
    public final boolean h(int i) {
        return this.h[i];
    }

    public final int hashCode() {
        return ((Number) this.k.getValue()).intValue();
    }

    public final String toString() {
        return yi.u0(y80.W(0, this.c), ", ", this.a.concat("("), ")", new mb0(this, 20), 24);
    }
}
