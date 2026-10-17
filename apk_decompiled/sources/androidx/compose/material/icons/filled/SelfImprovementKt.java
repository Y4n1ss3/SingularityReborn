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

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SelfImprovementKt {
    private static ImageVector _selfImprovement;

    public static final ImageVector getSelfImprovement(Icons.Filled filled) {
        ImageVector imageVector = _selfImprovement;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.SelfImprovement", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = af0.b(12.0f, 6.0f, -2.0f, 0.0f);
        b.arcToRelative(2.0f, 2.0f, 0.0f, true, true, 4.0f, 0.0f);
        b.arcToRelative(2.0f, 2.0f, 0.0f, true, true, -4.0f, 0.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder h = af0.h(21.0f, 16.0f, -2.0f);
        h.curveToRelative(-2.24f, 0.0f, -4.16f, -0.96f, -5.6f, -2.68f);
        h.lineToRelative(-1.34f, -1.6f);
        h.curveTo(13.68f, 9.26f, 13.12f, 9.0f, 12.53f, 9.0f);
        h.horizontalLineToRelative(-1.05f);
        h.curveToRelative(-0.59f, 0.0f, -1.15f, 0.26f, -1.53f, 0.72f);
        h.lineToRelative(-1.34f, 1.6f);
        h.curveTo(7.16f, 13.04f, 5.24f, 14.0f, 3.0f, 14.0f);
        h.verticalLineToRelative(2.0f);
        h.curveToRelative(2.77f, 0.0f, 5.19f, -1.17f, 7.0f, -3.25f);
        h.verticalLineTo(15.0f);
        h.lineToRelative(-3.88f, 1.55f);
        h.curveTo(5.45f, 16.82f, 5.0f, 17.48f, 5.0f, 18.21f);
        h.curveTo(5.0f, 19.2f, 5.8f, 20.0f, 6.79f, 20.0f);
        h.horizontalLineTo(9.0f);
        h.verticalLineToRelative(-0.5f);
        h.curveToRelative(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f);
        h.horizontalLineToRelative(3.0f);
        h.curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        h.reflectiveCurveTo(14.78f, 18.0f, 14.5f, 18.0f);
        h.horizontalLineToRelative(-3.0f);
        h.curveToRelative(-0.83f, 0.0f, -1.5f, 0.67f, -1.5f, 1.5f);
        h.verticalLineTo(20.0f);
        h.horizontalLineToRelative(7.21f);
        h.curveTo(18.2f, 20.0f, 19.0f, 19.2f, 19.0f, 18.21f);
        h.curveToRelative(0.0f, -0.73f, -0.45f, -1.39f, -1.12f, -1.66f);
        h.lineTo(14.0f, 15.0f);
        h.verticalLineToRelative(-2.25f);
        h.curveTo(15.81f, 14.83f, 18.23f, 16.0f, 21.0f, 16.0f);
        h.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, h.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _selfImprovement = build;
        build.getClass();
        return build;
    }
}
