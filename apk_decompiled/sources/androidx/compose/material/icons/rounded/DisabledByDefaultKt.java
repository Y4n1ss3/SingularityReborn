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
public final class DisabledByDefaultKt {
    private static ImageVector _disabledByDefault;

    public static final ImageVector getDisabledByDefault(Icons.Rounded rounded) {
        ImageVector imageVector = _disabledByDefault;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.DisabledByDefault", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder h = af0.h(3.0f, 5.0f, 14.0f);
        h.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        h.horizontalLineToRelative(14.0f);
        h.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        h.verticalLineTo(5.0f);
        h.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        h.horizontalLineTo(5.0f);
        h.curveTo(3.9f, 3.0f, 3.0f, 3.9f, 3.0f, 5.0f);
        k4.r(h, 16.3f, 16.29f, 16.3f, 16.29f);
        h.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        h.lineTo(12.0f, 13.41f);
        h.lineToRelative(-2.89f, 2.89f);
        h.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        h.lineToRelative(0.0f, 0.0f);
        h.curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        h.lineTo(10.59f, 12.0f);
        h.lineTo(7.7f, 9.11f);
        h.curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        h.lineToRelative(0.0f, 0.0f);
        h.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        h.lineTo(12.0f, 10.59f);
        h.lineToRelative(2.89f, -2.88f);
        h.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        h.lineToRelative(0.0f, 0.0f);
        h.curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f);
        h.lineTo(13.41f, 12.0f);
        h.lineToRelative(2.89f, 2.88f);
        h.curveTo(16.68f, 15.27f, 16.68f, 15.91f, 16.3f, 16.29f);
        h.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, h.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _disabledByDefault = build;
        build.getClass();
        return build;
    }
}
