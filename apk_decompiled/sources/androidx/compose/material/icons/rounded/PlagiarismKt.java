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
import defpackage.c21;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PlagiarismKt {
    private static ImageVector _plagiarism;

    public static final ImageVector getPlagiarism(Icons.Rounded rounded) {
        ImageVector imageVector = _plagiarism;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Plagiarism", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(19.41f, 7.41f, -4.83f, -4.83f);
        e.curveTo(14.21f, 2.21f, 13.7f, 2.0f, 13.17f, 2.0f);
        e.horizontalLineTo(6.0f);
        e.curveTo(4.9f, 2.0f, 4.0f, 2.9f, 4.0f, 4.0f);
        e.verticalLineToRelative(16.0f);
        e.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        e.horizontalLineToRelative(12.0f);
        e.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        e.verticalLineTo(8.83f);
        e.curveTo(20.0f, 8.3f, 19.79f, 7.79f, 19.41f, 7.41f);
        k4.r(e, 15.74f, 18.74f, 15.74f, 18.74f);
        e.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        e.lineToRelative(-1.18f, -1.18f);
        e.curveToRelative(-1.33f, 0.71f, -3.01f, 0.53f, -4.13f, -0.59f);
        e.curveToRelative(-1.52f, -1.52f, -1.35f, -4.08f, 0.5f, -5.37f);
        e.curveToRelative(1.16f, -0.81f, 2.78f, -0.81f, 3.95f, 0.0f);
        e.curveToRelative(1.55f, 1.08f, 1.9f, 3.04f, 1.09f, 4.55f);
        e.lineToRelative(1.18f, 1.18f);
        e.curveTo(16.13f, 17.72f, 16.13f, 18.35f, 15.74f, 18.74f);
        e.close();
        e.moveTo(14.0f, 9.0f);
        e.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, c21.b(e, 3.5f, 18.5f, 9.0f, 14.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = af0.b(11.5f, 14.5f, -1.5f, 0.0f);
        b.arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f);
        b.arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _plagiarism = build;
        build.getClass();
        return build;
    }
}
