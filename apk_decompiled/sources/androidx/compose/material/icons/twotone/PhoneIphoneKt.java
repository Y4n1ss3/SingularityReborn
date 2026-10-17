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
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PhoneIphoneKt {
    private static ImageVector _phoneIphone;

    public static final ImageVector getPhoneIphone(Icons.TwoTone twoTone) {
        ImageVector imageVector = _phoneIphone;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.PhoneIphone", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.f(7.0f, 4.0f, 9.0f, 14.0f, 7.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(15.5f, 1.0f, -8.0f);
        a.curveTo(6.12f, 1.0f, 5.0f, 2.12f, 5.0f, 3.5f);
        a.verticalLineToRelative(17.0f);
        a.curveTo(5.0f, 21.88f, 6.12f, 23.0f, 7.5f, 23.0f);
        a.horizontalLineToRelative(8.0f);
        a.curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f);
        a.verticalLineToRelative(-17.0f);
        a.curveTo(18.0f, 2.12f, 16.88f, 1.0f, 15.5f, 1.0f);
        a.close();
        a.moveTo(11.5f, 22.0f);
        a.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        a.reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f);
        a.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        a.reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f);
        k4.r(a, 16.0f, 18.0f, 7.0f, 18.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.x(a, 7.0f, 4.0f, 9.0f, 14.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _phoneIphone = build;
        build.getClass();
        return build;
    }
}
