package defpackage;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.ChipBorder;
import androidx.compose.material3.ChipColors;
import androidx.compose.material3.ChipElevation;
import androidx.compose.material3.ChipKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class ci implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ iy e;
    public final /* synthetic */ my f;
    public final /* synthetic */ Modifier g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ my i;
    public final /* synthetic */ Shape j;
    public final /* synthetic */ ChipColors k;
    public final /* synthetic */ ChipElevation l;
    public final /* synthetic */ ChipBorder m;
    public final /* synthetic */ MutableInteractionSource n;
    public final /* synthetic */ int o;
    public final /* synthetic */ int p;

    public /* synthetic */ ci(iy iyVar, my myVar, Modifier modifier, boolean z, my myVar2, Shape shape, ChipColors chipColors, ChipElevation chipElevation, ChipBorder chipBorder, MutableInteractionSource mutableInteractionSource, int i, int i2, int i3) {
        this.d = i3;
        this.e = iyVar;
        this.f = myVar;
        this.g = modifier;
        this.h = z;
        this.i = myVar2;
        this.j = shape;
        this.k = chipColors;
        this.l = chipElevation;
        this.m = chipBorder;
        this.n = mutableInteractionSource;
        this.o = i;
        this.p = i2;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 ElevatedSuggestionChip$lambda$14;
        w01 SuggestionChip$lambda$11;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                ElevatedSuggestionChip$lambda$14 = ChipKt.ElevatedSuggestionChip$lambda$14(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, (Composer) obj, intValue);
                return ElevatedSuggestionChip$lambda$14;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                SuggestionChip$lambda$11 = ChipKt.SuggestionChip$lambda$11(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, (Composer) obj, intValue2);
                return SuggestionChip$lambda$11;
        }
    }
}
