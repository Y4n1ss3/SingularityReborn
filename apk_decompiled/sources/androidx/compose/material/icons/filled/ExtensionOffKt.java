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
import defpackage.gy;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ExtensionOffKt {
    private static ImageVector _extensionOff;

    public static final ImageVector getExtensionOff(Icons.Filled filled) {
        ImageVector imageVector = _extensionOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.ExtensionOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(19.78f, 22.61f, -1.63f, -1.63f);
        e.curveTo(18.1f, 20.98f, 18.05f, 21.0f, 18.0f, 21.0f);
        e.horizontalLineToRelative(-3.8f);
        e.curveToRelative(0.0f, -2.71f, -2.16f, -3.0f, -2.7f, -3.0f);
        e.reflectiveCurveToRelative(-2.7f, 0.29f, -2.7f, 3.0f);
        e.horizontalLineTo(5.0f);
        e.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        e.verticalLineToRelative(-3.8f);
        e.curveToRelative(2.71f, 0.0f, 3.0f, -2.16f, 3.0f, -2.7f);
        e.curveToRelative(0.0f, -0.54f, -0.3f, -2.7f, -2.99f, -2.7f);
        e.verticalLineTo(6.0f);
        e.curveToRelative(0.0f, -0.05f, 0.02f, -0.09f, 0.02f, -0.14f);
        e.lineTo(1.39f, 4.22f);
        e.lineToRelative(1.41f, -1.41f);
        gy.B(e, 18.38f, 18.38f, 19.78f, 22.61f);
        e.moveTo(20.0f, 17.17f);
        e.verticalLineTo(15.0f);
        e.curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f);
        e.reflectiveCurveTo(21.38f, 10.0f, 20.0f, 10.0f);
        e.verticalLineTo(6.0f);
        e.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        e.horizontalLineToRelative(-4.0f);
        e.curveToRelative(0.0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f);
        e.reflectiveCurveTo(9.0f, 2.62f, 9.0f, 4.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.m(e, 6.83f, 20.0f, 17.17f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _extensionOff = build;
        build.getClass();
        return build;
    }
}
