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
import defpackage.k4;
import defpackage.r6;
import defpackage.uo;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NotificationsNoneKt {
    private static ImageVector _notificationsNone;

    public static final ImageVector getNotificationsNone(Icons.Rounded rounded) {
        ImageVector imageVector = _notificationsNone;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.NotificationsNone", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder s = uo.s(19.29f, 17.29f, 18.0f, 16.0f, -5.0f);
        s.curveToRelative(0.0f, -3.07f, -1.64f, -5.64f, -4.5f, -6.32f);
        s.lineTo(13.5f, 4.0f);
        s.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        s.reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f);
        s.verticalLineToRelative(0.68f);
        s.curveTo(7.63f, 5.36f, 6.0f, 7.92f, 6.0f, 11.0f);
        s.verticalLineToRelative(5.0f);
        s.lineToRelative(-1.29f, 1.29f);
        s.curveToRelative(-0.63f, 0.63f, -0.19f, 1.71f, 0.7f, 1.71f);
        s.horizontalLineToRelative(13.17f);
        s.curveToRelative(0.9f, 0.0f, 1.34f, -1.08f, 0.71f, -1.71f);
        k4.r(s, 16.0f, 17.0f, 8.0f, 17.0f);
        s.verticalLineToRelative(-6.0f);
        s.curveToRelative(0.0f, -2.48f, 1.51f, -4.5f, 4.0f, -4.5f);
        s.reflectiveCurveToRelative(4.0f, 2.02f, 4.0f, 4.5f);
        r6.l(s, 6.0f, 12.0f, 22.0f);
        s.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        s.horizontalLineToRelative(-4.0f);
        s.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        s.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, s.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _notificationsNone = build;
        build.getClass();
        return build;
    }
}
