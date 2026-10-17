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
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class DoorbellKt {
    private static ImageVector _doorbell;

    public static final ImageVector getDoorbell(Icons.Rounded rounded) {
        ImageVector imageVector = _doorbell;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.Doorbell", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(10.8f, 3.9f, -6.0f, 4.5f);
        e.curveTo(4.3f, 8.78f, 4.0f, 9.37f, 4.0f, 10.0f);
        e.verticalLineToRelative(9.0f);
        e.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        e.horizontalLineToRelative(12.0f);
        e.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        e.verticalLineToRelative(-9.0f);
        e.curveToRelative(0.0f, -0.63f, -0.3f, -1.22f, -0.8f, -1.6f);
        e.lineToRelative(-6.0f, -4.5f);
        e.curveTo(12.49f, 3.37f, 11.51f, 3.37f, 10.8f, 3.9f);
        e.close();
        e.moveTo(12.0f, 17.5f);
        e.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        e.horizontalLineToRelative(2.0f);
        e.curveTo(13.0f, 17.05f, 12.55f, 17.5f, 12.0f, 17.5f);
        af0.l(e, 15.5f, 16.0f, -7.0f);
        e.curveTo(8.22f, 16.0f, 8.0f, 15.78f, 8.0f, 15.5f);
        e.verticalLineToRelative(0.0f);
        e.curveTo(8.0f, 15.22f, 8.22f, 15.0f, 8.5f, 15.0f);
        e.horizontalLineTo(9.0f);
        e.verticalLineToRelative(-2.34f);
        e.curveToRelative(0.0f, -1.54f, 0.82f, -2.82f, 2.25f, -3.16f);
        e.verticalLineTo(9.25f);
        e.curveToRelative(0.0f, -0.41f, 0.34f, -0.75f, 0.75f, -0.75f);
        e.reflectiveCurveToRelative(0.75f, 0.34f, 0.75f, 0.75f);
        e.verticalLineTo(9.5f);
        e.curveTo(14.19f, 9.84f, 15.0f, 11.12f, 15.0f, 12.66f);
        e.verticalLineTo(15.0f);
        e.horizontalLineToRelative(0.5f);
        e.curveToRelative(0.28f, 0.0f, 0.5f, 0.22f, 0.5f, 0.5f);
        e.verticalLineToRelative(0.0f);
        e.curveTo(16.0f, 15.78f, 15.78f, 16.0f, 15.5f, 16.0f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _doorbell = build;
        build.getClass();
        return build;
    }
}
