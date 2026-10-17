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
import defpackage.fc;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AirlineSeatFlatAngledKt {
    private static ImageVector _airlineSeatFlatAngled;

    public static final ImageVector getAirlineSeatFlatAngled(Icons.Filled filled) {
        ImageVector imageVector = _airlineSeatFlatAngled;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.AirlineSeatFlatAngled", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(22.25f, 14.29f, -0.69f, 1.89f);
        e.lineTo(9.2f, 11.71f);
        e.lineToRelative(2.08f, -5.66f);
        e.lineToRelative(8.56f, 3.09f);
        e.curveToRelative(2.1f, 0.76f, 3.18f, 3.06f, 2.41f, 5.15f);
        k4.r(e, 1.5f, 12.14f, 8.0f, 14.48f);
        fc.w(e, 8.0f, 19.0f, 8.0f, -1.63f);
        e.lineTo(20.52f, 19.0f);
        e.lineToRelative(0.69f, -1.89f);
        fc.C(e, -19.02f, -6.86f, -0.69f, 1.89f);
        e.moveTo(7.3f, 10.2f);
        e.curveToRelative(1.49f, -0.72f, 2.12f, -2.51f, 1.41f, -4.0f);
        e.curveTo(7.99f, 4.71f, 6.2f, 4.08f, 4.7f, 4.8f);
        e.curveToRelative(-1.49f, 0.71f, -2.12f, 2.5f, -1.4f, 4.0f);
        e.curveToRelative(0.71f, 1.49f, 2.5f, 2.12f, 4.0f, 1.4f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _airlineSeatFlatAngled = build;
        build.getClass();
        return build;
    }
}
