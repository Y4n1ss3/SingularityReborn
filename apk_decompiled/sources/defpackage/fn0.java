package defpackage;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.material3.MultiChoiceSegmentedButtonRowScope;
import androidx.compose.material3.SegmentedButtonColors;
import androidx.compose.material3.SegmentedButtonKt;
import androidx.compose.material3.SingleChoiceSegmentedButtonRowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class fn0 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Shape f;
    public final /* synthetic */ Modifier g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ SegmentedButtonColors i;
    public final /* synthetic */ BorderStroke j;
    public final /* synthetic */ PaddingValues k;
    public final /* synthetic */ MutableInteractionSource l;
    public final /* synthetic */ my m;
    public final /* synthetic */ my n;
    public final /* synthetic */ int o;
    public final /* synthetic */ int p;
    public final /* synthetic */ int q;
    public final /* synthetic */ RowScope r;
    public final /* synthetic */ ty s;

    public /* synthetic */ fn0(RowScope rowScope, boolean z, ty tyVar, Shape shape, Modifier modifier, boolean z2, SegmentedButtonColors segmentedButtonColors, BorderStroke borderStroke, PaddingValues paddingValues, MutableInteractionSource mutableInteractionSource, my myVar, my myVar2, int i, int i2, int i3, int i4) {
        this.d = i4;
        this.r = rowScope;
        this.e = z;
        this.s = tyVar;
        this.f = shape;
        this.g = modifier;
        this.h = z2;
        this.i = segmentedButtonColors;
        this.j = borderStroke;
        this.k = paddingValues;
        this.l = mutableInteractionSource;
        this.m = myVar;
        this.n = myVar2;
        this.o = i;
        this.p = i2;
        this.q = i3;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 SegmentedButton$lambda$1;
        w01 SegmentedButton$lambda$5;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                SegmentedButton$lambda$1 = SegmentedButtonKt.SegmentedButton$lambda$1((MultiChoiceSegmentedButtonRowScope) this.r, this.e, (ky) this.s, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, (Composer) obj, intValue);
                return SegmentedButton$lambda$1;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                SegmentedButton$lambda$5 = SegmentedButtonKt.SegmentedButton$lambda$5((SingleChoiceSegmentedButtonRowScope) this.r, this.e, (iy) this.s, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, (Composer) obj, intValue2);
                return SegmentedButton$lambda$5;
        }
    }
}
