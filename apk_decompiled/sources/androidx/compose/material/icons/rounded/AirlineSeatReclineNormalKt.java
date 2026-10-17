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
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AirlineSeatReclineNormalKt {
    private static ImageVector _airlineSeatReclineNormal;

    public static final ImageVector getAirlineSeatReclineNormal(Icons.Rounded rounded) {
        ImageVector imageVector = _airlineSeatReclineNormal;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.AirlineSeatReclineNormal", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(7.59f, 5.41f);
        b.curveToRelative(-0.78f, -0.78f, -0.78f, -2.05f, 0.0f, -2.83f);
        b.reflectiveCurveToRelative(2.05f, -0.78f, 2.83f, 0.0f);
        b.reflectiveCurveToRelative(0.78f, 2.05f, 0.0f, 2.83f);
        b.curveToRelative(-0.79f, 0.79f, -2.05f, 0.79f, -2.83f, 0.0f);
        k4.r(b, 6.0f, 16.0f, 6.0f, 8.0f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        b.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        b.verticalLineToRelative(8.0f);
        b.curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f);
        b.horizontalLineToRelative(5.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        b.reflectiveCurveToRelative(-0.45f, -1.0f, -1.0f, -1.0f);
        b.lineTo(9.0f, 19.0f);
        b.curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f);
        k4.x(b, 19.28f, 19.35f, -3.77f, -3.77f);
        b.curveToRelative(-0.37f, -0.37f, -0.88f, -0.58f, -1.41f, -0.58f);
        b.horizontalLineToRelative(-2.6f);
        b.verticalLineToRelative(-3.68f);
        b.curveToRelative(1.09f, 0.89f, 2.66f, 1.7f, 4.2f, 2.02f);
        b.curveToRelative(0.67f, 0.14f, 1.3f, -0.36f, 1.3f, -1.04f);
        b.curveToRelative(0.0f, -0.53f, -0.39f, -0.96f, -0.92f, -1.05f);
        b.curveToRelative(-1.42f, -0.24f, -2.88f, -1.01f, -3.75f, -1.97f);
        b.lineToRelative(-1.4f, -1.55f);
        b.curveToRelative(-0.19f, -0.21f, -0.43f, -0.38f, -0.69f, -0.5f);
        b.curveToRelative(-0.29f, -0.14f, -0.62f, -0.23f, -0.96f, -0.23f);
        b.horizontalLineToRelative(-0.03f);
        b.curveTo(8.01f, 7.0f, 7.0f, 8.01f, 7.0f, 9.25f);
        b.lineTo(7.0f, 15.0f);
        b.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        b.horizontalLineToRelative(5.07f);
        b.lineToRelative(2.78f, 2.78f);
        b.curveToRelative(0.39f, 0.39f, 1.04f, 0.39f, 1.43f, 0.0f);
        b.curveToRelative(0.4f, -0.39f, 0.4f, -1.03f, 0.0f, -1.43f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _airlineSeatReclineNormal = build;
        build.getClass();
        return build;
    }
}
