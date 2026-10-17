package androidx.compose.material.icons.rounded;

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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class AirlineSeatReclineExtraKt {
    private static ImageVector _airlineSeatReclineExtra;

    public static final ImageVector getAirlineSeatReclineExtra(Icons.Rounded rounded) {
        ImageVector imageVector = _airlineSeatReclineExtra;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.AirlineSeatReclineExtra", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(5.35f, 5.64f);
        b.curveToRelative(-0.9f, -0.64f, -1.12f, -1.88f, -0.49f, -2.79f);
        b.curveToRelative(0.63f, -0.9f, 1.88f, -1.12f, 2.79f, -0.49f);
        b.curveToRelative(0.9f, 0.64f, 1.12f, 1.88f, 0.49f, 2.79f);
        b.curveToRelative(-0.64f, 0.9f, -1.88f, 1.12f, -2.79f, 0.49f);
        b.close();
        b.moveTo(16.0f, 20.0f);
        b.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        b.lineTo(8.93f, 19.0f);
        b.curveToRelative(-1.48f, 0.0f, -2.74f, -1.08f, -2.96f, -2.54f);
        b.lineTo(4.16f, 7.78f);
        b.curveTo(4.07f, 7.33f, 3.67f, 7.0f, 3.2f, 7.0f);
        b.curveToRelative(-0.62f, 0.0f, -1.08f, 0.57f, -0.96f, 1.18f);
        b.lineToRelative(1.75f, 8.58f);
        b.curveTo(4.37f, 19.2f, 6.47f, 21.0f, 8.94f, 21.0f);
        b.lineTo(15.0f, 21.0f);
        b.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        af0.l(b, 15.54f, 15.0f, -4.19f);
        b.lineToRelative(-1.03f, -4.1f);
        b.curveToRelative(1.28f, 0.72f, 2.63f, 1.28f, 4.1f, 1.3f);
        b.curveToRelative(0.58f, 0.01f, 1.05f, -0.49f, 1.05f, -1.07f);
        b.curveToRelative(0.0f, -0.59f, -0.49f, -1.04f, -1.08f, -1.06f);
        b.curveToRelative(-1.31f, -0.04f, -2.63f, -0.56f, -3.61f, -1.33f);
        b.lineTo(9.14f, 7.47f);
        b.curveToRelative(-0.23f, -0.18f, -0.49f, -0.3f, -0.76f, -0.38f);
        b.curveToRelative(-0.32f, -0.09f, -0.66f, -0.12f, -0.99f, -0.06f);
        b.horizontalLineToRelative(-0.02f);
        b.curveToRelative(-1.23f, 0.22f, -2.05f, 1.39f, -1.84f, 2.61f);
        b.lineToRelative(1.35f, 5.92f);
        b.curveTo(7.16f, 16.98f, 8.39f, 18.0f, 9.83f, 18.0f);
        b.horizontalLineToRelative(6.85f);
        b.lineToRelative(3.09f, 2.42f);
        b.curveToRelative(0.42f, 0.33f, 1.02f, 0.29f, 1.39f, -0.08f);
        b.curveToRelative(0.45f, -0.45f, 0.4f, -1.18f, -0.1f, -1.57f);
        b.lineToRelative(-4.29f, -3.35f);
        b.curveToRelative(-0.35f, -0.27f, -0.78f, -0.42f, -1.23f, -0.42f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _airlineSeatReclineExtra = build;
        build.getClass();
        return build;
    }
}
