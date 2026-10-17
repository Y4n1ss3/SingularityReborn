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
import defpackage.gy;
import defpackage.k4;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class CenterFocusStrongKt {
    private static ImageVector _centerFocusStrong;

    public static final ImageVector getCenterFocusStrong(Icons.TwoTone twoTone) {
        ImageVector imageVector = _centerFocusStrong;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.CenterFocusStrong", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = af0.b(12.0f, 12.0f, -3.0f, 0.0f);
        b.arcToRelative(3.0f, 3.0f, 0.0f, true, true, 6.0f, 0.0f);
        b.arcToRelative(3.0f, 3.0f, 0.0f, true, true, -6.0f, 0.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(7.0f, 12.0f);
        b2.curveToRelative(0.0f, 2.76f, 2.24f, 5.0f, 5.0f, 5.0f);
        b2.reflectiveCurveToRelative(5.0f, -2.24f, 5.0f, -5.0f);
        b2.reflectiveCurveToRelative(-2.24f, -5.0f, -5.0f, -5.0f);
        b2.reflectiveCurveToRelative(-5.0f, 2.24f, -5.0f, 5.0f);
        b2.close();
        b2.moveTo(15.0f, 12.0f);
        b2.curveToRelative(0.0f, 1.65f, -1.35f, 3.0f, -3.0f, 3.0f);
        b2.reflectiveCurveToRelative(-3.0f, -1.35f, -3.0f, -3.0f);
        b2.reflectiveCurveToRelative(1.35f, -3.0f, 3.0f, -3.0f);
        b2.reflectiveCurveToRelative(3.0f, 1.35f, 3.0f, 3.0f);
        b2.close();
        b2.moveTo(3.0f, 19.0f);
        b2.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        bv.C(b2, 4.0f, -2.0f, 5.0f, 19.0f);
        bv.n(b2, -4.0f, 3.0f, 15.0f, 4.0f);
        bv.y(b2, 3.0f, 5.0f, 4.0f, 2.0f);
        b2.lineTo(5.0f, 5.0f);
        b2.horizontalLineToRelative(4.0f);
        b2.lineTo(9.0f, 3.0f);
        b2.lineTo(5.0f, 3.0f);
        b2.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        b2.close();
        b2.moveTo(21.0f, 5.0f);
        b2.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        af0.v(b2, -4.0f, 2.0f, 4.0f, 4.0f);
        gy.n(b2, 2.0f, 21.0f, 5.0f);
        k4.C(b2, 19.0f, 19.0f, -4.0f, 2.0f);
        b2.horizontalLineToRelative(4.0f);
        b2.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.r(b2, -4.0f, -2.0f, 4.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _centerFocusStrong = build;
        build.getClass();
        return build;
    }
}
