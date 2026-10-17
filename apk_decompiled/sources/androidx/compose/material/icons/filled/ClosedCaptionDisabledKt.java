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
import defpackage.fc;
import defpackage.gy;
import defpackage.k4;
import defpackage.kf0;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class ClosedCaptionDisabledKt {
    private static ImageVector _closedCaptionDisabled;

    public static final ImageVector getClosedCaptionDisabled(Icons.Filled filled) {
        ImageVector imageVector = _closedCaptionDisabled;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Filled.ClosedCaptionDisabled", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
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
        r6.D(d, -1.0f, -1.5f, 0.5f, -0.17f);
        fc.u(d, -1.83f, -1.83f, 10.5f, 2.0f);
        r6.v(d, 11.0f, 18.0f, -1.0f);
        d.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        d.horizontalLineToRelative(-3.0f);
        d.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        kf0.t(d, 0.17f, 6.83f, 4.0f);
        d.moveTo(19.78f, 22.61f);
        d.lineTo(17.17f, 20.0f);
        d.horizontalLineTo(5.0f);
        d.curveToRelative(-1.11f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        d.verticalLineTo(6.0f);
        d.curveToRelative(0.0f, -0.05f, 0.02f, -0.1f, 0.02f, -0.15f);
        d.lineTo(1.39f, 4.22f);
        d.lineToRelative(1.41f, -1.41f);
        gy.B(d, 18.38f, 18.38f, 19.78f, 22.61f);
        d.moveTo(11.0f, 13.83f);
        r6.w(d, 10.17f, 13.0f, 9.5f, 0.5f);
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
