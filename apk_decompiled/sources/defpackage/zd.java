package defpackage;

import androidx.compose.foundation.BasicTooltipKt;
import androidx.compose.foundation.BasicTooltipState;
import androidx.compose.material3.TimePickerColors;
import androidx.compose.material3.TimePickerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.window.PopupPositionProvider;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class zd implements my {
    public final /* synthetic */ int d = 0;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ int f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ ty j;

    public /* synthetic */ zd(PopupPositionProvider popupPositionProvider, BasicTooltipState basicTooltipState, un unVar, boolean z, my myVar, int i) {
        this.g = popupPositionProvider;
        this.h = basicTooltipState;
        this.i = unVar;
        this.e = z;
        this.j = myVar;
        this.f = i;
    }

    @Override // defpackage.my
    public final Object invoke(Object obj, Object obj2) {
        w01 TooltipPopup$lambda$2;
        w01 ToggleItem$lambda$50;
        switch (this.d) {
            case 0:
                int intValue = ((Integer) obj2).intValue();
                TooltipPopup$lambda$2 = BasicTooltipKt.TooltipPopup$lambda$2((PopupPositionProvider) this.g, (BasicTooltipState) this.h, (un) this.i, this.e, (my) this.j, this.f, (Composer) obj, intValue);
                return TooltipPopup$lambda$2;
            default:
                int intValue2 = ((Integer) obj2).intValue();
                ToggleItem$lambda$50 = TimePickerKt.ToggleItem$lambda$50(this.e, (Shape) this.g, (iy) this.h, (TimePickerColors) this.i, (ny) this.j, this.f, (Composer) obj, intValue2);
                return ToggleItem$lambda$50;
        }
    }

    public /* synthetic */ zd(boolean z, Shape shape, iy iyVar, TimePickerColors timePickerColors, ny nyVar, int i) {
        this.e = z;
        this.g = shape;
        this.h = iyVar;
        this.i = timePickerColors;
        this.j = nyVar;
        this.f = i;
    }
}
