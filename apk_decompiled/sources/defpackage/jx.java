package defpackage;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.FlowLayoutKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class jx implements my {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ Modifier e;
    public final /* synthetic */ Arrangement.Horizontal f;
    public final /* synthetic */ Arrangement.Vertical g;
    public final /* synthetic */ int h;
    public final /* synthetic */ int i;
    public final /* synthetic */ ny j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;
    public final /* synthetic */ Object m;

    public /* synthetic */ jx(Modifier modifier, Arrangement.Horizontal horizontal, Arrangement.Vertical vertical, Alignment.Vertical vertical2, int i, int i2, ny nyVar, int i3, int i4) {
        this.e = modifier;
        this.f = horizontal;
        this.g = vertical;
        this.m = vertical2;
        this.h = i;
        this.i = i2;
        this.j = nyVar;
        this.k = i3;
        this.l = i4;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 FlowColumn$lambda$3;
        w01 FlowRow$lambda$3;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                FlowColumn$lambda$3 = FlowLayoutKt.FlowColumn$lambda$3(this.e, this.g, this.f, (Alignment.Horizontal) this.m, this.h, this.i, this.j, this.k, this.l, (Composer) obj, intValue);
                return FlowColumn$lambda$3;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                FlowRow$lambda$3 = FlowLayoutKt.FlowRow$lambda$3(this.e, this.f, this.g, (Alignment.Vertical) this.m, this.h, this.i, this.j, this.k, this.l, (Composer) obj, intValue2);
                return FlowRow$lambda$3;
        }
    }

    public /* synthetic */ jx(Modifier modifier, Arrangement.Vertical vertical, Arrangement.Horizontal horizontal, Alignment.Horizontal horizontal2, int i, int i2, ny nyVar, int i3, int i4) {
        this.e = modifier;
        this.g = vertical;
        this.f = horizontal;
        this.m = horizontal2;
        this.h = i;
        this.i = i2;
        this.j = nyVar;
        this.k = i3;
        this.l = i4;
    }
}
