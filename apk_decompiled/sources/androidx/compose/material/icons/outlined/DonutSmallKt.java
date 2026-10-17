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
import defpackage.bv;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DonutSmallKt {
    private static ImageVector _donutSmall;

    public static final ImageVector getDonutSmall(Icons.Outlined outlined) {
        ImageVector imageVector = _donutSmall;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.DonutSmall", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(14.82f, 11.0f, 7.13f);
        a.curveToRelative(-0.47f, -4.72f, -4.23f, -8.48f, -8.95f, -8.95f);
        a.verticalLineToRelative(7.13f);
        a.curveToRelative(0.85f, 0.31f, 1.51f, 0.97f, 1.82f, 1.82f);
        a.close();
        a.moveTo(15.0f, 4.58f);
        a.curveTo(17.0f, 5.4f, 18.6f, 7.0f, 19.42f, 9.0f);
        a.horizontalLineToRelative(-3.43f);
        a.curveToRelative(-0.28f, -0.37f, -0.62f, -0.71f, -0.99f, -0.99f);
        uo.l(a, 15.0f, 4.58f, 2.0f, 12.0f);
        a.curveToRelative(0.0f, 5.19f, 3.95f, 9.45f, 9.0f, 9.95f);
        a.verticalLineToRelative(-7.13f);
        a.curveTo(9.84f, 14.4f, 9.0f, 13.3f, 9.0f, 12.0f);
        a.curveToRelative(0.0f, -1.3f, 0.84f, -2.4f, 2.0f, -2.82f);
        a.lineTo(11.0f, 2.05f);
        a.curveToRelative(-5.05f, 0.5f, -9.0f, 4.76f, -9.0f, 9.95f);
        bv.v(a, 9.0f, 4.58f, 3.44f);
        a.curveToRelative(-1.23f, 0.92f, -2.0f, 2.39f, -2.0f, 3.98f);
        a.curveToRelative(0.0f, 1.59f, 0.77f, 3.06f, 2.0f, 3.99f);
        a.verticalLineToRelative(3.44f);
        a.curveTo(6.04f, 18.24f, 4.0f, 15.35f, 4.0f, 12.0f);
        a.curveToRelative(0.0f, -3.35f, 2.04f, -6.24f, 5.0f, -7.42f);
        bv.v(a, 13.0f, 14.82f, 7.13f);
        a.curveToRelative(4.72f, -0.47f, 8.48f, -4.23f, 8.95f, -8.95f);
        a.horizontalLineToRelative(-7.13f);
        a.curveToRelative(-0.31f, 0.85f, -0.97f, 1.51f, -1.82f, 1.82f);
        a.close();
        a.moveTo(15.0f, 15.99f);
        a.curveToRelative(0.37f, -0.28f, 0.71f, -0.61f, 0.99f, -0.99f);
        a.horizontalLineToRelative(3.43f);
        a.curveTo(18.6f, 17.0f, 17.0f, 18.6f, 15.0f, 19.42f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.c(a, -3.43f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _donutSmall = build;
        build.getClass();
        return build;
    }
}
