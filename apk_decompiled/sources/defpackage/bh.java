package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public abstract class bh implements yy {
    public final kn d;
    public final int e;
    public final mf f;

    public bh(kn knVar, int i, mf mfVar) {
        this.d = knVar;
        this.e = i;
        this.f = mfVar;
    }

    @Override // defpackage.yy
    public final iw c(kn knVar, int i, mf mfVar) {
        kn knVar2 = this.d;
        kn plus = knVar.plus(knVar2);
        mf mfVar2 = mf.d;
        mf mfVar3 = this.f;
        int i2 = this.e;
        if (mfVar == mfVar2) {
            if (i2 != -3) {
                if (i != -3) {
                    if (i2 != -2) {
                        if (i != -2) {
                            i += i2;
                            if (i < 0) {
                                i = Integer.MAX_VALUE;
                            }
                        }
                    }
                }
                i = i2;
            }
            mfVar = mfVar3;
        }
        return (q10.b(plus, knVar2) && i == i2 && mfVar == mfVar3) ? this : f(plus, i, mfVar);
    }

    @Override // defpackage.iw
    public Object collect(jw jwVar, hm hmVar) {
        Object n = p10.n(new o3(jwVar, this, (hm) null, 2), hmVar);
        return n == vn.d ? n : w01.a;
    }

    public String d() {
        return null;
    }

    public abstract Object e(gg0 gg0Var, hm hmVar);

    public abstract bh f(kn knVar, int i, mf mfVar);

    public iw g() {
        return null;
    }

    public zg h(un unVar) {
        int i = this.e;
        if (i == -3) {
            i = -2;
        }
        my d4Var = new d4(this, null, 3);
        gg0 gg0Var = new gg0(p01.w(unVar, this.d), d41.b(i, 4, this.f));
        gg0Var.Z(xn.f, gg0Var, d4Var);
        return gg0Var;
    }

    public String toString() {
        ArrayList arrayList = new ArrayList(4);
        String d = d();
        if (d != null) {
            arrayList.add(d);
        }
        st stVar = st.d;
        kn knVar = this.d;
        if (knVar != stVar) {
            arrayList.add("context=" + knVar);
        }
        int i = this.e;
        if (i != -3) {
            arrayList.add("capacity=" + i);
        }
        mf mfVar = mf.d;
        mf mfVar2 = this.f;
        if (mfVar2 != mfVar) {
            arrayList.add("onBufferOverflow=" + mfVar2);
        }
        StringBuilder sb = new StringBuilder(getClass().getSimpleName());
        sb.append('[');
        return c21.a(sb, yi.u0(arrayList, ", ", null, null, null, 62), ']');
    }
}
