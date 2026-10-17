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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ThumbDownOffAltKt {
    private static ImageVector _thumbDownOffAlt;

    public static final ImageVector getThumbDownOffAlt(Icons.Rounded rounded) {
        ImageVector imageVector = _thumbDownOffAlt;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ThumbDownOffAlt", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(14.99f, 3.0f, 6.0f);
        d.curveTo(5.2f, 3.0f, 4.48f, 3.48f, 4.17f, 4.21f);
        d.lineToRelative(-3.26f, 7.61f);
        d.curveTo(0.06f, 13.8f, 1.51f, 16.0f, 3.66f, 16.0f);
        d.horizontalLineToRelative(5.65f);
        d.lineToRelative(-0.95f, 4.58f);
        d.curveToRelative(-0.1f, 0.5f, 0.05f, 1.01f, 0.41f, 1.37f);
        d.curveToRelative(0.29f, 0.29f, 0.67f, 0.43f, 1.05f, 0.43f);
        d.curveToRelative(0.38f, 0.0f, 0.77f, -0.15f, 1.06f, -0.44f);
        d.lineToRelative(5.53f, -5.54f);
        d.curveToRelative(0.37f, -0.37f, 0.58f, -0.88f, 0.58f, -1.41f);
        d.verticalLineTo(5.0f);
        d.curveTo(16.99f, 3.9f, 16.09f, 3.0f, 14.99f, 3.0f);
        k4.x(d, 10.66f, 19.33f, 0.61f, -2.92f);
        d.lineToRelative(0.5f, -2.41f);
        d.horizontalLineTo(9.31f);
        d.horizontalLineTo(3.66f);
        d.curveToRelative(-0.47f, 0.0f, -0.72f, -0.28f, -0.83f, -0.45f);
        d.curveToRelative(-0.11f, -0.17f, -0.27f, -0.51f, -0.08f, -0.95f);
        d.lineTo(6.0f, 5.0f);
        d.horizontalLineToRelative(8.99f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(d, 0.0f, 9.99f, 10.66f, 19.33f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(21.0f, 3.0f);
        b.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        b.verticalLineToRelative(8.0f);
        b.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        b.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        b.verticalLineTo(5.0f);
        b.curveTo(23.0f, 3.9f, 22.1f, 3.0f, 21.0f, 3.0f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _thumbDownOffAlt = build;
        build.getClass();
        return build;
    }
}
