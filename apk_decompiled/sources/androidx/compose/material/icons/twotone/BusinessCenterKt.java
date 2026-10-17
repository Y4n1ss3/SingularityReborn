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
import defpackage.gy;
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BusinessCenterKt {
    private static ImageVector _businessCenter;

    public static final ImageVector getBusinessCenter(Icons.TwoTone twoTone) {
        ImageVector imageVector = _businessCenter;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.BusinessCenter", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uo.b(15.0f, 17.0f, 9.0f, -1.0f, 5.0f);
        af0.C(b, 3.0f, 14.0f, -3.0f, -4.0f);
        k4.C(b, 4.0f, 14.0f, 5.0f, -3.0f);
        af0.w(b, 6.0f, 3.0f, 5.0f, 9.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.h(b, 4.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder p = kf0.p(20.0f, 7.0f, -4.0f, 16.0f, 5.0f);
        p.lineToRelative(-2.0f, -2.0f);
        p.horizontalLineToRelative(-4.0f);
        p.lineTo(8.0f, 5.0f);
        p.verticalLineToRelative(2.0f);
        p.lineTo(4.0f, 7.0f);
        p.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        p.verticalLineToRelative(5.0f);
        p.curveToRelative(0.0f, 0.75f, 0.4f, 1.38f, 1.0f, 1.73f);
        p.lineTo(3.0f, 19.0f);
        p.curveToRelative(0.0f, 1.11f, 0.89f, 2.0f, 2.0f, 2.0f);
        p.horizontalLineToRelative(14.0f);
        p.curveToRelative(1.11f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f);
        p.verticalLineToRelative(-3.28f);
        p.curveToRelative(0.59f, -0.35f, 1.0f, -0.99f, 1.0f, -1.72f);
        p.lineTo(22.0f, 9.0f);
        p.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        r6.B(p, 10.0f, 5.0f, 4.0f, 2.0f);
        gy.n(p, -4.0f, 10.0f, 5.0f);
        p.moveTo(19.0f, 19.0f);
        af0.m(p, 5.0f, 19.0f, -3.0f, 4.0f);
        r6.D(p, 1.0f, 6.0f, -1.0f, 4.0f);
        kp0.z(p, 3.0f, 11.0f, 15.0f, -2.0f);
        j50.n(p, 2.0f, 2.0f, -2.0f);
        k4.C(p, 20.0f, 14.0f, -5.0f, -3.0f);
        p.lineTo(9.0f, 11.0f);
        p.verticalLineToRelative(3.0f);
        p.lineTo(4.0f, 14.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.x(p, 4.0f, 9.0f, 16.0f, 5.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _businessCenter = build;
        build.getClass();
        return build;
    }
}
