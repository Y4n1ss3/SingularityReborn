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
import defpackage.bv;
import defpackage.k4;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DiningKt {
    private static ImageVector _dining;

    public static final ImageVector getDining(Icons.Rounded rounded) {
        ImageVector imageVector = _dining;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Dining", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(20.0f, 2.0f, 4.0f);
        d.curveTo(2.9f, 2.0f, 2.0f, 2.9f, 2.0f, 4.0f);
        d.verticalLineToRelative(16.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(16.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        d.verticalLineTo(4.0f);
        d.curveTo(22.0f, 2.9f, 21.1f, 2.0f, 20.0f, 2.0f);
        d.close();
        d.moveTo(11.0f, 10.3f);
        d.curveToRelative(0.0f, 0.93f, -0.64f, 1.71f, -1.5f, 1.93f);
        d.verticalLineToRelative(6.02f);
        d.curveTo(9.5f, 18.66f, 9.16f, 19.0f, 8.75f, 19.0f);
        d.horizontalLineToRelative(0.0f);
        d.curveTo(8.34f, 19.0f, 8.0f, 18.66f, 8.0f, 18.25f);
        d.verticalLineToRelative(-6.02f);
        d.curveToRelative(-0.86f, -0.22f, -1.5f, -1.0f, -1.5f, -1.93f);
        d.verticalLineTo(6.5f);
        d.curveTo(6.5f, 6.22f, 6.72f, 6.0f, 7.0f, 6.0f);
        d.reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f);
        uf.z(d, 9.0f, 0.75f, 6.5f);
        d.curveToRelative(0.0f, -0.28f, 0.22f, -0.5f, 0.5f, -0.5f);
        d.reflectiveCurveToRelative(0.5f, 0.22f, 0.5f, 0.5f);
        uo.j(d, 9.0f, 10.0f, 6.5f);
        d.curveTo(10.0f, 6.22f, 10.23f, 6.0f, 10.5f, 6.0f);
        d.curveTo(10.78f, 6.0f, 11.0f, 6.22f, 11.0f, 6.5f);
        bv.t(d, 10.3f, 15.58f, 12.59f);
        d.lineToRelative(-0.08f, 0.03f);
        d.verticalLineToRelative(5.63f);
        d.curveToRelative(0.0f, 0.41f, -0.34f, 0.75f, -0.75f, 0.75f);
        d.horizontalLineToRelative(0.0f);
        d.curveTo(14.34f, 19.0f, 14.0f, 18.66f, 14.0f, 18.25f);
        d.verticalLineToRelative(-5.63f);
        d.lineToRelative(-0.08f, -0.04f);
        d.curveToRelative(-0.97f, -0.47f, -1.67f, -1.7f, -1.67f, -3.18f);
        d.curveToRelative(0.0f, -1.88f, 1.13f, -3.4f, 2.5f, -3.4f);
        d.curveToRelative(1.38f, 0.0f, 2.5f, 1.53f, 2.5f, 3.41f);
        d.curveTo(17.25f, 10.89f, 16.55f, 12.12f, 15.58f, 12.59f);
        d.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, d.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _dining = build;
        build.getClass();
        return build;
    }
}
