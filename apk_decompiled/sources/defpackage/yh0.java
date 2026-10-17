package defpackage;

import androidx.compose.material3.RangeSliderState;
import androidx.compose.material3.SliderKt;
import androidx.compose.ui.unit.IntSize;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class yh0 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ RangeSliderState e;

    public /* synthetic */ yh0(RangeSliderState rangeSliderState, int i) {
        this.d = i;
        this.e = rangeSliderState;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 gestureEndAction$lambda$0;
        w01 RangeSliderImpl$lambda$44$lambda$34$lambda$33;
        w01 RangeSliderImpl$lambda$44$lambda$39$lambda$38;
        int i = this.d;
        RangeSliderState rangeSliderState = this.e;
        switch (i) {
            case 0:
                gestureEndAction$lambda$0 = RangeSliderState.gestureEndAction$lambda$0(rangeSliderState, ((Boolean) obj).booleanValue());
                return gestureEndAction$lambda$0;
            case 1:
                RangeSliderImpl$lambda$44$lambda$34$lambda$33 = SliderKt.RangeSliderImpl$lambda$44$lambda$34$lambda$33(rangeSliderState, (IntSize) obj);
                return RangeSliderImpl$lambda$44$lambda$34$lambda$33;
            default:
                RangeSliderImpl$lambda$44$lambda$39$lambda$38 = SliderKt.RangeSliderImpl$lambda$44$lambda$39$lambda$38(rangeSliderState, (IntSize) obj);
                return RangeSliderImpl$lambda$44$lambda$39$lambda$38;
        }
    }
}
