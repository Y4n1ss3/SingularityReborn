package androidx.compose.material.icons.automirrored.rounded;

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

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AltRouteKt {
    private static ImageVector _altRoute;

    public static final ImageVector getAltRoute(Icons.AutoMirrored.Rounded rounded) {
        ImageVector imageVector = _altRoute;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Rounded.AltRoute", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(9.78f, 11.16f, -1.42f, 1.42f);
        e.curveToRelative(-0.68f, -0.69f, -1.34f, -1.58f, -1.79f, -2.94f);
        e.lineToRelative(1.94f, -0.49f);
        e.curveTo(8.83f, 10.04f, 9.28f, 10.65f, 9.78f, 11.16f);
        k4.r(e, 10.15f, 5.15f, 7.35f, 2.35f);
        e.curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0.0f);
        e.lineTo(3.85f, 5.15f);
        e.curveTo(3.54f, 5.46f, 3.76f, 6.0f, 4.21f, 6.0f);
        e.horizontalLineToRelative(1.81f);
        e.curveTo(6.04f, 6.81f, 6.1f, 7.54f, 6.21f, 8.17f);
        e.lineToRelative(1.94f, -0.49f);
        e.curveTo(8.08f, 7.2f, 8.03f, 6.63f, 8.02f, 6.0f);
        e.horizontalLineToRelative(1.78f);
        e.curveTo(10.24f, 6.0f, 10.46f, 5.46f, 10.15f, 5.15f);
        k4.x(e, 20.15f, 5.15f, -2.79f, -2.79f);
        e.curveToRelative(-0.2f, -0.2f, -0.51f, -0.2f, -0.71f, 0.0f);
        e.lineToRelative(-2.79f, 2.79f);
        e.curveTo(13.54f, 5.46f, 13.76f, 6.0f, 14.21f, 6.0f);
        e.horizontalLineToRelative(1.78f);
        e.curveToRelative(-0.1f, 3.68f, -1.28f, 4.75f, -2.54f, 5.88f);
        e.curveToRelative(-0.5f, 0.44f, -1.01f, 0.92f, -1.45f, 1.55f);
        e.curveToRelative(-0.34f, -0.49f, -0.73f, -0.88f, -1.13f, -1.24f);
        e.lineTo(9.46f, 13.6f);
        e.curveTo(10.39f, 14.45f, 11.0f, 15.14f, 11.0f, 17.0f);
        e.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        e.horizontalLineToRelative(0.0f);
        e.verticalLineToRelative(4.0f);
        e.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        e.horizontalLineToRelative(0.0f);
        e.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        e.verticalLineToRelative(-4.0f);
        e.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        e.curveToRelative(0.0f, -2.02f, 0.71f, -2.66f, 1.79f, -3.63f);
        e.curveToRelative(1.38f, -1.24f, 3.08f, -2.78f, 3.2f, -7.37f);
        e.horizontalLineToRelative(1.8f);
        e.curveTo(20.24f, 6.0f, 20.46f, 5.46f, 20.15f, 5.15f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _altRoute = build;
        build.getClass();
        return build;
    }
}
