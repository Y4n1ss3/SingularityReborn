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
import defpackage.k4;
import defpackage.kf0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HlsOffKt {
    private static ImageVector _hlsOff;

    public static final ImageVector getHlsOff(Icons.Rounded rounded) {
        ImageVector imageVector = _hlsOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.HlsOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(17.83f, 15.0f, 1.67f);
        a.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        a.verticalLineToRelative(-1.5f);
        a.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        k4.q(a, 17.0f, -1.0f, 2.04f, 0.0f);
        a.curveToRelative(0.1f, 0.29f, 0.38f, 0.5f, 0.71f, 0.5f);
        a.curveToRelative(0.41f, 0.0f, 0.75f, -0.34f, 0.75f, -0.75f);
        a.verticalLineTo(10.0f);
        a.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        a.horizontalLineToRelative(-3.0f);
        a.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        a.verticalLineToRelative(1.5f);
        a.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        uf.k(a, 19.0f, 1.0f, -2.04f, 0.0f);
        a.curveToRelative(-0.1f, -0.29f, -0.38f, -0.5f, -0.71f, -0.5f);
        a.curveToRelative(-0.12f, 0.0f, -0.24f, 0.03f, -0.34f, 0.08f);
        uo.l(a, 17.83f, 15.0f, 19.07f, 21.9f);
        a.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        a.reflectiveCurveToRelative(0.39f, -1.02f, 0.0f, -1.41f);
        a.lineTo(3.51f, 3.51f);
        a.curveToRelative(-0.39f, -0.39f, -1.02f, -0.39f, -1.41f, 0.0f);
        a.reflectiveCurveToRelative(-0.39f, 1.02f, 0.0f, 1.41f);
        a.lineToRelative(4.48f, 4.48f);
        a.curveTo(6.53f, 9.51f, 6.5f, 9.63f, 6.5f, 9.75f);
        uf.z(a, 11.0f, -2.0f, 9.75f);
        a.curveTo(4.5f, 9.34f, 4.16f, 9.0f, 3.75f, 9.0f);
        a.reflectiveCurveTo(3.0f, 9.34f, 3.0f, 9.75f);
        a.verticalLineToRelative(4.5f);
        a.curveTo(3.0f, 14.66f, 3.34f, 15.0f, 3.75f, 15.0f);
        a.reflectiveCurveToRelative(0.75f, -0.34f, 0.75f, -0.75f);
        kf0.r(a, 12.5f, 2.0f, 1.75f);
        a.curveTo(6.5f, 14.66f, 6.84f, 15.0f, 7.25f, 15.0f);
        a.reflectiveCurveTo(8.0f, 14.66f, 8.0f, 14.25f);
        k4.z(a, -3.42f, 2.0f, 2.0f, 14.0f);
        a.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.d(a, 1.17f, 19.07f, 21.9f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hlsOff = build;
        build.getClass();
        return build;
    }
}
