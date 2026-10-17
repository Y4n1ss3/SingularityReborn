package defpackage;

import androidx.compose.material3.RangeSliderState;
import androidx.compose.material3.SliderKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class vq0 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ RangeSliderState f;
    public final /* synthetic */ ti g;

    public /* synthetic */ vq0(boolean z, RangeSliderState rangeSliderState, ti tiVar, int i) {
        this.d = i;
        this.e = z;
        this.f = rangeSliderState;
        this.g = tiVar;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 rangeSliderEndThumbSemantics$lambda$58;
        w01 rangeSliderStartThumbSemantics$lambda$55;
        int i = this.d;
        ti tiVar = this.g;
        RangeSliderState rangeSliderState = this.f;
        boolean z = this.e;
        SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
        switch (i) {
            case 0:
                rangeSliderEndThumbSemantics$lambda$58 = SliderKt.rangeSliderEndThumbSemantics$lambda$58(z, rangeSliderState, tiVar, semanticsPropertyReceiver);
                return rangeSliderEndThumbSemantics$lambda$58;
            default:
                rangeSliderStartThumbSemantics$lambda$55 = SliderKt.rangeSliderStartThumbSemantics$lambda$55(z, rangeSliderState, tiVar, semanticsPropertyReceiver);
                return rangeSliderStartThumbSemantics$lambda$55;
        }
    }
}
