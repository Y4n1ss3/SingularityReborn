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
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LoupeKt {
    private static ImageVector _loupe;

    public static final ImageVector getLoupe(Icons.TwoTone twoTone) {
        ImageVector imageVector = _loupe;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Loupe", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 20.0f);
        b.curveToRelative(4.41f, 0.0f, 8.0f, -3.59f, 8.0f, -8.0f);
        b.reflectiveCurveToRelative(-3.59f, -8.0f, -8.0f, -8.0f);
        b.reflectiveCurveToRelative(-8.0f, 3.59f, -8.0f, 8.0f);
        b.reflectiveCurveToRelative(3.59f, 8.0f, 8.0f, 8.0f);
        af0.l(b, 7.0f, 11.0f, 4.0f);
        fc.w(b, 11.0f, 7.0f, 2.0f, 4.0f);
        af0.v(b, 4.0f, 2.0f, -4.0f, 4.0f);
        bv.C(b, -2.0f, -4.0f, 7.0f, 13.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.c(b, -2.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder n = k4.n(11.0f, 17.0f, 2.0f, -4.0f, 4.0f);
        uo.B(n, -2.0f, -4.0f, 13.0f, 7.0f);
        bv.C(n, -2.0f, 4.0f, 7.0f, 11.0f);
        kf0.C(n, 2.0f, 4.0f, 12.0f, 22.0f);
        n.horizontalLineToRelative(8.0f);
        n.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        n.verticalLineToRelative(-8.0f);
        n.curveToRelative(0.0f, -5.51f, -4.49f, -10.0f, -10.0f, -10.0f);
        n.reflectiveCurveTo(2.0f, 6.49f, 2.0f, 12.0f);
        n.reflectiveCurveToRelative(4.49f, 10.0f, 10.0f, 10.0f);
        n.close();
        n.moveTo(12.0f, 4.0f);
        n.curveToRelative(4.41f, 0.0f, 8.0f, 3.59f, 8.0f, 8.0f);
        n.reflectiveCurveToRelative(-3.59f, 8.0f, -8.0f, 8.0f);
        n.reflectiveCurveToRelative(-8.0f, -3.59f, -8.0f, -8.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(n, 3.59f, -8.0f, 8.0f, -8.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _loupe = build;
        build.getClass();
        return build;
    }
}
