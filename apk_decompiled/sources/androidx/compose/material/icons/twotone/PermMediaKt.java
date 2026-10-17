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
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PermMediaKt {
    private static ImageVector _permMedia;

    public static final ImageVector getPermMedia(Icons.TwoTone twoTone) {
        ImageVector imageVector = _permMedia;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.PermMedia", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(13.17f, 6.0f, -0.59f, -0.59f);
        e.lineTo(11.17f, 4.0f);
        af0.m(e, 6.0f, 4.0f, 12.0f, 16.0f);
        uf.j(e, 22.0f, 6.0f, -8.83f);
        e.moveTo(17.5f, 10.5f);
        e.lineTo(21.0f, 15.0f);
        e.lineTo(7.0f, 15.0f);
        e.lineToRelative(4.5f, -6.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(e, 3.5f, 4.51f, 2.5f, -3.01f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder s = uo.s(2.0f, 6.0f, 0.0f, 6.0f, 5.0f);
        s.horizontalLineToRelative(0.01f);
        s.lineTo(0.0f, 20.0f);
        s.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        bv.C(s, 18.0f, -2.0f, 2.0f, 20.0f);
        uo.l(s, 2.0f, 6.0f, 7.0f, 15.0f);
        s.horizontalLineToRelative(14.0f);
        s.lineToRelative(-3.5f, -4.5f);
        gy.B(s, -2.5f, 3.01f, 11.5f, 9.0f);
        s.moveTo(22.0f, 4.0f);
        s.horizontalLineToRelative(-8.0f);
        s.lineToRelative(-2.0f, -2.0f);
        s.lineTo(6.0f, 2.0f);
        s.curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        s.lineTo(4.0f, 16.0f);
        s.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        s.horizontalLineToRelative(16.0f);
        s.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        s.lineTo(24.0f, 6.0f);
        s.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        k4.r(s, 22.0f, 16.0f, 6.0f, 16.0f);
        s.lineTo(6.0f, 4.0f);
        s.horizontalLineToRelative(5.17f);
        s.lineToRelative(1.41f, 1.41f);
        s.lineToRelative(0.59f, 0.59f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, bv.f(s, 22.0f, 6.0f, 10.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _permMedia = build;
        build.getClass();
        return build;
    }
}
