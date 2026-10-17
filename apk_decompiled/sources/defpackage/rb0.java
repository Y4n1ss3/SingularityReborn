package defpackage;

import androidx.compose.material3.NavigationBarKt;
import androidx.compose.material3.NavigationRailKt;
import androidx.compose.runtime.Composer;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class rb0 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ my e;
    public final /* synthetic */ my f;
    public final /* synthetic */ my g;
    public final /* synthetic */ my h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ iy j;
    public final /* synthetic */ iy k;
    public final /* synthetic */ int l;

    public /* synthetic */ rb0(my myVar, my myVar2, my myVar3, my myVar4, boolean z, iy iyVar, iy iyVar2, int i, int i2) {
        this.d = i2;
        this.e = myVar;
        this.f = myVar2;
        this.g = myVar3;
        this.h = myVar4;
        this.i = z;
        this.j = iyVar;
        this.k = iyVar2;
        this.l = i;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 NavigationBarItemLayout$lambda$23;
        w01 NavigationRailItemLayout$lambda$18;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                NavigationBarItemLayout$lambda$23 = NavigationBarKt.NavigationBarItemLayout$lambda$23(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, (Composer) obj, intValue);
                return NavigationBarItemLayout$lambda$23;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                NavigationRailItemLayout$lambda$18 = NavigationRailKt.NavigationRailItemLayout$lambda$18(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, (Composer) obj, intValue2);
                return NavigationRailItemLayout$lambda$18;
        }
    }
}
