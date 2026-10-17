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
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ElectricMeterKt {
    private static ImageVector _electricMeter;

    public static final ImageVector getElectricMeter(Icons.Filled filled) {
        ImageVector imageVector = _electricMeter;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.ElectricMeter", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 2.0f);
        b.curveToRelative(-4.96f, 0.0f, -9.0f, 4.04f, -9.0f, 9.0f);
        b.curveToRelative(0.0f, 3.91f, 2.51f, 7.24f, 6.0f, 8.47f);
        kf0.r(b, 22.0f, 2.0f, -2.06f);
        b.curveToRelative(0.33f, 0.04f, 0.66f, 0.06f, 1.0f, 0.06f);
        b.reflectiveCurveToRelative(0.67f, -0.02f, 1.0f, -0.06f);
        kf0.r(b, 22.0f, 2.0f, -2.53f);
        b.curveToRelative(3.49f, -1.24f, 6.0f, -4.57f, 6.0f, -8.47f);
        b.curveTo(21.0f, 6.04f, 16.96f, 2.0f, 12.0f, 2.0f);
        k4.x(b, 14.25f, 14.0f, -3.0f, 3.0f);
        b.lineToRelative(-1.5f, -1.5f);
        b.lineTo(11.0f, 14.25f);
        b.lineTo(9.75f, 13.0f);
        b.lineToRelative(3.0f, -3.0f);
        b.lineToRelative(1.5f, 1.5f);
        r6.C(b, 13.0f, 12.75f, 14.25f, 14.0f);
        uo.p(b, 16.0f, 9.0f, 8.0f, 7.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.i(b, 8.0f, 9.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _electricMeter = build;
        build.getClass();
        return build;
    }
}
