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
public final class ExtensionOffKt {
    private static ImageVector _extensionOff;

    public static final ImageVector getExtensionOff(Icons.Rounded rounded) {
        ImageVector imageVector = _extensionOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ExtensionOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(20.49f, 21.9f);
        b.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        b.lineToRelative(-0.92f, -0.92f);
        b.curveTo(18.1f, 20.98f, 18.05f, 21.0f, 18.0f, 21.0f);
        b.horizontalLineToRelative(-3.8f);
        b.curveToRelative(0.0f, -2.71f, -2.16f, -3.0f, -2.7f, -3.0f);
        b.reflectiveCurveToRelative(-2.7f, 0.29f, -2.7f, 3.0f);
        b.horizontalLineTo(5.0f);
        b.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        b.verticalLineToRelative(-3.8f);
        b.curveToRelative(2.71f, 0.0f, 3.0f, -2.16f, 3.0f, -2.7f);
        b.curveToRelative(0.0f, -0.54f, -0.3f, -2.7f, -2.99f, -2.7f);
        b.verticalLineTo(6.0f);
        b.curveToRelative(0.0f, -0.05f, 0.02f, -0.09f, 0.02f, -0.14f);
        b.lineTo(2.1f, 4.93f);
        b.curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        b.lineToRelative(0.0f, 0.0f);
        b.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        b.lineToRelative(16.97f, 16.97f);
        b.curveTo(20.88f, 20.88f, 20.88f, 21.51f, 20.49f, 21.9f);
        uo.l(b, 20.49f, 21.9f, 20.0f, 17.17f);
        b.verticalLineTo(15.0f);
        b.curveToRelative(1.38f, 0.0f, 2.5f, -1.12f, 2.5f, -2.5f);
        b.reflectiveCurveTo(21.38f, 10.0f, 20.0f, 10.0f);
        b.verticalLineTo(6.0f);
        b.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        b.horizontalLineToRelative(-4.0f);
        b.curveToRelative(0.0f, -1.38f, -1.12f, -2.5f, -2.5f, -2.5f);
        b.reflectiveCurveTo(9.0f, 2.62f, 9.0f, 4.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.m(b, 6.83f, 20.0f, 17.17f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _extensionOff = build;
        build.getClass();
        return build;
    }
}
