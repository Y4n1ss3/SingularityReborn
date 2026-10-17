package androidx.compose.material.icons.filled;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.af0;
import defpackage.bv;
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ElevatorKt {
    private static ImageVector _elevator;

    public static final ImageVector getElevator(Icons.Filled filled) {
        ImageVector imageVector = _elevator;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Elevator", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(19.0f, 3.0f, 5.0f);
        d.curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        d.verticalLineToRelative(14.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(14.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        d.verticalLineTo(5.0f);
        d.curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f);
        d.close();
        d.moveTo(8.5f, 6.0f);
        d.curveToRelative(0.69f, 0.0f, 1.25f, 0.56f, 1.25f, 1.25f);
        d.curveToRelative(0.0f, 0.69f, -0.56f, 1.25f, -1.25f, 1.25f);
        d.reflectiveCurveTo(7.25f, 7.94f, 7.25f, 7.25f);
        d.curveTo(7.25f, 6.56f, 7.81f, 6.0f, 8.5f, 6.0f);
        r6.B(d, 11.0f, 14.0f, -1.0f, 4.0f);
        af0.o(d, 7.0f, -4.0f, 6.0f, -2.5f);
        d.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        d.horizontalLineToRelative(1.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        bv.t(d, 14.0f, 15.5f, 17.0f);
        d.lineTo(13.0f, 13.0f);
        gy.n(d, 5.0f, 15.5f, 17.0f);
        d.moveTo(13.0f, 11.0f);
        d.lineToRelative(2.5f, -4.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.d(d, 2.5f, 4.0f, 13.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _elevator = build;
        build.getClass();
        return build;
    }
}
