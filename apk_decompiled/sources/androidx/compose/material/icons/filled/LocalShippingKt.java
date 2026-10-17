package androidx.compose.material.icons.filled;

import androidx.compose.material.icons.Icons;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.SolidColor;
import androidx.compose.ui.graphics.StrokeCap;
import androidx.compose.ui.graphics.StrokeJoin;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.compose.ui.graphics.vector.PathBuilder;
import androidx.compose.ui.graphics.vector.VectorKt;
import androidx.compose.ui.unit.Dp;
import defpackage.j50;
import defpackage.k4;
import defpackage.kf0;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class LocalShippingKt {
    private static ImageVector _localShipping;

    public static final ImageVector getLocalShipping(Icons.Filled filled) {
        ImageVector imageVector = _localShipping;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.LocalShipping", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder p = kf0.p(20.0f, 8.0f, -3.0f, 17.0f, 4.0f);
        p.lineTo(3.0f, 4.0f);
        p.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        p.verticalLineToRelative(11.0f);
        p.horizontalLineToRelative(2.0f);
        p.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        p.reflectiveCurveToRelative(3.0f, -1.34f, 3.0f, -3.0f);
        p.horizontalLineToRelative(6.0f);
        p.curveToRelative(0.0f, 1.66f, 1.34f, 3.0f, 3.0f, 3.0f);
        p.reflectiveCurveToRelative(3.0f, -1.34f, 3.0f, -3.0f);
        j50.u(p, 2.0f, -5.0f, -3.0f, -4.0f);
        p.moveTo(6.0f, 18.5f);
        p.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        p.reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f);
        p.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        p.reflectiveCurveToRelative(-0.67f, 1.5f, -1.5f, 1.5f);
        k4.x(p, 19.5f, 9.5f, 1.96f, 2.5f);
        p.lineTo(17.0f, 12.0f);
        uf.j(p, 17.0f, 9.5f, 2.5f);
        p.moveTo(18.0f, 18.5f);
        p.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        p.reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f);
        p.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uo.e(p, -0.67f, 1.5f, -1.5f, 1.5f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _localShipping = build;
        build.getClass();
        return build;
    }
}
