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
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class SafetyCheckKt {
    private static ImageVector _safetyCheck;

    public static final ImageVector getSafetyCheck(Icons.Rounded rounded) {
        ImageVector imageVector = _safetyCheck;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SafetyCheck", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(11.3f, 2.26f, -6.0f, 2.25f);
        e.curveTo(4.52f, 4.81f, 4.0f, 5.55f, 4.0f, 6.39f);
        e.verticalLineToRelative(4.7f);
        e.curveToRelative(0.0f, 4.83f, 3.13f, 9.37f, 7.43f, 10.75f);
        e.curveToRelative(0.37f, 0.12f, 0.77f, 0.12f, 1.14f, 0.0f);
        e.curveToRelative(4.3f, -1.38f, 7.43f, -5.91f, 7.43f, -10.75f);
        e.verticalLineToRelative(-4.7f);
        e.curveToRelative(0.0f, -0.83f, -0.52f, -1.58f, -1.3f, -1.87f);
        e.lineToRelative(-6.0f, -2.25f);
        e.curveTo(12.25f, 2.09f, 11.75f, 2.09f, 11.3f, 2.26f);
        e.close();
        e.moveTo(12.0f, 17.0f);
        e.curveToRelative(-2.76f, 0.0f, -5.0f, -2.24f, -5.0f, -5.0f);
        e.reflectiveCurveToRelative(2.24f, -5.0f, 5.0f, -5.0f);
        e.reflectiveCurveToRelative(5.0f, 2.24f, 5.0f, 5.0f);
        e.reflectiveCurveTo(14.76f, 17.0f, 12.0f, 17.0f);
        e.close();
        e.moveTo(14.0f, 14.0f);
        e.curveToRelative(-0.2f, 0.2f, -0.51f, 0.2f, -0.71f, 0.0f);
        e.lineToRelative(-1.65f, -1.65f);
        e.curveToRelative(-0.09f, -0.09f, -0.15f, -0.22f, -0.15f, -0.35f);
        e.verticalLineTo(9.5f);
        e.curveTo(11.5f, 9.22f, 11.72f, 9.0f, 12.0f, 9.0f);
        e.curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        e.verticalLineToRelative(2.29f);
        e.lineToRelative(1.5f, 1.5f);
        e.curveTo(14.2f, 13.49f, 14.2f, 13.8f, 14.0f, 14.0f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _safetyCheck = build;
        build.getClass();
        return build;
    }
}
