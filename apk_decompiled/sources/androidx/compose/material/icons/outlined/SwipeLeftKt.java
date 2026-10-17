package androidx.compose.material.icons.outlined;

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
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SwipeLeftKt {
    private static ImageVector _swipeLeft;

    public static final ImageVector getSwipeLeft(Icons.Outlined outlined) {
        ImageVector imageVector = _swipeLeft;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.SwipeLeft", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
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
        uo.l(e, 17.08f, 21.0f, 4.09f, 5.5f);
        af0.y(e, 7.0f, 7.0f, 2.0f, 2.0f);
        e.horizontalLineToRelative(1.5f);
        e.verticalLineToRelative(2.02f);
        e.curveTo(5.82f, 2.13f, 8.78f, 1.0f, 12.0f, 1.0f);
        e.curveToRelative(5.49f, 0.0f, 9.27f, 3.12f, 10.0f, 6.0f);
        e.horizontalLineToRelative(-1.57f);
        e.curveTo(19.67f, 5.02f, 16.74f, 2.5f, 12.0f, 2.5f);
        e.curveTo(8.97f, 2.5f, 6.21f, 3.64f, 4.09f, 5.5f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _swipeLeft = build;
        build.getClass();
        return build;
    }
}
