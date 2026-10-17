package androidx.compose.material.icons.twotone;

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
import defpackage.gy;
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SwipeRightKt {
    private static ImageVector _swipeRight;

    public static final ImageVector getSwipeRight(Icons.TwoTone twoTone) {
        ImageVector imageVector = _swipeRight;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.SwipeRight", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = uo.i(17.08f, 21.0f, -6.55f, -3.7f, -3.78f);
        i.lineTo(11.0f, 18.11f);
        i.verticalLineTo(7.5f);
        i.curveTo(11.0f, 7.22f, 11.22f, 7.0f, 11.5f, 7.0f);
        i.reflectiveCurveTo(12.0f, 7.22f, 12.0f, 7.5f);
        uo.B(i, 6.18f, 1.76f, 18.0f, 15.56f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(i, 17.08f, 21.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(18.89f, 13.77f, -3.8f, -1.67f);
        e.curveTo(14.96f, 12.04f, 14.81f, 12.0f, 14.65f, 12.0f);
        e.horizontalLineTo(14.0f);
        e.verticalLineTo(7.5f);
        e.curveTo(14.0f, 6.12f, 12.88f, 5.0f, 11.5f, 5.0f);
        e.reflectiveCurveTo(9.0f, 6.12f, 9.0f, 7.5f);
        e.verticalLineToRelative(8.15f);
        e.lineToRelative(-1.87f, -0.4f);
        e.curveToRelative(-0.19f, -0.03f, -1.02f, -0.15f, -1.73f, 0.56f);
        e.lineTo(4.0f, 17.22f);
        e.lineToRelative(5.12f, 5.19f);
        e.curveTo(9.49f, 22.79f, 10.0f, 23.0f, 10.53f, 23.0f);
        e.horizontalLineToRelative(6.55f);
        e.curveToRelative(0.98f, 0.0f, 1.81f, -0.7f, 1.97f, -1.67f);
        e.lineToRelative(0.92f, -5.44f);
        e.curveTo(20.12f, 15.03f, 19.68f, 14.17f, 18.89f, 13.77f);
        af0.l(e, 17.08f, 21.0f, -6.55f);
        e.lineToRelative(-3.7f, -3.78f);
        e.lineTo(11.0f, 18.11f);
        e.verticalLineTo(7.5f);
        e.curveTo(11.0f, 7.22f, 11.22f, 7.0f, 11.5f, 7.0f);
        e.reflectiveCurveTo(12.0f, 7.22f, 12.0f, 7.5f);
        uo.B(e, 6.18f, 1.76f, 18.0f, 15.56f);
        uo.l(e, 17.08f, 21.0f, 12.0f, 2.5f);
        e.curveTo(7.26f, 2.5f, 4.33f, 5.02f, 3.57f, 7.0f);
        e.horizontalLineTo(2.0f);
        e.curveToRelative(0.73f, -2.88f, 4.51f, -6.0f, 10.0f, -6.0f);
        e.curveToRelative(3.22f, 0.0f, 6.18f, 1.13f, 8.5f, 3.02f);
        bv.A(e, 2.0f, 22.0f, 5.0f, -5.0f);
        e.verticalLineTo(5.5f);
        e.horizontalLineToRelative(2.91f);
        e.curveTo(17.79f, 3.64f, 15.03f, 2.5f, 12.0f, 2.5f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _swipeRight = build;
        build.getClass();
        return build;
    }
}
