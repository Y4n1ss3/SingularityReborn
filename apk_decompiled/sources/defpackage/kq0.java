package defpackage;

import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsConnection_androidKt;
import androidx.compose.foundation.layout.WindowInsetsSizeKt;
import androidx.compose.material3.SliderDefaults;
import androidx.compose.runtime.Composer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class kq0 implements ny {
    public final /* synthetic */ int d;

    public /* synthetic */ kq0(int i) {
        this.d = i;
    }

    @Override // defpackage.ny
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MeasureResult TrackImpl_xlyIBlM$lambda$44$lambda$43;
        Modifier imeNestedScroll$lambda$1;
        int startCalc$lambda$0;
        int endCalc$lambda$0;
        switch (this.d) {
            case 0:
                TrackImpl_xlyIBlM$lambda$44$lambda$43 = SliderDefaults.TrackImpl_xlyIBlM$lambda$44$lambda$43((MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
                return TrackImpl_xlyIBlM$lambda$44$lambda$43;
            case 1:
                imeNestedScroll$lambda$1 = WindowInsetsConnection_androidKt.imeNestedScroll$lambda$1((Modifier) obj, (Composer) obj2, ((Integer) obj3).intValue());
                return imeNestedScroll$lambda$1;
            case 2:
                startCalc$lambda$0 = WindowInsetsSizeKt.startCalc$lambda$0((WindowInsets) obj, (LayoutDirection) obj2, (Density) obj3);
                return Integer.valueOf(startCalc$lambda$0);
            default:
                endCalc$lambda$0 = WindowInsetsSizeKt.endCalc$lambda$0((WindowInsets) obj, (LayoutDirection) obj2, (Density) obj3);
                return Integer.valueOf(endCalc$lambda$0);
        }
    }
}
