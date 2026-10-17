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
import defpackage.uf;

/* compiled from: r8-map-id-cdb4a92a528673486ef3c1abb8e37179149e2fde38b808a8f4ccb57bfaa0900b */
/* loaded from: classes.dex */
public final class NotificationsPausedKt {
    private static ImageVector _notificationsPaused;

    public static final ImageVector getNotificationsPaused(Icons.Rounded rounded) {
        ImageVector imageVector = _notificationsPaused;
        if (imageVector != null) {
            imageVector.getClass();
            return imageVector;
        }
        ImageVector.Builder builder = new ImageVector.Builder("Rounded.NotificationsPaused", Dp.m7611constructorimpl(24.0f), Dp.m7611constructorimpl(24.0f), 24.0f, 24.0f, 0L, 0, false, 96, null);
        int defaultFillType = VectorKt.getDefaultFillType();
        SolidColor solidColor = new SolidColor(Color.Companion.m4787getBlack0d7_KjU(), null);
        int m5135getButtKaPHkGw = StrokeCap.Companion.m5135getButtKaPHkGw();
        int m5145getBevelLxFBmk8 = StrokeJoin.Companion.m5145getBevelLxFBmk8();
        PathBuilder b = uf.b(12.0f, 22.0f);
        b.curveToRelative(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
        b.horizontalLineToRelative(-4.0f);
        b.curveToRelative(0.0f, 1.1f, 0.89f, 2.0f, 2.0f, 2.0f);
        k4.r(b, 19.29f, 17.29f, 18.0f, 16.0f);
        b.verticalLineToRelative(-5.0f);
        b.curveToRelative(0.0f, -3.07f, -1.64f, -5.64f, -4.5f, -6.32f);
        b.lineTo(13.5f, 4.0f);
        b.curveToRelative(0.0f, -0.83f, -0.67f, -1.5f, -1.5f, -1.5f);
        b.reflectiveCurveToRelative(-1.5f, 0.67f, -1.5f, 1.5f);
        b.verticalLineToRelative(0.68f);
        b.curveTo(7.63f, 5.36f, 6.0f, 7.92f, 6.0f, 11.0f);
        b.verticalLineToRelative(5.0f);
        b.lineToRelative(-1.29f, 1.29f);
        b.curveToRelative(-0.63f, 0.63f, -0.19f, 1.71f, 0.7f, 1.71f);
        b.horizontalLineToRelative(13.17f);
        b.curveToRelative(0.9f, 0.0f, 1.34f, -1.08f, 0.71f, -1.71f);
        b.close();
        b.moveTo(14.5f, 9.33f);
        b.curveToRelative(0.0f, 0.31f, -0.11f, 0.6f, -0.3f, 0.84f);
        b.lineToRelative(-2.5f, 3.03f);
        b.horizontalLineToRelative(1.9f);
        b.curveToRelative(0.5f, 0.0f, 0.9f, 0.4f, 0.9f, 0.9f);
        b.reflectiveCurveToRelative(-0.4f, 0.9f, -0.9f, 0.9f);
        b.horizontalLineToRelative(-2.78f);
        b.curveToRelative(-0.73f, 0.0f, -1.32f, -0.59f, -1.32f, -1.32f);
        b.verticalLineToRelative(-0.01f);
        b.curveToRelative(0.0f, -0.31f, 0.11f, -0.6f, 0.3f, -0.84f);
        b.lineToRelative(2.5f, -3.03f);
        b.horizontalLineToRelative(-1.9f);
        b.curveToRelative(-0.5f, 0.0f, -0.9f, -0.4f, -0.9f, -0.9f);
        b.reflectiveCurveToRelative(0.4f, -0.9f, 0.9f, -0.9f);
        b.horizontalLineToRelative(2.78f);
        b.curveToRelative(0.73f, 0.0f, 1.32f, 0.59f, 1.32f, 1.33f);
        b.close();
        ImageVector build = ImageVector.Builder.m5492addPathoIyEayM$default(builder, b.getNodes(), defaultFillType, "", solidColor, 1.0f, null, 1.0f, 1.0f, m5135getButtKaPHkGw, m5145getBevelLxFBmk8, 1.0f, 0.0f, 0.0f, 0.0f, 14336, null).build();
        _notificationsPaused = build;
        build.getClass();
        return build;
    }
}
