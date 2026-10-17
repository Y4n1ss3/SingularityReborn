package defpackage;

import androidx.compose.foundation.ScrollState;
import androidx.compose.material3.TabRowKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class et0 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ ny f;
    public final /* synthetic */ Modifier g;
    public final /* synthetic */ long h;
    public final /* synthetic */ long i;
    public final /* synthetic */ float j;
    public final /* synthetic */ my k;
    public final /* synthetic */ my l;
    public final /* synthetic */ ScrollState m;
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;

    public /* synthetic */ et0(int i, ny nyVar, Modifier modifier, long j, long j2, float f, my myVar, my myVar2, ScrollState scrollState, int i2, int i3) {
        this.d = 1;
        this.e = i;
        this.f = nyVar;
        this.g = modifier;
        this.h = j;
        this.i = j2;
        this.j = f;
        this.k = myVar;
        this.l = myVar2;
        this.m = scrollState;
        this.n = i2;
        this.o = i3;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 SecondaryScrollableTabRow_qhFBPw4$lambda$9;
        w01 ScrollableTabRowWithSubcomposeImpl_qhFBPw4$lambda$7;
        w01 PrimaryScrollableTabRow_qhFBPw4$lambda$8;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                int i = this.e;
                ny nyVar = this.f;
                Modifier modifier = this.g;
                long j = this.h;
                long j2 = this.i;
                float f = this.j;
                my myVar = this.k;
                my myVar2 = this.l;
                SecondaryScrollableTabRow_qhFBPw4$lambda$9 = TabRowKt.SecondaryScrollableTabRow_qhFBPw4$lambda$9(i, modifier, this.m, j, j2, f, nyVar, myVar, myVar2, this.n, this.o, (Composer) obj, intValue);
                return SecondaryScrollableTabRow_qhFBPw4$lambda$9;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                ScrollableTabRowWithSubcomposeImpl_qhFBPw4$lambda$7 = TabRowKt.ScrollableTabRowWithSubcomposeImpl_qhFBPw4$lambda$7(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, (Composer) obj, intValue2);
                return ScrollableTabRowWithSubcomposeImpl_qhFBPw4$lambda$7;
            default:
                int intValue3 = ((Integer) obj2).intValue();
                int i2 = this.e;
                ny nyVar2 = this.f;
                Modifier modifier2 = this.g;
                long j3 = this.h;
                long j4 = this.i;
                float f2 = this.j;
                my myVar3 = this.k;
                my myVar4 = this.l;
                PrimaryScrollableTabRow_qhFBPw4$lambda$8 = TabRowKt.PrimaryScrollableTabRow_qhFBPw4$lambda$8(i2, modifier2, this.m, j3, j4, f2, nyVar2, myVar3, myVar4, this.n, this.o, (Composer) obj, intValue3);
                return PrimaryScrollableTabRow_qhFBPw4$lambda$8;
        }
    }

    public /* synthetic */ et0(int i, Modifier modifier, ScrollState scrollState, long j, long j2, float f, ny nyVar, my myVar, my myVar2, int i2, int i3, int i4) {
        this.d = i4;
        this.e = i;
        this.g = modifier;
        this.m = scrollState;
        this.h = j;
        this.i = j2;
        this.j = f;
        this.f = nyVar;
        this.k = myVar;
        this.l = myVar2;
        this.n = i2;
        this.o = i3;
    }
}
