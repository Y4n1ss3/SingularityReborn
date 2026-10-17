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
import defpackage.gy;
import defpackage.j50;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class FortKt {
    private static ImageVector _fort;

    public static final ImageVector getFort(Icons.Outlined outlined) {
        ImageVector imageVector = _fort;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Fort", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder w = kp0.w(21.0f, 3.0f, 2.0f, -2.0f, 3.0f);
        af0.w(w, -2.0f, 2.0f, -2.0f, 3.0f);
        bv.p(w, -2.0f, 4.0f, 2.0f, 2.0f);
        gy.i(w, 1.0f, 9.0f, 9.0f);
        uo.x(w, 2.0f, -2.0f, 3.0f, 9.0f);
        gy.A(w, 2.0f, 7.0f, 3.0f, 5.0f);
        gy.A(w, 2.0f, 3.0f, 3.0f, 1.0f);
        j50.A(w, 4.0f, 2.0f, 2.0f, 6.0f);
        r6.A(w, -2.0f, 2.0f, 4.0f, 9.0f);
        w.verticalLineToRelative(-3.0f);
        w.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        w.reflectiveCurveToRelative(2.0f, 0.9f, 2.0f, 2.0f);
        kf0.z(w, 3.0f, 9.0f, -4.0f);
        w.lineToRelative(-2.0f, -2.0f);
        w.verticalLineTo(9.0f);
        w.lineToRelative(2.0f, -2.0f);
        w.verticalLineTo(3.0f);
        kp0.r(w, 21.0f, 21.0f, 19.0f, -5.0f);
        w.verticalLineToRelative(-1.0f);
        w.curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f);
        w.reflectiveCurveToRelative(-4.0f, 1.79f, -4.0f, 4.0f);
        r6.s(w, 1.0f, 3.0f, -1.17f);
        w.lineToRelative(2.0f, -2.0f);
        w.verticalLineTo(8.17f);
        w.lineTo(3.83f, 7.0f);
        w.horizontalLineToRelative(4.34f);
        fc.t(w, 7.0f, 8.17f, 12.0f, 10.0f);
        w.verticalLineTo(8.17f);
        w.lineTo(15.83f, 7.0f);
        w.horizontalLineToRelative(4.34f);
        w.lineTo(19.0f, 8.17f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.n(w, 7.66f, 2.0f, 2.0f, 19.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _fort = build;
        build.getClass();
        return build;
    }
}
