package defpackage;

import androidx.compose.foundation.layout.RulerAlignmentKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.RectRulers;
import androidx.compose.ui.unit.Constraints;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class dk0 implements ny {
    public final /* synthetic */ int d;
    public final /* synthetic */ RectRulers e;

    public /* synthetic */ dk0(RectRulers rectRulers, int i) {
        this.d = i;
        this.e = rectRulers;
    }

    @Override // defpackage.ny
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MeasureResult fitInside$lambda$0;
        MeasureResult fitOutside$lambda$0;
        int i = this.d;
        MeasureScope measureScope = (MeasureScope) obj;
        Measurable measurable = (Measurable) obj2;
        Constraints constraints = (Constraints) obj3;
        RectRulers rectRulers = this.e;
        switch (i) {
            case 0:
                fitInside$lambda$0 = RulerAlignmentKt.fitInside$lambda$0(rectRulers, measureScope, measurable, constraints);
                return fitInside$lambda$0;
            default:
                fitOutside$lambda$0 = RulerAlignmentKt.fitOutside$lambda$0(rectRulers, measureScope, measurable, constraints);
                return fitOutside$lambda$0;
        }
    }
}
