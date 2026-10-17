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
import defpackage.bv;
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SwipeVerticalKt {
    private static ImageVector _swipeVertical;

    public static final ImageVector getSwipeVertical(Icons.Sharp sharp) {
        ImageVector imageVector = _swipeVertical;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.SwipeVertical", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
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
        bv.t(a, 3.5f, 21.71f, 11.18f);
        a.lineToRelative(2.09f, 7.39f);
        a.lineToRelative(-8.23f, 3.65f);
        a.lineToRelative(-6.84f, -2.85f);
        a.lineToRelative(0.61f, -1.62f);
        a.lineToRelative(3.8f, -0.75f);
        a.lineTo(8.79f, 7.17f);
        a.curveToRelative(-0.34f, -0.76f, 0.0f, -1.64f, 0.76f, -1.98f);
        a.curveToRelative(0.76f, -0.34f, 1.64f, 0.0f, 1.98f, 0.76f);
        a.lineToRelative(2.43f, 5.49f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(a, 1.26f, -0.56f, 21.71f, 11.18f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _swipeVertical = build;
        build.getClass();
        return build;
    }
}
