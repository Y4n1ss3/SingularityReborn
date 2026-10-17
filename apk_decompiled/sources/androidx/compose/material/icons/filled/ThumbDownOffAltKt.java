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
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ThumbDownOffAltKt {
    private static ImageVector _thumbDownOffAlt;

    public static final ImageVector getThumbDownOffAlt(Icons.Filled filled) {
        ImageVector imageVector = _thumbDownOffAlt;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.ThumbDownOffAlt", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(10.89f, 18.28f, 0.57f, -2.89f);
        e.curveToRelative(0.12f, -0.59f, -0.04f, -1.2f, -0.42f, -1.66f);
        e.curveToRelative(-0.38f, -0.46f, -0.94f, -0.73f, -1.54f, -0.73f);
        e.lineTo(4.0f, 13.0f);
        uo.k(e, -1.08f, 6.57f, 6.0f, 8.09f);
        e.curveToRelative(0.18f, 0.0f, 0.34f, 0.16f, 0.34f, 0.34f);
        e.verticalLineToRelative(7.84f);
        e.lineToRelative(-4.11f, 4.1f);
        e.moveTo(10.0f, 22.0f);
        e.lineToRelative(6.41f, -6.41f);
        e.curveToRelative(0.38f, -0.38f, 0.59f, -0.89f, 0.59f, -1.42f);
        e.lineTo(17.0f, 6.34f);
        e.curveTo(17.0f, 5.05f, 15.95f, 4.0f, 14.66f, 4.0f);
        e.horizontalLineToRelative(-8.1f);
        e.curveToRelative(-0.71f, 0.0f, -1.36f, 0.37f, -1.72f, 0.97f);
        e.lineToRelative(-2.67f, 6.15f);
        e.curveToRelative(-0.11f, 0.25f, -0.17f, 0.52f, -0.17f, 0.8f);
        e.lineTo(2.0f, 13.0f);
        e.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        e.horizontalLineToRelative(5.5f);
        e.lineToRelative(-0.92f, 4.65f);
        e.curveToRelative(-0.05f, 0.22f, -0.02f, 0.46f, 0.08f, 0.66f);
        e.curveToRelative(0.23f, 0.45f, 0.52f, 0.86f, 0.88f, 1.22f);
        uo.l(e, 10.0f, 22.0f, 20.0f, 15.0f);
        uo.n(e, 2.0f, 22.0f, 4.0f, -2.0f);
        e.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        e.verticalLineToRelative(9.0f);
        e.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _thumbDownOffAlt = build;
        build.getClass();
        return build;
    }
}
