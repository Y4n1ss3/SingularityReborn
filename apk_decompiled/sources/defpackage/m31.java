package defpackage;

import android.os.Build;
import android.view.View;
import java.util.Objects;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public class m31 {
    public static final p31 b;
    public final p31 a;

    static {
        int i = Build.VERSION.SDK_INT;
        b = (i >= 34 ? new d31() : i >= 30 ? new c31() : new b31()).b().a.a().a.b().a.c();
    }

    public m31(p31 p31Var) {
        this.a = p31Var;
    }

    public p31 a() {
        return this.a;
    }

    public p31 b() {
        return this.a;
    }

    public p31 c() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m31)) {
            return false;
        }
        m31 m31Var = (m31) obj;
        return p() == m31Var.p() && o() == m31Var.o() && Objects.equals(l(), m31Var.l()) && Objects.equals(j(), m31Var.j()) && Objects.equals(f(), m31Var.f());
    }

    public pr f() {
        return null;
    }

    public v00 g(int i) {
        return v00.e;
    }

    public v00 h(int i) {
        if ((i & 8) == 0) {
            return v00.e;
        }
        o.m("Unable to query the maximum insets for IME");
        return null;
    }

    public int hashCode() {
        return Objects.hash(Boolean.valueOf(p()), Boolean.valueOf(o()), l(), j(), f());
    }

    public v00 i() {
        return l();
    }

    public v00 j() {
        return v00.e;
    }

    public v00 k() {
        return l();
    }

    public v00 l() {
        return v00.e;
    }

    public v00 m() {
        return l();
    }

    public p31 n(int i, int i2, int i3, int i4) {
        return b;
    }

    public boolean o() {
        return false;
    }

    public boolean p() {
        return false;
    }

    public boolean q(int i) {
        return true;
    }

    public void d(View view) {
    }

    public void e(p31 p31Var) {
    }

    public void r(v00[] v00VarArr) {
    }

    public void s(v00 v00Var) {
    }

    public void t(p31 p31Var) {
    }

    public void u(int i) {
    }
}
