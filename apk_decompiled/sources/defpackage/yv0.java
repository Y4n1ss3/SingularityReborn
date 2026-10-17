package defpackage;

import androidx.compose.material3.RichTooltipColors;
import androidx.compose.material3.TooltipKt;
import androidx.compose.material3.TooltipScope;
import androidx.compose.material3.Tooltip_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class yv0 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ TooltipScope e;
    public final /* synthetic */ Modifier f;
    public final /* synthetic */ my g;
    public final /* synthetic */ my h;
    public final /* synthetic */ long i;
    public final /* synthetic */ float j;
    public final /* synthetic */ Shape k;
    public final /* synthetic */ RichTooltipColors l;
    public final /* synthetic */ float m;
    public final /* synthetic */ float n;
    public final /* synthetic */ my o;
    public final /* synthetic */ int p;
    public final /* synthetic */ int q;
    public final /* synthetic */ int r;

    public /* synthetic */ yv0(TooltipScope tooltipScope, Modifier modifier, my myVar, my myVar2, long j, float f, Shape shape, RichTooltipColors richTooltipColors, float f2, float f3, my myVar3, int i, int i2, int i3, int i4) {
        this.d = i4;
        this.e = tooltipScope;
        this.f = modifier;
        this.g = myVar;
        this.h = myVar2;
        this.i = j;
        this.j = f;
        this.k = shape;
        this.l = richTooltipColors;
        this.m = f2;
        this.n = f3;
        this.o = myVar3;
        this.p = i;
        this.q = i2;
        this.r = i3;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 RichTooltip_ZuUcA3Q$lambda$12;
        w01 RichTooltipAndroid_ZuUcA3Q$lambda$3;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                RichTooltip_ZuUcA3Q$lambda$12 = TooltipKt.RichTooltip_ZuUcA3Q$lambda$12(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, (Composer) obj, intValue);
                return RichTooltip_ZuUcA3Q$lambda$12;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                RichTooltipAndroid_ZuUcA3Q$lambda$3 = Tooltip_androidKt.RichTooltipAndroid_ZuUcA3Q$lambda$3(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, (Composer) obj, intValue2);
                return RichTooltipAndroid_ZuUcA3Q$lambda$3;
        }
    }
}
