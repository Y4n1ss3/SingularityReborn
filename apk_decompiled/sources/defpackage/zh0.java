package defpackage;

import androidx.compose.material3.RangeSliderState;
import androidx.compose.material3.SliderState;
import java.util.List;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class zh0 implements ky {
    public final /* synthetic */ int d;
    public final /* synthetic */ iy e;
    public final /* synthetic */ ui f;

    public /* synthetic */ zh0(iy iyVar, ui uiVar, int i) {
        this.d = i;
        this.e = iyVar;
        this.f = uiVar;
    }

    @Override // defpackage.ky
    public final Object invoke(Object obj) {
        RangeSliderState Saver$lambda$1;
        SliderState Saver$lambda$12;
        switch (this.d) {
            case 0:
                Saver$lambda$1 = RangeSliderState.Companion.Saver$lambda$1(this.e, this.f, (List) obj);
                return Saver$lambda$1;
            default:
                Saver$lambda$12 = SliderState.Companion.Saver$lambda$1(this.e, this.f, (List) obj);
                return Saver$lambda$12;
        }
    }
}
