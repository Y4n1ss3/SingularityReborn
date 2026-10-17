package defpackage;

import androidx.compose.material3.TabRowKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class ft0 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ Modifier e;
    public final /* synthetic */ long f;
    public final /* synthetic */ long g;
    public final /* synthetic */ ny h;
    public final /* synthetic */ my i;
    public final /* synthetic */ my j;
    public final /* synthetic */ int k;

    public /* synthetic */ ft0(Modifier modifier, long j, long j2, ny nyVar, my myVar, my myVar2, int i, int i2) {
        this.d = i2;
        this.e = modifier;
        this.f = j;
        this.g = j2;
        this.h = nyVar;
        this.i = myVar;
        this.j = myVar2;
        this.k = i;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 TabRowWithSubcomposeImpl_DTcfvLk$lambda$6;
        w01 TabRowImpl_DTcfvLk$lambda$4;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                TabRowWithSubcomposeImpl_DTcfvLk$lambda$6 = TabRowKt.TabRowWithSubcomposeImpl_DTcfvLk$lambda$6(this.e, this.f, this.g, this.h, this.i, this.j, this.k, (Composer) obj, intValue);
                return TabRowWithSubcomposeImpl_DTcfvLk$lambda$6;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                TabRowImpl_DTcfvLk$lambda$4 = TabRowKt.TabRowImpl_DTcfvLk$lambda$4(this.e, this.f, this.g, this.h, this.i, this.j, this.k, (Composer) obj, intValue2);
                return TabRowImpl_DTcfvLk$lambda$4;
        }
    }
}
