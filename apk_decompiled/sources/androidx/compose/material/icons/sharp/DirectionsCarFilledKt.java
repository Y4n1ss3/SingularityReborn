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
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DirectionsCarFilledKt {
    private static ImageVector _directionsCarFilled;

    public static final ImageVector getDirectionsCarFilled(Icons.Sharp sharp) {
        ImageVector imageVector = _directionsCarFilled;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.DirectionsCarFilled", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder l = uf.l(18.57f, 5.0f, 5.43f, 3.0f, 12.0f);
        r6.D(l, 9.0f, 3.0f, -2.0f, 12.0f);
        kf0.z(l, 2.0f, 3.0f, -9.0f);
        uo.l(l, 18.57f, 5.0f, 7.5f, 16.0f);
        l.curveTo(6.67f, 16.0f, 6.0f, 15.33f, 6.0f, 14.5f);
        l.reflectiveCurveTo(6.67f, 13.0f, 7.5f, 13.0f);
        l.reflectiveCurveTo(9.0f, 13.67f, 9.0f, 14.5f);
        l.reflectiveCurveTo(8.33f, 16.0f, 7.5f, 16.0f);
        l.close();
        l.moveTo(16.5f, 16.0f);
        l.curveToRelative(-0.83f, 0.0f, -1.5f, -0.67f, -1.5f, -1.5f);
        l.reflectiveCurveToRelative(0.67f, -1.5f, 1.5f, -1.5f);
        l.reflectiveCurveToRelative(1.5f, 0.67f, 1.5f, 1.5f);
        l.reflectiveCurveTo(17.33f, 16.0f, 16.5f, 16.0f);
        k4.x(l, 5.81f, 10.0f, 1.04f, -3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.e(l, 10.29f, 1.04f, 3.0f, 5.81f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _directionsCarFilled = build;
        build.getClass();
        return build;
    }
}
