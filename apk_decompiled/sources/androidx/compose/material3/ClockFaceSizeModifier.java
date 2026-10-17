package androidx.compose.material3;

import androidx.compose.material3.tokens.TimePickerTokens;
import androidx.compose.ui.layout.LayoutModifier;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import defpackage.h7;
import defpackage.w01;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ClockFaceSizeModifier implements LayoutModifier {
    public static final int $stable = 0;

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 measure_3p2s80s$lambda$0(Placeable placeable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.place$default(placementScope, placeable, 0, 0, 0.0f, 4, null);
        return w01.a;
    }

    @Override // androidx.compose.ui.layout.LayoutModifier
    /* renamed from: measure-3p2s80s */
    public MeasureResult mo1114measure3p2s80s(MeasureScope measureScope, Measurable measurable, long j) {
        float f;
        float f2;
        float clockDialMinContainerSize;
        float mo364toDpu2uoSUM = measureScope.mo364toDpu2uoSUM(Constraints.m7563getMaxHeightimpl(j));
        f = TimePickerKt.TimePickerMaxHeight;
        if (Dp.m7610compareTo0680j_4(mo364toDpu2uoSUM, f) >= 0) {
            clockDialMinContainerSize = TimePickerTokens.INSTANCE.m3707getClockDialContainerSizeD9Ej5fM();
        } else {
            f2 = TimePickerKt.TimePickerMidHeight;
            clockDialMinContainerSize = Dp.m7610compareTo0680j_4(mo364toDpu2uoSUM, f2) >= 0 ? TimePickerKt.ClockDialMidContainerSize : TimePickerKt.getClockDialMinContainerSize();
        }
        int mo361roundToPx0680j_4 = measureScope.mo361roundToPx0680j_4(clockDialMinContainerSize);
        Placeable mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(Constraints.Companion.m7574fixedJhjzzOo(mo361roundToPx0680j_4, mo361roundToPx0680j_4));
        return MeasureScope.layout$default(measureScope, mo6234measureBRTryo0.getWidth(), mo6234measureBRTryo0.getHeight(), null, new h7(2, mo6234measureBRTryo0), 4, null);
    }
}
