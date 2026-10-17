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
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DoNotStepKt {
    private static ImageVector _doNotStep;

    public static final ImageVector getDoNotStep(Icons.Filled filled) {
        ImageVector imageVector = _doNotStep;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.DoNotStep", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(1.39f, 4.22f, 7.9f, 7.9f);
        e.curveToRelative(0.18f, 0.2f, 0.18f, 0.5f, -0.01f, 0.7f);
        e.curveToRelative(-0.1f, 0.1f, -0.23f, 0.15f, -0.35f, 0.15f);
        e.reflectiveCurveToRelative(-0.26f, -0.05f, -0.35f, -0.15f);
        e.lineTo(6.87f, 11.1f);
        e.curveToRelative(-0.11f, 0.4f, -0.26f, 0.78f, -0.45f, 1.12f);
        e.lineToRelative(1.4f, 1.4f);
        e.curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0.0f, 0.71f);
        e.curveToRelative(-0.1f, 0.1f, -0.23f, 0.15f, -0.35f, 0.15f);
        e.reflectiveCurveToRelative(-0.26f, -0.05f, -0.35f, -0.15f);
        e.lineToRelative(-1.27f, -1.27f);
        e.curveToRelative(-0.24f, 0.29f, -0.5f, 0.56f, -0.77f, 0.8f);
        e.lineToRelative(1.28f, 1.28f);
        e.curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0.0f, 0.71f);
        e.curveTo(6.26f, 15.95f, 6.13f, 16.0f, 6.0f, 16.0f);
        e.reflectiveCurveToRelative(-0.26f, -0.05f, -0.35f, -0.15f);
        e.lineToRelative(-1.38f, -1.38f);
        e.curveToRelative(-0.69f, 0.46f, -1.39f, 0.79f, -1.97f, 1.02f);
        e.curveTo(1.52f, 15.8f, 1.0f, 16.53f, 1.0f, 17.37f);
        uo.u(e, 20.0f, 9.5f, 3.33f, -3.33f);
        e.lineToRelative(5.94f, 5.94f);
        e.lineToRelative(1.41f, -1.41f);
        r6.C(e, 2.81f, 2.81f, 1.39f, 4.22f);
        e.moveTo(18.51f, 15.68f);
        e.lineToRelative(-1.41f, -1.41f);
        e.lineToRelative(4.48f, -4.48f);
        r6.C(e, 23.0f, 11.2f, 18.51f, 15.68f);
        e.moveTo(20.88f, 9.08f);
        e.lineToRelative(-4.48f, 4.48f);
        e.lineTo(9.3f, 6.47f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(e, 13.8f, 2.0f, 20.88f, 9.08f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _doNotStep = build;
        build.getClass();
        return build;
    }
}
