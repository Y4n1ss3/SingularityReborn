package androidx.compose.material.icons.rounded;

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
import defpackage.fc;
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LocalTaxiKt {
    private static ImageVector _localTaxi;

    public static final ImageVector getLocalTaxi(Icons.Rounded rounded) {
        ImageVector imageVector = _localTaxi;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.LocalTaxi", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(18.92f, 6.01f);
        b.curveTo(18.72f, 5.42f, 18.16f, 5.0f, 17.5f, 5.0f);
        b.lineTo(15.0f, 5.0f);
        b.lineTo(15.0f, 4.0f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        b.horizontalLineToRelative(-4.0f);
        b.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        b.verticalLineToRelative(1.0f);
        b.lineTo(6.5f, 5.0f);
        b.curveToRelative(-0.66f, 0.0f, -1.21f, 0.42f, -1.42f, 1.01f);
        b.lineToRelative(-1.97f, 5.67f);
        b.curveToRelative(-0.07f, 0.21f, -0.11f, 0.43f, -0.11f, 0.66f);
        b.verticalLineToRelative(7.16f);
        b.curveToRelative(0.0f, 0.83f, 0.67f, 1.5f, 1.5f, 1.5f);
        b.reflectiveCurveTo(6.0f, 20.33f, 6.0f, 19.5f);
        fc.w(b, 6.0f, 19.0f, 12.0f, 0.5f);
        b.curveToRelative(0.0f, 0.82f, 0.67f, 1.5f, 1.5f, 1.5f);
        b.curveToRelative(0.82f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        b.verticalLineToRelative(-7.16f);
        b.curveToRelative(0.0f, -0.22f, -0.04f, -0.45f, -0.11f, -0.66f);
        fc.B(b, -1.97f, -5.67f, 6.5f, 16.0f);
        b.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        b.reflectiveCurveTo(5.67f, 13.0f, 6.5f, 13.0f);
        b.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        b.reflectiveCurveTo(7.33f, 16.0f, 6.5f, 16.0f);
        b.close();
        b.moveTo(17.5f, 16.0f);
        b.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        b.reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f);
        b.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        b.reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f);
        k4.x(b, 5.0f, 11.0f, 1.5f, -4.5f);
        b.horizontalLineToRelative(11.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(b, 19.0f, 11.0f, 5.0f, 11.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _localTaxi = build;
        build.getClass();
        return build;
    }
}
