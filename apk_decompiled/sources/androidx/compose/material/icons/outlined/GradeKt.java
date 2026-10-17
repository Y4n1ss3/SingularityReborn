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
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class GradeKt {
    private static ImageVector _grade;

    public static final ImageVector getGrade(Icons.Outlined outlined) {
        ImageVector imageVector = _grade;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Grade", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(12.0f, 7.13f, 0.97f, 2.29f);
        e.lineToRelative(0.47f, 1.11f);
        e.lineToRelative(1.2f, 0.1f);
        e.lineToRelative(2.47f, 0.21f);
        e.lineToRelative(-1.88f, 1.63f);
        e.lineToRelative(-0.91f, 0.79f);
        e.lineToRelative(0.27f, 1.18f);
        e.lineToRelative(0.56f, 2.41f);
        e.lineToRelative(-2.12f, -1.28f);
        e.lineToRelative(-1.03f, -0.64f);
        e.lineToRelative(-1.03f, 0.62f);
        e.lineToRelative(-2.12f, 1.28f);
        e.lineToRelative(0.56f, -2.41f);
        e.lineToRelative(0.27f, -1.18f);
        e.lineToRelative(-0.91f, -0.79f);
        e.lineToRelative(-1.88f, -1.63f);
        e.lineToRelative(2.47f, -0.21f);
        e.lineToRelative(1.2f, -0.1f);
        e.lineToRelative(0.47f, -1.11f);
        e.lineToRelative(0.97f, -2.27f);
        e.moveTo(12.0f, 2.0f);
        e.lineTo(9.19f, 8.63f);
        e.lineTo(2.0f, 9.24f);
        e.lineToRelative(5.46f, 4.73f);
        e.lineTo(5.82f, 21.0f);
        e.lineTo(12.0f, 17.27f);
        e.lineTo(18.18f, 21.0f);
        e.lineToRelative(-1.64f, -7.03f);
        e.lineTo(22.0f, 9.24f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(e, -7.19f, -0.61f, 12.0f, 2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _grade = build;
        build.getClass();
        return build;
    }
}
