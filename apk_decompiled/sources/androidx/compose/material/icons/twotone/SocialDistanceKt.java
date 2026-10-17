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
import defpackage.bv;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SocialDistanceKt {
    private static ImageVector _socialDistance;

    public static final ImageVector getSocialDistance(Icons.TwoTone twoTone) {
        ImageVector imageVector = _socialDistance;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.SocialDistance", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(4.0f, 5.0f);
        b.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        b.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        b.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        b.reflectiveCurveTo(4.0f, 6.1f, 4.0f, 5.0f);
        b.close();
        b.moveTo(8.78f, 8.58f);
        b.curveTo(7.93f, 8.21f, 6.99f, 8.0f, 6.0f, 8.0f);
        b.reflectiveCurveTo(4.07f, 8.21f, 3.22f, 8.58f);
        b.curveTo(2.48f, 8.9f, 2.0f, 9.62f, 2.0f, 10.43f);
        b.lineTo(2.0f, 11.0f);
        b.horizontalLineToRelative(8.0f);
        b.lineToRelative(0.0f, -0.57f);
        b.curveTo(10.0f, 9.62f, 9.52f, 8.9f, 8.78f, 8.58f);
        b.close();
        b.moveTo(18.0f, 7.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        b.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        b.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        b.curveTo(16.0f, 6.1f, 16.9f, 7.0f, 18.0f, 7.0f);
        b.close();
        b.moveTo(20.78f, 8.58f);
        b.curveTo(19.93f, 8.21f, 18.99f, 8.0f, 18.0f, 8.0f);
        b.curveToRelative(-0.99f, 0.0f, -1.93f, 0.21f, -2.78f, 0.58f);
        b.curveTo(14.48f, 8.9f, 14.0f, 9.62f, 14.0f, 10.43f);
        b.lineTo(14.0f, 11.0f);
        b.horizontalLineToRelative(8.0f);
        b.lineToRelative(0.0f, -0.57f);
        b.curveTo(22.0f, 9.62f, 21.52f, 8.9f, 20.78f, 8.58f);
        k4.x(b, 22.0f, 17.0f, -4.0f, -4.0f);
        r6.s(b, 3.0f, 6.0f, -3.0f);
        b.lineToRelative(-4.0f, 4.0f);
        r6.A(b, 4.0f, 4.0f, -3.0f, 12.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, bv.j(b, 3.0f, 22.0f, 17.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _socialDistance = build;
        build.getClass();
        return build;
    }
}
