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
import defpackage.k4;
import defpackage.kf0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DifferenceKt {
    private static ImageVector _difference;

    public static final ImageVector getDifference(Icons.Outlined outlined) {
        ImageVector imageVector = _difference;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.Difference", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(18.0f, 23.0f, 4.0f);
        d.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        uf.p(d, 7.0f, 2.0f, 14.0f, 14.0f);
        uo.y(d, 23.0f, 14.5f, 7.0f, 5.0f);
        af0.v(d, -2.0f, 2.0f, -2.0f, 2.0f);
        af0.w(d, 2.0f, 2.0f, 2.0f, 9.0f);
        kf0.v(d, 2.0f, 7.0f, 14.5f);
        k4.C(d, 16.5f, 13.0f, -6.0f, 2.0f);
        uo.r(d, 6.0f, 13.0f, 15.0f, 1.0f);
        d.horizontalLineTo(8.0f);
        d.curveTo(6.9f, 1.0f, 6.01f, 1.9f, 6.01f, 3.0f);
        d.lineTo(6.0f, 17.0f);
        d.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 1.99f, 2.0f);
        d.horizontalLineTo(19.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        bv.k(d, 7.0f, 15.0f, 1.0f);
        uo.p(d, 19.0f, 17.0f, 8.0f, 3.0f);
        d.horizontalLineToRelative(6.17f);
        d.lineTo(19.0f, 7.83f);
        d.verticalLineTo(17.0f);
        d.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, d.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _difference = build;
        build.getClass();
        return build;
    }
}
