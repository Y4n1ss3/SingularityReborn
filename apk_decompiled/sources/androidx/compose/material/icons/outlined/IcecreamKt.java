package androidx.compose.material.icons.outlined;

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
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class IcecreamKt {
    private static ImageVector _icecream;

    public static final ImageVector getIcecream(Icons.Outlined outlined) {
        ImageVector imageVector = _icecream;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Icecream", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(18.38f, 6.24f);
        b.curveTo(17.79f, 3.24f, 15.14f, 1.0f, 12.0f, 1.0f);
        b.reflectiveCurveTo(6.21f, 3.24f, 5.62f, 6.24f);
        b.curveTo(4.08f, 6.81f, 3.0f, 8.29f, 3.0f, 10.0f);
        b.curveToRelative(0.0f, 2.21f, 1.79f, 4.0f, 4.0f, 4.0f);
        b.curveToRelative(0.12f, 0.0f, 0.23f, -0.02f, 0.34f, -0.02f);
        b.lineTo(12.07f, 23.0f);
        b.lineToRelative(4.61f, -9.03f);
        b.curveTo(16.79f, 13.98f, 16.89f, 14.0f, 17.0f, 14.0f);
        b.curveToRelative(2.21f, 0.0f, 4.0f, -1.79f, 4.0f, -4.0f);
        b.curveTo(21.0f, 8.29f, 19.92f, 6.81f, 18.38f, 6.24f);
        k4.x(b, 12.05f, 18.63f, -2.73f, -5.21f);
        b.curveTo(10.15f, 13.79f, 11.06f, 14.0f, 12.0f, 14.0f);
        b.curveToRelative(0.95f, 0.0f, 1.88f, -0.21f, 2.72f, -0.6f);
        uo.l(b, 12.05f, 18.63f, 17.0f, 12.0f);
        b.curveToRelative(-0.52f, 0.0f, -1.01f, -0.2f, -1.39f, -0.56f);
        b.lineToRelative(-0.56f, -0.54f);
        b.lineToRelative(-0.66f, 0.42f);
        b.curveTo(13.68f, 11.76f, 12.86f, 12.0f, 12.0f, 12.0f);
        b.reflectiveCurveToRelative(-1.68f, -0.24f, -2.39f, -0.69f);
        b.lineTo(8.95f, 10.9f);
        b.lineToRelative(-0.56f, 0.54f);
        b.curveTo(8.01f, 11.79f, 7.52f, 12.0f, 7.0f, 12.0f);
        b.curveToRelative(-1.1f, 0.0f, -2.0f, -0.89f, -2.0f, -2.0f);
        b.curveToRelative(0.0f, -0.98f, 0.72f, -1.82f, 1.68f, -1.97f);
        b.lineTo(7.45f, 7.9f);
        b.lineToRelative(0.06f, -0.78f);
        b.curveTo(7.71f, 4.8f, 9.66f, 3.0f, 12.0f, 3.0f);
        b.reflectiveCurveToRelative(4.29f, 1.8f, 4.48f, 4.12f);
        b.lineToRelative(0.06f, 0.78f);
        b.lineToRelative(0.77f, 0.12f);
        b.curveTo(18.28f, 8.18f, 19.0f, 9.01f, 19.0f, 10.0f);
        b.curveTo(19.0f, 11.1f, 18.1f, 12.0f, 17.0f, 12.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _icecream = build;
        build.getClass();
        return build;
    }
}
