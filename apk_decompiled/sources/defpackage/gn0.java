package defpackage;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
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
public final /* synthetic */ class gn0 implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Shape f;
    public final /* synthetic */ Modifier g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ SegmentedButtonColors i;
    public final /* synthetic */ BorderStroke j;
    public final /* synthetic */ MutableInteractionSource k;
    public final /* synthetic */ my l;
    public final /* synthetic */ my m;
    public final /* synthetic */ int n;
    public final /* synthetic */ int o;
    public final /* synthetic */ int p;
    public final /* synthetic */ RowScope q;
    public final /* synthetic */ ty r;

    public /* synthetic */ gn0(RowScope rowScope, boolean z, ty tyVar, Shape shape, Modifier modifier, boolean z2, SegmentedButtonColors segmentedButtonColors, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, my myVar, my myVar2, int i, int i2, int i3, int i4) {
        this.d = i4;
        this.q = rowScope;
        this.e = z;
        this.r = tyVar;
        this.f = shape;
        this.g = modifier;
        this.h = z2;
        this.i = segmentedButtonColors;
        this.j = borderStroke;
        this.k = mutableInteractionSource;
        this.l = myVar;
        this.m = myVar2;
        this.n = i;
        this.o = i2;
        this.p = i3;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 SegmentedButton$lambda$7;
        w01 SegmentedButton$lambda$6;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                SegmentedButton$lambda$7 = SegmentedButtonKt.SegmentedButton$lambda$7((SingleChoiceSegmentedButtonRowScope) this.q, this.e, (iy) this.r, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, (Composer) obj, intValue);
                return SegmentedButton$lambda$7;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                SegmentedButton$lambda$6 = SegmentedButtonKt.SegmentedButton$lambda$6((MultiChoiceSegmentedButtonRowScope) this.q, this.e, (ky) this.r, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, (Composer) obj, intValue2);
                return SegmentedButton$lambda$6;
        }
    }
}
