package defpackage;

import androidx.compose.material3.CheckboxKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class th implements iy {
    public final /* synthetic */ int d;
    public final /* synthetic */ ky e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ th(int i, boolean z, ky kyVar) {
        this.d = i;
        this.e = kyVar;
        this.f = z;
    }

    @Override // defpackage.iy
    public final Object invoke() {
        w01 Checkbox$lambda$5$lambda$4;
        w01 Checkbox$lambda$2$lambda$1;
        int i = this.d;
        boolean z = this.f;
        ky kyVar = this.e;
        switch (i) {
            case 0:
                Checkbox$lambda$5$lambda$4 = CheckboxKt.Checkbox$lambda$5$lambda$4(kyVar, z);
                return Checkbox$lambda$5$lambda$4;
            default:
                Checkbox$lambda$2$lambda$1 = CheckboxKt.Checkbox$lambda$2$lambda$1(kyVar, z);
                return Checkbox$lambda$2$lambda$1;
        }
    }
}
