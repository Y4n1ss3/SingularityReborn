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
import defpackage.bv;
import defpackage.kf0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SwipeVerticalKt {
    private static ImageVector _swipeVertical;

    public static final ImageVector getSwipeVertical(Icons.Filled filled) {
        ImageVector imageVector = _swipeVertical;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.SwipeVertical", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(1.0f, 3.5f, 2.02f);
        a.curveTo(1.13f, 5.82f, 0.0f, 8.78f, 0.0f, 12.0f);
        a.reflectiveCurveToRelative(1.13f, 6.18f, 3.02f, 8.5f);
        kf0.o(a, 1.0f, 22.0f, 5.0f, -5.0f);
        a.horizontalLineTo(4.5f);
        a.verticalLineToRelative(2.91f);
        a.curveToRelative(-1.86f, -2.11f, -3.0f, -4.88f, -3.0f, -7.91f);
        a.reflectiveCurveToRelative(1.14f, -5.79f, 3.0f, -7.91f);
        a.verticalLineTo(7.0f);
        a.horizontalLineTo(6.0f);
        a.verticalLineTo(2.0f);
        a.horizontalLineTo(1.0f);
        bv.t(a, 3.5f, 13.85f, 11.62f);
        a.lineToRelative(-2.68f, -5.37f);
        a.curveToRelative(-0.37f, -0.74f, -1.27f, -1.04f, -2.01f, -0.67f);
        a.curveTo(8.41f, 5.96f, 8.11f, 6.86f, 8.48f, 7.6f);
        a.lineToRelative(4.81f, 9.6f);
        a.lineTo(10.05f, 18.0f);
        a.curveToRelative(-0.33f, 0.09f, -0.59f, 0.33f, -0.7f, 0.66f);
        a.lineTo(9.0f, 19.78f);
        a.lineToRelative(6.19f, 2.25f);
        a.curveToRelative(0.5f, 0.17f, 1.28f, 0.02f, 1.75f, -0.22f);
        a.lineToRelative(5.51f, -2.75f);
        a.curveToRelative(0.89f, -0.45f, 1.32f, -1.48f, 1.0f, -2.42f);
        a.lineToRelative(-1.43f, -4.27f);
        a.curveToRelative(-0.27f, -0.82f, -1.04f, -1.37f, -1.9f, -1.37f);
        a.horizontalLineToRelative(-4.56f);
        a.curveToRelative(-0.31f, 0.0f, -0.62f, 0.07f, -0.89f, 0.21f);
        a.lineTo(13.85f, 11.62f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, a.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _swipeVertical = build;
        build.getClass();
        return build;
    }
}
