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
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PedalBikeKt {
    private static ImageVector _pedalBike;

    public static final ImageVector getPedalBike(Icons.Sharp sharp) {
        ImageVector imageVector = _pedalBike;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Sharp.PedalBike", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder k = gy.k(18.18f, 10.0f, 16.0f, 4.0f, -4.0f);
        gy.C(k, 2.0f, 2.6f, 1.46f, 4.0f);
        r6.t(k, -4.81f, -0.36f, -1.0f, 12.0f);
        bv.A(k, 7.0f, 7.0f, 2.0f, 1.75f);
        k.lineToRelative(1.82f, 5.0f);
        k.horizontalLineTo(9.9f);
        k.curveToRelative(-0.44f, -2.23f, -2.31f, -3.88f, -4.65f, -3.99f);
        k.curveTo(2.45f, 9.87f, 0.0f, 12.2f, 0.0f, 15.0f);
        k.curveToRelative(0.0f, 2.8f, 2.2f, 5.0f, 5.0f, 5.0f);
        k.curveToRelative(2.46f, 0.0f, 4.45f, -1.69f, 4.9f, -4.0f);
        k.horizontalLineToRelative(4.2f);
        k.curveToRelative(0.44f, 2.23f, 2.31f, 3.88f, 4.65f, 3.99f);
        k.curveToRelative(2.8f, 0.13f, 5.25f, -2.19f, 5.25f, -5.0f);
        k.curveToRelative(0.0f, -2.8f, -2.2f, -5.0f, -5.0f, -5.0f);
        k4.w(k, 18.18f, 7.82f, 16.0f);
        k.curveToRelative(-0.4f, 1.17f, -1.49f, 2.0f, -2.82f, 2.0f);
        k.curveToRelative(-1.68f, 0.0f, -3.0f, -1.32f, -3.0f, -3.0f);
        k.reflectiveCurveToRelative(1.32f, -3.0f, 3.0f, -3.0f);
        k.curveToRelative(1.33f, 0.0f, 2.42f, 0.83f, 2.82f, 2.0f);
        fc.j(k, 5.0f, 2.0f, 7.82f);
        k.moveTo(14.1f, 14.0f);
        r6.t(k, -1.4f, -0.73f, -2.0f, 15.0f);
        k.curveTo(14.56f, 12.58f, 14.24f, 13.25f, 14.1f, 14.0f);
        k.close();
        k.moveTo(19.0f, 18.0f);
        k.curveToRelative(-1.68f, 0.0f, -3.0f, -1.32f, -3.0f, -3.0f);
        k.curveToRelative(0.0f, -0.93f, 0.41f, -1.73f, 1.05f, -2.28f);
        k.lineToRelative(0.96f, 2.64f);
        k.lineToRelative(1.88f, -0.68f);
        k.lineToRelative(-0.97f, -2.67f);
        k.curveToRelative(0.03f, 0.0f, 0.06f, -0.01f, 0.09f, -0.01f);
        k.curveToRelative(1.68f, 0.0f, 3.0f, 1.32f, 3.0f, 3.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, kf0.e(k, 20.68f, 18.0f, 19.0f, 18.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _pedalBike = build;
        build.getClass();
        return build;
    }
}
