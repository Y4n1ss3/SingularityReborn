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
import defpackage.gy;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class GradeKt {
    private static ImageVector _grade;

    public static final ImageVector getGrade(Icons.TwoTone twoTone) {
        ImageVector imageVector = _grade;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Grade", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(17.11f, 10.83f, -2.47f, -0.21f);
        e.lineToRelative(-1.2f, -0.1f);
        e.lineToRelative(-0.47f, -1.11f);
        e.lineTo(12.0f, 7.13f);
        e.lineToRelative(-0.97f, 2.28f);
        e.lineToRelative(-0.47f, 1.11f);
        e.lineToRelative(-1.2f, 0.1f);
        e.lineToRelative(-2.47f, 0.21f);
        e.lineToRelative(1.88f, 1.63f);
        e.lineToRelative(0.91f, 0.79f);
        e.lineToRelative(-0.27f, 1.17f);
        e.lineToRelative(-0.57f, 2.42f);
        e.lineToRelative(2.13f, -1.28f);
        e.lineToRelative(1.03f, -0.63f);
        e.lineToRelative(1.03f, 0.63f);
        e.lineToRelative(2.13f, 1.28f);
        e.lineToRelative(-0.57f, -2.42f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e, -0.27f, -1.17f, 0.91f, -0.79f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e2 = k4.e(22.0f, 9.24f, -7.19f, -0.61f);
        e2.lineTo(12.0f, 2.0f);
        e2.lineTo(9.19f, 8.63f);
        e2.lineTo(2.0f, 9.24f);
        e2.lineToRelative(5.46f, 4.73f);
        e2.lineTo(5.82f, 21.0f);
        e2.lineTo(12.0f, 17.27f);
        e2.lineTo(18.18f, 21.0f);
        gy.B(e2, -1.64f, -7.03f, 22.0f, 9.24f);
        e2.moveTo(14.59f, 14.42f);
        e2.lineToRelative(0.56f, 2.41f);
        e2.lineToRelative(-2.12f, -1.28f);
        e2.lineToRelative(-1.03f, -0.62f);
        e2.lineToRelative(-1.03f, 0.62f);
        e2.lineToRelative(-2.12f, 1.28f);
        e2.lineToRelative(0.56f, -2.41f);
        e2.lineToRelative(0.27f, -1.18f);
        e2.lineToRelative(-0.91f, -0.79f);
        e2.lineToRelative(-1.88f, -1.63f);
        e2.lineToRelative(2.47f, -0.21f);
        e2.lineToRelative(1.2f, -0.1f);
        e2.lineToRelative(0.47f, -1.11f);
        e2.lineToRelative(0.97f, -2.27f);
        e2.lineToRelative(0.97f, 2.29f);
        e2.lineToRelative(0.47f, 1.11f);
        e2.lineToRelative(1.2f, 0.1f);
        e2.lineToRelative(2.47f, 0.21f);
        e2.lineToRelative(-1.88f, 1.63f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e2, -0.91f, 0.79f, 0.27f, 1.16f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _grade = build;
        build.getClass();
        return build;
    }
}
