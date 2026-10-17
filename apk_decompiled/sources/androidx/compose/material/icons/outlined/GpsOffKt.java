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
import defpackage.fc;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class GpsOffKt {
    private static ImageVector _gpsOff;

    public static final ImageVector getGpsOff(Icons.Outlined outlined) {
        ImageVector imageVector = _gpsOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.GpsOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(20.94f, 11.0f);
        b.curveToRelative(-0.46f, -4.17f, -3.77f, -7.48f, -7.94f, -7.94f);
        fc.w(b, 13.0f, 1.0f, -2.0f, 2.06f);
        b.curveToRelative(-0.98f, 0.11f, -1.91f, 0.38f, -2.77f, 0.78f);
        b.lineToRelative(1.53f, 1.53f);
        b.curveTo(10.46f, 5.13f, 11.22f, 5.0f, 12.0f, 5.0f);
        b.curveToRelative(3.87f, 0.0f, 7.0f, 3.13f, 7.0f, 7.0f);
        b.curveToRelative(0.0f, 0.79f, -0.13f, 1.54f, -0.37f, 2.24f);
        b.lineToRelative(1.53f, 1.53f);
        b.curveToRelative(0.4f, -0.86f, 0.67f, -1.79f, 0.78f, -2.77f);
        kp0.x(b, 23.0f, 13.0f, -2.0f, -2.06f);
        b.moveTo(3.0f, 4.27f);
        b.lineToRelative(2.04f, 2.04f);
        b.curveTo(3.97f, 7.62f, 3.26f, 9.23f, 3.06f, 11.0f);
        af0.m(b, 1.0f, 11.0f, 2.0f, 2.06f);
        b.curveToRelative(0.46f, 4.17f, 3.77f, 7.48f, 7.94f, 7.94f);
        fc.w(b, 11.0f, 23.0f, 2.0f, -2.06f);
        b.curveToRelative(1.77f, -0.2f, 3.38f, -0.91f, 4.69f, -1.98f);
        b.lineTo(19.73f, 21.0f);
        b.lineToRelative(1.41f, -1.41f);
        r6.C(b, 4.41f, 2.86f, 3.0f, 4.27f);
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
