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
import defpackage.fc;
import defpackage.k4;
import defpackage.r6;
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AirlineSeatFlatAngledKt {
    private static ImageVector _airlineSeatFlatAngled;

    public static final ImageVector getAirlineSeatFlatAngled(Icons.Outlined outlined) {
        ImageVector imageVector = _airlineSeatFlatAngled;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.AirlineSeatFlatAngled", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(6.0f, 6.5f);
        b.curveToRelative(0.31f, 0.0f, 0.7f, 0.15f, 0.9f, 0.56f);
        b.curveToRelative(0.24f, 0.5f, 0.02f, 1.1f, -0.47f, 1.34f);
        b.curveToRelative(-0.14f, 0.06f, -0.28f, 0.1f, -0.43f, 0.1f);
        b.curveToRelative(-0.3f, 0.0f, -0.7f, -0.15f, -0.89f, -0.56f);
        b.curveToRelative(-0.17f, -0.34f, -0.1f, -0.63f, -0.05f, -0.78f);
        b.curveToRelative(0.05f, -0.14f, 0.18f, -0.4f, 0.51f, -0.56f);
        b.curveToRelative(0.14f, -0.06f, 0.28f, -0.1f, 0.43f, -0.1f);
        b.moveToRelative(6.47f, 2.11f);
        b.lineToRelative(6.69f, 2.41f);
        b.curveToRelative(0.52f, 0.19f, 0.93f, 0.56f, 1.15f, 1.05f);
        b.curveToRelative(0.22f, 0.48f, 0.25f, 1.03f, 0.06f, 1.53f);
        b.lineToRelative(-0.01f, 0.02f);
        b.lineToRelative(-8.59f, -3.11f);
        b.lineToRelative(0.7f, -1.9f);
        b.moveTo(10.0f, 15.19f);
        b.lineToRelative(4.0f, 1.44f);
        fc.w(b, 14.0f, 17.0f, -4.0f, -1.81f);
        b.moveTo(6.0f, 4.5f);
        b.curveToRelative(-0.44f, 0.0f, -0.88f, 0.1f, -1.3f, 0.3f);
        b.curveToRelative(-1.49f, 0.71f, -2.12f, 2.5f, -1.4f, 4.0f);
        b.curveToRelative(0.51f, 1.07f, 1.58f, 1.7f, 2.7f, 1.7f);
        b.curveToRelative(0.44f, 0.0f, 0.88f, -0.1f, 1.3f, -0.3f);
        b.curveToRelative(1.49f, -0.72f, 2.12f, -2.51f, 1.41f, -4.0f);
        b.curveTo(8.19f, 5.13f, 7.12f, 4.5f, 6.0f, 4.5f);
        k4.r(b, 11.28f, 6.05f, 9.2f, 11.71f);
        b.lineToRelative(12.36f, 4.47f);
        b.lineToRelative(0.69f, -1.89f);
        b.curveToRelative(0.77f, -2.09f, -0.31f, -4.39f, -2.41f, -5.15f);
        fc.B(b, -8.56f, -3.09f, 2.19f, 10.25f);
        b.lineToRelative(-0.69f, 1.89f);
        b.lineTo(8.0f, 14.48f);
        fc.w(b, 8.0f, 19.0f, 8.0f, -1.63f);
        b.lineTo(20.52f, 19.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, r6.r(b, 0.69f, -1.89f, -19.02f, -6.86f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _airlineSeatFlatAngled = build;
        build.getClass();
        return build;
    }
}
