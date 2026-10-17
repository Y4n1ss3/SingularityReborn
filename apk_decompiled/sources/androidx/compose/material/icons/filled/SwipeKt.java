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
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SwipeKt {
    private static ImageVector _swipe;

    public static final ImageVector getSwipe(Icons.Filled filled) {
        ImageVector imageVector = _swipe;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.Swipe", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(18.89f, 14.75f, -4.09f, -2.04f);
        e.curveToRelative(-0.28f, -0.14f, -0.58f, -0.21f, -0.89f, -0.21f);
        e.horizontalLineTo(13.0f);
        e.verticalLineToRelative(-6.0f);
        e.curveTo(13.0f, 5.67f, 12.33f, 5.0f, 11.5f, 5.0f);
        e.reflectiveCurveTo(10.0f, 5.67f, 10.0f, 6.5f);
        e.verticalLineToRelative(10.74f);
        e.lineTo(6.75f, 16.5f);
        e.curveToRelative(-0.33f, -0.07f, -0.68f, 0.03f, -0.92f, 0.28f);
        e.lineTo(5.0f, 17.62f);
        e.lineToRelative(4.54f, 4.79f);
        e.curveTo(9.92f, 22.79f, 10.68f, 23.0f, 11.21f, 23.0f);
        e.horizontalLineToRelative(6.16f);
        e.curveToRelative(1.0f, 0.0f, 1.84f, -0.73f, 1.98f, -1.72f);
        e.lineToRelative(0.63f, -4.46f);
        e.curveTo(20.1f, 15.97f, 19.66f, 15.14f, 18.89f, 14.75f);
        e.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(20.13f, 3.87f);
        b.curveTo(18.69f, 2.17f, 15.6f, 1.0f, 12.0f, 1.0f);
        b.reflectiveCurveTo(5.31f, 2.17f, 3.87f, 3.87f);
        af0.m(b, 2.0f, 2.0f, 5.0f, 5.0f);
        b.lineTo(4.93f, 4.93f);
        b.curveToRelative(1.0f, -1.29f, 3.7f, -2.43f, 7.07f, -2.43f);
        b.reflectiveCurveToRelative(6.07f, 1.14f, 7.07f, 2.43f);
        kf0.y(b, 17.0f, 7.0f, 5.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(b, 20.13f, 3.87f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _swipe = build;
        build.getClass();
        return build;
    }
}
