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

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class IntegrationInstructionsKt {
    private static ImageVector _integrationInstructions;

    public static final ImageVector getIntegrationInstructions(Icons.Filled filled) {
        ImageVector imageVector = _integrationInstructions;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.IntegrationInstructions", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder a = af0.a(19.0f, 3.0f, -4.18f);
        a.curveTo(14.4f, 1.84f, 13.3f, 1.0f, 12.0f, 1.0f);
        a.reflectiveCurveTo(9.6f, 1.84f, 9.18f, 3.0f);
        a.horizontalLineTo(5.0f);
        a.curveTo(4.86f, 3.0f, 4.73f, 3.01f, 4.6f, 3.04f);
        a.curveTo(4.21f, 3.12f, 3.86f, 3.32f, 3.59f, 3.59f);
        a.curveToRelative(-0.18f, 0.18f, -0.33f, 0.4f, -0.43f, 0.64f);
        a.curveTo(3.06f, 4.46f, 3.0f, 4.72f, 3.0f, 5.0f);
        a.verticalLineToRelative(14.0f);
        a.curveToRelative(0.0f, 0.27f, 0.06f, 0.54f, 0.16f, 0.78f);
        a.curveToRelative(0.1f, 0.24f, 0.25f, 0.45f, 0.43f, 0.64f);
        a.curveToRelative(0.27f, 0.27f, 0.62f, 0.47f, 1.01f, 0.55f);
        a.curveTo(4.73f, 20.99f, 4.86f, 21.0f, 5.0f, 21.0f);
        a.horizontalLineToRelative(14.0f);
        a.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        a.verticalLineTo(5.0f);
        a.curveTo(21.0f, 3.9f, 20.1f, 3.0f, 19.0f, 3.0f);
        k4.x(a, 11.0f, 14.17f, -1.41f, 1.42f);
        a.lineTo(6.0f, 12.0f);
        a.lineToRelative(3.59f, -3.59f);
        a.lineTo(11.0f, 9.83f);
        r6.C(a, 8.83f, 12.0f, 11.0f, 14.17f);
        a.moveTo(12.0f, 4.25f);
        a.curveToRelative(-0.41f, 0.0f, -0.75f, -0.34f, -0.75f, -0.75f);
        a.reflectiveCurveTo(11.59f, 2.75f, 12.0f, 2.75f);
        a.reflectiveCurveToRelative(0.75f, 0.34f, 0.75f, 0.75f);
        a.reflectiveCurveTo(12.41f, 4.25f, 12.0f, 4.25f);
        k4.r(a, 14.41f, 15.59f, 13.0f, 14.17f);
        a.lineTo(15.17f, 12.0f);
        a.lineTo(13.0f, 9.83f);
        a.lineToRelative(1.41f, -1.42f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, af0.t(a, 18.0f, 12.0f, 14.41f, 15.59f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _integrationInstructions = build;
        build.getClass();
        return build;
    }
}
