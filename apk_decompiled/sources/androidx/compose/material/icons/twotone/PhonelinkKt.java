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
import defpackage.kf0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PhonelinkKt {
    private static ImageVector _phonelink;

    public static final ImageVector getPhonelink(Icons.TwoTone twoTone) {
        ImageVector imageVector = _phonelink;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Phonelink", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.c(18.0f, 10.0f, 4.0f, 7.0f, -4.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder p = kf0.p(4.0f, 6.0f, 18.0f, 22.0f, 4.0f);
        p.lineTo(4.0f, 4.0f);
        p.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        bv.q(p, 11.0f, 0.0f, 17.0f, 3.0f);
        bv.C(p, 14.0f, -3.0f, 4.0f, 17.0f);
        uo.l(p, 4.0f, 6.0f, 23.0f, 8.0f);
        p.horizontalLineToRelative(-6.0f);
        p.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        p.verticalLineToRelative(10.0f);
        p.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        p.horizontalLineToRelative(6.0f);
        p.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        p.lineTo(24.0f, 9.0f);
        p.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        r6.B(p, 22.0f, 17.0f, -4.0f, -7.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.v(p, 4.0f, 7.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _phonelink = build;
        build.getClass();
        return build;
    }
}
