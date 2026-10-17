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
import defpackage.af0;
import defpackage.fc;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class GpsOffKt {
    private static ImageVector _gpsOff;

    public static final ImageVector getGpsOff(Icons.Filled filled) {
        ImageVector imageVector = _gpsOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.GpsOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(20.94f, 11.0f);
        b.curveToRelative(-0.46f, -4.17f, -3.77f, -7.48f, -7.94f, -7.94f);
        fc.w(b, 13.0f, 1.0f, -2.0f, 2.06f);
        b.curveToRelative(-1.13f, 0.12f, -2.19f, 0.46f, -3.16f, 0.97f);
        b.lineToRelative(1.5f, 1.5f);
        b.curveTo(10.16f, 5.19f, 11.06f, 5.0f, 12.0f, 5.0f);
        b.curveToRelative(3.87f, 0.0f, 7.0f, 3.13f, 7.0f, 7.0f);
        b.curveToRelative(0.0f, 0.94f, -0.19f, 1.84f, -0.52f, 2.65f);
        b.lineToRelative(1.5f, 1.5f);
        b.curveToRelative(0.5f, -0.96f, 0.84f, -2.02f, 0.97f, -3.15f);
        kp0.x(b, 23.0f, 13.0f, -2.0f, -2.06f);
        b.moveTo(3.0f, 4.27f);
        b.lineToRelative(2.04f, 2.04f);
        b.curveTo(3.97f, 7.62f, 3.25f, 9.23f, 3.06f, 11.0f);
        af0.m(b, 1.0f, 11.0f, 2.0f, 2.06f);
        b.curveToRelative(0.46f, 4.17f, 3.77f, 7.48f, 7.94f, 7.94f);
        fc.w(b, 11.0f, 23.0f, 2.0f, -2.06f);
        b.curveToRelative(1.77f, -0.2f, 3.38f, -0.91f, 4.69f, -1.98f);
        b.lineTo(19.73f, 21.0f);
        b.lineTo(21.0f, 19.73f);
        r6.C(b, 4.27f, 3.0f, 3.0f, 4.27f);
        b.moveTo(16.27f, 17.54f);
        b.curveTo(15.09f, 18.45f, 13.61f, 19.0f, 12.0f, 19.0f);
        b.curveToRelative(-3.87f, 0.0f, -7.0f, -3.13f, -7.0f, -7.0f);
        b.curveToRelative(0.0f, -1.61f, 0.55f, -3.09f, 1.46f, -4.27f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, uf.g(b, 9.81f, 9.81f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _gpsOff = build;
        build.getClass();
        return build;
    }
}
