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
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class PinInvokeKt {
    private static ImageVector _pinInvoke;

    public static final ImageVector getPinInvoke(Icons.Rounded rounded) {
        ImageVector imageVector = _pinInvoke;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.PinInvoke", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder h = af0.h(22.0f, 12.0f, 6.0f);
        h.curveToRelative(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
        h.horizontalLineTo(4.0f);
        h.curveToRelative(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        h.verticalLineTo(6.0f);
        h.curveToRelative(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
        r6.t(h, 10.0f, 0.0f, 2.0f, 4.0f);
        fc.y(h, 12.0f, 16.0f, -6.0f, 22.0f);
        h.moveTo(22.0f, 7.0f);
        h.curveToRelative(0.0f, -1.66f, -1.34f, -3.0f, -3.0f, -3.0f);
        h.curveToRelative(-1.66f, 0.0f, -3.0f, 1.34f, -3.0f, 3.0f);
        h.reflectiveCurveToRelative(1.34f, 3.0f, 3.0f, 3.0f);
        h.curveTo(20.66f, 10.0f, 22.0f, 8.66f, 22.0f, 7.0f);
        h.close();
        h.moveTo(9.34f, 15.66f);
        h.curveToRelative(0.39f, 0.39f, 1.02f, 0.39f, 1.41f, 0.0f);
        h.lineToRelative(2.12f, -2.12f);
        h.lineToRelative(1.27f, 1.27f);
        h.curveTo(14.46f, 15.12f, 15.0f, 14.9f, 15.0f, 14.45f);
        h.verticalLineTo(10.5f);
        h.curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f);
        h.horizontalLineToRelative(-3.95f);
        h.curveToRelative(-0.45f, 0.0f, -0.67f, 0.54f, -0.35f, 0.85f);
        h.lineToRelative(1.27f, 1.27f);
        h.lineToRelative(-2.12f, 2.12f);
        h.curveTo(8.95f, 14.63f, 8.95f, 15.27f, 9.34f, 15.66f);
        h.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, h.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _pinInvoke = build;
        build.getClass();
        return build;
    }
}
