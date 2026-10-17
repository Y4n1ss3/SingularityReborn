package defpackage;

import androidx.compose.material3.TooltipKt;
import androidx.compose.material3.TooltipScope;
import androidx.compose.material3.Tooltip_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class bw0 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ TooltipScope e;
    public final /* synthetic */ Modifier f;
    public final /* synthetic */ long g;
    public final /* synthetic */ float h;
    public final /* synthetic */ Shape i;
    public final /* synthetic */ long j;
    public final /* synthetic */ long k;
    public final /* synthetic */ float l;
    public final /* synthetic */ float m;
    public final /* synthetic */ my n;
    public final /* synthetic */ int o;
    public final /* synthetic */ int p;

    public /* synthetic */ bw0(TooltipScope tooltipScope, Modifier modifier, long j, float f, Shape shape, long j2, long j3, float f2, float f3, my myVar, int i, int i2, int i3) {
        this.d = i3;
        this.e = tooltipScope;
        this.f = modifier;
        this.g = j;
        this.h = f;
        this.i = shape;
        this.j = j2;
        this.k = j3;
        this.l = f2;
        this.m = f3;
        this.n = myVar;
        this.o = i;
        this.p = i2;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 PlainTooltip_m9Er_Xc$lambda$6;
        w01 PlainTooltipAndroid_m9Er_Xc$lambda$1;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                PlainTooltip_m9Er_Xc$lambda$6 = TooltipKt.PlainTooltip_m9Er_Xc$lambda$6(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, (Composer) obj, intValue);
                return PlainTooltip_m9Er_Xc$lambda$6;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                PlainTooltipAndroid_m9Er_Xc$lambda$1 = Tooltip_androidKt.PlainTooltipAndroid_m9Er_Xc$lambda$1(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, (Composer) obj, intValue2);
                return PlainTooltipAndroid_m9Er_Xc$lambda$1;
        }
    }
}
