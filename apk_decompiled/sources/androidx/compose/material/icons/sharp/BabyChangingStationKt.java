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
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class BabyChangingStationKt {
    private static ImageVector _babyChangingStation;

    public static final ImageVector getBabyChangingStation(Icons.Sharp sharp) {
        ImageVector imageVector = _babyChangingStation;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.BabyChangingStation", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder m = fc.m(14.0f, 8.0f, 2.0f, -3.0f);
        m.lineTo(8.31f, 8.82f);
        uf.u(m, 7.0f, 12.75f, 22.0f, 3.0f);
        m.verticalLineTo(12.0f);
        m.lineToRelative(1.58f, -4.63f);
        m.curveTo(4.86f, 6.53f, 5.63f, 6.01f, 6.46f, 6.0f);
        m.curveTo(6.74f, 6.0f, 7.02f, 6.05f, 7.3f, 6.18f);
        gy.B(m, 4.15f, 1.83f, 14.0f, 8.0f);
        m.moveTo(8.0f, 1.0f);
        m.curveTo(6.9f, 1.0f, 6.0f, 1.9f, 6.0f, 3.0f);
        m.reflectiveCurveToRelative(0.9f, 2.0f, 2.0f, 2.0f);
        m.reflectiveCurveToRelative(2.0f, -0.9f, 2.0f, -2.0f);
        m.reflectiveCurveTo(9.1f, 1.0f, 8.0f, 1.0f);
        r6.B(m, 9.0f, 19.0f, 12.0f, -2.0f);
        bv.s(m, 9.0f, 19.0f, 19.5f, 16.0f);
        m.curveToRelative(0.83f, 0.0f, 1.5f, -0.67f, 1.5f, -1.5f);
        m.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        m.reflectiveCurveTo(18.0f, 13.67f, 18.0f, 14.5f);
        m.curveTo(18.0f, 15.33f, 18.67f, 16.0f, 19.5f, 16.0f);
        af0.A(m, 13.0f, 13.0f, -2.0f, 9.0f);
        r6.D(m, 2.0f, 2.0f, 3.0f, 6.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.i(m, -5.0f, -2.0f, 2.0f, 13.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _babyChangingStation = build;
        build.getClass();
        return build;
    }
}
