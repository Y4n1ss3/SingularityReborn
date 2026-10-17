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
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class VillaKt {
    private static ImageVector _villa;

    public static final ImageVector getVilla(Icons.TwoTone twoTone) {
        ImageVector imageVector = _villa;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Villa", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder j = kf0.j(5.0f, 9.37f, 9.0f, -3.46f, 12.0f);
        j.horizontalLineTo(9.0f);
        j.verticalLineToRelative(7.0f);
        j.horizontalLineTo(5.0f);
        j.verticalLineTo(9.37f);
        j.close();
        k4.C(j, 19.0f, 19.0f, -3.0f, -3.0f);
        af0.v(j, -2.0f, 3.0f, -3.0f, -5.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(j, 8.0f, 19.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(19.0f, 10.0f);
        b.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        b.horizontalLineToRelative(-1.0f);
        b.verticalLineTo(3.0f);
        b.lineTo(3.0f, 8.0f);
        kf0.z(b, 13.0f, 18.0f, -9.0f);
        b.curveTo(21.0f, 10.9f, 20.1f, 10.0f, 19.0f, 10.0f);
        k4.x(b, 5.0f, 9.37f, 9.0f, -3.46f);
        b.verticalLineTo(12.0f);
        b.horizontalLineTo(9.0f);
        b.verticalLineToRelative(7.0f);
        b.horizontalLineTo(5.0f);
        k4.D(b, 9.37f, 19.0f, 19.0f, -3.0f);
        r6.D(b, -3.0f, -2.0f, 3.0f, -3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.f(b, -5.0f, 8.0f, 19.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _villa = build;
        build.getClass();
        return build;
    }
}
