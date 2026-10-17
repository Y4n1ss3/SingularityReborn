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
import defpackage.gy;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class GradeKt {
    private static ImageVector _grade;

    public static final ImageVector getGrade(Icons.Rounded rounded) {
        ImageVector imageVector = _grade;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Grade", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(12.0f, 17.27f, 5.17f, 3.12f);
        e.curveToRelative(0.38f, 0.23f, 0.85f, -0.11f, 0.75f, -0.54f);
        e.lineToRelative(-1.37f, -5.88f);
        e.lineToRelative(4.56f, -3.95f);
        e.curveToRelative(0.33f, -0.29f, 0.16f, -0.84f, -0.29f, -0.88f);
        e.lineToRelative(-6.01f, -0.51f);
        e.lineToRelative(-2.35f, -5.54f);
        e.curveToRelative(-0.17f, -0.41f, -0.75f, -0.41f, -0.92f, 0.0f);
        e.lineTo(9.19f, 8.63f);
        e.lineToRelative(-6.01f, 0.51f);
        e.curveToRelative(-0.44f, 0.04f, -0.62f, 0.59f, -0.28f, 0.88f);
        e.lineToRelative(4.56f, 3.95f);
        e.lineToRelative(-1.37f, 5.88f);
        e.curveToRelative(-0.1f, 0.43f, 0.37f, 0.77f, 0.75f, 0.54f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(e, 12.0f, 17.27f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _grade = build;
        build.getClass();
        return build;
    }
}
