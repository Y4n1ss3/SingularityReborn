package androidx.compose.material.icons.sharp;

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
import defpackage.gy;
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

    public static final ImageVector getFormatShapes(Icons.Sharp sharp) {
        ImageVector imageVector = _formatShapes;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.FormatShapes", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder k = gy.k(23.0f, 7.0f, 23.0f, 1.0f, -6.0f);
        k.verticalLineToRelative(2.0f);
        k.lineTo(7.0f, 3.0f);
        k.lineTo(7.0f, 1.0f);
        af0.m(k, 1.0f, 1.0f, 6.0f, 2.0f);
        bv.q(k, 10.0f, 1.0f, 17.0f, 6.0f);
        af0.v(k, 6.0f, -2.0f, 10.0f, 2.0f);
        kf0.x(k, 6.0f, -6.0f, -2.0f);
        uf.j(k, 21.0f, 7.0f, 2.0f);
        k4.C(k, 3.0f, 3.0f, 2.0f, 2.0f);
        r6.C(k, 3.0f, 5.0f, 3.0f, 3.0f);
        k.moveTo(5.0f, 21.0f);
        af0.m(k, 3.0f, 21.0f, -2.0f, 2.0f);
        r6.l(k, 2.0f, 17.0f, 19.0f);
        k.lineTo(7.0f, 19.0f);
        k.verticalLineToRelative(-2.0f);
        k.lineTo(5.0f, 17.0f);
        k.lineTo(5.0f, 7.0f);
        uo.n(k, 2.0f, 7.0f, 5.0f, 10.0f);
        r6.D(k, 2.0f, 2.0f, 10.0f, -2.0f);
        bv.m(k, 2.0f, 21.0f, 21.0f, -2.0f);
        r6.p(k, -2.0f, 2.0f, 2.0f);
        k.moveTo(19.0f, 5.0f);
        fc.w(k, 19.0f, 3.0f, 2.0f, 2.0f);
        kp0.A(k, -2.0f, 13.73f, 14.0f, -3.49f);
        k.lineToRelative(-0.73f, 2.0f);
        k.lineTo(7.89f, 16.0f);
        k.lineToRelative(3.4f, -9.0f);
        kf0.B(k, 1.4f, 3.41f, 9.0f, -1.63f);
        fc.B(k, -0.74f, -2.0f, 10.69f, 12.74f);
        k.horizontalLineToRelative(2.61f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.u(k, 12.0f, 8.91f, -1.31f, 3.83f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _formatShapes = build;
        build.getClass();
        return build;
    }
}
