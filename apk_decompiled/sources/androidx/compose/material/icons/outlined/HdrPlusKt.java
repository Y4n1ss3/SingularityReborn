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
import defpackage.fc;
import defpackage.k4;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class HdrPlusKt {
    private static ImageVector _hdrPlus;

    public static final ImageVector getHdrPlus(Icons.Outlined outlined) {
        ImageVector imageVector = _hdrPlus;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.HdrPlus", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(8.13f, 19.0f);
        b.curveToRelative(1.15f, 0.64f, 2.47f, 1.0f, 3.87f, 1.0f);
        b.curveToRelative(4.41f, 0.0f, 8.0f, -3.59f, 8.0f, -8.0f);
        b.reflectiveCurveToRelative(-3.59f, -8.0f, -8.0f, -8.0f);
        b.reflectiveCurveToRelative(-8.0f, 3.59f, -8.0f, 8.0f);
        b.curveToRelative(0.0f, 2.52f, 1.17f, 4.77f, 3.0f, 6.24f);
        b.verticalLineTo(13.0f);
        b.horizontalLineToRelative(3.5f);
        b.curveToRelative(0.8f, 0.0f, 1.5f, 0.7f, 1.5f, 1.5f);
        b.verticalLineToRelative(1.0f);
        b.curveToRelative(0.0f, 0.6f, -0.4f, 1.1f, -0.9f, 1.4f);
        b.lineTo(12.0f, 19.0f);
        r6.t(b, -1.5f, -0.9f, -2.0f, 8.5f);
        kf0.n(b, 2.0f, 8.13f, 12.0f, 2.0f);
        b.curveToRelative(5.52f, 0.0f, 10.0f, 4.48f, 10.0f, 10.0f);
        b.reflectiveCurveToRelative(-4.48f, 10.0f, -10.0f, 10.0f);
        b.reflectiveCurveTo(2.0f, 17.52f, 2.0f, 12.0f);
        b.reflectiveCurveTo(6.48f, 2.0f, 12.0f, 2.0f);
        uo.q(b, 17.5f, 16.0f, 16.0f, 1.5f);
        af0.p(b, -1.5f, 16.0f, 13.0f, -1.5f);
        af0.p(b, 1.5f, 13.0f, 16.0f, 1.49f);
        uo.r(b, 1.5f, 16.0f, 10.5f, 15.5f);
        fc.y(b, -1.0f, -2.0f, 1.0f, 10.5f);
        kp0.C(b, 10.5f, 8.0f, 6.0f, 12.0f);
        k4.l(b, 6.0f, -1.5f, 9.5f, -2.0f);
        uo.m(b, 12.0f, 7.0f, 6.0f, 1.5f);
        kf0.n(b, 2.0f, 10.5f, 16.0f, 6.0f);
        b.curveToRelative(0.8f, 0.0f, 1.5f, 0.7f, 1.5f, 1.5f);
        b.verticalLineToRelative(3.0f);
        b.curveToRelative(0.0f, 0.8f, -0.7f, 1.5f, -1.5f, 1.5f);
        kf0.v(b, -3.0f, 6.0f, 16.0f);
        bv.y(b, 16.0f, 10.5f, -3.0f, -1.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, bv.e(b, 3.0f, 16.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _hdrPlus = build;
        build.getClass();
        return build;
    }
}
