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

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class GppBadKt {
    private static ImageVector _gppBad;

    public static final ImageVector getGppBad(Icons.Rounded rounded) {
        ImageVector imageVector = _gppBad;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.GppBad", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(18.7f, 4.51f, -6.0f, -2.25f);
        e.curveToRelative(-0.45f, -0.17f, -0.95f, -0.17f, -1.4f, 0.0f);
        e.lineToRelative(-6.0f, 2.25f);
        e.curveTo(4.52f, 4.81f, 4.0f, 5.55f, 4.0f, 6.39f);
        e.verticalLineToRelative(4.7f);
        e.curveToRelative(0.0f, 4.94f, 3.27f, 9.57f, 7.71f, 10.83f);
        e.curveToRelative(0.19f, 0.05f, 0.39f, 0.05f, 0.57f, 0.0f);
        e.curveTo(16.73f, 20.66f, 20.0f, 16.03f, 20.0f, 11.09f);
        e.verticalLineToRelative(-4.7f);
        e.curveTo(20.0f, 5.55f, 19.48f, 4.81f, 18.7f, 4.51f);
        k4.r(e, 14.8f, 14.79f, 14.8f, 14.79f);
        e.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.01f);
        e.lineTo(12.0f, 13.42f);
        e.lineToRelative(-1.39f, 1.38f);
        e.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        e.lineToRelative(0.0f, 0.0f);
        e.curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        e.lineTo(10.59f, 12.0f);
        e.lineTo(9.2f, 10.61f);
        e.curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        e.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        e.lineTo(12.0f, 10.59f);
        e.lineToRelative(1.39f, -1.39f);
        e.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        e.lineToRelative(0.0f, 0.0f);
        e.curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f);
        e.lineTo(13.42f, 12.0f);
        e.lineToRelative(1.38f, 1.38f);
        e.curveTo(15.19f, 13.77f, 15.19f, 14.4f, 14.8f, 14.79f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _gppBad = build;
        build.getClass();
        return build;
    }
}
