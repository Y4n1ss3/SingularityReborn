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
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class TextsmsKt {
    private static ImageVector _textsms;

    public static final ImageVector getTextsms(Icons.TwoTone twoTone) {
        ImageVector imageVector = _textsms;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.Textsms", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = kf0.b(4.0f, 18.0f, 2.0f, -2.0f, 14.0f);
        b.lineTo(20.0f, 4.0f);
        bv.r(b, 4.0f, 4.0f, 14.0f);
        k4.C(b, 15.0f, 9.0f, 2.0f, 2.0f);
        gy.n(b, -2.0f, 15.0f, 9.0f);
        k4.C(b, 11.0f, 9.0f, 2.0f, 2.0f);
        gy.n(b, -2.0f, 11.0f, 9.0f);
        k4.C(b, 7.0f, 9.0f, 2.0f, 2.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(b, 7.0f, 11.0f, 7.0f, 9.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(20.0f, 2.0f, 4.0f, 2.0f);
        i.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        r6.h(i, 18.0f, 4.0f, -4.0f, 14.0f);
        i.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        i.lineTo(22.0f, 4.0f);
        i.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        k4.r(i, 20.0f, 16.0f, 6.0f, 16.0f);
        i.lineToRelative(-2.0f, 2.0f);
        r6.m(i, 4.0f, 4.0f, 16.0f, 12.0f);
        k4.C(i, 7.0f, 9.0f, 2.0f, 2.0f);
        uo.l(i, 7.0f, 11.0f, 11.0f, 9.0f);
        j50.n(i, 2.0f, 2.0f, -2.0f);
        k4.C(i, 15.0f, 9.0f, 2.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.d(i, -2.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _textsms = build;
        build.getClass();
        return build;
    }
}
