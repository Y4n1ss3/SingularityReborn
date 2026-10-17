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
import defpackage.gy;
import defpackage.uf;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DoNotStepKt {
    private static ImageVector _doNotStep;

    public static final ImageVector getDoNotStep(Icons.Rounded rounded) {
        ImageVector imageVector = _doNotStep;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.DoNotStep", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(2.1f, 3.51f);
        b.curveToRelative(-0.39f, 0.39f, -0.39f, 1.02f, 0.0f, 1.41f);
        b.lineToRelative(7.19f, 7.19f);
        b.curveToRelative(0.18f, 0.2f, 0.18f, 0.5f, -0.01f, 0.7f);
        b.curveToRelative(-0.1f, 0.1f, -0.23f, 0.15f, -0.35f, 0.15f);
        b.reflectiveCurveToRelative(-0.26f, -0.05f, -0.35f, -0.15f);
        b.lineTo(6.87f, 11.1f);
        b.curveToRelative(-0.11f, 0.4f, -0.26f, 0.78f, -0.45f, 1.12f);
        b.lineToRelative(1.4f, 1.4f);
        b.curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0.0f, 0.71f);
        b.curveToRelative(-0.1f, 0.1f, -0.23f, 0.15f, -0.35f, 0.15f);
        b.reflectiveCurveToRelative(-0.26f, -0.05f, -0.35f, -0.15f);
        b.lineToRelative(-1.27f, -1.27f);
        b.curveToRelative(-0.24f, 0.29f, -0.5f, 0.56f, -0.77f, 0.8f);
        b.lineToRelative(1.28f, 1.28f);
        b.curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0.0f, 0.71f);
        b.curveTo(6.26f, 15.95f, 6.13f, 16.0f, 6.0f, 16.0f);
        b.reflectiveCurveToRelative(-0.26f, -0.05f, -0.35f, -0.15f);
        b.lineToRelative(-1.38f, -1.38f);
        b.curveToRelative(-0.71f, 0.47f, -1.43f, 0.81f, -2.02f, 1.04f);
        b.curveTo(1.49f, 15.81f, 1.0f, 16.55f, 1.0f, 17.37f);
        b.lineTo(1.0f, 18.0f);
        b.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        b.horizontalLineToRelative(6.67f);
        b.curveToRelative(0.53f, 0.0f, 1.04f, -0.21f, 1.41f, -0.59f);
        b.lineToRelative(2.74f, -2.74f);
        b.lineToRelative(5.23f, 5.23f);
        b.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        b.lineToRelative(0.0f, 0.0f);
        b.curveToRelative(0.39f, -0.39f, 0.39f, -1.02f, 0.0f, -1.41f);
        b.lineTo(3.51f, 3.51f);
        b.curveTo(3.12f, 3.12f, 2.49f, 3.12f, 2.1f, 3.51f);
        uo.l(b, 2.1f, 3.51f, 18.51f, 15.68f);
        b.lineToRelative(-1.41f, -1.41f);
        b.lineToRelative(4.48f, -4.48f);
        b.lineToRelative(0.0f, 0.0f);
        b.curveToRelative(0.78f, 0.78f, 0.78f, 2.05f, 0.0f, 2.83f);
        uo.l(b, 18.51f, 15.68f, 20.88f, 9.08f);
        b.lineToRelative(-4.48f, 4.48f);
        b.lineTo(9.3f, 6.47f);
        b.lineToRelative(3.09f, -3.07f);
        b.curveToRelative(0.78f, -0.78f, 2.04f, -0.77f, 2.82f, 0.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.q(b, 20.88f, 9.08f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _doNotStep = build;
        build.getClass();
        return build;
    }
}
