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
import defpackage.fc;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DevicesOtherKt {
    private static ImageVector _devicesOther;

    public static final ImageVector getDevicesOther(Icons.TwoTone twoTone) {
        ImageVector imageVector = _devicesOther;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.DevicesOther", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.c(17.0f, 10.0f, 4.0f, 8.0f, -4.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, companion3.m5145getBevelLxFBmk8(), 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = af0.b(11.0f, 16.0f, -1.5f, 0.0f);
        b.arcToRelative(1.5f, 1.5f, 0.0f, true, true, 3.0f, 0.0f);
        b.arcToRelative(1.5f, 1.5f, 0.0f, true, true, -3.0f, 0.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType2, "", solidColor2, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType3 = VectorKt.getDefaultFillType();
        SolidColor solidColor3 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw3 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder p = kf0.p(3.0f, 6.0f, 18.0f, 21.0f, 4.0f);
        p.lineTo(3.0f, 4.0f);
        p.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        p.verticalLineToRelative(12.0f);
        p.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        bv.C(p, 4.0f, -2.0f, 3.0f, 18.0f);
        uo.l(p, 3.0f, 6.0f, 22.0f, 8.0f);
        p.horizontalLineToRelative(-6.0f);
        p.curveToRelative(-0.5f, 0.0f, -1.0f, 0.5f, -1.0f, 1.0f);
        p.verticalLineToRelative(10.0f);
        p.curveToRelative(0.0f, 0.5f, 0.5f, 1.0f, 1.0f, 1.0f);
        p.horizontalLineToRelative(6.0f);
        p.curveToRelative(0.5f, 0.0f, 1.0f, -0.5f, 1.0f, -1.0f);
        p.lineTo(23.0f, 9.0f);
        p.curveToRelative(0.0f, -0.5f, -0.5f, -1.0f, -1.0f, -1.0f);
        r6.B(p, 21.0f, 18.0f, -4.0f, -8.0f);
        fc.x(p, 4.0f, 8.0f, 13.0f, 12.0f);
        p.lineTo(9.0f, 12.0f);
        p.verticalLineToRelative(1.78f);
        p.curveToRelative(-0.61f, 0.55f, -1.0f, 1.33f, -1.0f, 2.22f);
        p.reflectiveCurveToRelative(0.39f, 1.67f, 1.0f, 2.22f);
        fc.w(p, 9.0f, 20.0f, 4.0f, -1.78f);
        p.curveToRelative(0.61f, -0.55f, 1.0f, -1.34f, 1.0f, -2.22f);
        p.reflectiveCurveToRelative(-0.39f, -1.67f, -1.0f, -2.22f);
        uo.l(p, 13.0f, 12.0f, 11.0f, 17.5f);
        p.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        p.reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f);
        p.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(p, -0.67f, 1.5f, -1.5f, 1.5f), defaultFillType3, "", solidColor3, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw3, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _devicesOther = build;
        build.getClass();
        return build;
    }
}
