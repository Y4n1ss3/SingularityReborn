package androidx.compose.material.icons.automirrored.sharp;

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
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AltRouteKt {
    private static ImageVector _altRoute;

    public static final ImageVector getAltRoute(Icons.AutoMirrored.Sharp sharp) {
        ImageVector imageVector = _altRoute;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("AutoMirrored.Sharp.AltRoute", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, true, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(9.78f, 11.16f, -1.42f, 1.42f);
        e.curveToRelative(-0.68f, -0.69f, -1.34f, -1.58f, -1.79f, -2.94f);
        e.lineToRelative(1.94f, -0.49f);
        e.curveTo(8.83f, 10.04f, 9.28f, 10.65f, 9.78f, 11.16f);
        k4.r(e, 11.0f, 6.0f, 7.0f, 2.0f);
        e.lineTo(3.0f, 6.0f);
        e.horizontalLineToRelative(3.02f);
        e.curveTo(6.04f, 6.81f, 6.1f, 7.54f, 6.21f, 8.17f);
        e.lineToRelative(1.94f, -0.49f);
        e.curveTo(8.08f, 7.2f, 8.03f, 6.63f, 8.02f, 6.0f);
        k4.w(e, 11.0f, 21.0f, 6.0f);
        e.lineToRelative(-4.0f, -4.0f);
        e.lineToRelative(-4.0f, 4.0f);
        e.horizontalLineToRelative(2.99f);
        e.curveToRelative(-0.1f, 3.68f, -1.28f, 4.75f, -2.54f, 5.88f);
        e.curveToRelative(-0.5f, 0.44f, -1.01f, 0.92f, -1.45f, 1.55f);
        e.curveToRelative(-0.34f, -0.49f, -0.73f, -0.88f, -1.13f, -1.24f);
        e.lineTo(9.46f, 13.6f);
        e.curveTo(10.39f, 14.45f, 11.0f, 15.14f, 11.0f, 17.0f);
        e.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        af0.v(e, 0.0f, 5.0f, 2.0f, -5.0f);
        e.curveToRelative(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f);
        e.curveToRelative(0.0f, -2.02f, 0.71f, -2.66f, 1.79f, -3.63f);
        e.curveToRelative(1.38f, -1.24f, 3.08f, -2.78f, 3.2f, -7.37f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.h(e, 21.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _altRoute = build;
        build.getClass();
        return build;
    }
}
