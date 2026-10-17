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
import defpackage.c21;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SwipeRightKt {
    private static ImageVector _swipeRight;

    public static final ImageVector getSwipeRight(Icons.Filled filled) {
        ImageVector imageVector = _swipeRight;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.SwipeRight", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(19.98f, 16.82f, -0.63f, 4.46f);
        e.curveTo(19.21f, 22.27f, 18.36f, 23.0f, 17.37f, 23.0f);
        e.horizontalLineToRelative(-6.16f);
        e.curveToRelative(-0.53f, 0.0f, -1.29f, -0.21f, -1.66f, -0.59f);
        e.lineTo(5.0f, 17.62f);
        e.lineToRelative(0.83f, -0.84f);
        e.curveToRelative(0.24f, -0.24f, 0.58f, -0.35f, 0.92f, -0.28f);
        e.lineTo(10.0f, 17.24f);
        e.verticalLineTo(6.5f);
        e.curveTo(10.0f, 5.67f, 10.67f, 5.0f, 11.5f, 5.0f);
        e.reflectiveCurveTo(13.0f, 5.67f, 13.0f, 6.5f);
        e.verticalLineToRelative(6.0f);
        e.horizontalLineToRelative(0.91f);
        e.curveToRelative(0.31f, 0.0f, 0.62f, 0.07f, 0.89f, 0.21f);
        e.lineToRelative(4.09f, 2.04f);
        e.curveTo(19.66f, 15.14f, 20.1f, 15.97f, 19.98f, 16.82f);
        c21.d(e, 19.91f, 5.5f, 17.0f, 7.0f);
        af0.q(e, 5.0f, 2.0f, -1.5f, 2.02f);
        e.curveTo(18.18f, 2.13f, 15.22f, 1.0f, 12.0f, 1.0f);
        e.curveTo(6.51f, 1.0f, 2.73f, 4.12f, 2.0f, 7.0f);
        e.horizontalLineToRelative(1.57f);
        e.curveTo(4.33f, 5.02f, 7.26f, 2.5f, 12.0f, 2.5f);
        e.curveTo(15.03f, 2.5f, 17.79f, 3.64f, 19.91f, 5.5f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _swipeRight = build;
        build.getClass();
        return build;
    }
}
