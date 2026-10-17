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
import defpackage.c21;
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ProductionQuantityLimitsKt {
    private static ImageVector _productionQuantityLimits;

    public static final ImageVector getProductionQuantityLimits(Icons.Outlined outlined) {
        ImageVector imageVector = _productionQuantityLimits;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.ProductionQuantityLimits", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder n = fc.n(13.0f, 10.0f, -2.0f, 8.0f, 2.0f);
        k4.D(n, 10.0f, 13.0f, 6.0f, -2.0f);
        c21.c(n, 1.0f, 2.0f, 6.0f);
        n.moveTo(7.0f, 18.0f);
        n.curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        n.reflectiveCurveTo(5.9f, 22.0f, 7.0f, 22.0f);
        n.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        n.reflectiveCurveTo(8.1f, 18.0f, 7.0f, 18.0f);
        n.close();
        n.moveTo(17.0f, 18.0f);
        n.curveToRelative(-1.1f, 0.0f, -1.99f, 0.9f, -1.99f, 2.0f);
        n.reflectiveCurveToRelative(0.89f, 2.0f, 1.99f, 2.0f);
        n.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        n.reflectiveCurveTo(18.1f, 18.0f, 17.0f, 18.0f);
        af0.l(n, 8.1f, 13.0f, 7.45f);
        n.curveToRelative(0.75f, 0.0f, 1.41f, -0.41f, 1.75f, -1.03f);
        n.lineTo(21.0f, 4.96f);
        n.lineTo(19.25f, 4.0f);
        n.lineToRelative(-3.7f, 7.0f);
        bv.u(n, 8.53f, 4.27f, 2.0f, 1.0f);
        gy.C(n, 2.0f, 2.0f, 3.6f, 7.59f);
        n.lineToRelative(-1.35f, 2.44f);
        n.curveTo(4.52f, 15.37f, 5.48f, 17.0f, 7.0f, 17.0f);
        k4.k(n, 12.0f, -2.0f, 7.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(n, 8.1f, 13.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _productionQuantityLimits = build;
        build.getClass();
        return build;
    }
}
