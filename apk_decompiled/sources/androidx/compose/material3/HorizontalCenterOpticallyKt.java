package androidx.compose.material3;

import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.material3.HorizontalCenterOpticallyKt;
import androidx.compose.material3.ShapeWithHorizontalCenterOptically;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Size;
import androidx.compose.ui.layout.LayoutModifierKt;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.layout.Placeable;
import androidx.compose.ui.unit.Constraints;
import androidx.compose.ui.unit.Dp;
import defpackage.ef;
import defpackage.ky;
import defpackage.w01;
import defpackage.y80;
import defpackage.yz;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HorizontalCenterOpticallyKt {
    public static final float CenterOpticallyCoefficient = 0.11f;

    /* renamed from: horizontalCenterOptically-4j6BHR0, reason: not valid java name */
    public static final Modifier m2013horizontalCenterOptically4j6BHR0(Modifier modifier, CornerBasedShape cornerBasedShape, float f, float f2) {
        return LayoutModifierKt.layout(modifier, new yz(f, f2, cornerBasedShape, 0));
    }

    /* renamed from: horizontalCenterOptically-4j6BHR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m2015horizontalCenterOptically4j6BHR0$default(Modifier modifier, CornerBasedShape cornerBasedShape, float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f = Dp.m7611constructorimpl(0.0f);
        }
        if ((i & 4) != 0) {
            f2 = Dp.m7611constructorimpl(0.0f);
        }
        return m2013horizontalCenterOptically4j6BHR0(modifier, cornerBasedShape, f, f2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult horizontalCenterOptically_4j6BHR0$lambda$1(float f, float f2, CornerBasedShape cornerBasedShape, MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        Placeable mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(constraints.m7570unboximpl());
        int width = mo6234measureBRTryo0.getWidth();
        int height = mo6234measureBRTryo0.getHeight();
        long m4576constructorimpl = Size.m4576constructorimpl((Float.floatToRawIntBits(width) << 32) | (Float.floatToRawIntBits(height) & 4294967295L));
        return MeasureScope.layout$default(measureScope, width, height, null, new ef((((cornerBasedShape.getTopStart().mo1047toPxTmRCtEA(m4576constructorimpl, measureScope) + cornerBasedShape.getBottomStart().mo1047toPxTmRCtEA(m4576constructorimpl, measureScope)) / 2.0f) - ((cornerBasedShape.getTopEnd().mo1047toPxTmRCtEA(m4576constructorimpl, measureScope) + cornerBasedShape.getBottomEnd().mo1047toPxTmRCtEA(m4576constructorimpl, measureScope)) / 2.0f)) * 0.11f, -measureScope.mo367toPx0680j_4(f), measureScope.mo367toPx0680j_4(f2), mo6234measureBRTryo0), 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 horizontalCenterOptically_4j6BHR0$lambda$1$lambda$0(float f, float f2, float f3, Placeable placeable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.place$default(placementScope, placeable, y80.P(y80.g(f, f2, f3)), 0, 0.0f, 4, null);
        return w01.a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult horizontalCenterOptically_4j6BHR0$lambda$3(float f, float f2, final ShapeWithHorizontalCenterOptically shapeWithHorizontalCenterOptically, MeasureScope measureScope, Measurable measurable, Constraints constraints) {
        final Placeable mo6234measureBRTryo0 = measurable.mo6234measureBRTryo0(constraints.m7570unboximpl());
        int width = mo6234measureBRTryo0.getWidth();
        int height = mo6234measureBRTryo0.getHeight();
        final float f3 = -measureScope.mo367toPx0680j_4(f);
        final float mo367toPx0680j_4 = measureScope.mo367toPx0680j_4(f2);
        return MeasureScope.layout$default(measureScope, width, height, null, new ky() { // from class: xz
            @Override // defpackage.ky
            public final Object invoke(Object obj) {
                w01 horizontalCenterOptically_4j6BHR0$lambda$3$lambda$2;
                horizontalCenterOptically_4j6BHR0$lambda$3$lambda$2 = HorizontalCenterOpticallyKt.horizontalCenterOptically_4j6BHR0$lambda$3$lambda$2(ShapeWithHorizontalCenterOptically.this, f3, mo367toPx0680j_4, mo6234measureBRTryo0, (Placeable.PlacementScope) obj);
                return horizontalCenterOptically_4j6BHR0$lambda$3$lambda$2;
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final w01 horizontalCenterOptically_4j6BHR0$lambda$3$lambda$2(ShapeWithHorizontalCenterOptically shapeWithHorizontalCenterOptically, float f, float f2, Placeable placeable, Placeable.PlacementScope placementScope) {
        Placeable.PlacementScope.place$default(placementScope, placeable, y80.P(y80.g(shapeWithHorizontalCenterOptically.offset(), f, f2)), 0, 0.0f, 4, null);
        return w01.a;
    }

    /* renamed from: horizontalCenterOptically-4j6BHR0, reason: not valid java name */
    public static final Modifier m2014horizontalCenterOptically4j6BHR0(Modifier modifier, ShapeWithHorizontalCenterOptically shapeWithHorizontalCenterOptically, float f, float f2) {
        return LayoutModifierKt.layout(modifier, new yz(f, f2, shapeWithHorizontalCenterOptically, 1));
    }

    /* renamed from: horizontalCenterOptically-4j6BHR0$default, reason: not valid java name */
    public static /* synthetic */ Modifier m2016horizontalCenterOptically4j6BHR0$default(Modifier modifier, ShapeWithHorizontalCenterOptically shapeWithHorizontalCenterOptically, float f, float f2, int i, Object obj) {
        if ((i & 2) != 0) {
            f = Dp.m7611constructorimpl(0.0f);
        }
        if ((i & 4) != 0) {
            f2 = Dp.m7611constructorimpl(0.0f);
        }
        return m2014horizontalCenterOptically4j6BHR0(modifier, shapeWithHorizontalCenterOptically, f, f2);
    }
}
