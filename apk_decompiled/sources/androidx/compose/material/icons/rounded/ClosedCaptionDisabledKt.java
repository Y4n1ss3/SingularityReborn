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
import defpackage.fc;
import defpackage.k4;
import defpackage.kf0;
import defpackage.kp0;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ClosedCaptionDisabledKt {
    private static ImageVector _closedCaptionDisabled;

    public static final ImageVector getClosedCaptionDisabled(Icons.Rounded rounded) {
        ImageVector imageVector = _closedCaptionDisabled;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.ClosedCaptionDisabled", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder d = k4.d(6.83f, 4.0f, 19.0f);
        d.curveToRelative(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
        d.verticalLineToRelative(12.0f);
        d.curveToRelative(0.0f, 0.05f, -0.01f, 0.1f, -0.02f, 0.16f);
        d.lineToRelative(-3.38f, -3.38f);
        d.curveTo(17.84f, 14.59f, 18.0f, 14.32f, 18.0f, 14.0f);
        d.verticalLineToRelative(-0.5f);
        d.curveToRelative(0.0f, -0.28f, -0.22f, -0.5f, -0.5f, -0.5f);
        d.horizontalLineTo(17.0f);
        d.curveToRelative(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f);
        kp0.q(d, -0.17f, -1.83f, -1.83f, 10.5f);
        d.horizontalLineToRelative(2.0f);
        d.curveToRelative(0.0f, 0.28f, 0.22f, 0.5f, 0.5f, 0.5f);
        d.horizontalLineToRelative(0.5f);
        d.curveToRelative(0.28f, 0.0f, 0.5f, -0.22f, 0.5f, -0.5f);
        d.verticalLineTo(10.0f);
        d.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        d.horizontalLineToRelative(-3.0f);
        d.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        kf0.t(d, 0.17f, 6.83f, 4.0f);
        d.moveTo(20.49f, 21.9f);
        d.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        d.lineToRelative(-1.9f, -1.9f);
        d.horizontalLineTo(5.0f);
        d.curveToRelative(-1.11f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        d.verticalLineTo(6.0f);
        d.curveToRelative(0.0f, -0.05f, 0.02f, -0.1f, 0.02f, -0.15f);
        d.lineTo(2.1f, 4.93f);
        d.curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        d.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        d.lineToRelative(16.97f, 16.97f);
        d.curveTo(20.88f, 20.88f, 20.88f, 21.51f, 20.49f, 21.9f);
        k4.r(d, 11.0f, 13.83f, 10.17f, 13.0f);
        d.horizontalLineTo(10.0f);
        d.curveToRelative(-0.28f, 0.0f, -0.5f, 0.22f, -0.5f, 0.5f);
        kf0.x(d, -2.0f, -3.0f, 0.17f);
        d.lineTo(6.4f, 9.22f);
        d.curveTo(6.16f, 9.41f, 6.0f, 9.68f, 6.0f, 10.0f);
        d.verticalLineToRelative(4.0f);
        d.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        d.horizontalLineToRelative(3.0f);
        d.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(d, 13.83f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _closedCaptionDisabled = build;
        build.getClass();
        return build;
    }
}
