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
import defpackage.bv;
import defpackage.k4;
import defpackage.kf0;
import defpackage.kp0;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AirlineSeatFlatKt {
    private static ImageVector _airlineSeatFlat;

    public static final ImageVector getAirlineSeatFlat(Icons.Outlined outlined) {
        ImageVector imageVector = _airlineSeatFlat;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.AirlineSeatFlat", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(5.0f, 13.0f);
        b.curveToRelative(0.78f, 0.0f, 1.55f, -0.3f, 2.14f, -0.9f);
        b.curveToRelative(1.16f, -1.19f, 1.14f, -3.08f, -0.04f, -4.24f);
        b.curveTo(6.51f, 7.29f, 5.75f, 7.0f, 5.0f, 7.0f);
        b.curveToRelative(-0.78f, 0.0f, -1.55f, 0.3f, -2.14f, 0.9f);
        b.curveToRelative(-1.16f, 1.19f, -1.14f, 3.08f, 0.04f, 4.24f);
        b.curveToRelative(0.59f, 0.57f, 1.35f, 0.86f, 2.1f, 0.86f);
        b.close();
        b.moveTo(4.29f, 9.3f);
        b.curveToRelative(0.19f, -0.19f, 0.44f, -0.3f, 0.71f, -0.3f);
        b.curveToRelative(0.26f, 0.0f, 0.51f, 0.1f, 0.7f, 0.28f);
        b.curveToRelative(0.4f, 0.39f, 0.4f, 1.01f, 0.02f, 1.41f);
        b.curveToRelative(-0.2f, 0.2f, -0.45f, 0.31f, -0.72f, 0.31f);
        b.curveToRelative(-0.26f, 0.0f, -0.51f, -0.1f, -0.7f, -0.28f);
        b.curveToRelative(-0.4f, -0.4f, -0.4f, -1.02f, -0.01f, -1.42f);
        k4.r(b, 18.0f, 7.0f, 9.0f, 7.0f);
        kf0.z(b, 6.0f, 13.0f, -2.0f);
        b.curveToRelative(0.0f, -2.21f, -1.79f, -4.0f, -4.0f, -4.0f);
        k4.r(b, 11.0f, 11.0f, 11.0f, 9.0f);
        b.horizontalLineToRelative(7.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        kp0.A(b, -9.0f, 2.0f, 16.0f, 6.0f);
        r6.D(b, 2.0f, 8.0f, -2.0f, 6.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, bv.j(b, -2.0f, 2.0f, 14.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _airlineSeatFlat = build;
        build.getClass();
        return build;
    }
}
