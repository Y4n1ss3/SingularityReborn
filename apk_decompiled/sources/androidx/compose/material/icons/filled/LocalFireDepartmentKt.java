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
import defpackage.gy;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LocalFireDepartmentKt {
    private static ImageVector _localFireDepartment;

    public static final ImageVector getLocalFireDepartment(Icons.Filled filled) {
        ImageVector imageVector = _localFireDepartment;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.LocalFireDepartment", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(12.0f, 12.9f, -2.13f, 2.09f);
        e.curveTo(9.31f, 15.55f, 9.0f, 16.28f, 9.0f, 17.06f);
        e.curveTo(9.0f, 18.68f, 10.35f, 20.0f, 12.0f, 20.0f);
        e.reflectiveCurveToRelative(3.0f, -1.32f, 3.0f, -2.94f);
        e.curveToRelative(0.0f, -0.78f, -0.31f, -1.52f, -0.87f, -2.07f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(e, 12.0f, 12.9f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e2 = k4.e(16.0f, 6.0f, -0.44f, 0.55f);
        e2.curveTo(14.38f, 8.02f, 12.0f, 7.19f, 12.0f, 5.3f);
        e2.verticalLineTo(2.0f);
        e2.curveToRelative(0.0f, 0.0f, -8.0f, 4.0f, -8.0f, 11.0f);
        e2.curveToRelative(0.0f, 2.92f, 1.56f, 5.47f, 3.89f, 6.86f);
        e2.curveTo(7.33f, 19.07f, 7.0f, 18.1f, 7.0f, 17.06f);
        e2.curveToRelative(0.0f, -1.32f, 0.52f, -2.56f, 1.47f, -3.5f);
        e2.lineTo(12.0f, 10.1f);
        e2.lineToRelative(3.53f, 3.47f);
        e2.curveToRelative(0.95f, 0.93f, 1.47f, 2.17f, 1.47f, 3.5f);
        e2.curveToRelative(0.0f, 1.02f, -0.31f, 1.96f, -0.85f, 2.75f);
        e2.curveToRelative(1.89f, -1.15f, 3.29f, -3.06f, 3.71f, -5.3f);
        e2.curveTo(20.52f, 10.97f, 18.79f, 7.62f, 16.0f, 6.0f);
        e2.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e2.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _localFireDepartment = build;
        build.getClass();
        return build;
    }
}
