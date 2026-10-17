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
import defpackage.kp0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FormatShapesKt {
    private static ImageVector _formatShapes;

    public static final ImageVector getFormatShapes(Icons.TwoTone twoTone) {
        ImageVector imageVector = _formatShapes;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("TwoTone.FormatShapes", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b = bv.b(3.0f, 3.0f, 2.0f, 2.0f);
        uo.l(b, 3.0f, 5.0f, 19.0f, 19.0f);
        j50.n(b, 2.0f, 2.0f, -2.0f);
        k4.C(b, 19.0f, 3.0f, 2.0f, 2.0f);
        kp0.A(b, -2.0f, 3.0f, 19.0f, 2.0f);
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, bv.j(b, 2.0f, 3.0f, 21.0f), defaultFillType, "", solidColor, 0.3f, null, 0.3f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder b2 = kf0.b(11.29f, 7.0f, -3.4f, 9.0f, 1.62f);
        b2.lineToRelative(0.73f, -2.0f);
        kf0.B(b2, 3.49f, 0.74f, 2.0f, 1.63f);
        uf.r(b2, -3.41f, -9.0f, -1.4f);
        b2.moveTo(10.69f, 12.74f);
        b2.lineTo(12.0f, 8.91f);
        uf.r(b2, 1.3f, 3.83f, -2.61f);
        b2.moveTo(17.0f, 3.0f);
        b2.lineTo(7.0f, 3.0f);
        b2.lineTo(7.0f, 1.0f);
        af0.m(b2, 1.0f, 1.0f, 6.0f, 2.0f);
        bv.q(b2, 10.0f, 1.0f, 17.0f, 6.0f);
        af0.v(b2, 6.0f, -2.0f, 10.0f, 2.0f);
        kf0.x(b2, 6.0f, -6.0f, -2.0f);
        b2.lineTo(21.0f, 7.0f);
        uo.n(b2, 2.0f, 23.0f, 1.0f, -6.0f);
        bv.m(b2, 2.0f, 3.0f, 3.0f, 2.0f);
        b2.verticalLineToRelative(2.0f);
        r6.C(b2, 3.0f, 5.0f, 3.0f, 3.0f);
        b2.moveTo(5.0f, 21.0f);
        af0.m(b2, 3.0f, 21.0f, -2.0f, 2.0f);
        bv.m(b2, 2.0f, 21.0f, 21.0f, -2.0f);
        r6.p(b2, -2.0f, 2.0f, 2.0f);
        k4.C(b2, 19.0f, 3.0f, 2.0f, 2.0f);
        gy.n(b2, -2.0f, 19.0f, 3.0f);
        k4.C(b2, 19.0f, 17.0f, -2.0f, 2.0f);
        b2.lineTo(7.0f, 19.0f);
        b2.verticalLineToRelative(-2.0f);
        b2.lineTo(5.0f, 17.0f);
        b2.lineTo(5.0f, 7.0f);
        uo.n(b2, 2.0f, 7.0f, 5.0f, 10.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.r(b2, 2.0f, 2.0f, 10.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _formatShapes = build;
        build.getClass();
        return build;
    }
}
