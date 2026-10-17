package defpackage;

import androidx.compose.foundation.BorderStroke;
import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.ChipKt;
import androidx.compose.material3.SearchBarDefaults;
import androidx.compose.material3.SelectableChipColors;
import androidx.compose.material3.SelectableChipElevation;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class hi implements my {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Modifier f;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ my h;
    public final /* synthetic */ my i;
    public final /* synthetic */ my j;
    public final /* synthetic */ MutableInteractionSource k;
    public final /* synthetic */ int l;
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ Object s;
    public final /* synthetic */ Object t;

    public /* synthetic */ hi(SearchBarDefaults searchBarDefaults, String str, ky kyVar, ky kyVar2, boolean z, ky kyVar3, Modifier modifier, boolean z2, my myVar, my myVar2, my myVar3, TextFieldColors textFieldColors, MutableInteractionSource mutableInteractionSource, int i, int i2, int i3) {
        this.o = searchBarDefaults;
        this.p = str;
        this.q = kyVar;
        this.r = kyVar2;
        this.e = z;
        this.s = kyVar3;
        this.f = modifier;
        this.g = z2;
        this.h = myVar;
        this.i = myVar2;
        this.j = myVar3;
        this.t = textFieldColors;
        this.k = mutableInteractionSource;
        this.l = i;
        this.m = i2;
        this.n = i3;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 InputChip$lambda$8;
        w01 InputField$lambda$44;
        int i = this.d;
        Object obj3 = this.t;
        Object obj4 = this.s;
        Object obj5 = this.r;
        Object obj6 = this.q;
        Object obj7 = this.p;
        Object obj8 = this.o;
        switch (i) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                InputChip$lambda$8 = ChipKt.InputChip$lambda$8(this.e, (iy) obj8, this.h, this.f, this.g, this.i, this.j, (my) obj7, (Shape) obj6, (SelectableChipColors) obj5, (SelectableChipElevation) obj4, (BorderStroke) obj3, this.k, this.l, this.m, this.n, (Composer) obj, intValue);
                return InputChip$lambda$8;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                InputField$lambda$44 = SearchBarDefaults.InputField$lambda$44((SearchBarDefaults) obj8, (String) obj7, (ky) obj6, (ky) obj5, this.e, (ky) obj4, this.f, this.g, this.h, this.i, this.j, (TextFieldColors) obj3, this.k, this.l, this.m, this.n, (Composer) obj, intValue2);
                return InputField$lambda$44;
        }
    }

    public /* synthetic */ hi(boolean z, iy iyVar, my myVar, Modifier modifier, boolean z2, my myVar2, my myVar3, my myVar4, Shape shape, SelectableChipColors selectableChipColors, SelectableChipElevation selectableChipElevation, BorderStroke borderStroke, MutableInteractionSource mutableInteractionSource, int i, int i2, int i3) {
        this.e = z;
        this.o = iyVar;
        this.h = myVar;
        this.f = modifier;
        this.g = z2;
        this.i = myVar2;
        this.j = myVar3;
        this.p = myVar4;
        this.q = shape;
        this.r = selectableChipColors;
        this.s = selectableChipElevation;
        this.t = borderStroke;
        this.k = mutableInteractionSource;
        this.l = i;
        this.m = i2;
        this.n = i3;
    }
}
