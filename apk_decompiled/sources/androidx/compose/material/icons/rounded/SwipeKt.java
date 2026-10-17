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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SwipeKt {
    private static ImageVector _swipe;

    public static final ImageVector getSwipe(Icons.Rounded rounded) {
        ImageVector imageVector = _swipe;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Swipe", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(21.15f, 2.85f, -1.02f, 1.02f);
        e.curveTo(18.69f, 2.17f, 15.6f, 1.0f, 12.0f, 1.0f);
        e.reflectiveCurveTo(5.31f, 2.17f, 3.87f, 3.87f);
        e.lineTo(2.85f, 2.85f);
        e.curveTo(2.54f, 2.54f, 2.0f, 2.76f, 2.0f, 3.21f);
        e.verticalLineTo(6.5f);
        e.curveTo(2.0f, 6.78f, 2.22f, 7.0f, 2.5f, 7.0f);
        e.horizontalLineToRelative(3.29f);
        e.curveToRelative(0.45f, 0.0f, 0.67f, -0.54f, 0.35f, -0.85f);
        e.lineTo(4.93f, 4.93f);
        e.curveToRelative(1.0f, -1.29f, 3.7f, -2.43f, 7.07f, -2.43f);
        e.reflectiveCurveToRelative(6.07f, 1.14f, 7.07f, 2.43f);
        e.lineToRelative(-1.22f, 1.22f);
        e.curveTo(17.54f, 6.46f, 17.76f, 7.0f, 18.21f, 7.0f);
        e.horizontalLineToRelative(3.29f);
        e.curveTo(21.78f, 7.0f, 22.0f, 6.78f, 22.0f, 6.5f);
        e.verticalLineTo(3.21f);
        e.curveTo(22.0f, 2.76f, 21.46f, 2.54f, 21.15f, 2.85f);
        e.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(14.5f, 12.71f);
        b.curveToRelative(-0.28f, -0.14f, -0.58f, -0.21f, -0.89f, -0.21f);
        b.horizontalLineTo(13.0f);
        b.verticalLineToRelative(-6.0f);
        b.curveTo(13.0f, 5.67f, 12.33f, 5.0f, 11.5f, 5.0f);
        b.reflectiveCurveTo(10.0f, 5.67f, 10.0f, 6.5f);
        b.verticalLineToRelative(10.74f);
        b.lineToRelative(-3.44f, -0.72f);
        b.curveToRelative(-0.37f, -0.08f, -0.76f, 0.04f, -1.03f, 0.31f);
        b.lineToRelative(0.0f, 0.0f);
        b.curveToRelative(-0.43f, 0.44f, -0.43f, 1.14f, 0.01f, 1.58f);
        b.lineToRelative(4.01f, 4.01f);
        b.curveTo(9.92f, 22.79f, 10.43f, 23.0f, 10.96f, 23.0f);
        b.horizontalLineToRelative(6.41f);
        b.curveToRelative(1.0f, 0.0f, 1.84f, -0.73f, 1.98f, -1.72f);
        b.lineToRelative(0.63f, -4.46f);
        b.curveToRelative(0.12f, -0.85f, -0.32f, -1.69f, -1.09f, -2.07f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(b, 14.5f, 12.71f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _swipe = build;
        build.getClass();
        return build;
    }
}
