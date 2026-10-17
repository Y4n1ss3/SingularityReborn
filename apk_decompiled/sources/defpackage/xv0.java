package defpackage;

import androidx.compose.material3.TooltipScope;
import androidx.compose.ui.layout.LayoutCoordinates;
import androidx.compose.ui.layout.MeasureScope;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class xv0 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ TooltipScope e;

    public /* synthetic */ xv0(TooltipScope tooltipScope, int i) {
        this.d = i;
        this.e = tooltipScope;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        LayoutCoordinates obtainAnchorBounds;
        LayoutCoordinates obtainAnchorBounds2;
        int i = this.d;
        TooltipScope tooltipScope = this.e;
        MeasureScope measureScope = (MeasureScope) obj;
        switch (i) {
            case 0:
                obtainAnchorBounds = tooltipScope.obtainAnchorBounds(measureScope);
                return obtainAnchorBounds;
            default:
                obtainAnchorBounds2 = tooltipScope.obtainAnchorBounds(measureScope);
                return obtainAnchorBounds2;
        }
    }
}
