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
import defpackage.fc;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MediationKt {
    private static ImageVector _mediation;

    public static final ImageVector getMediation(Icons.Rounded rounded) {
        ImageVector imageVector = _mediation;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Mediation", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(18.0f, 13.0f, -5.06f);
        a.curveToRelative(-0.34f, 3.1f, -2.26f, 5.72f, -4.94f, 7.05f);
        a.curveToRelative(-0.03f, 1.81f, -1.66f, 3.23f, -3.55f, 2.9f);
        a.curveToRelative(-1.2f, -0.21f, -2.19f, -1.2f, -2.4f, -2.4f);
        a.curveTo(1.71f, 18.65f, 3.16f, 17.0f, 5.0f, 17.0f);
        a.curveToRelative(0.95f, 0.0f, 1.78f, 0.45f, 2.33f, 1.14f);
        a.curveToRelative(1.9f, -1.03f, 3.26f, -2.91f, 3.58f, -5.14f);
        a.horizontalLineToRelative(-3.1f);
        a.curveToRelative(-0.48f, 1.34f, -1.86f, 2.24f, -3.42f, 1.94f);
        a.curveToRelative(-1.18f, -0.23f, -2.13f, -1.2f, -2.35f, -2.38f);
        a.curveTo(1.7f, 10.66f, 3.16f, 9.0f, 5.0f, 9.0f);
        a.curveToRelative(1.3f, 0.0f, 2.4f, 0.84f, 2.82f, 2.0f);
        a.horizontalLineToRelative(3.1f);
        a.curveTo(10.6f, 8.77f, 9.23f, 6.9f, 7.33f, 5.86f);
        a.curveToRelative(-0.64f, 0.8f, -1.67f, 1.28f, -2.81f, 1.1f);
        a.curveTo(3.29f, 6.77f, 2.26f, 5.77f, 2.05f, 4.54f);
        a.curveTo(1.72f, 2.65f, 3.17f, 1.0f, 5.0f, 1.0f);
        a.curveToRelative(1.64f, 0.0f, 2.96f, 1.31f, 2.99f, 2.95f);
        a.curveToRelative(2.68f, 1.33f, 4.6f, 3.95f, 4.94f, 7.05f);
        a.horizontalLineTo(18.0f);
        a.verticalLineTo(9.21f);
        a.curveToRelative(0.0f, -0.45f, 0.54f, -0.67f, 0.85f, -0.35f);
        a.lineToRelative(2.79f, 2.79f);
        a.curveToRelative(0.2f, 0.2f, 0.2f, 0.51f, 0.0f, 0.71f);
        a.lineToRelative(-2.79f, 2.79f);
        a.curveTo(18.54f, 15.46f, 18.0f, 15.24f, 18.0f, 14.79f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(a, 13.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _mediation = build;
        build.getClass();
        return build;
    }
}
