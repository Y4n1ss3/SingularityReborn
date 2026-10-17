package defpackage;

import androidx.compose.foundation.ScrollState;
import androidx.compose.material3.TabRowKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class ht0 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ Modifier f;
    public final /* synthetic */ ScrollState g;
    public final /* synthetic */ long h;
    public final /* synthetic */ long i;
    public final /* synthetic */ float j;
    public final /* synthetic */ ny k;
    public final /* synthetic */ my l;
    public final /* synthetic */ float m;
    public final /* synthetic */ my n;
    public final /* synthetic */ int o;
    public final /* synthetic */ int p;

    public /* synthetic */ ht0(int i, Modifier modifier, ScrollState scrollState, long j, long j2, float f, ny nyVar, my myVar, float f2, my myVar2, int i2, int i3, int i4) {
        this.d = i4;
        this.e = i;
        this.f = modifier;
        this.g = scrollState;
        this.h = j;
        this.i = j2;
        this.j = f;
        this.k = nyVar;
        this.l = myVar;
        this.m = f2;
        this.n = myVar2;
        this.o = i2;
        this.p = i3;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 PrimaryScrollableTabRow_cx2KkNY$lambda$2;
        w01 SecondaryScrollableTabRow_cx2KkNY$lambda$3;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                PrimaryScrollableTabRow_cx2KkNY$lambda$2 = TabRowKt.PrimaryScrollableTabRow_cx2KkNY$lambda$2(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, (Composer) obj, intValue);
                return PrimaryScrollableTabRow_cx2KkNY$lambda$2;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                SecondaryScrollableTabRow_cx2KkNY$lambda$3 = TabRowKt.SecondaryScrollableTabRow_cx2KkNY$lambda$3(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, (Composer) obj, intValue2);
                return SecondaryScrollableTabRow_cx2KkNY$lambda$3;
        }
    }
}
