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
public final class SystemUpdateAltKt {
    private static ImageVector _systemUpdateAlt;

    public static final ImageVector getSystemUpdateAlt(Icons.Rounded rounded) {
        ImageVector imageVector = _systemUpdateAlt;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.SystemUpdateAlt", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(12.35f, 15.65f, 2.79f, -2.79f);
        e.curveToRelative(0.31f, -0.31f, 0.09f, -0.85f, -0.35f, -0.85f);
        e.horizontalLineTo(13.0f);
        e.verticalLineTo(4.0f);
        e.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        e.reflectiveCurveToRelative(-1.0f, 0.45f, -1.0f, 1.0f);
        e.verticalLineToRelative(8.0f);
        e.horizontalLineTo(9.21f);
        e.curveToRelative(-0.45f, 0.0f, -0.67f, 0.54f, -0.35f, 0.85f);
        e.lineToRelative(2.79f, 2.79f);
        e.curveToRelative(0.19f, 0.2f, 0.51f, 0.2f, 0.7f, 0.01f);
        af0.l(e, 21.0f, 3.0f, -5.01f);
        e.curveToRelative(-0.54f, 0.0f, -0.99f, 0.45f, -0.99f, 0.99f);
        e.curveToRelative(0.0f, 0.55f, 0.45f, 0.99f, 0.99f, 0.99f);
        e.horizontalLineTo(20.0f);
        e.curveToRelative(0.55f, 0.0f, 1.0f, 0.45f, 1.0f, 1.0f);
        e.verticalLineToRelative(12.03f);
        e.curveToRelative(0.0f, 0.55f, -0.45f, 1.0f, -1.0f, 1.0f);
        e.horizontalLineTo(4.0f);
        e.curveToRelative(-0.55f, 0.0f, -1.0f, -0.45f, -1.0f, -1.0f);
        e.verticalLineTo(5.99f);
        e.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        e.horizontalLineToRelative(4.01f);
        e.curveToRelative(0.54f, 0.0f, 0.99f, -0.45f, 0.99f, -0.99f);
        e.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -0.99f, -1.0f);
        e.horizontalLineTo(3.0f);
        e.curveToRelative(-1.1f, 0.0f, -2.0f, 0.9f, -2.0f, 2.0f);
        e.verticalLineToRelative(14.0f);
        e.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        e.horizontalLineToRelative(18.0f);
        e.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        e.verticalLineTo(5.0f);
        e.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        e.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, e.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _systemUpdateAlt = build;
        build.getClass();
        return build;
    }
}
