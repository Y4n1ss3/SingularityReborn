package androidx.compose.material.icons.twotone;

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
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LocalLibraryKt {
    private static ImageVector _localLibrary;

    public static final ImageVector getLocalLibrary(Icons.TwoTone twoTone) {
        ImageVector imageVector = _localLibrary;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.LocalLibrary", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder h = af0.h(19.0f, 17.13f, -6.95f);
        h.curveToRelative(-2.1f, 0.38f, -4.05f, 1.35f, -5.64f, 2.83f);
        h.lineTo(12.0f, 14.28f);
        h.lineToRelative(-1.36f, -1.27f);
        h.curveTo(9.05f, 11.53f, 7.1f, 10.56f, 5.0f, 10.18f);
        h.verticalLineToRelative(6.95f);
        h.curveToRelative(2.53f, 0.34f, 4.94f, 1.3f, 7.0f, 2.83f);
        h.curveToRelative(2.07f, -1.52f, 4.47f, -2.49f, 7.0f, -2.83f);
        h.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, h.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = af0.b(12.0f, 5.0f, -2.0f, 0.0f);
        b.arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f);
        b.arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType2, "", solidColor2, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw3 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk83 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(16.0f, 5.0f);
        b2.curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f);
        b2.reflectiveCurveTo(8.0f, 2.79f, 8.0f, 5.0f);
        b2.reflectiveCurveToRelative(1.79f, 4.0f, 4.0f, 4.0f);
        b2.reflectiveCurveToRelative(4.0f, -1.79f, 4.0f, -4.0f);
        b2.close();
        b2.moveTo(10.0f, 5.0f);
        b2.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        b2.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        b2.reflectiveCurveToRelative(-0.9f, 2.0f, -2.0f, 2.0f);
        b2.reflectiveCurveToRelative(-2.0f, -0.9f, -2.0f, -2.0f);
        b2.close();
        b2.moveTo(3.0f, 19.0f);
        b2.curveToRelative(3.48f, 0.0f, 6.64f, 1.35f, 9.0f, 3.55f);
        b2.curveToRelative(2.36f, -2.19f, 5.52f, -3.55f, 9.0f, -3.55f);
        b2.lineTo(21.0f, 8.0f);
        b2.curveToRelative(-3.48f, 0.0f, -6.64f, 1.35f, -9.0f, 3.55f);
        b2.curveTo(9.64f, 9.35f, 6.48f, 8.0f, 3.0f, 8.0f);
        r6.l(b2, 11.0f, 5.0f, 10.18f);
        b2.curveToRelative(2.1f, 0.38f, 4.05f, 1.35f, 5.64f, 2.83f);
        b2.lineTo(12.0f, 14.28f);
        b2.lineToRelative(1.36f, -1.27f);
        b2.curveToRelative(1.59f, -1.48f, 3.54f, -2.45f, 5.64f, -2.83f);
        b2.verticalLineToRelative(6.95f);
        b2.curveToRelative(-2.53f, 0.34f, -4.93f, 1.3f, -7.0f, 2.82f);
        b2.curveToRelative(-2.06f, -1.52f, -4.47f, -2.49f, -7.0f, -2.83f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.c(b2, -6.94f), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw3, m5145getBevelLxFBmk83, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _localLibrary = build;
        build.getClass();
        return build;
    }
}
