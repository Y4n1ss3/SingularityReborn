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
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Brightness6Kt {
    private static ImageVector _brightness6;

    public static final ImageVector getBrightness6(Icons.Rounded rounded) {
        ImageVector imageVector = _brightness6;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Brightness6", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(20.0f, 15.31f, 2.6f, -2.6f);
        e.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        e.lineTo(20.0f, 8.69f);
        e.lineTo(20.0f, 5.0f);
        e.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        e.horizontalLineToRelative(-3.69f);
        e.lineToRelative(-2.6f, -2.6f);
        e.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        e.lineTo(8.69f, 4.0f);
        e.lineTo(5.0f, 4.0f);
        e.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        e.verticalLineToRelative(3.69f);
        e.lineToRelative(-2.6f, 2.6f);
        e.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        e.lineTo(4.0f, 15.3f);
        e.lineTo(4.0f, 19.0f);
        e.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        e.horizontalLineToRelative(3.69f);
        e.lineToRelative(2.6f, 2.6f);
        e.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        e.lineToRelative(2.6f, -2.6f);
        e.lineTo(19.0f, 20.0f);
        e.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        r6.l(e, -3.69f, 12.0f, 16.9f);
        e.lineTo(12.0f, 7.1f);
        e.curveToRelative(0.0f, -0.61f, 0.55f, -1.11f, 1.15f, -0.99f);
        e.curveTo(15.91f, 6.65f, 18.0f, 9.08f, 18.0f, 12.0f);
        e.reflectiveCurveToRelative(-2.09f, 5.35f, -4.85f, 5.89f);
        e.curveToRelative(-0.6f, 0.12f, -1.15f, -0.38f, -1.15f, -0.99f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _brightness6 = build;
        build.getClass();
        return build;
    }
}
