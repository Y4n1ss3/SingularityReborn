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
public final /* synthetic */ class gi implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ iy e;
    public final /* synthetic */ my f;
    public final /* synthetic */ Modifier g;
    public final /* synthetic */ boolean h;
    public final /* synthetic */ my i;
    public final /* synthetic */ Shape j;
    public final /* synthetic */ ChipColors k;
    public final /* synthetic */ ChipElevation l;
    public final /* synthetic */ BorderStroke m;
    public final /* synthetic */ MutableInteractionSource n;
    public final /* synthetic */ int o;
    public final /* synthetic */ int p;

    public /* synthetic */ gi(iy iyVar, my myVar, Modifier modifier, boolean z, my myVar2, Shape shape, ChipColors chipColors, ChipElevation chipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, int i, int i2, int i3) {
        this.d = i3;
        this.e = iyVar;
        this.f = myVar;
        this.g = modifier;
        this.h = z;
        this.i = myVar2;
        this.j = shape;
        this.k = chipColors;
        this.l = chipElevation;
        this.m = borderStroke;
        this.n = mutableInteractionSource;
        this.o = i;
        this.p = i2;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 SuggestionChip$lambda$9;
        w01 ElevatedSuggestionChip$lambda$12;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                SuggestionChip$lambda$9 = ChipKt.SuggestionChip$lambda$9(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, (Composer) obj, intValue);
                return SuggestionChip$lambda$9;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                ElevatedSuggestionChip$lambda$12 = ChipKt.ElevatedSuggestionChip$lambda$12(this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o, this.p, (Composer) obj, intValue2);
                return ElevatedSuggestionChip$lambda$12;
        }
    }
}
