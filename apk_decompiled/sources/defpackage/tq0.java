package defpackage;

import androidx.compose.material3.SliderKt;
import androidx.compose.material3.SliderState;
import androidx.compose.ui.unit.IntSize;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class tq0 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ SliderState e;

    public /* synthetic */ tq0(SliderState sliderState, int i) {
        this.d = i;
        this.e = sliderState;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        w01 SliderImpl$lambda$29$lambda$26$lambda$25;
        boolean sliderSemantics$lambda$52$lambda$51;
        int i = this.d;
        SliderState sliderState = this.e;
        switch (i) {
            case 0:
                SliderImpl$lambda$29$lambda$26$lambda$25 = SliderKt.SliderImpl$lambda$29$lambda$26$lambda$25(sliderState, (IntSize) obj);
                return SliderImpl$lambda$29$lambda$26$lambda$25;
            default:
                sliderSemantics$lambda$52$lambda$51 = SliderKt.sliderSemantics$lambda$52$lambda$51(sliderState, ((Float) obj).floatValue());
                return Boolean.valueOf(sliderSemantics$lambda$52$lambda$51);
        }
    }
}
