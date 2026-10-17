package androidx.compose.material.icons.sharp;

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
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SwipeRightKt {
    private static ImageVector _swipeRight;

    public static final ImageVector getSwipeRight(Icons.Sharp sharp) {
        ImageVector imageVector = _swipeRight;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.SwipeRight", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder k = gy.k(20.18f, 15.4f, 19.1f, 23.0f, -9.0f);
        k.lineTo(5.0f, 17.62f);
        k.lineToRelative(1.22f, -1.23f);
        k.lineTo(10.0f, 17.24f);
        k.verticalLineTo(6.5f);
        k.curveTo(10.0f, 5.67f, 10.67f, 5.0f, 11.5f, 5.0f);
        k.reflectiveCurveTo(13.0f, 5.67f, 13.0f, 6.5f);
        uo.D(k, 6.0f, 1.38f, 20.18f, 15.4f);
        uo.p(k, 19.91f, 5.5f, 17.0f, 7.0f);
        af0.q(k, 5.0f, 2.0f, -1.5f, 2.02f);
        k.curveTo(18.18f, 2.13f, 15.22f, 1.0f, 12.0f, 1.0f);
        k.curveTo(6.51f, 1.0f, 2.73f, 4.12f, 2.0f, 7.0f);
        k.horizontalLineToRelative(1.57f);
        k.curveTo(4.33f, 5.02f, 7.26f, 2.5f, 12.0f, 2.5f);
        k.curveTo(15.03f, 2.5f, 17.79f, 3.64f, 19.91f, 5.5f);
        k.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _swipeRight = build;
        build.getClass();
        return build;
    }
}
