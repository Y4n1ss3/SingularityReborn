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
import defpackage.j50;
import defpackage.k4;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class OpenInNewOffKt {
    private static ImageVector _openInNewOff;

    public static final ImageVector getOpenInNewOff(Icons.Rounded rounded) {
        ImageVector imageVector = _openInNewOff;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.OpenInNewOff", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder e = k4.e(16.79f, 5.8f, -1.94f, -1.94f);
        e.curveTo(14.54f, 3.54f, 14.76f, 3.0f, 15.21f, 3.0f);
        e.horizontalLineToRelative(5.29f);
        e.curveTo(20.78f, 3.0f, 21.0f, 3.22f, 21.0f, 3.5f);
        e.verticalLineToRelative(5.29f);
        e.curveToRelative(0.0f, 0.45f, -0.54f, 0.67f, -0.85f, 0.35f);
        e.lineTo(18.21f, 7.2f);
        e.lineToRelative(-4.09f, 4.09f);
        gy.B(e, -1.41f, -1.41f, 16.79f, 5.8f);
        e.moveTo(19.0f, 13.0f);
        k4.z(e, 3.17f, 2.0f, 2.0f, 13.0f);
        e.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        e.horizontalLineTo(20.0f);
        e.curveTo(19.45f, 12.0f, 19.0f, 12.45f, 19.0f, 13.0f);
        k4.x(e, 19.07f, 21.9f, -0.9f, -0.9f);
        e.horizontalLineTo(5.0f);
        e.curveToRelative(-1.11f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
        e.verticalLineTo(5.83f);
        e.lineToRelative(-0.9f, -0.9f);
        e.curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        e.lineToRelative(0.0f, 0.0f);
        e.curveToRelative(0.39f, -0.39f, 1.02f, -0.39f, 1.41f, 0.0f);
        e.lineToRelative(16.97f, 16.97f);
        e.curveToRelative(0.39f, 0.39f, 0.39f, 1.02f, 0.0f, 1.41f);
        e.lineToRelative(0.0f, 0.0f);
        e.curveTo(20.09f, 22.29f, 19.46f, 22.29f, 19.07f, 21.9f);
        k4.x(e, 16.17f, 19.0f, -4.88f, -4.88f);
        e.lineTo(10.41f, 15.0f);
        e.curveToRelative(-0.39f, 0.39f, -1.02f, 0.39f, -1.41f, 0.0f);
        e.lineToRelative(0.0f, 0.0f);
        e.curveToRelative(-0.39f, -0.39f, -0.39f, -1.02f, 0.0f, -1.41f);
        e.lineToRelative(0.88f, -0.88f);
        j50.z(e, 5.0f, 7.83f, 19.0f, 16.17f);
        e.moveTo(7.83f, 5.0f);
        e.horizontalLineTo(11.0f);
        e.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        e.verticalLineTo(4.0f);
        e.curveToRelative(0.0f, -0.55f, -0.45f, -1.0f, -1.0f, -1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, gy.m(e, 5.83f, 7.83f, 5.0f), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _openInNewOff = build;
        build.getClass();
        return build;
    }
}
