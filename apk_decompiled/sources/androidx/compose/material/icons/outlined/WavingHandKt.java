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
import defpackage.k4;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class WavingHandKt {
    private static ImageVector _wavingHand;

    public static final ImageVector getWavingHand(Icons.Outlined outlined) {
        ImageVector imageVector = _wavingHand;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.WavingHand", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder i = af0.i(7.03f, 4.95f, 3.49f, 8.49f);
        i.curveToRelative(-3.32f, 3.32f, -3.32f, 8.7f, 0.0f, 12.02f);
        i.reflectiveCurveToRelative(8.7f, 3.32f, 12.02f, 0.0f);
        i.lineToRelative(6.01f, -6.01f);
        i.curveToRelative(0.97f, -0.97f, 0.97f, -2.56f, 0.0f, -3.54f);
        i.curveToRelative(-0.12f, -0.12f, -0.25f, -0.23f, -0.39f, -0.32f);
        i.lineToRelative(0.39f, -0.39f);
        i.curveToRelative(0.97f, -0.97f, 0.97f, -2.56f, 0.0f, -3.54f);
        i.curveToRelative(-0.16f, -0.16f, -0.35f, -0.3f, -0.54f, -0.41f);
        i.curveToRelative(0.4f, -0.92f, 0.23f, -2.02f, -0.52f, -2.77f);
        i.curveToRelative(-0.87f, -0.87f, -2.22f, -0.96f, -3.2f, -0.28f);
        i.curveToRelative(-0.1f, -0.15f, -0.21f, -0.29f, -0.34f, -0.42f);
        i.curveToRelative(-0.97f, -0.97f, -2.56f, -0.97f, -3.54f, 0.0f);
        i.lineToRelative(-2.51f, 2.51f);
        i.curveToRelative(-0.09f, -0.14f, -0.2f, -0.27f, -0.32f, -0.39f);
        i.curveTo(9.58f, 3.98f, 8.0f, 3.98f, 7.03f, 4.95f);
        i.close();
        i.moveTo(8.44f, 6.37f);
        i.curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, 0.0f);
        i.curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0.0f, 0.71f);
        i.lineToRelative(-3.18f, 3.18f);
        i.curveToRelative(1.17f, 1.17f, 1.17f, 3.07f, 0.0f, 4.24f);
        i.lineToRelative(1.41f, 1.41f);
        i.curveToRelative(1.45f, -1.45f, 1.82f, -3.57f, 1.12f, -5.36f);
        i.lineToRelative(6.3f, -6.3f);
        i.curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, 0.0f);
        i.reflectiveCurveToRelative(0.2f, 0.51f, 0.0f, 0.71f);
        i.lineToRelative(-4.6f, 4.6f);
        i.lineToRelative(1.41f, 1.41f);
        i.lineToRelative(6.01f, -6.01f);
        i.curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, 0.0f);
        i.curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0.0f, 0.71f);
        i.lineToRelative(-6.01f, 6.01f);
        i.lineToRelative(1.41f, 1.41f);
        i.lineToRelative(4.95f, -4.95f);
        i.curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, 0.0f);
        i.curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0.0f, 0.71f);
        i.lineToRelative(-5.66f, 5.66f);
        i.lineToRelative(1.41f, 1.41f);
        i.lineToRelative(3.54f, -3.54f);
        i.curveToRelative(0.2f, -0.2f, 0.51f, -0.2f, 0.71f, 0.0f);
        i.curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0.0f, 0.71f);
        i.lineTo(14.1f, 19.1f);
        i.curveToRelative(-2.54f, 2.54f, -6.65f, 2.54f, -9.19f, 0.0f);
        i.reflectiveCurveToRelative(-2.54f, -6.65f, 0.0f, -9.19f);
        uo.l(i, 8.44f, 6.37f, 23.0f, 17.0f);
        i.curveToRelative(0.0f, 3.31f, -2.69f, 6.0f, -6.0f, 6.0f);
        i.verticalLineToRelative(-1.5f);
        i.curveToRelative(2.48f, 0.0f, 4.5f, -2.02f, 4.5f, -4.5f);
        k4.w(i, 23.0f, 1.0f, 7.0f);
        i.curveToRelative(0.0f, -3.31f, 2.69f, -6.0f, 6.0f, -6.0f);
        i.verticalLineToRelative(1.5f);
        i.curveTo(4.52f, 2.5f, 2.5f, 4.52f, 2.5f, 7.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, k4.h(i, 1.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _wavingHand = build;
        build.getClass();
        return build;
    }
}
