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
import defpackage.bv;
import defpackage.fc;
import defpackage.gy;
import defpackage.kf0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WcKt {
    private static ImageVector _wc;

    public static final ImageVector getWc(Icons.Sharp sharp) {
        ImageVector imageVector = _wc;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.Wc", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder y = gy.y(5.5f, 22.0f, -7.5f, 4.0f, 14.5f);
        fc.w(y, 4.0f, 7.0f, 7.0f, 7.5f);
        y.lineTo(9.5f, 14.5f);
        uf.j(y, 9.5f, 22.0f, -4.0f);
        bv.y(y, 18.0f, 22.0f, -6.0f, 3.0f);
        y.lineToRelative(-3.0f, -9.0f);
        kf0.B(y, -3.0f, -3.0f, 9.0f, 3.0f);
        kf0.C(y, 6.0f, 3.0f, 7.5f, 6.0f);
        y.curveToRelative(1.11f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f);
        y.reflectiveCurveToRelative(-0.89f, -2.0f, -2.0f, -2.0f);
        y.reflectiveCurveToRelative(-2.0f, 0.89f, -2.0f, 2.0f);
        y.reflectiveCurveToRelative(0.89f, 2.0f, 2.0f, 2.0f);
        y.close();
        y.moveTo(16.5f, 6.0f);
        y.curveToRelative(1.11f, 0.0f, 2.0f, -0.89f, 2.0f, -2.0f);
        y.reflectiveCurveToRelative(-0.89f, -2.0f, -2.0f, -2.0f);
        y.reflectiveCurveToRelative(-2.0f, 0.89f, -2.0f, 2.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(y, 0.89f, 2.0f, 2.0f, 2.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wc = build;
        build.getClass();
        return build;
    }
}
