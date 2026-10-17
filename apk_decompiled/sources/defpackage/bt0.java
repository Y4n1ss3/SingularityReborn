package defpackage;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.TabKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class bt0 implements my {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ iy f;
    public final /* synthetic */ my g;
    public final /* synthetic */ my h;
    public final /* synthetic */ Modifier i;
    public final /* synthetic */ boolean j;
    public final /* synthetic */ long k;
    public final /* synthetic */ long l;
    public final /* synthetic */ MutableInteractionSource m;
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;

    public /* synthetic */ bt0(boolean z, iy iyVar, my myVar, my myVar2, Modifier modifier, boolean z2, long j, long j2, MutableInteractionSource mutableInteractionSource, int i, int i2) {
        this.e = z;
        this.f = iyVar;
        this.g = myVar;
        this.h = myVar2;
        this.i = modifier;
        this.j = z2;
        this.k = j;
        this.l = j2;
        this.m = mutableInteractionSource;
        this.n = i;
        this.o = i2;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 Tab_wqdebIU$lambda$1;
        w01 LeadingIconTab_wqdebIU$lambda$2;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                boolean z = this.e;
                iy iyVar = this.f;
                my myVar = this.g;
                my myVar2 = this.h;
                Tab_wqdebIU$lambda$1 = TabKt.Tab_wqdebIU$lambda$1(z, iyVar, this.i, this.j, myVar, myVar2, this.k, this.l, this.m, this.n, this.o, (Composer) obj, intValue);
                return Tab_wqdebIU$lambda$1;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                LeadingIconTab_wqdebIU$lambda$2 = TabKt.LeadingIconTab_wqdebIU$lambda$2(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, (Composer) obj, intValue2);
                return LeadingIconTab_wqdebIU$lambda$2;
        }
    }

    public /* synthetic */ bt0(boolean z, iy iyVar, Modifier modifier, boolean z2, my myVar, my myVar2, long j, long j2, MutableInteractionSource mutableInteractionSource, int i, int i2) {
        this.e = z;
        this.f = iyVar;
        this.i = modifier;
        this.j = z2;
        this.g = myVar;
        this.h = myVar2;
        this.k = j;
        this.l = j2;
        this.m = mutableInteractionSource;
        this.n = i;
        this.o = i2;
    }
}
