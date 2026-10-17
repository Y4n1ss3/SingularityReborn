package androidx.compose.foundation.layout;

import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.layout.RectRulers;
import androidx.compose.ui.unit.Constraints;
import defpackage.ck0;
import defpackage.dk0;
import defpackage.mb0;
import defpackage.nc0;
import defpackage.w01;
import defpackage.y80;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class RulerAlignmentKt {
    public static final Modifier fitInside(Modifier modifier, RectRulers rectRulers) {
        return LayoutModifierKt.layout(modifier, new dk0(rectRulers, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult fitInside$lambda$0(RectRulers rectRulers, MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        if (Constraints.m7560getHasBoundedWidthimpl(constraints.m7570unboximpl()) && Constraints.m7559getHasBoundedHeightimpl(constraints.m7570unboximpl())) {
            int m7564getMaxWidthimpl = Constraints.m7564getMaxWidthimpl(constraints.m7570unboximpl());
            int m7563getMaxHeightimpl = Constraints.m7563getMaxHeightimpl(constraints.m7570unboximpl());
            return MeasureScope.layout$default(measureScope, m7564getMaxWidthimpl, m7563getMaxHeightimpl, null, new ck0(rectRulers, m7564getMaxWidthimpl, m7563getMaxHeightimpl, measurable, 0), 4, null);
        }
        Placeable mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(constraints.m7570unboximpl());
        int width = mo6234measureBRTryo0.getWidth();
        int height = mo6234measureBRTryo0.getHeight();
        return MeasureScope.layout$default(measureScope, width, height, null, new nc0(rectRulers, width, height, mo6234measureBRTryo0), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 fitInside$lambda$0$0(RectRulers rectRulers, int i, int i2, Measurable measurable, Placeable.PlacementScope placementScope) {
        int P = y80.P(placementScope.current(rectRulers.getLeft(), 0.0f));
        if (P < 0) {
            P = 0;
        }
        int i3 = P > i ? i : P;
        int P2 = y80.P(placementScope.current(rectRulers.getTop(), 0.0f));
        if (P2 < 0) {
            P2 = 0;
        }
        int i4 = P2 > i2 ? i2 : P2;
        int P3 = y80.P(placementScope.current(rectRulers.getRight(), i));
        if (P3 < 0) {
            P3 = 0;
        }
        if (P3 <= i) {
            i = P3;
        }
        int P4 = y80.P(placementScope.current(rectRulers.getBottom(), i2));
        int i5 = P4 >= 0 ? P4 : 0;
        if (i5 <= i2) {
            i2 = i5;
        }
        Placeable.PlacementScope.place$default(placementScope, measurable.mo6234measureBRTryo0(Constraints.Companion.m7574fixedJhjzzOo(i - i3, i2 - i4)), i3, i4, 0.0f, 4, null);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 fitInside$lambda$0$1(RectRulers rectRulers, int i, int i2, Placeable placeable, Placeable.PlacementScope placementScope) {
        int P = y80.P(placementScope.current(rectRulers.getLeft(), 0.0f));
        if (P < 0) {
            P = 0;
        }
        if (P > i) {
            P = i;
        }
        int P2 = y80.P(placementScope.current(rectRulers.getTop(), 0.0f));
        if (P2 < 0) {
            P2 = 0;
        }
        if (P2 > i2) {
            P2 = i2;
        }
        int P3 = y80.P(placementScope.current(rectRulers.getRight(), i));
        if (P3 < 0) {
            P3 = 0;
        }
        if (P3 > i) {
            P3 = i;
        }
        int P4 = y80.P(placementScope.current(rectRulers.getBottom(), i2));
        int i3 = P4 >= 0 ? P4 : 0;
        if (i3 > i2) {
            i3 = i2;
        }
        Placeable.PlacementScope.place$default(placementScope, placeable, ((P + P3) - i) / 2, ((P2 + i3) - i2) / 2, 0.0f, 4, null);
        return w01.a;
    }

    public static final Modifier fitOutside(Modifier modifier, RectRulers rectRulers) {
        return LayoutModifierKt.layout(modifier, new dk0(rectRulers, 1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult fitOutside$lambda$0(RectRulers rectRulers, MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        if (!Constraints.m7560getHasBoundedWidthimpl(constraints.m7570unboximpl()) || !Constraints.m7559getHasBoundedHeightimpl(constraints.m7570unboximpl())) {
            return MeasureScope.layout$default(measureScope, 0, 0, null, new mb0(measurable, 12), 4, null);
        }
        int m7564getMaxWidthimpl = Constraints.m7564getMaxWidthimpl(constraints.m7570unboximpl());
        int m7563getMaxHeightimpl = Constraints.m7563getMaxHeightimpl(constraints.m7570unboximpl());
        return MeasureScope.layout$default(measureScope, m7564getMaxWidthimpl, m7563getMaxHeightimpl, null, new ck0(rectRulers, m7564getMaxWidthimpl, m7563getMaxHeightimpl, measurable, 1), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 fitOutside$lambda$0$0(RectRulers rectRulers, int i, int i2, Measurable measurable, Placeable.PlacementScope placementScope) {
        int i3;
        int i4;
        int P = y80.P(placementScope.current(rectRulers.getLeft(), 0.0f));
        int P2 = y80.P(placementScope.current(rectRulers.getTop(), 0.0f));
        int P3 = y80.P(placementScope.current(rectRulers.getRight(), i));
        int P4 = y80.P(placementScope.current(rectRulers.getBottom(), i2));
        if (P > 0) {
            i = P;
        } else {
            if (P2 <= 0) {
                if (P3 < i) {
                    i -= P3;
                    i3 = P3;
                    i4 = 0;
                } else if (P4 < i2) {
                    i2 -= P4;
                    i4 = P4;
                    i3 = 0;
                } else {
                    i = 0;
                    i2 = 0;
                    i3 = 0;
                    i4 = i3;
                }
                Placeable.PlacementScope.place$default(placementScope, measurable.mo6234measureBRTryo0(Constraints.Companion.m7574fixedJhjzzOo(i, i2)), i3, i4, 0.0f, 4, null);
                return w01.a;
            }
            i2 = P2;
        }
        i3 = 0;
        i4 = i3;
        Placeable.PlacementScope.place$default(placementScope, measurable.mo6234measureBRTryo0(Constraints.Companion.m7574fixedJhjzzOo(i, i2)), i3, i4, 0.0f, 4, null);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 fitOutside$lambda$0$1(Measurable measurable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.place$default(placementScope, measurable.mo6234measureBRTryo0(Constraints.Companion.m7574fixedJhjzzOo(0, 0)), 0, 0, 0.0f, 4, null);
        return w01.a;
    }
}
