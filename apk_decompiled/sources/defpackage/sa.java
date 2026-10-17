package defpackage;

import androidx.compose.ui.graphics.Fields;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes2.dex */
public final class sa {
    public final q90 a;
    public final String b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final boolean g;
    public final String h;
    public final boolean i;

    public /* synthetic */ sa(q90 q90Var, String str, boolean z, boolean z2, String str2, boolean z3, String str3, boolean z4, int i) {
        this(q90Var, str, false, z, z2, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? false : z3, (i & Fields.SpotShadowColor) != 0 ? null : str3, (i & Fields.RotationX) != 0 ? false : z4);
    }

    public static sa a(sa saVar, String str, boolean z, boolean z2, String str2, int i) {
        q90 q90Var = saVar.a;
        boolean z3 = (i & 4) != 0 ? saVar.c : true;
        boolean z4 = saVar.d;
        if ((i & 16) != 0) {
            z = saVar.e;
        }
        boolean z5 = z;
        String str3 = saVar.f;
        if ((i & 64) != 0) {
            z2 = saVar.g;
        }
        boolean z6 = z2;
        if ((i & Fields.SpotShadowColor) != 0) {
            str2 = saVar.h;
        }
        boolean z7 = saVar.i;
        q90Var.getClass();
        str.getClass();
        return new sa(q90Var, str, z3, z4, z5, str3, z6, str2, z7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sa)) {
            return false;
        }
        sa saVar = (sa) obj;
        return q10.b(this.a, saVar.a) && q10.b(this.b, saVar.b) && this.c == saVar.c && this.d == saVar.d && this.e == saVar.e && q10.b(this.f, saVar.f) && this.g == saVar.g && q10.b(this.h, saVar.h) && this.i == saVar.i;
    }

    public final int hashCode() {
        int c = kp0.c(kp0.c(kp0.c((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        int c2 = kp0.c((c + (str == null ? 0 : str.hashCode())) * 31, 31, this.g);
        String str2 = this.h;
        return Boolean.hashCode(this.i) + ((c2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "RepoModuleState(entry=" + this.a + ", status=" + this.b + ", isProcessing=" + this.c + ", isInstalled=" + this.d + ", isEnabled=" + this.e + ", currentVersion=" + this.f + ", hasUpdate=" + this.g + ", latestVersion=" + this.h + ", pendingReboot=" + this.i + ")";
    }

    public sa(q90 q90Var, String str, boolean z, boolean z2, boolean z3, String str2, boolean z4, String str3, boolean z5) {
        q90Var.getClass();
        this.a = q90Var;
        this.b = str;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = str2;
        this.g = z4;
        this.h = str3;
        this.i = z5;
    }
}
