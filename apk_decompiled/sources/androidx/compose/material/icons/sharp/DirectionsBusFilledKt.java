package androidx.compose.material.icons.sharp;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.c21;
import defpackage.k4;
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DirectionsBusFilledKt {
    private static ImageVector _directionsBusFilled;

    public static final ImageVector getDirectionsBusFilled(Icons.Sharp sharp) {
        ImageVector imageVector = _directionsBusFilled;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.DirectionsBusFilled", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 2.0f);
        b.curveTo(8.0f, 2.0f, 4.0f, 2.5f, 4.0f, 6.0f);
        b.verticalLineToRelative(9.5f);
        b.curveToRelative(0.0f, 0.95f, 0.38f, 1.81f, 1.0f, 2.44f);
        uf.p(b, 21.0f, 3.0f, -2.0f, 8.0f);
        kf0.z(b, 2.0f, 3.0f, -3.06f);
        b.curveToRelative(0.62f, -0.63f, 1.0f, -1.49f, 1.0f, -2.44f);
        b.verticalLineTo(6.0f);
        b.curveTo(20.0f, 2.5f, 16.42f, 2.0f, 12.0f, 2.0f);
        b.close();
        b.moveTo(8.5f, 16.0f);
        b.curveTo(7.67f, 16.0f, 7.0f, 15.33f, 7.0f, 14.5f);
        b.reflectiveCurveTo(7.67f, 13.0f, 8.5f, 13.0f);
        b.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        b.reflectiveCurveTo(9.33f, 16.0f, 8.5f, 16.0f);
        b.close();
        b.moveTo(15.5f, 16.0f);
        b.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        b.reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f);
        b.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        b.reflectiveCurveTo(16.33f, 16.0f, 15.5f, 16.0f);
        c21.d(b, 18.0f, 10.0f, 6.0f, 7.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(b, 12.0f, 10.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _directionsBusFilled = build;
        build.getClass();
        return build;
    }
}
