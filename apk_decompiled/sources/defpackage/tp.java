package defpackage;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.DatePickerKt;
import androidx.compose.material3.DrawerState;
import androidx.compose.material3.LabelKt;
import androidx.compose.material3.NavigationDrawerKt;
import androidx.compose.material3.RangeSliderState;
import androidx.compose.material3.SliderColors;
import androidx.compose.material3.SliderDefaults;
import androidx.compose.material3.SliderPositions;
import androidx.compose.material3.SliderState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.vector.ImageVector;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class tp implements my {
    public final /* synthetic */ int d;
    public final /* synthetic */ Modifier e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;

    public /* synthetic */ tp(iy iyVar, ImageVector imageVector, String str, Modifier modifier, boolean z, int i, int i2) {
        this.d = 0;
        this.i = iyVar;
        this.j = imageVector;
        this.k = str;
        this.e = modifier;
        this.f = z;
        this.g = i;
        this.h = i2;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 IconButtonWithTooltip$lambda$71;
        w01 Label$lambda$5;
        w01 DismissibleNavigationDrawer$lambda$39;
        w01 Track$lambda$13;
        w01 Track$lambda$12;
        w01 Track$lambda$33;
        int i = this.d;
        Object obj3 = this.k;
        Object obj4 = this.j;
        Object obj5 = this.i;
        switch (i) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                IconButtonWithTooltip$lambda$71 = DatePickerKt.IconButtonWithTooltip$lambda$71((iy) obj5, (ImageVector) obj4, (String) obj3, this.e, this.f, this.g, this.h, (Composer) obj, intValue);
                return IconButtonWithTooltip$lambda$71;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                Label$lambda$5 = LabelKt.Label$lambda$5((ny) obj5, this.e, (MutableInteractionSource) obj4, this.f, (my) obj3, this.g, this.h, (Composer) obj, intValue2);
                return Label$lambda$5;
            case 2:
                int intValue3 = ((Integer) obj2).intValue();
                DismissibleNavigationDrawer$lambda$39 = NavigationDrawerKt.DismissibleNavigationDrawer$lambda$39((my) obj5, this.e, (DrawerState) obj4, this.f, (my) obj3, this.g, this.h, (Composer) obj, intValue3);
                return DismissibleNavigationDrawer$lambda$39;
            case 3:
                int intValue4 = ((Integer) obj2).intValue();
                Track$lambda$13 = SliderDefaults.Track$lambda$13((SliderDefaults) obj5, (SliderState) obj4, this.e, (SliderColors) obj3, this.f, this.g, this.h, (Composer) obj, intValue4);
                return Track$lambda$13;
            case 4:
                int intValue5 = ((Integer) obj2).intValue();
                Track$lambda$12 = SliderDefaults.Track$lambda$12((SliderDefaults) obj5, (SliderPositions) obj4, this.e, (SliderColors) obj3, this.f, this.g, this.h, (Composer) obj, intValue5);
                return Track$lambda$12;
            default:
                int intValue6 = ((Integer) obj2).intValue();
                Track$lambda$33 = SliderDefaults.Track$lambda$33((SliderDefaults) obj5, (RangeSliderState) obj4, this.e, (SliderColors) obj3, this.f, this.g, this.h, (Composer) obj, intValue6);
                return Track$lambda$33;
        }
    }

    public /* synthetic */ tp(ty tyVar, Modifier modifier, Object obj, boolean z, my myVar, int i, int i2, int i3) {
        this.d = i3;
        this.i = tyVar;
        this.e = modifier;
        this.j = obj;
        this.f = z;
        this.k = myVar;
        this.g = i;
        this.h = i2;
    }

    public /* synthetic */ tp(SliderDefaults sliderDefaults, Object obj, Modifier modifier, SliderColors sliderColors, boolean z, int i, int i2, int i3) {
        this.d = i3;
        this.i = sliderDefaults;
        this.j = obj;
        this.e = modifier;
        this.k = sliderColors;
        this.f = z;
        this.g = i;
        this.h = i2;
    }
}
