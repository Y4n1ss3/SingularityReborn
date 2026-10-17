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
import defpackage.af0;
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FloodKt {
    private static ImageVector _flood;

    public static final ImageVector getFlood(Icons.Outlined outlined) {
        ImageVector imageVector = _flood;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Flood", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(18.67f, 19.0f);
        b.curveToRelative(-1.95f, 0.0f, -2.09f, 1.0f, -3.33f, 1.0f);
        b.curveToRelative(-1.19f, 0.0f, -1.42f, -1.0f, -3.33f, -1.0f);
        b.curveToRelative(-1.95f, 0.0f, -2.1f, 1.0f, -3.34f, 1.0f);
        b.curveToRelative(-1.24f, 0.0f, -1.38f, -1.0f, -3.33f, -1.0f);
        b.curveToRelative(-1.95f, 0.0f, -2.1f, 1.0f, -3.34f, 1.0f);
        b.verticalLineToRelative(2.0f);
        b.curveToRelative(1.95f, 0.0f, 2.11f, -1.0f, 3.34f, -1.0f);
        b.curveToRelative(1.24f, 0.0f, 1.38f, 1.0f, 3.33f, 1.0f);
        b.curveToRelative(1.95f, 0.0f, 2.1f, -1.0f, 3.34f, -1.0f);
        b.curveToRelative(1.22f, 0.0f, 1.4f, 1.0f, 3.33f, 1.0f);
        b.curveToRelative(1.93f, 0.0f, 2.1f, -1.0f, 3.33f, -1.0f);
        b.curveToRelative(1.22f, 0.0f, 1.4f, 1.0f, 3.33f, 1.0f);
        b.verticalLineToRelative(-2.0f);
        b.curveTo(20.76f, 20.0f, 20.62f, 19.0f, 18.67f, 19.0f);
        b.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(8.68f, 17.5f);
        b2.curveToRelative(1.95f, 0.0f, 2.09f, -1.0f, 3.33f, -1.0f);
        b2.curveToRelative(1.19f, 0.0f, 1.42f, 1.0f, 3.33f, 1.0f);
        b2.curveToRelative(1.95f, 0.0f, 2.09f, -1.0f, 3.33f, -1.0f);
        b2.curveToRelative(1.19f, 0.0f, 1.4f, 0.98f, 3.31f, 1.0f);
        b2.verticalLineToRelative(-2.0f);
        b2.curveToRelative(-0.63f, 0.0f, -1.0f, -0.28f, -1.48f, -0.55f);
        b2.lineToRelative(-2.02f, -7.53f);
        b2.lineToRelative(2.09f, 0.85f);
        b2.lineToRelative(0.74f, -1.86f);
        b2.lineTo(9.78f, 2.0f);
        b2.lineTo(2.0f, 11.61f);
        b2.lineToRelative(1.57f, 1.23f);
        b2.lineToRelative(1.39f, -1.78f);
        b2.lineToRelative(0.93f, 3.48f);
        b2.curveToRelative(-0.18f, -0.02f, -0.35f, -0.05f, -0.56f, -0.05f);
        b2.curveToRelative(-1.95f, 0.0f, -2.09f, 1.0f, -3.33f, 1.0f);
        b2.verticalLineToRelative(2.0f);
        b2.curveToRelative(1.9f, 0.0f, 2.17f, -1.0f, 3.35f, -1.0f);
        b2.curveTo(6.54f, 16.5f, 6.77f, 17.5f, 8.68f, 17.5f);
        k4.x(b2, 10.42f, 4.41f, 5.74f, 2.09f);
        b2.lineToRelative(2.15f, 8.02f);
        b2.curveToRelative(-1.54f, 0.11f, -1.82f, 0.89f, -2.85f, 0.96f);
        b2.lineToRelative(-1.42f, -5.31f);
        b2.lineToRelative(-3.86f, 1.04f);
        b2.lineToRelative(0.91f, 3.39f);
        b2.curveToRelative(-1.12f, 0.25f, -1.41f, 0.9f, -2.42f, 0.9f);
        b2.curveToRelative(-0.18f, 0.0f, -0.33f, -0.02f, -0.45f, -0.05f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(b2, 6.5f, 9.09f, 10.42f, 4.41f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _flood = build;
        build.getClass();
        return build;
    }
}
