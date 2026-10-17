package defpackage;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.IconToggleButtonColors;
import androidx.compose.material3.SwitchColors;
import androidx.compose.material3.SwitchKt;
import androidx.compose.material3.TooltipKt;
import androidx.compose.material3.TooltipState;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.window.PopupPositionProvider;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class d00 implements my {
    public final /* synthetic */ int d = 2;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Modifier g;
    public final /* synthetic */ my h;
    public final /* synthetic */ boolean i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ int k;
    public final /* synthetic */ int l;
    public final /* synthetic */ Object m;

    public /* synthetic */ d00(PopupPositionProvider popupPositionProvider, ny nyVar, TooltipState tooltipState, Modifier modifier, boolean z, boolean z2, my myVar, int i, int i2) {
        this.f = popupPositionProvider;
        this.m = nyVar;
        this.j = tooltipState;
        this.g = modifier;
        this.e = z;
        this.i = z2;
        this.h = myVar;
        this.k = i;
        this.l = i2;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 IconToggleButton$lambda$5;
        w01 Switch$lambda$1;
        w01 TooltipBox$lambda$0;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                IconToggleButton$lambda$5 = IconButtonKt.IconToggleButton$lambda$5(this.e, (ky) this.f, this.g, this.i, (IconToggleButtonColors) this.m, (MutableInteractionSource) this.j, this.h, this.k, this.l, (Composer) obj, intValue);
                return IconToggleButton$lambda$5;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                Switch$lambda$1 = SwitchKt.Switch$lambda$1(this.e, (ky) this.f, this.g, this.h, this.i, (SwitchColors) this.m, (MutableInteractionSource) this.j, this.k, this.l, (Composer) obj, intValue2);
                return Switch$lambda$1;
            default:
                int intValue3 = ((Integer) obj2).intValue();
                TooltipBox$lambda$0 = TooltipKt.TooltipBox$lambda$0((PopupPositionProvider) this.f, (ny) this.m, (TooltipState) this.j, this.g, this.e, this.i, this.h, this.k, this.l, (Composer) obj, intValue3);
                return TooltipBox$lambda$0;
        }
    }

    public /* synthetic */ d00(boolean z, ky kyVar, Modifier modifier, my myVar, boolean z2, SwitchColors switchColors, MutableInteractionSource mutableInteractionSource, int i, int i2) {
        this.e = z;
        this.f = kyVar;
        this.g = modifier;
        this.h = myVar;
        this.i = z2;
        this.m = switchColors;
        this.j = mutableInteractionSource;
        this.k = i;
        this.l = i2;
    }

    public /* synthetic */ d00(boolean z, ky kyVar, Modifier modifier, boolean z2, IconToggleButtonColors iconToggleButtonColors, MutableInteractionSource mutableInteractionSource, my myVar, int i, int i2) {
        this.e = z;
        this.f = kyVar;
        this.g = modifier;
        this.i = z2;
        this.m = iconToggleButtonColors;
        this.j = mutableInteractionSource;
        this.h = myVar;
        this.k = i;
        this.l = i2;
    }
}
