package defpackage;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.ChipColors;
import androidx.compose.material3.ChipElevation;
import androidx.compose.material3.ChipKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class ei implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ iy e;
    public final /* synthetic */ my f;
    public final /* synthetic */ Modifier g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ my i;
    public final /* synthetic */ my j;
    public final /* synthetic */ Shape k;
    public final /* synthetic */ ChipColors l;
    public final /* synthetic */ ChipElevation m;
    public final /* synthetic */ BorderStroke n;
    public final /* synthetic */ MutableInteractionSource o;
    public final /* synthetic */ int p;
    public final /* synthetic */ int q;
    public final /* synthetic */ int r;

    public /* synthetic */ ei(iy iyVar, my myVar, Modifier modifier, boolean z, my myVar2, my myVar3, Shape shape, ChipColors chipColors, ChipElevation chipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, int i, int i2, int i3, int i4) {
        this.d = i4;
        this.e = iyVar;
        this.f = myVar;
        this.g = modifier;
        this.h = z;
        this.i = myVar2;
        this.j = myVar3;
        this.k = shape;
        this.l = chipColors;
        this.m = chipElevation;
        this.n = borderStroke;
        this.o = mutableInteractionSource;
        this.p = i;
        this.q = i2;
        this.r = i3;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 ElevatedAssistChip$lambda$3;
        w01 AssistChip$lambda$0;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                ElevatedAssistChip$lambda$3 = ChipKt.ElevatedAssistChip$lambda$3(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, (Composer) obj, intValue);
                return ElevatedAssistChip$lambda$3;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                AssistChip$lambda$0 = ChipKt.AssistChip$lambda$0(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.r, (Composer) obj, intValue2);
                return AssistChip$lambda$0;
        }
    }
}
