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
import defpackage.gy;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LocalFireDepartmentKt {
    private static ImageVector _localFireDepartment;

    public static final ImageVector getLocalFireDepartment(Icons.Rounded rounded) {
        ImageVector imageVector = _localFireDepartment;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.LocalFireDepartment", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(12.0f, 12.9f, -2.03f, 2.0f);
        e.curveToRelative(-0.46f, 0.46f, -0.82f, 1.03f, -0.93f, 1.67f);
        e.curveTo(8.74f, 18.41f, 10.18f, 20.0f, 12.0f, 20.0f);
        e.reflectiveCurveToRelative(3.26f, -1.59f, 2.96f, -3.42f);
        e.curveToRelative(-0.11f, -0.64f, -0.46f, -1.22f, -0.93f, -1.67f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(e, 12.0f, 12.9f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(15.56f, 6.55f, 15.56f, 6.55f);
        i.curveTo(14.38f, 8.02f, 12.0f, 7.19f, 12.0f, 5.3f);
        i.verticalLineTo(3.77f);
        i.curveToRelative(0.0f, -0.8f, -0.89f, -1.28f, -1.55f, -0.84f);
        i.curveTo(8.12f, 4.49f, 4.0f, 7.97f, 4.0f, 13.0f);
        i.curveToRelative(0.0f, 2.92f, 1.56f, 5.47f, 3.89f, 6.86f);
        i.curveToRelative(-0.71f, -1.02f, -1.06f, -2.31f, -0.81f, -3.68f);
        i.curveToRelative(0.19f, -1.04f, 0.75f, -1.98f, 1.51f, -2.72f);
        i.lineToRelative(2.71f, -2.67f);
        i.curveToRelative(0.39f, -0.38f, 1.01f, -0.38f, 1.4f, 0.0f);
        i.lineToRelative(2.73f, 2.69f);
        i.curveToRelative(0.74f, 0.73f, 1.3f, 1.65f, 1.48f, 2.68f);
        i.curveToRelative(0.25f, 1.36f, -0.07f, 2.64f, -0.77f, 3.66f);
        i.curveToRelative(1.89f, -1.15f, 3.29f, -3.06f, 3.71f, -5.3f);
        i.curveToRelative(0.61f, -3.27f, -0.81f, -6.37f, -3.22f, -8.1f);
        i.curveTo(16.3f, 6.17f, 15.83f, 6.22f, 15.56f, 6.55f);
        i.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, i.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _localFireDepartment = build;
        build.getClass();
        return build;
    }
}
