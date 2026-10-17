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
import defpackage.j50;
import defpackage.k4;
import defpackage.r6;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class MailLockKt {
    private static ImageVector _mailLock;

    public static final ImageVector getMailLock(Icons.Rounded rounded) {
        ImageVector imageVector = _mailLock;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.MailLock", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        Color.Companion companion = Color.Companion;
        SolidColor solidColor = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        StrokeCap.Companion companion2 = StrokeCap.Companion;
        int m5135getButtKaPHkGw = companion2.m5135getButtKaPHkGw();
        StrokeJoin.Companion companion3 = StrokeJoin.Companion;
        int m5145getBevelLxFBmk8 = companion3.m5145getBevelLxFBmk8();
        PathBuilder d = j50.d(22.0f, 9.97f, 6.0f);
        d.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        d.horizontalLineTo(4.0f);
        d.curveTo(2.9f, 4.0f, 2.01f, 4.9f, 2.01f, 6.0f);
        d.lineTo(2.0f, 18.0f);
        d.curveToRelative(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
        d.horizontalLineToRelative(12.0f);
        d.verticalLineToRelative(-5.03f);
        d.curveToRelative(0.0f, -2.76f, 2.24f, -5.0f, 5.0f, -5.0f);
        k4.w(d, 22.0f, 19.6f, 8.25f);
        d.lineToRelative(-6.54f, 4.09f);
        d.curveToRelative(-0.65f, 0.41f, -1.47f, 0.41f, -2.12f, 0.0f);
        d.lineTo(4.4f, 8.25f);
        d.curveTo(4.15f, 8.09f, 4.0f, 7.82f, 4.0f, 7.53f);
        d.verticalLineToRelative(0.0f);
        d.curveToRelative(0.0f, -0.67f, 0.73f, -1.07f, 1.3f, -0.72f);
        d.lineTo(12.0f, 11.0f);
        d.lineToRelative(6.7f, -4.19f);
        d.curveTo(19.27f, 6.46f, 20.0f, 6.86f, 20.0f, 7.53f);
        d.verticalLineToRelative(0.0f);
        d.curveTo(20.0f, 7.82f, 19.85f, 8.09f, 19.6f, 8.25f);
        d.close();
        ImageVector.Builder.m5492addPathoIyEayM$default(builder, d.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null);
        int defaultFillType2 = VectorKt.getDefaultFillType();
        SolidColor solidColor2 = new SolidColor(companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw2 = companion2.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk82 = companion3.m5145getBevelLxFBmk8();
        PathBuilder h = af0.h(23.0f, 15.0f, -1.0f);
        h.curveToRelative(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
        h.reflectiveCurveToRelative(-2.0f, 0.9f, -2.0f, 2.0f);
        h.verticalLineToRelative(1.0f);
        h.curveToRelative(-0.55f, 0.0f, -1.0f, 0.45f, -1.0f, 1.0f);
        h.verticalLineToRelative(3.0f);
        h.curveToRelative(0.0f, 0.55f, 0.45f, 1.0f, 1.0f, 1.0f);
        h.horizontalLineToRelative(4.0f);
        h.curveToRelative(0.55f, 0.0f, 1.0f, -0.45f, 1.0f, -1.0f);
        h.verticalLineToRelative(-3.0f);
        h.curveTo(24.0f, 15.45f, 23.55f, 15.0f, 23.0f, 15.0f);
        r6.B(h, 22.0f, 15.0f, -2.0f, -1.0f);
        h.curveToRelative(0.0f, -0.55f, 0.45f, -1.0f, 1.0f, -1.0f);
        h.reflectiveCurveToRelative(1.0f, 0.45f, 1.0f, 1.0f);
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, fc.f(h, 15.0f), defaultFillType2, "", solidColor2, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw2, m5145getBevelLxFBmk82, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _mailLock = build;
        build.getClass();
        return build;
    }
}
