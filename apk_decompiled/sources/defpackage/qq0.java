package defpackage;

import androidx.compose.material3.RangeSliderState;
import androidx.compose.material3.SliderKt;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class qq0 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ ui e;
    public final /* synthetic */ RangeSliderState f;

    public /* synthetic */ qq0(ui uiVar, RangeSliderState rangeSliderState, int i) {
        this.d = i;
        this.e = uiVar;
        this.f = rangeSliderState;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        boolean rangeSliderEndThumbSemantics$lambda$58$lambda$57;
        int i = this.d;
        RangeSliderState rangeSliderState = this.f;
        ui uiVar = this.e;
        float floatValue = ((Float) obj).floatValue();
        switch (i) {
            case 0:
                rangeSliderEndThumbSemantics$lambda$58$lambda$57 = SliderKt.rangeSliderEndThumbSemantics$lambda$58$lambda$57(uiVar, rangeSliderState, floatValue);
                break;
            default:
                rangeSliderEndThumbSemantics$lambda$58$lambda$57 = SliderKt.rangeSliderStartThumbSemantics$lambda$55$lambda$54(uiVar, rangeSliderState, floatValue);
                break;
        }
        return Boolean.valueOf(rangeSliderEndThumbSemantics$lambda$58$lambda$57);
    }
}
