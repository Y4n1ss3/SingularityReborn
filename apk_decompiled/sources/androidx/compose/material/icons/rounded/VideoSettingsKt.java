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
import defpackage.bv;
import defpackage.k4;
import defpackage.kf0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VideoSettingsKt {
    private static ImageVector _videoSettings;

    public static final ImageVector getVideoSettings(Icons.Rounded rounded) {
        ImageVector imageVector = _videoSettings;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.VideoSettings", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(4.0f, 6.0f, 16.0f);
        a.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        bv.x(a, 4.0f, 2.0f, 6.0f);
        a.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        a.horizontalLineTo(3.0f);
        a.curveTo(1.9f, 4.0f, 1.0f, 4.9f, 1.0f, 6.0f);
        a.verticalLineToRelative(12.0f);
        a.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        k4.k(a, 9.0f, -2.0f, 4.0f);
        a.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        a.verticalLineTo(7.0f);
        a.curveTo(3.0f, 6.45f, 3.45f, 6.0f, 4.0f, 6.0f);
        a.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, a.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.g(k4.e(15.0f, 12.0f, -6.0f, -4.0f), 0.0f, 8.0f), VectorKt.getDefaultFillType(), "", new SolidColor(companion.m4787getBlack0d7_KjU(), null), 1.0f, null, 1.0f, 1.0f, companion2.m5135getButtKaPHkGw(), companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(22.71f, 18.43f);
        b.curveToRelative(0.03f, -0.29f, 0.04f, -0.58f, 0.01f, -0.86f);
        b.lineToRelative(1.07f, -0.85f);
        b.curveToRelative(0.1f, -0.08f, 0.12f, -0.21f, 0.06f, -0.32f);
        b.lineToRelative(-1.03f, -1.79f);
        b.curveToRelative(-0.06f, -0.11f, -0.19f, -0.15f, -0.31f, -0.11f);
        b.lineTo(21.23f, 15.0f);
        b.curveToRelative(-0.23f, -0.17f, -0.48f, -0.31f, -0.75f, -0.42f);
        b.lineToRelative(-0.2f, -1.36f);
        b.curveTo(20.26f, 13.09f, 20.16f, 13.0f, 20.03f, 13.0f);
        b.horizontalLineToRelative(-2.07f);
        b.curveToRelative(-0.12f, 0.0f, -0.23f, 0.09f, -0.25f, 0.21f);
        b.lineToRelative(-0.2f, 1.36f);
        b.curveToRelative(-0.26f, 0.11f, -0.51f, 0.26f, -0.74f, 0.42f);
        b.lineToRelative(-1.28f, -0.5f);
        b.curveToRelative(-0.12f, -0.05f, -0.25f, 0.0f, -0.31f, 0.11f);
        b.lineToRelative(-1.03f, 1.79f);
        b.curveToRelative(-0.06f, 0.11f, -0.04f, 0.24f, 0.06f, 0.32f);
        b.lineToRelative(1.07f, 0.86f);
        b.curveToRelative(-0.03f, 0.29f, -0.04f, 0.58f, -0.01f, 0.86f);
        b.lineToRelative(-1.07f, 0.85f);
        b.curveToRelative(-0.1f, 0.08f, -0.12f, 0.21f, -0.06f, 0.32f);
        b.lineToRelative(1.03f, 1.79f);
        b.curveToRelative(0.06f, 0.11f, 0.19f, 0.15f, 0.31f, 0.11f);
        b.lineToRelative(1.27f, -0.5f);
        b.curveToRelative(0.23f, 0.17f, 0.48f, 0.31f, 0.75f, 0.42f);
        b.lineToRelative(0.2f, 1.36f);
        b.curveToRelative(0.02f, 0.12f, 0.12f, 0.21f, 0.25f, 0.21f);
        b.horizontalLineToRelative(2.07f);
        b.curveToRelative(0.12f, 0.0f, 0.23f, -0.09f, 0.25f, -0.21f);
        b.lineToRelative(0.2f, -1.36f);
        b.curveToRelative(0.26f, -0.11f, 0.51f, -0.26f, 0.74f, -0.42f);
        b.lineToRelative(1.28f, 0.5f);
        b.curveToRelative(0.12f, 0.05f, 0.25f, 0.0f, 0.31f, -0.11f);
        b.lineToRelative(1.03f, -1.79f);
        b.curveToRelative(0.06f, -0.11f, 0.04f, -0.24f, -0.06f, -0.32f);
        uo.l(b, 22.71f, 18.43f, 19.0f, 19.5f);
        b.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        b.reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f);
        b.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(b, 19.83f, 19.5f, 19.0f, 19.5f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _videoSettings = build;
        build.getClass();
        return build;
    }
}
