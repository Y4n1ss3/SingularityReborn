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
import defpackage.j50;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AddAlertKt {
    private static ImageVector _addAlert;

    public static final ImageVector getAddAlert(Icons.TwoTone twoTone) {
        ImageVector imageVector = _addAlert;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.AddAlert", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 6.0f);
        b.curveToRelative(-2.76f, 0.0f, -5.0f, 2.24f, -5.0f, 5.0f);
        kf0.z(b, 7.0f, 10.0f, -7.0f);
        b.curveToRelative(0.0f, -2.76f, -2.24f, -5.0f, -5.0f, -5.0f);
        r6.B(b, 16.0f, 13.0f, -3.0f, 3.0f);
        bv.C(b, -2.0f, -3.0f, 8.0f, 13.0f);
        uo.B(b, -2.0f, 3.0f, 11.0f, 8.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.k(b, 2.0f, 3.0f, 3.0f, 2.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = uf.b(12.0f, 23.0f);
        b2.curveToRelative(1.1f, 0.0f, 1.99f, -0.89f, 1.99f, -1.99f);
        b2.horizontalLineToRelative(-3.98f);
        b2.curveToRelative(0.0f, 1.1f, 0.89f, 1.99f, 1.99f, 1.99f);
        bv.v(b2, 19.0f, 17.0f, -6.0f);
        b2.curveToRelative(0.0f, -3.35f, -2.36f, -6.15f, -5.5f, -6.83f);
        b2.lineTo(13.5f, 3.0f);
        b2.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        b2.reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f);
        b2.verticalLineToRelative(1.17f);
        b2.curveTo(7.36f, 4.85f, 5.0f, 7.65f, 5.0f, 11.0f);
        j50.A(b2, 6.0f, -2.0f, 2.0f, 1.0f);
        j50.u(b2, 18.0f, -1.0f, -2.0f, -2.0f);
        b2.moveTo(17.0f, 18.0f);
        b2.lineTo(7.0f, 18.0f);
        b2.verticalLineToRelative(-7.0f);
        b2.curveToRelative(0.0f, -2.76f, 2.24f, -5.0f, 5.0f, -5.0f);
        b2.reflectiveCurveToRelative(5.0f, 2.24f, 5.0f, 5.0f);
        r6.l(b2, 7.0f, 13.0f, 11.0f);
        fc.w(b2, 13.0f, 8.0f, -2.0f, 3.0f);
        af0.m(b2, 8.0f, 11.0f, 2.0f, 3.0f);
        r6.D(b2, 3.0f, 2.0f, -3.0f, 3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.c(b2, -2.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _addAlert = build;
        build.getClass();
        return build;
    }
}
