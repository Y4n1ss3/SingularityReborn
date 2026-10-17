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
import defpackage.gy;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AirlineSeatFlatKt {
    private static ImageVector _airlineSeatFlat;

    public static final ImageVector getAirlineSeatFlat(Icons.Sharp sharp) {
        ImageVector imageVector = _airlineSeatFlat;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.AirlineSeatFlat", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder y = gy.y(22.0f, 7.0f, 6.0f, 9.0f, 13.0f);
        uf.j(y, 9.0f, 7.0f, 13.0f);
        bv.y(y, 2.0f, 14.0f, 2.0f, 6.0f);
        r6.D(y, 2.0f, 8.0f, -2.0f, 6.0f);
        kf0.t(y, -2.0f, 2.0f, 14.0f);
        y.moveTo(7.14f, 12.1f);
        y.curveToRelative(1.16f, -1.19f, 1.14f, -3.08f, -0.04f, -4.24f);
        y.curveToRelative(-1.19f, -1.16f, -3.08f, -1.14f, -4.24f, 0.04f);
        y.curveToRelative(-1.16f, 1.19f, -1.14f, 3.08f, 0.04f, 4.24f);
        y.curveToRelative(1.19f, 1.16f, 3.08f, 1.14f, 4.24f, -0.04f);
        y.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, y.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _airlineSeatFlat = build;
        build.getClass();
        return build;
    }
}
