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
import defpackage.bv;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ExtensionOffKt {
    private static ImageVector _extensionOff;

    public static final ImageVector getExtensionOff(Icons.Outlined outlined) {
        ImageVector imageVector = _extensionOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Outlined.ExtensionOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(1.39f, 4.22f, 1.62f, 1.62f);
        e.curveToRelative(0.0f, 0.05f, -0.01f, 0.1f, -0.01f, 0.16f);
        e.verticalLineToRelative(3.8f);
        e.curveTo(5.7f, 9.8f, 6.0f, 11.96f, 6.0f, 12.5f);
        e.curveToRelative(0.0f, 0.54f, -0.29f, 2.7f, -3.0f, 2.7f);
        e.verticalLineTo(19.0f);
        e.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        e.horizontalLineToRelative(3.8f);
        e.curveToRelative(0.0f, -2.71f, 2.16f, -3.0f, 2.7f, -3.0f);
        e.curveToRelative(0.54f, 0.0f, 2.7f, 0.29f, 2.7f, 3.0f);
        e.horizontalLineTo(18.0f);
        e.curveToRelative(0.06f, 0.0f, 0.11f, 0.0f, 0.16f, -0.01f);
        e.lineToRelative(1.61f, 1.61f);
        e.lineToRelative(1.41f, -1.41f);
        r6.C(e, 2.81f, 2.81f, 1.39f, 4.22f);
        e.moveTo(11.5f, 16.0f);
        e.curveToRelative(-1.5f, 0.0f, -3.57f, 0.83f, -4.37f, 3.0f);
        e.horizontalLineTo(5.0f);
        e.verticalLineToRelative(-2.13f);
        e.curveToRelative(2.17f, -0.8f, 3.0f, -2.87f, 3.0f, -4.37f);
        e.curveToRelative(0.0f, -0.69f, -0.18f, -1.5f, -0.58f, -2.25f);
        e.lineToRelative(6.33f, 6.33f);
        e.curveTo(13.0f, 16.18f, 12.19f, 16.0f, 11.5f, 16.0f);
        k4.x(e, 8.83f, 6.0f, -2.0f, -2.0f);
        e.horizontalLineTo(9.0f);
        e.curveToRelative(0.0f, -1.38f, 1.12f, -2.5f, 2.5f, -2.5f);
        e.reflectiveCurveTo(14.0f, 2.62f, 14.0f, 4.0f);
        e.horizontalLineToRelative(4.0f);
        e.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        e.verticalLineToRelative(4.0f);
        e.curveToRelative(1.38f, 0.0f, 2.5f, 1.12f, 2.5f, 2.5f);
        e.reflectiveCurveTo(21.38f, 15.0f, 20.0f, 15.0f);
        k4.z(e, 2.17f, -2.0f, -2.0f, 13.0f);
        e.horizontalLineToRelative(2.0f);
        e.curveToRelative(0.28f, 0.0f, 0.5f, -0.22f, 0.5f, -0.5f);
        e.reflectiveCurveTo(20.28f, 12.0f, 20.0f, 12.0f);
        af0.n(e, -2.0f, 6.0f, -6.0f, 4.0f);
        e.curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f);
        e.reflectiveCurveTo(11.0f, 3.72f, 11.0f, 4.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, bv.e(e, 2.0f, 8.83f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _extensionOff = build;
        build.getClass();
        return build;
    }
}
