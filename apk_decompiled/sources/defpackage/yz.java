package defpackage;

import androidx.compose.foundation.shape.CornerBasedShape;
import androidx.compose.material3.HorizontalCenterOpticallyKt;
import androidx.compose.material3.ShapeWithHorizontalCenterOptically;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.layout.Measurable;
import androidx.compose.ui.layout.MeasureResult;
import androidx.compose.ui.layout.MeasureScope;
import androidx.compose.ui.unit.Constraints;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final /* synthetic */ class yz implements ny {
    public final /* synthetic */ int d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;
    public final /* synthetic */ Shape g;

    public /* synthetic */ yz(float f, float f2, Shape shape, int i) {
        this.d = i;
        this.e = f;
        this.f = f2;
        this.g = shape;
    }

    @Override // defpackage.ny
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MeasureResult horizontalCenterOptically_4j6BHR0$lambda$1;
        MeasureResult horizontalCenterOptically_4j6BHR0$lambda$3;
        switch (this.d) {
            case 0:
                horizontalCenterOptically_4j6BHR0$lambda$1 = HorizontalCenterOpticallyKt.horizontalCenterOptically_4j6BHR0$lambda$1(this.e, this.f, (CornerBasedShape) this.g, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
                return horizontalCenterOptically_4j6BHR0$lambda$1;
            default:
                horizontalCenterOptically_4j6BHR0$lambda$3 = HorizontalCenterOpticallyKt.horizontalCenterOptically_4j6BHR0$lambda$3(this.e, this.f, (ShapeWithHorizontalCenterOptically) this.g, (MeasureScope) obj, (Measurable) obj2, (Constraints) obj3);
                return horizontalCenterOptically_4j6BHR0$lambda$3;
        }
    }
}
