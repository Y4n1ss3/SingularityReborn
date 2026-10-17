package defpackage;

import androidx.compose.foundation.interaction.MutableInteractionSource;
import androidx.compose.material3.IconButtonColors;
import androidx.compose.material3.IconButtonKt;
import androidx.compose.material3.TooltipState;
import androidx.compose.material3.internal.BasicTooltipKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.RecomposeScopeImplKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.window.PopupPositionProvider;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class vd implements my {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ iy e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ ty g;
    public final /* synthetic */ int h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object j;
    public final /* synthetic */ Object k;
    public final /* synthetic */ Object l;

    public /* synthetic */ vd(Modifier modifier, iy iyVar, boolean z, Shape shape, IconButtonColors iconButtonColors, MutableInteractionSource mutableInteractionSource, my myVar, int i) {
        this.i = modifier;
        this.e = iyVar;
        this.f = z;
        this.j = shape;
        this.k = iconButtonColors;
        this.l = mutableInteractionSource;
        this.g = myVar;
        this.h = i;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 TooltipPopup$lambda$10;
        w01 IconButtonImpl$lambda$4;
        int i = this.d;
        ty tyVar = this.g;
        Object obj3 = this.l;
        Object obj4 = this.k;
        Object obj5 = this.j;
        Object obj6 = this.i;
        switch (i) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                TooltipPopup$lambda$10 = BasicTooltipKt.TooltipPopup$lambda$10((PopupPositionProvider) obj6, (TooltipState) obj5, this.e, (un) obj4, this.f, (MutableState) obj3, (my) tyVar, this.h, (Composer) obj, intValue);
                return TooltipPopup$lambda$10;
            case 1:
                int intValue2 = ((Integer) obj2).intValue();
                IconButtonImpl$lambda$4 = IconButtonKt.IconButtonImpl$lambda$4((Modifier) obj6, this.e, this.f, (Shape) obj5, (IconButtonColors) obj4, (MutableInteractionSource) obj3, (my) tyVar, this.h, (Composer) obj, intValue2);
                return IconButtonImpl$lambda$4;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags = RecomposeScopeImplKt.updateChangedFlags(this.h | 1);
                e80.z(this.f, (String) obj6, (String) obj5, (ky) obj4, (ky) obj3, this.e, (iy) tyVar, (Composer) obj, updateChangedFlags);
                return w01.a;
        }
    }

    public /* synthetic */ vd(PopupPositionProvider popupPositionProvider, TooltipState tooltipState, iy iyVar, un unVar, boolean z, MutableState mutableState, my myVar, int i) {
        this.i = popupPositionProvider;
        this.j = tooltipState;
        this.e = iyVar;
        this.k = unVar;
        this.f = z;
        this.l = mutableState;
        this.g = myVar;
        this.h = i;
    }

    public /* synthetic */ vd(boolean z, String str, String str2, ky kyVar, ky kyVar2, iy iyVar, iy iyVar2, int i) {
        this.f = z;
        this.i = str;
        this.j = str2;
        this.k = kyVar;
        this.l = kyVar2;
        this.e = iyVar;
        this.g = iyVar2;
        this.h = i;
    }
}
