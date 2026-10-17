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
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AdsClickKt {
    private static ImageVector _adsClick;

    public static final ImageVector getAdsClick(Icons.Sharp sharp) {
        ImageVector imageVector = _adsClick;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.AdsClick", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(11.71f, 17.99f);
        b.curveTo(8.53f, 17.84f, 6.0f, 15.22f, 6.0f, 12.0f);
        b.curveToRelative(0.0f, -3.31f, 2.69f, -6.0f, 6.0f, -6.0f);
        b.curveToRelative(3.22f, 0.0f, 5.84f, 2.53f, 5.99f, 5.71f);
        b.lineToRelative(-2.1f, -0.63f);
        b.curveTo(15.48f, 9.31f, 13.89f, 8.0f, 12.0f, 8.0f);
        b.curveToRelative(-2.21f, 0.0f, -4.0f, 1.79f, -4.0f, 4.0f);
        b.curveToRelative(0.0f, 1.89f, 1.31f, 3.48f, 3.08f, 3.89f);
        uo.l(b, 11.71f, 17.99f, 22.0f, 12.0f);
        b.curveToRelative(0.0f, 0.3f, -0.01f, 0.6f, -0.04f, 0.9f);
        b.lineToRelative(-1.97f, -0.59f);
        b.curveTo(20.0f, 12.21f, 20.0f, 12.1f, 20.0f, 12.0f);
        b.curveToRelative(0.0f, -4.42f, -3.58f, -8.0f, -8.0f, -8.0f);
        b.reflectiveCurveToRelative(-8.0f, 3.58f, -8.0f, 8.0f);
        b.reflectiveCurveToRelative(3.58f, 8.0f, 8.0f, 8.0f);
        b.curveToRelative(0.1f, 0.0f, 0.21f, 0.0f, 0.31f, -0.01f);
        b.lineToRelative(0.59f, 1.97f);
        b.curveTo(12.6f, 21.99f, 12.3f, 22.0f, 12.0f, 22.0f);
        b.curveTo(6.48f, 22.0f, 2.0f, 17.52f, 2.0f, 12.0f);
        b.curveTo(2.0f, 6.48f, 6.48f, 2.0f, 12.0f, 2.0f);
        b.reflectiveCurveTo(22.0f, 6.48f, 22.0f, 12.0f);
        k4.r(b, 18.23f, 16.26f, 22.0f, 15.0f);
        b.lineToRelative(-10.0f, -3.0f);
        b.lineToRelative(3.0f, 10.0f);
        b.lineToRelative(1.26f, -3.77f);
        b.lineToRelative(4.27f, 4.27f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.k(b, 1.98f, -1.98f, 18.23f, 16.26f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _adsClick = build;
        build.getClass();
        return build;
    }
}
