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
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class Forward5Kt {
    private static ImageVector _forward5;

    public static final ImageVector getForward5(Icons.Filled filled) {
        ImageVector imageVector = _forward5;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Forward5", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(18.0f, 13.0f);
        b.curveToRelative(0.0f, 3.31f, -2.69f, 6.0f, -6.0f, 6.0f);
        b.reflectiveCurveToRelative(-6.0f, -2.69f, -6.0f, -6.0f);
        b.reflectiveCurveToRelative(2.69f, -6.0f, 6.0f, -6.0f);
        b.verticalLineToRelative(4.0f);
        b.lineToRelative(5.0f, -5.0f);
        b.lineToRelative(-5.0f, -5.0f);
        b.verticalLineToRelative(4.0f);
        b.curveToRelative(-4.42f, 0.0f, -8.0f, 3.58f, -8.0f, 8.0f);
        b.curveToRelative(0.0f, 4.42f, 3.58f, 8.0f, 8.0f, 8.0f);
        b.curveToRelative(4.42f, 0.0f, 8.0f, -3.58f, 8.0f, -8.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.h(b, 18.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(12.03f, 15.38f);
        b2.curveToRelative(-0.44f, 0.0f, -0.58f, -0.31f, -0.6f, -0.56f);
        b2.horizontalLineToRelative(-0.84f);
        b2.curveToRelative(0.03f, 0.85f, 0.79f, 1.25f, 1.44f, 1.25f);
        b2.curveToRelative(0.93f, 0.0f, 1.44f, -0.63f, 1.44f, -1.43f);
        b2.curveToRelative(0.0f, -1.33f, -0.97f, -1.44f, -1.3f, -1.44f);
        b2.curveToRelative(-0.2f, 0.0f, -0.43f, 0.05f, -0.64f, 0.16f);
        r6.q(b2, 0.11f, -0.92f, 1.7f, -0.71f);
        b2.horizontalLineToRelative(-2.39f);
        b2.lineToRelative(-0.25f, 2.17f);
        b2.lineToRelative(0.67f, 0.17f);
        b2.curveToRelative(0.13f, -0.13f, 0.28f, -0.23f, 0.57f, -0.23f);
        b2.curveToRelative(0.4f, 0.0f, 0.69f, 0.23f, 0.69f, 0.75f);
        b2.curveTo(12.62f, 14.64f, 12.65f, 15.38f, 12.03f, 15.38f);
        b2.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _forward5 = build;
        build.getClass();
        return build;
    }
}
