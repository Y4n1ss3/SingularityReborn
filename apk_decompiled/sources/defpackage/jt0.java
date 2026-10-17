package defpackage;

import androidx.compose.material3.TabRowKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class jt0 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Modifier f;
    public final /* synthetic */ long g;
    public final /* synthetic */ long h;
    public final /* synthetic */ ny i;
    public final /* synthetic */ my j;
    public final /* synthetic */ my k;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;

    public /* synthetic */ jt0(int i, Modifier modifier, long j, long j2, ny nyVar, my myVar, my myVar2, int i2, int i3, int i4) {
        this.d = i4;
        this.e = i;
        this.f = modifier;
        this.g = j;
        this.h = j2;
        this.i = nyVar;
        this.j = myVar;
        this.k = myVar2;
        this.l = i2;
        this.m = i3;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                return TabRowKt.PrimaryTabRow_pAZo6Ak$lambda$0(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, (Composer) obj, intValue);
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                return TabRowKt.TabRow_pAZo6Ak$lambda$10(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, (Composer) obj, intValue2);
            default:
                int intValue3 = ((Integer) obj2).intValue();
                return TabRowKt.SecondaryTabRow_pAZo6Ak$lambda$1(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, (Composer) obj, intValue3);
        }
    }
}
