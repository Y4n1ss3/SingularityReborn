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
import defpackage.af0;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SportsKt {
    private static ImageVector _sports;

    public static final ImageVector getSports(Icons.Filled filled) {
        ImageVector imageVector = _sports;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Sports", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(11.23f, 6.0f);
        b.curveTo(9.57f, 6.0f, 8.01f, 6.66f, 6.87f, 7.73f);
        b.curveTo(6.54f, 6.73f, 5.61f, 6.0f, 4.5f, 6.0f);
        b.curveTo(3.12f, 6.0f, 2.0f, 7.12f, 2.0f, 8.5f);
        b.curveTo(2.0f, 9.88f, 3.12f, 11.0f, 4.5f, 11.0f);
        b.curveToRelative(0.21f, 0.0f, 0.41f, -0.03f, 0.61f, -0.08f);
        b.curveToRelative(-0.05f, 0.25f, -0.09f, 0.51f, -0.1f, 0.78f);
        b.curveToRelative(-0.18f, 3.68f, 2.95f, 6.68f, 6.68f, 6.27f);
        b.curveToRelative(2.55f, -0.28f, 4.68f, -2.26f, 5.19f, -4.77f);
        b.curveToRelative(0.15f, -0.71f, 0.15f, -1.4f, 0.06f, -2.06f);
        b.curveToRelative(-0.09f, -0.6f, 0.38f, -1.13f, 0.99f, -1.13f);
        kp0.p(b, 22.0f, 6.0f, 11.23f);
        b.moveTo(4.5f, 9.0f);
        b.curveTo(4.22f, 9.0f, 4.0f, 8.78f, 4.0f, 8.5f);
        b.curveTo(4.0f, 8.22f, 4.22f, 8.0f, 4.5f, 8.0f);
        b.reflectiveCurveTo(5.0f, 8.22f, 5.0f, 8.5f);
        b.curveTo(5.0f, 8.78f, 4.78f, 9.0f, 4.5f, 9.0f);
        b.close();
        b.moveTo(11.0f, 15.0f);
        b.curveToRelative(-1.66f, 0.0f, -3.0f, -1.34f, -3.0f, -3.0f);
        b.reflectiveCurveToRelative(1.34f, -3.0f, 3.0f, -3.0f);
        b.reflectiveCurveToRelative(3.0f, 1.34f, 3.0f, 3.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b, 12.66f, 15.0f, 11.0f, 15.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = af0.b(11.0f, 12.0f, -2.0f, 0.0f);
        b2.arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f);
        b2.arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _sports = build;
        build.getClass();
        return build;
    }
}
